/*
 * Copyright (c)  2005-2008, Stanford University
 * Use of the OpenSim software in source form is permitted provided that the following
 * conditions are met:
 * 	1. The software is used only for non-commercial research and education. It may not
 *     be used in relation to any commercial activity.
 * 	2. The software is not distributed or redistributed.  Software distribution is allowed 
 *     only through https://simtk.org/home/opensim.
 * 	3. Use of the OpenSim software or derivatives must be acknowledged in all publications,
 *      presentations, or documents describing work in which OpenSim or derivatives are used.
 * 	4. Credits to developers may not be removed from executables
 *     created from modifications of the source.
 * 	5. Modifications of source code must retain the above copyright notice, this list of
 *     conditions and the following disclaimer. 
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *  SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 *  HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR BUSINESS INTERRUPTION) OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *  WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.opensim.view;

import org.opensim.modeling.*;
import vtk.vtkActor;
import vtk.vtkClipPolyData;
import vtk.vtkPlane;
import vtk.vtkPolyData;
import vtk.vtkSphereSource;

public class DecorativeSphereDisplayer extends DecorativeGeometryDisplayer {
    private static int RESOLUTION_PHI=32;
    private static int RESOLUTION_THETA=32;
    private double radius;
    private int bodyId=-1;
    private int indexOnBody = -1;
    DecorativeGeometry agLocal;
    vtkSphereSource sphere = null;
    //protected OpenSimObject obj;
    /** 
     * Displayer for Wrap Geometry
     * @param ag
     * @param object 
     */
    DecorativeSphereDisplayer(DecorativeSphere ag) {
        this.radius = ag.getRadius();
        bodyId = ag.getBodyId();
        indexOnBody = ag.getIndexOnBody();
        agLocal = new DecorativeGeometry(ag);
        if (ag.hasUserRef()) setObj(ag.getUserRefAsObject());
     }

    /**
     * Convert DecorativeGeometry object passed in to the corresponding vtk polyhedral representation.
     * Transform is passed in as well since the way it applies to PolyData depends on source
     */
    public vtkPolyData getPolyData() {
        //Geometry.GeometryType analyticType = ag.
        boolean quadrants[] = new boolean[6];
        //ag.getQuadrants(quadrants);
        double[] pos = new double[3];
        if (sphere == null){
            sphere = new vtkSphereSource();
            sphere.LatLongTessellationOn();
            sphere.SetPhiResolution(RESOLUTION_PHI);
            sphere.SetThetaResolution(RESOLUTION_THETA);
            sphere.SetRadius(radius);
        }
        return sphere.GetOutput();
    }

    /**
     * Based on the array of quadrants, clip the wrap-object sphere/ellipsoid 
     */
    public static void setQuadrants(final boolean quadrants[], final vtkSphereSource sphere) {
      if (!quadrants[0]){ 
         sphere.SetStartTheta(270.0);
         sphere.SetEndTheta(90.0);
      }
      else if (!quadrants[1]){
         sphere.SetStartTheta(90.0);
         sphere.SetEndTheta(270.0);
      }
      else if (!quadrants[2]){
        sphere.SetEndTheta(180.0);
      }
      else if (!quadrants[3]){  
         sphere.SetStartTheta(180.0);
      }
      else if (!quadrants[4])   
        sphere.SetEndPhi(90.0);
      else if (!quadrants[5])
         sphere.SetStartPhi(90.0);
   }

   /** 
    * Clip poly data of Cylinder, torus to proper half per passed in quadrants array
    * only x, y are considered here as they are supported by the kinematics engine
    */
   public static vtkPolyData clipPolyData(boolean[] quadrants, vtkPolyData full) {
      vtkPlane cutPlane = new vtkPlane();
      if (!quadrants[0])
         cutPlane.SetNormal(1.0, 0.0, 0.0);
      else if (!quadrants[1])
         cutPlane.SetNormal(-1.0, 0.0, 0.0);
      else if (!quadrants[2]) 
         cutPlane.SetNormal(0.0, 1.0, 0.0);
      else if (!quadrants[3])
         cutPlane.SetNormal(0.0, -1.0, 0.0);
      else  // do nothing
         return full;
      vtkClipPolyData clipper = new vtkClipPolyData();
      clipper.SetClipFunction(cutPlane);
      clipper.SetInput(full);
      
      return clipper.GetOutput();
   }

    @Override
    void updateDisplayFromDecorativeGeometry() {
        vtkPolyData polyData = getPolyData();
        createAndConnectMapper(polyData);
        setXformAndAttributesFromDecorativeGeometry(agLocal);
    }

    @Override
    vtkActor computeVisuals() {
        updateDisplayFromDecorativeGeometry();
        return this;
    }

    int getBodyId() {
        return bodyId;
    }
    int getIndexOnBody() {
        return indexOnBody;
    }
}