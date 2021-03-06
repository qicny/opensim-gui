/* -------------------------------------------------------------------------- *
 * OpenSim: ViewEditAction.java                                               *
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

package org.opensim.view;

import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;
import org.opensim.utils.TheApp;
import org.opensim.view.pub.ViewDB;

/**
 * A Class representing the action of renaming a graphics window.
 *
 * @todo this class should be final per netBeans 
 */

public class ViewEditAction extends CallableSystemAction {
    
    public void performAction() {
        // TODO implement action body
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewEditJDialog dlg = 
                new ViewEditJDialog(TheApp.getAppFrame(), true, ViewDB.getInstance().getCurrentModelWindow());
                dlg.setLocationRelativeTo(ExplorerTopComponent.getDefault());
                dlg.setVisible(true);
            }
        });
        /*
        DialogDescriptor viewEditDlg = new DialogDescriptor(new RenameViewPanel(ViewDB.getInstance().getCurrentModelWindow()), "Rename View");
        viewEditDlg.addPropertyChangeListener(new PropertyChangeListener(){
            public void propertyChange(PropertyChangeEvent evt) {
                Object obj = evt.getSource();
                String propName = evt.getPropertyName();
                if (propName.equalsIgnoreCase("Value")){
                    int acceptReject = ((Integer)evt.getNewValue()).intValue();
                    if (acceptReject==1){   //OK
                        ViewDB.getInstance().getCurrentModelWindow().setTabDisplayName("OK");
                        ViewDB.getInstance().getCurrentModelWindow().setDisplayName("OK");
                    }
                    else {  //Cancel
                        ViewDB.getInstance().getCurrentModelWindow().setTabDisplayName("Cancel");
                        ViewDB.getInstance().getCurrentModelWindow().setDisplayName("Cancel");                        
                    }
                }
            }});
        DialogDisplayer.getDefault().createDialog(viewEditDlg).setVisible(true);
        */
    }
    
    public String getName() {
        return NbBundle.getMessage(ViewEditAction.class, "CTL_EditViewAction");
    }
    
    protected void initialize() {
        super.initialize();
        // see org.openide.util.actions.SystemAction.iconResource() javadoc for more details
        putValue("noIconInMenu", Boolean.TRUE);
    }
    
    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }
    
    protected boolean asynchronous() {
        return false;
    }
    
}
