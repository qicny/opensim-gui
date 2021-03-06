/* -------------------------------------------------------------------------- *
 * OpenSim: ModelInfoJPanel.java                                              *
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

/*
 * ModelInfoJPanel.java
 *
 * Created on August 1, 2007, 4:58 PM
 */

package org.opensim.view;

/**
 *
 * @author  Ayman
 */
public class ModelInfoJPanel extends javax.swing.JPanel {
   
   /** Creates new form ModelInfoJPanel */
   public ModelInfoJPanel() {
      initComponents();
   }
   
   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
   private void initComponents() {
      jScrollPane1 = new javax.swing.JScrollPane();
      jPublicationsTextArea = new javax.swing.JTextArea();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      modelFileValue = new javax.swing.JLabel();
      modelNameValue = new javax.swing.JLabel();
      DynamicsEngineValue = new javax.swing.JLabel();
      AuthorsValue = new javax.swing.JLabel();

      jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
      jPublicationsTextArea.setBackground(new java.awt.Color(236, 233, 216));
      jPublicationsTextArea.setColumns(20);
      jPublicationsTextArea.setEditable(false);
      jPublicationsTextArea.setFont(new java.awt.Font("Tahoma", 0, 11));
      jPublicationsTextArea.setLineWrap(true);
      jPublicationsTextArea.setRows(5);
      jPublicationsTextArea.setText("References and publications go here.");
      jPublicationsTextArea.setWrapStyleWord(true);
      jScrollPane1.setViewportView(jPublicationsTextArea);

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13));
      jLabel1.setText("Model Name:");

      jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13));
      jLabel2.setText("Model File:");

      jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13));
      jLabel3.setText("Dynamics Engine:");

      jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13));
      jLabel5.setText("Authors:");

      jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13));
      jLabel6.setText("References:");

      modelFileValue.setText("Full path for model file if on disk");

      modelNameValue.setText("model display name");

      DynamicsEngineValue.setText("Name of dynamics engine (SIMM, SDFast, Simbody, ...)");

      AuthorsValue.setText("Authors who contributed to the model");

      org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(layout.createSequentialGroup()
            .add(20, 20, 20)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1)
               .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
               .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
               .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5)
               .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel6))
            .add(4, 4, 4)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
               .add(AuthorsValue)
               .add(DynamicsEngineValue)
               .add(modelFileValue)
               .add(modelNameValue))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(layout.createSequentialGroup()
            .add(18, 18, 18)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
               .add(jLabel1)
               .add(modelNameValue))
            .add(7, 7, 7)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
               .add(jLabel2)
               .add(modelFileValue))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
               .add(DynamicsEngineValue)
               .add(jLabel3))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
               .add(jLabel5)
               .add(AuthorsValue))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(layout.createSequentialGroup()
                  .add(jLabel6)
                  .add(113, 113, 113))
               .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
      );
   }// </editor-fold>//GEN-END:initComponents
   
   
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel AuthorsValue;
   private javax.swing.JLabel DynamicsEngineValue;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JTextArea jPublicationsTextArea;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JLabel modelFileValue;
   private javax.swing.JLabel modelNameValue;
   // End of variables declaration//GEN-END:variables
    public void setModelName(String modelNameValue)
    {
        this.modelNameValue.setText(modelNameValue);
    }

    public void setModelFile(String modelFileValue)
    {
        this.modelFileValue.setText(modelFileValue);
    }

    public void setAuthors(String authorsValue)
    {
       AuthorsValue.setText(authorsValue);
    }

    public void setReferences(String referencesValue)
    {
       jPublicationsTextArea.setText(referencesValue);
       jPublicationsTextArea.setCaretPosition(0);
    }

   public void setDynamicsEngineName(String string) {
      DynamicsEngineValue.setText(string);
   }
   
}
