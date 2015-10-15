/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.threejs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.opensim.modeling.ArrayDecorativeGeometry;
import org.opensim.modeling.BodiesList;
import org.opensim.modeling.BodyIterator;
import org.opensim.modeling.Component;
import org.opensim.modeling.ComponentIterator;
import org.opensim.modeling.ComponentsList;
import org.opensim.modeling.DecorativeGeometry;
import org.opensim.modeling.Model;
import org.opensim.modeling.ModelDisplayHints;
import org.opensim.modeling.PhysicalFrame;
import org.opensim.modeling.State;
import org.opensim.modeling.Transform;
import org.opensim.utils.BrowserLauncher;
import org.opensim.view.pub.OpenSimDB;
import org.eclipse.jetty.JettyMain;

@ActionID(
        category = "File",
        id = "org.opensim.threejs.ExportSceneToThreeJsAction"
)
@ActionRegistration(
        displayName = "#CTL_ExportSceneToThreeJsAction"
)
@ActionReference(path = "Menu/File", position = 1429)
@Messages("CTL_ExportSceneToThreeJsAction=Export model to json")
public final class ExportSceneToThreeJsAction implements ActionListener {

    private HashMap<Integer, JSONObject> mapBodyIndicesToGroups = new HashMap<Integer, JSONObject>();
    private HashMap<Integer, PhysicalFrame> mapBodyIndicesToFrames = new HashMap<Integer, PhysicalFrame>();
    private State state;
    private double visScaleFactor = 1000.0;
    private static String workDir = "C:\\Dev\\DemoOct2015\\";
    
    @Override
    public void actionPerformed(ActionEvent e) {
        BufferedWriter out = null;
        try {
            //HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
            //server.createContext("/threejsEditor/index.html", new MyHandler());
            //server.setExecutor(null); // creates a default executor
            //server.start();
            /*
            String[] args=null;
            try {
                JettyMain.main(args);
            } catch (Exception ex) {
                Exceptions.printStackTrace(ex);
            }*/
            //BrowserLauncher.openURL("http://localhost:8000/threejsEditor/editor/index.html");
            out = new BufferedWriter(new FileWriter(workDir+"scene.json", false));
            // TODO implement action body
            Model model = OpenSimDB.getInstance().getCurrentModel();
            state = model.getWorkingState();
            ModelDisplayHints mdh = model.getDisplayHints();
            ComponentsList mcList = model.getComponentsList();
            ComponentIterator mcIter = mcList.begin();
            // read template that includes default materials and place holders for "geometries", "materials"
            JSONObject jsonTop = loadTemplateJSON();
            if (jsonTop == null){
                // Throw exception, missing resource
            }
            BodiesList bodies = model.getBodiesList();
            BodyIterator body = bodies.begin();
            mapBodyIndicesToFrames.put(0, model.getGround());
            while (!body.equals(bodies.end())) {
                int id = body.getMobilizedBodyIndex();
                // Body group
                //JSONObject json_mobod = createGroupForMoBody(id, physicalFrame);
                //mapBodyIndicesToGroups.put(id, json_mobod);
                mapBodyIndicesToFrames.put(id, PhysicalFrame.safeDownCast(body.__deref__()));
                System.out.println("id="+id+" body ="+body.getName());
                body.next();
            }
            
            // Get reference to geometries, materials and object/children
            JSONArray json_geometries = (JSONArray) jsonTop.get("geometries");
            HashMap<String, UUID> mapGeometryToUUID = new HashMap<String, UUID>() {};
            
            JSONArray json_materials = (JSONArray) jsonTop.get("materials");
            HashMap<String, UUID> mapMaterialToUUID = new HashMap<String, UUID>() {};

            JSONObject sceneObject = (JSONObject) jsonTop.get("object");
            JSONArray json_scene_objects = (JSONArray) sceneObject.get("children");
            DecorativeGeometryImplementationJS dgimp = new DecorativeGeometryImplementationJS(json_geometries, visScaleFactor);
            while (!mcIter.equals(mcList.end())) {
                //System.out.println("Object:Type,Name:"+ mcIter.getConcreteClassName()+","+mcIter.getName());
                Component comp = mcIter.__deref__();
                //System.out.println("Comp:"+comp.getConcreteClassName()+"ID="+comp.getPathName());
                ArrayDecorativeGeometry adg = new ArrayDecorativeGeometry();
                comp.generateDecorations(true, mdh, model.getWorkingState(), adg);
                //comp.generateDecorations(false, mdh, model.getWorkingState(), adg);
                if (adg.size() > 0) {  // Component has some geometry
                    DecorativeGeometry dg;
                    for (int idx = 0; idx < adg.size(); idx++) {
                        dg = adg.getElt(idx);
                        String geomId =comp.getPathName().concat(String.valueOf(dg.getIndexOnBody()));
                         // pad to 4 hex digits
                        UUID uuid = UUID.randomUUID();
                        mapGeometryToUUID.put(geomId, uuid);
                        //System.out.println("hexGeom uuid:"+uuid+" type="+dg.toString());                       
                        dgimp.setGeomID(uuid);
                        dg.implementGeometry(dgimp);
                        // add entry for corresponding Material here
                        UUID uuid_mat = UUID.randomUUID();
                        mapMaterialToUUID.put(geomId, uuid_mat);
                        addMaterialJsonForGeometry(uuid_mat, dg, json_materials);
                        addSceneJsonObject(model, dg, geomId, uuid, uuid_mat, json_scene_objects);
                    }
                }
                mcIter.next();
            }
            //JSONArray json_scene = new JSONArray();
            // Create top level node for one group at ground body
            //createDefaultScene(json_scene, json_geometries, json_materials);
            StringWriter outString = new JSONWriter();
            jsonTop.writeJSONString(outString);
            String jsonText = outString.toString();
            //System.out.print(jsonText);
            //System.out.println("---------------");
            //System.out.print(jsonText);
            out.write(jsonText);
            out.flush();
            out.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } finally {
        }
    }

