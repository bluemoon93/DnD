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
public class DicePanel extends javax.swing.JPanel {

    Gui g;

    /**
     * Creates new form dicePanel2
     */
    public DicePanel() {
        initComponents();
        //this.gui=gui;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diceField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        hasAdvantage = new javax.swing.JCheckBox();
        hasDisadvantage = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        diceField.setText("1d20");
        diceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diceFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Roll");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel41.setText("0");

        hasAdvantage.setText("Inspiration/Advantage");
        hasAdvantage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasAdvantageActionPerformed(evt);
            }
        });

        hasDisadvantage.setText("Disadvantage");
        hasDisadvantage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasDisadvantageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diceField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hasDisadvantage)
                            .addComponent(hasAdvantage))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addComponent(hasAdvantage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasDisadvantage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dice = diceField.getText();
        Formula f = new Formula(dice);

        int diceValue = 0;
        boolean hasDice=false;
        try {
            if (dice.contains("d")) {
                String[] fields = dice.split("d");
                int i = 0;
                String dValue = "";
                while (Character.isDigit(fields[1].charAt(i))) {
                    dValue += fields[1].charAt(i);
                    i++;
                }

                diceValue = Integer.parseInt(dValue);
                hasDice=true;
            }
        } catch (Exception ex) {
            //
        }
        
        int val = f.getValue(g.getModifier("STR"), g.getModifier("DEX"),
                g.getModifier("CON"), g.getModifier("INT"), g.getModifier("WIS"),
                g.getModifier("CHA"), g.getModifier("PROF"));
        if (hasAdvantage.isSelected()) {
            int val2 = f.getValue(g.getModifier("STR"), g.getModifier("DEX"),
                    g.getModifier("CON"), g.getModifier("INT"), g.getModifier("WIS"),
                    g.getModifier("CHA"), g.getModifier("PROF"));
            if (val2 > val) {
                val = val2;
            }
        } else if (hasDisadvantage.isSelected()) {
            int val2 = f.getValue(g.getModifier("STR"), g.getModifier("DEX"),
                    g.getModifier("CON"), g.getModifier("INT"), g.getModifier("WIS"),
                    g.getModifier("CHA"), g.getModifier("PROF"));
            if (val2 < val) {
                val = val2;
            }
        }
        jLabel41.setText("" + val);
        hasAdvantage.setSelected(false);
        hasDisadvantage.setSelected(false);
        g.updatePassiveWisdom();

        if (g.online != null) {
            if (val == 1 && hasDice) {
                g.online.print(" rolled a " + diceField.getText() + " for " + val + ". CRITICAL FAIL");
            } else if (val == diceValue && hasDice) {
                g.online.print(" rolled a " + diceField.getText() + " for " + val + ". CRITICAL SUCCESS");
            } else {
                g.online.print(" rolled a " + diceField.getText() + " for " + val);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hasAdvantageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasAdvantageActionPerformed
        //Advantage/Inspiration
        if (hasAdvantage.isSelected()) {
            hasDisadvantage.setSelected(false);
        }
        g.updatePassiveWisdom();
    }//GEN-LAST:event_hasAdvantageActionPerformed

    private void hasDisadvantageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasDisadvantageActionPerformed
        //Disadvantage
        if (hasDisadvantage.isSelected()) {
            hasAdvantage.setSelected(false);
        }
        g.updatePassiveWisdom();
    }//GEN-LAST:event_hasDisadvantageActionPerformed

    private void diceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diceFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diceField;
    public javax.swing.JCheckBox hasAdvantage;
    public javax.swing.JCheckBox hasDisadvantage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel41;
    // End of variables declaration//GEN-END:variables
}
