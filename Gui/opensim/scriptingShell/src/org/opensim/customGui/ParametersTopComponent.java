/* -------------------------------------------------------------------------- *
 * OpenSim: ParametersTopComponent.java                                       *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */
package org.opensim.customGui;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Box;
import org.openide.ErrorManager;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import org.opensim.modeling.Analysis;
import org.opensim.modeling.ArrayInt;
import org.opensim.modeling.Coordinate;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimObject;
import org.opensim.swingui.SliderWithTextBox;
import org.opensim.tools.serializers.ToolExecutor;
import org.opensim.tools.serializers.ToolFactory;
import org.opensim.tools.serializers.ToolSerializer;
import org.opensim.tracking.ResultDisplayerInterface;
import org.opensim.view.ModelEvent;
import org.opensim.view.pub.OpenSimDB;
import java.applet.*;
import javax.swing.JPanel;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.Function;
import org.opensim.plotter.JPlotterPanel;
import org.opensim.view.ObjectSetCurrentEvent;
import org.opensim.view.ObjectsDeletedEvent;
import org.opensim.view.functionEditor.FunctionPanelListener;
import org.opensim.view.nodes.OpenSimFunctionEditorPanel;
import org.opensim.view.pub.ViewDB;

//import org.opensim.view.output.TextResultDisplayer;
        
/**
 * Top component which displays something.
 */
public final class ParametersTopComponent extends TopComponent 
        implements Observer, ResultDisplayerInterface{
    
    private static ParametersTopComponent instance;
   // private final ExplorerManager manager = new ExplorerManager();
    //private final PropertySheetView psv = new PropertySheetView();
    private double convertRadiansToDegrees = Math.toDegrees(1.0);
    private ResultsDisplayerCallback resultDisplayer;
    private ArrayList<LabOutputInterface> outputChannels = new ArrayList<LabOutputInterface> ();
    private long outputRefreshRate=-1L;   // Default reasonable value should be provided by LabOutputsNode
   /** path to the icon used by the component and its open action */
//    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";
    
    private static final String PREFERRED_ID = "ParametersTopComponent";
    LabParametersNode parametersNode;
    LabOutputsNode outputsNode;
    ToolSerializer    tool;
    private PlotOutputPanel   plotPanel;
    private String runButtonLabel="Run >";

    private ToolExecutor toolExecutor;

    private URL urlForAudio;
    private AudioClip clip;
    private double[] cameraAttributes;
    
    private ParametersTopComponent() {
        initComponents();
        //add(psv, BorderLayout.CENTER);
        setName(NbBundle.getMessage(ParametersTopComponent.class, "CTL_ParametersTopComponent"));
        setToolTipText(NbBundle.getMessage(ParametersTopComponent.class, "HINT_ParametersTopComponent"));
//        setIcon(Utilities.loadImage(ICON_PATH, true));
        createAnalysis(OpenSimDB.getInstance().getCurrentModel());
        

    }

    public void createKnobForCoordinate(Coordinate c, String displayName) {
        CoordinateAdaptor ca = new CoordinateAdaptor(c);
        inputPanel.add(new SliderWithTextBox(ca,
                (c.getMotionType()==Coordinate.MotionType.Rotational)?convertRadiansToDegrees:1.0,
                displayName));
    }
    /** Create a text box tht updates while a tool is running. The specification of what to display
     * and formatting is embedded in the passed in LabOutputTextToPanel
     */
    public void createTextualOutput(LabOutputTextToPanel nextOutput) {
        TextOutputPanel resultPanel = new TextOutputPanel(nextOutput);
        outputChannels.add(resultPanel);
        outputPanel.add(resultPanel);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        runButton = new javax.swing.JToggleButton();
        resultsPanel = new javax.swing.JPanel();
        resetViewButton = new javax.swing.JButton();
        knobsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        inputPanel = new javax.swing.JPanel();
        outputPanel = new javax.swing.JPanel();

        org.openide.awt.Mnemonics.setLocalizedText(runButton, "Run >");
        runButton.setToolTipText("Execute tool");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        resultsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Results"));
        resultsPanel.setLayout(new javax.swing.BoxLayout(resultsPanel, javax.swing.BoxLayout.Y_AXIS));

        resetViewButton.setLabel("Reset View");
        resetViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetViewButtonActionPerformed(evt);
            }
        });

        knobsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        knobsPanel.setLayout(new javax.swing.BoxLayout(knobsPanel, javax.swing.BoxLayout.Y_AXIS));

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Inputs"));
        inputPanel.setLayout(new javax.swing.BoxLayout(inputPanel, javax.swing.BoxLayout.Y_AXIS));
        jSplitPane1.setLeftComponent(inputPanel);

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Results"));
        outputPanel.setLayout(new javax.swing.BoxLayout(outputPanel, javax.swing.BoxLayout.Y_AXIS));
        jSplitPane1.setRightComponent(outputPanel);

        jScrollPane1.setViewportView(jSplitPane1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void resetViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetViewButtonActionPerformed
// TODO add your handling code here:
        ViewDB.getCurrentModelWindow().applyCameraAttributes(cameraAttributes);
        ViewDB.getCurrentModelWindow().getCanvas().Render();
    }//GEN-LAST:event_resetViewButtonActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
