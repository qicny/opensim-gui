/* -------------------------------------------------------------------------- *
 * OpenSim: OneProbeNode.java                                                 *
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
package org.opensim.view.nodes;

import java.awt.Image;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.Action;
import javax.swing.ImageIcon;
import org.openide.nodes.Children;
import org.openide.util.NbBundle;
import org.opensim.modeling.OpenSimObject;
import org.opensim.view.ObjectDisplayMenuAction;


/** Node class to wrap Probe objects */
public class OneProbeNode  extends DisablablModelComponentNode {
   private static ResourceBundle bundle = NbBundle.getBundle(OneProbeNode.class);
   
   public OneProbeNode(OpenSimObject b) {
      super(b);
      setShortDescription(bundle.getString("HINT_ProbeNode"));
      setChildren(Children.LEAF);      
   }

   
    @Override
    public Image getIcon(int i) {
        URL imageURL;
        if (!enabled)
            return super.getIcon(i);
        
        imageURL = this.getClass().getResource("icons/probe_single.png");
        if (imageURL != null) { 
            return new ImageIcon(imageURL, "Probe").getImage();
        } else {
            return null;
        }
    }
    
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled){
            setIconBaseWithExtension("/org/opensim/view/nodes/icons/probe_single.png");
        }
    }


    public Action[] getActions(boolean b) {
        Action[] superActions = (Action[]) super.getActions(b);        
        // Arrays are fixed size, onvert to a List
        List<Action> actions = java.util.Arrays.asList(superActions);
        // Create new Array of proper size
        Action[] retActions = new Action[actions.size()+2];
        actions.toArray(retActions);
        retActions[actions.size()]=new DeleteProbeAction();
        if (enabled){  // take out display menu ObjectDisplayMenuAction
            for (int i=0; i< retActions.length; i++){
                if (retActions[i] instanceof ObjectDisplayMenuAction){
                    retActions[i] = null; 
                    break;
                }
            }
        }
        try {
            ToggleEnabledStateAction act =(ToggleEnabledStateAction) ToggleEnabledStateAction.findObject(
                    (Class)Class.forName("org.opensim.view.nodes.ToggleEnabledStateAction"), true);
            retActions[actions.size()+1]=act;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return retActions;
    }

    @Override
    public void updateSelfFromObject() {
        super.updateSelfFromObject();
    }

    @Override
    public String getDisablePropertyName() {
        return("isDisabled"); //To change body of generated methods, choose Tools | Templates.
    }

}
