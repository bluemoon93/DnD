/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import Utils.Formula;

/**
 *
 * @author BlueMoon
 */
public class AttackPanel extends javax.swing.JPanel {

    Gui g;

    /**
     * Creates new form AttackPanel
     */
    public AttackPanel() {
        initComponents();
    }

    public void setListeners(Gui g) {
        this.g = g;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTextField7.setText("Name");

        jTextField9.setText("STR");
        jTextField9.setToolTipText("Attack Roll Modifier");

        jTextField11.setText("1d8+STR");

        jCheckBox4.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
        jCheckBox4.setText("Melee");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Prof");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jButton3.setText("Atk");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Dmg");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel56.setText(" 0");

        jLabel52.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel52.setText("0");

        jButton1.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addGap(18, 18, 18)
                .addComponent(jLabel56)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jCheckBox4)
                .addComponent(jCheckBox5)
                .addComponent(jButton3)
                .addComponent(jButton4)
                .addComponent(jLabel52)
                .addComponent(jLabel56)
                .addComponent(jButton1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        updateAtkModifer(true, false);
        
        if (jCheckBox4.isSelected()) {
            jCheckBox4.setText(g.getNextAttackType(jCheckBox4.getText()));
            jCheckBox4.setSelected(false);
        }

    }//GEN-LAST:event_jCheckBox4ActionPerformed

    public void updateAtkModifer(boolean changedAtkAtt, boolean changedProf) {
        if (changedProf) {
            if (jCheckBox5.isSelected()) {
                jTextField9.setText(jTextField9.getText() + "+PROF");
            } else {
                jTextField9.setText(jTextField9.getText().replaceFirst("[\\+]*PROF", ""));
            }
        }
        
        if (changedAtkAtt) {
            switch(jCheckBox4.getText()){
                case "Melee":
                    jTextField9.setText(jTextField9.getText().replaceFirst("STR", "DEX"));
                    jTextField11.setText(jTextField11.getText().replaceFirst("STR", "DEX"));
                    break;
                case "Range":
                    jTextField9.setText(jTextField9.getText().replaceFirst("DEX", "WIS"));
                    jTextField11.setText(jTextField11.getText().replaceFirst("DEX", "WIS"));
                    break;
                case "Wisdm":
                    jTextField9.setText(jTextField9.getText().replaceFirst("WIS", "INT"));
                    jTextField11.setText(jTextField11.getText().replaceFirst("WIS", "INT"));
                    break;
                case "Intel":
                    jTextField9.setText(jTextField9.getText().replaceFirst("INT", "CHA"));
                    jTextField11.setText(jTextField11.getText().replaceFirst("INT", "CHA"));
                    break;
                case "Chrsm":
                    jTextField9.setText(jTextField9.getText().replaceFirst("CHA[\\+]*", ""));
                    jTextField11.setText(jTextField11.getText().replaceFirst("[\\+]*CHA", ""));
                    break;
                case "None ":
                    if(jTextField9.getText().trim().length()>0)
                        jTextField9.setText("STR+"+jTextField9.getText());
                    else
                        jTextField9.setText("STR");
                    jTextField11.setText(jTextField11.getText()+"+STR");
                    break;
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int mod = new Formula(jTextField9.getText()).getValue(g.getModifier("STR"), g.getModifier("DEX"),
                g.getModifier("CON"), g.getModifier("INT"), g.getModifier("WIS"),
                g.getModifier("CHA"), g.getModifier("PROF"));
        jLabel52.setText(mod + "");
        int finalValue = mod + Formula.getDice(1, 20);
        jLabel56.setText(String.format("%2d", finalValue));
        if (g.online != null) {
            g.online.print(" rolled ATTACK on " + jTextField7.getText() + " - " + finalValue + "("+mod+")");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int mod = new Formula(jTextField11.getText().replaceFirst("[0-9]+d[0-9]+", "")).getValue(g.getModifier("STR"), g.getModifier("DEX"),
                g.getModifier("CON"), g.getModifier("INT"), g.getModifier("WIS"),
                g.getModifier("CHA"), g.getModifier("PROF"));
        jLabel52.setText(mod + "");
        
        int finalValue = new Formula(jTextField11.getText()).getValue(g.getModifier("STR"), g.getModifier("DEX"),
                g.getModifier("CON"), g.getModifier("INT"), g.getModifier("WIS"),
                g.getModifier("CHA"), g.getModifier("PROF"));
        jLabel56.setText(String.format("%2d", finalValue));
        
        if (g.online != null) {
            g.online.print(" rolled DAMAGE on " + jTextField7.getText() + " - " + finalValue + "("+mod+")");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        updateAtkModifer(false, true);
    }//GEN-LAST:event_jCheckBox5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JCheckBox jCheckBox4;
    public javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel56;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