// TODO add your handling code here:
        if (evt.getSource().equals(runButton)){
            if (runButton.isSelected()){
                runButton.setText("Stop");
                toolExecutor.execute(); // runs in background
                toolExecutor.addObserver(this);
                File file = new File("theme.wav");
                try {
                    clip = Applet.newAudioClip(file.toURL());
                    //clip.loop();
                    clip.play();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                }
            }
            else {
                toolExecutor.deleteObserver(this);
                toolExecutor.cancel();
                runButton.setText(runButtonLabel);
                if (clip!=null) clip.stop();
            }
        }
    }//GEN-LAST:event_runButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel knobsPanel;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JButton resetViewButton;
    private javax.swing.JPanel resultsPanel;
    private javax.swing.JToggleButton runButton;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link findInstance}.
     */
    public static synchronized ParametersTopComponent getDefault() {
        if (instance == null) {
            instance = new ParametersTopComponent();
        }
        return instance;
    }
    
    /**
     * Obtain the ParametersTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized ParametersTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            ErrorManager.getDefault().log(ErrorManager.WARNING, "Cannot find Parameters component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof ParametersTopComponent) {
            return (ParametersTopComponent)win;
        }
        ErrorManager.getDefault().log(ErrorManager.WARNING, "There seem to be multiple components with the '" + PREFERRED_ID + "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }
    
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }
    
    public void componentOpened() {
        // TODO add custom code on component opening
        OpenSimDB.getInstance().addObserver(this);
    }
    
    public void componentClosed() {
        // TODO add custom code on component closing
         OpenSimDB.getInstance().deleteObserver(this);
    }
    
    /** replaces this in object stream */
    public Object writeReplace() {
        return new ResolvableHelper();
    }
    
    protected String preferredID() {
        return PREFERRED_ID;
    }

    void setInputs(LabParametersNode params) {
        parametersNode = params;
        createInputsGUI();
    }

    private void createInputsGUI() {
        // For each parameter in parametersNode, create a slider for it based on corresponding
        // DblBoundedRangeModel
        inputPanel.removeAll();
        inputPanel.add(Box.createRigidArea(new Dimension(10,10)));
        Model mdl=OpenSimDB.getInstance().getCurrentModel();
        if (parametersNode!=null ) {
            ArrayList<LabParameter> params = parametersNode.getParameters();
            for(int i=0; i<params.size(); i++){
                LabParameter nextParam = params.get(i);
                if (nextParam.getOpenSimType().equalsIgnoreCase("Coordinate")){
                    Coordinate c = mdl.getCoordinateSet().get(nextParam.getObjectName());
                    assert(c!=null);
                    createKnobForCoordinate(c, nextParam.getPropertyDisplayName());
                } else {
                    try {
                        OpenSimObject obj = mdl.getObjectByTypeAndName(nextParam.getOpenSimType(), nextParam.getObjectName());
                        //DynamicPropertyAdaptor objAdaptor;
                        AbstractProperty prop=obj.getPropertyByName(nextParam.getPropertyName());
                        String displayName = nextParam.getPropertyDisplayName();
                        createGUIForProperty(prop, displayName, mdl, obj, nextParam.getPropertyComponent(), 
                                nextParam.getRangeMin(), nextParam.getRangeMax(), nextParam.getUserInterface());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        //inputPanel.add(Box.createVerticalGlue());
        //inputPanel.add(Box.createRigidArea(new Dimension(10,10)));
        inputPanel.validate();
    }

    private void createGUIForProperty(final AbstractProperty prop, final String displayName, final Model mdl,
            final OpenSimObject obj, final int propertyComponent, double min, double max, Object userInterface) {
        if (((String)userInterface).equalsIgnoreCase("Slider")){
            if (prop.getTypeName().equals("double")){
                DynamicPropertyAdaptor objAdaptor = new DynamicPropertyAdaptor(obj, mdl, prop, min, max);
                inputPanel.add(new SliderWithTextBox(objAdaptor,
                        1.0,
                        displayName));
            } /*else if (prop.getType()==prop.getType().DblVec||
                    prop.getType()==prop.getType().DblArray){
                // Three sliders one per component if none specified
                if (propertyComponent==-1){
                    for(int comp=0; comp<prop.getArraySize(); comp++){
                        DynamicPropertyComponentAdaptor objAdaptor = new DynamicPropertyComponentAdaptor(obj, mdl, prop, comp, min, max);
                        inputPanel.add(new SliderWithTextBox(objAdaptor,
                                1.0,
                                displayName+"."+String.valueOf(comp)));
                    }
                } else {  // Component was specified
                    DynamicPropertyComponentAdaptor objAdaptor = new DynamicPropertyComponentAdaptor(obj, mdl, prop, propertyComponent, min, max);
                    inputPanel.add(new SliderWithTextBox(objAdaptor,
                            1.0,
                            displayName));
                }
            }*/
        }
        return;
    }

    void setRunLabel(String label) {
        runButton.setText(label);
        runButtonLabel = label;
    }

    public void update(Observable o, Object arg) {
        //here we update the run button as needed and clenup when the model is changed or closed
        if (arg==ToolExecutor.Operation.ExecutionFinished){
            //toolExecutor.deleteObserver(this);
            runButton.setText(runButtonLabel);
            runButton.setSelected(false);
            if (clip!=null) clip.stop();

        }
        if (o instanceof OpenSimDB){
            if (arg instanceof ObjectSetCurrentEvent ||
                    arg instanceof ObjectsDeletedEvent ||
                    arg instanceof ModelEvent && ((ModelEvent) arg).getOperation()==ModelEvent.Operation.Close){
                // Current model changed, cleanup!
                inputPanel.removeAll();
                for (LabOutputInterface nextOutput:outputChannels)
                    nextOutput.cleanup();

                close();
            }
        }
        
    }

    public ToolExecutor createExecutor(ToolSerializer tool, Model model) throws IOException {
         String relativePathSetupFile = tool.getSetupFile();
         String absolutePathSetupFile = new File(relativePathSetupFile).getAbsolutePath();
         OpenSimObject obj = OpenSimObject.makeObjectFromFile(absolutePathSetupFile);
         toolExecutor = ToolFactory.createExecutor(model, absolutePathSetupFile, obj.getConcreteClassName(), this);
         return toolExecutor;
    }

    void createOutputGUI() {
        // Cycle thru outputs and create corresponding UI 
        if (outputsNode!=null ) {
            ArrayList<LabOutput> outs = outputsNode.getOutputs();
            outputRefreshRate=outputsNode.getRefreshRate();
            //outs.add(new LabOutputTextToWindow());
            for(int i=0; i<outs.size(); i++){
                LabOutput nextOutput = outs.get(i);
                if (nextOutput instanceof LabOutputTextToPanel){
                    createTextualOutput((LabOutputTextToPanel)nextOutput);
                }
                else if (nextOutput instanceof LabOutputPlot) {
                    plotPanel = new PlotOutputPanel((LabOutputPlot)nextOutput, this);
                    //outputChannels.add(resultPanel);
                    //knobsPanel.add(resultPanel);                    
                }
                else if (nextOutput instanceof LabOutputTextToWindow) {
                    outputChannels.add(new LabOutputAnnotationAnchorWindow((LabOutputTextToWindow)nextOutput));
                }
                else if (nextOutput instanceof LabOutputTextToObject) {
                    LabOutputAnnotationAnchorObject newChannel;
                    try {
                        newChannel = new LabOutputAnnotationAnchorObject((LabOutputTextToObject) nextOutput);
                        outputChannels.add(newChannel);
                    } catch (IOException ex) {
                        ex.printStackTrace();
            }
        }
            }
        }
        outputPanel.validate();
    }
    
    public void createRunButton() {
         inputPanel.add(Box.createRigidArea(new Dimension(10,10)));
         inputPanel.add(runButton);
         inputPanel.add(Box.createRigidArea(new Dimension(10,10)));
         inputPanel.validate();
    }
    public Analysis createAnalysis(Model model) {
        resultDisplayer = new ResultsDisplayerCallback(model);
        for (LabOutputInterface nextOutput:outputChannels)
            resultDisplayer.addOutput(nextOutput);
        if (plotPanel!= null)
        resultDisplayer.addOutput(plotPanel);
        model.addAnalysis(resultDisplayer);
        return resultDisplayer;
    }

    void seOutnputs(LabOutputsNode outs) {
        outputsNode = outs;
        createOutputGUI();
    }
    
    final static class ResolvableHelper implements Serializable {
        private static final long serialVersionUID = 1L;
        public Object readResolve() {
            return ParametersTopComponent.getDefault();
        }
    }

    public PlotOutputPanel getPlotPanel() {
        return plotPanel;
    }

    public ResultsDisplayerCallback getResultDisplayer() {
        return resultDisplayer;
    }
    
    public void removeAnalysis(Model model) {
        model.removeAnalysis(resultDisplayer, false);
    }
    /**
     * Attributes to set camera position. These can be obtained from the AppState.xml file saved
     * when the application is closed to restore view on entry.
     * @param aCameraAttributes 
     */
    public void setDefaultView(double[] aCameraAttributes) {
        cameraAttributes = aCameraAttributes;
    }
    /**
     * Built-in "reset view" button is added to inputPanel.
     */
    public void createResetViewButton() {
         inputPanel.add(resetViewButton);
         //inputPanel.add(Box.createRigidArea(new Dimension(10,10)));
         inputPanel.validate();
    }
    /**
     * Create a Slider in the inputPanel for a specific property that has a single double value
     * @param prop reference to property
     * @param displayName user friendly name to display around the slider
     * @param mdl model to which the object being edited belongs
     * @param obj object to which the property being edited belongs
     * @param min user specified slider min
     * @param max  user specified slider max
     */
    public void createKnobForProperty(AbstractProperty prop, String displayName, Model mdl,
            OpenSimObject obj, double min, double max) {   
        
        createGUIForProperty(prop, displayName, mdl, obj, -1, 
                                min, max, "Slider");
        inputPanel.validate();
    }
    /**
     * Create panel to display and allow live editing of Functions. supported functions are those
     * built in OpenSim proper types.
     * 
     * @param func 
     */
    public void createEditPanelForFunction(Function func){
        OpenSimFunctionEditorPanel osfep = new OpenSimFunctionEditorPanel(func);
        osfep.hideControlPanel(true);
        osfep.setPreferredSize(new Dimension(120, 50));
        // Recreatesystem on edits
        osfep.addListener(new FunctionPanelListener(){

            @Override
            public void clearSelectedNodes() {
                
            }

            @Override
            public void toggleSelectedNode(int series, int node) {
                //reportChange();
            }

            @Override
            public void replaceSelectedNode(int series, int node) {
                //reportChange();
            }

            @Override
            public void addNode(int series, double x, double y) {
                reportChange();
            }

            @Override
            public boolean deleteNode(int series, int node) {
                reportChange();
                return true;
            }

            @Override
            public boolean deleteNodes(int series, ArrayInt nodes) {
                reportChange();
                return true;
            }

            @Override
            public void duplicateNode(int series, int node) {
                reportChange();
                return;
            }

            @Override
            public void dragSelectedNodes(int series, int node, double[] dragVector) {
                reportChange();
                return;
            }
            private void reportChange(){
                int x = 0;
                //System.out.println("reportChange in ParametersTopComponent");
            }
        });
        inputPanel.add(osfep);
        inputPanel.validate();
    }
    /**
     * Add an instance of JPlotterPanel to the outputPanel with specified title
     * @param title
     * @return handle to added JPlotterPanel
     */
    public JPlotterPanel addPlotterPanel(String title){
        JPlotterPanel ppanel = new JPlotterPanel();
        ppanel.hideControlPanel(true);
        ppanel.setTitle(title);
        outputPanel.add(ppanel);
        outputPanel.validate();
        return ppanel;
    }
    /**
     * Create a button on inputPanel that will run a tool using the passed in setup file
     * 
     * @param setupFile (a setup file to run any of the standard tools (IK, ID, Analyze, FD, CMC)
     * @param buttonLabel (user friendly label to display on button)
     */
    public void addToolButton(String setupFile, String buttonLabel){
        tool = new ToolSerializer();
        tool.setSetupFile(setupFile);
        Model model = OpenSimDB.getInstance().getCurrentModel();
        tool.setModel(model);
        OpenSimObject obj = OpenSimObject.makeObjectFromFile(setupFile);
        try {
            toolExecutor = ToolFactory.createExecutor(model, setupFile, obj.getConcreteClassName(), this);
            setRunLabel(buttonLabel);
            createRunButton();
            
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
    /**
     * Add quantity to keep track of and update as the tool is run.
     * 
     * @param htmlSpec Format string, taining place holder ___ to be replaced
     * @param qtySpec Specification of quantity to display
     */
    public void addOutputQuantity(String htmlSpec, String qtySpec){
        LabOutputTextToPanel textToPanel = new LabOutputTextToPanel();
        textToPanel.setHtmlTemplate(htmlSpec);
        textToPanel.setQuantitySpecfication(qtySpec);
        TextOutputPanel textOutput = new TextOutputPanel(textToPanel);
        outputChannels.add(textOutput);
        resultDisplayer.addOutput(textOutput);
        outputPanel.add(textOutput);
    }
    /**
     * Add a new JPanel to the outputPanel of the custom gui and return a handle to it.
     * Typically you use this call to add a panel then add custom buttons to the returned panel
     * using standard swing syntax.
     * 
     * @return handle to JPanel that was created.
     */
    public JPanel addOutputPanel(String label){
        JPanel panel = new JPanel();
        if (!label.isEmpty())
            panel.setBorder(javax.swing.BorderFactory.createTitledBorder(label));
        outputPanel.add(panel);
        return panel;
    }
    /**
     * Add a new JPanel to the inputPanel of the custom gui and return a handle to it.
     * Typically you use this call to add a panel then add custom buttons to the returned panel
     * using standard swing syntax.
     * 
     * @return handle to JPanel that was created.
     */
    public JPanel addInputPanel(String label){
        JPanel panel = new JPanel();
        if (!label.isEmpty())
            panel.setBorder(javax.swing.BorderFactory.createTitledBorder(label));
        inputPanel.add(panel);
        return panel;
    }
    /**
     * Clear the contents of both inputPanel and outputPanel
     */
    public void reset() {
        inputPanel.removeAll();
        outputPanel.removeAll();
    }
    
}