    private void addMaterialJsonForGeometry(UUID uuid_mat, DecorativeGeometry dg, JSONArray json_materials) {
        Map mat_json = new LinkedHashMap();
        mat_json.put("uuid", uuid_mat.toString());
        mat_json.put("type", "MeshPhongMaterial");
        mat_json.put("color", JSONUtilities.mapColorToRGBA(dg.getColor()));
        mat_json.put("shininess", 30);
        mat_json.put("emissive", 0);
        mat_json.put("specular", 1118481);
        mat_json.put("side", 2);
        double opacity = dg.getOpacity();
        if (opacity < .999){
            mat_json.put("opacity", opacity);  
            mat_json.put("transparent", true);  
        }
        json_materials.add(mat_json);
    }

    private JSONObject loadTemplateJSON() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        
        try {
 
            Object obj = parser.parse(new FileReader(
                    "visResources/templateScene.json"));
 
            jsonObject = (JSONObject) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
   }

    private void addSceneJsonObject(Model model, DecorativeGeometry dg, String geomName, UUID uuid, UUID uuid_mat, JSONArray scene_objects) {
        Map obj_json = new LinkedHashMap();
        obj_json.put("uuid", UUID.randomUUID().toString());
        obj_json.put("type", "Mesh");
        obj_json.put("name", geomName);
        //obj_json.put("matrix", JSONUtilities.stringifyTransform(computeGroundTransform(model, dg)));
        obj_json.put("geometry", uuid.toString());
        obj_json.put("material", uuid_mat.toString());
        int bod = dg.getBodyId();
        Transform relativeTransform = dg.getTransform();
        PhysicalFrame bodyFrame = mapBodyIndicesToFrames.get(bod);
        Transform xform = bodyFrame.getGroundTransform(state);
        Transform fullTransform = xform.compose(relativeTransform);
        obj_json.put("matrix", JSONUtilities.createMatrixFromTransform(fullTransform, visScaleFactor));
        scene_objects.add(obj_json);
    }
}