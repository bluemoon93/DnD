/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import Utils.Formula;
import Utils.MiscListener;

/**
 *
 * @author BlueMoon
 */
public class HPPanel extends javax.swing.JPanel {
    Gui g;
    public MiscListener hitDiceML, currHpML;
    
    /**
     * Creates new form HPPanel
     */
    public HPPanel() {
        initComponents();
    }
    
    public void setListeners(Gui g){
        this.g=g;
        
        hitDiceML=new MiscListener(g, "HITDICE");
        currHpML=new MiscListener(g, "CURRHP");
        
        hitDiceNumber.getDocument().addDocumentListener(hitDiceML);
        currHpScore.getDocument().addDocumentListener(currHpML);
        
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stableButtonActionListener();
            }
        });
    }
    
    public void stableButtonActionListener(){
        if (jCheckBox17.isSelected()) {
            jButton13.setText("Hours AFK");
        } else {
            jButton13.setText("Death Save");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hitDiceNumber = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        currHpScore = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        hitDiceNumber.setText("10");

        jLabel51.setText("Dice Number");

        currHpScore.setText("10");

        jLabel61.setText("/ 10 HP");

        jLabel60.setText("1 Hit Dice Left");

        jButton11.setText("Long Rest");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Short Rest");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Death Save");
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel63.setText(" 0");

        jLabel64.setText("Life");

        jLabel65.setText("Death");

        jCheckBox14.setEnabled(false);

        jCheckBox3.setEnabled(false);

        jCheckBox12.setEnabled(false);

        jCheckBox15.setEnabled(false);

        jCheckBox16.setEnabled(false);

        jCheckBox13.setEnabled(false);

        jCheckBox17.setText("Stable");
        jCheckBox17.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(currHpScore, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(hitDiceNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel65)
                    .addComponent(jLabel64)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox13))))
                    .addComponent(jCheckBox17))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitDiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jButton13)
                    .addComponent(jLabel63)
                    .addComponent(jCheckBox17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel61)
                        .addComponent(currHpScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12)
                        .addComponent(jLabel64))
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(jButton11)
                        .addComponent(jLabel65))
                    .addComponent(jCheckBox14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox16)
                        .addComponent(jCheckBox15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // full hp, get half the max hit die; only 1 long rest per day
        //int diceN = Integer.parseInt(jTextField30.getText());
        int maxDice = g.getCurrentLevel();
        int currentDice = Integer.parseInt(jLabel60.getText().split(" ")[0]);
        currentDice += Math.ceil(maxDice / 2.0);
        if (currentDice > maxDice) {
            currentDice = maxDice;
        }
        if (g.online != null) {
            g.online.print(" has made a LONG REST. He now has " + currentDice + " Hit Dice Left");
        }
        jLabel60.setText(currentDice + " Hit Dice Left");
        jButton12.setEnabled(true);
        currHpScore.setText(jLabel61.getText().split(" ")[1]);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // regen hit die + con; use as many hit die as needed per rest
        int currHP = Integer.parseInt(currHpScore.getText());
        int diceN = Integer.parseInt(hitDiceNumber.getText());
        int regenHP = Formula.getDice(1, diceN) + g.getModifier("CON");
        currHP += regenHP;
        int maxHP = Integer.parseInt(jLabel61.getText().split(" ")[1]);
        if (currHP > maxHP) {
            currHP = maxHP;
        }
        int diceLeft = Integer.parseInt(jLabel60.getText().split(" ")[0]);
        if (diceLeft > 0) {
            if (g.online != null) {
                g.online.print(" has made a SHORT REST. He now has " + currHP + "/" + maxHP + " HP");
            }
            currHpScore.setText(currHP + "");
            jLabel60.setText((diceLeft - 1) + " Hit Dice Left");
        }
        if (diceLeft - 1 == 0) {
            jButton12.setEnabled(false);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        if (jCheckBox17.isSelected()) {
            //stable
            int d = Formula.getDice(1, 4);
            jLabel63.setText(d + "h");
            if (g.online != null) {
                g.online.print(" is passed out for " + d + " hours");
            }
        } else {
            //dying
            int d = Formula.getDice(1, 20);
            jLabel63.setText(String.format("%2d", d));
            if (g.online != null) {
                g.online.print(" rolled a DEATH SAVE - " + d);
            }
            if (d >= 10) {
                successDeathST();
                if (d == 20) {
                    successDeathST();
                }
            } else {
                failureDeathST();
                if (d == 1) {
                    failureDeathST();
                }
            }
            checkStable();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

     private void failureDeathST() {
        if (!jCheckBox14.isSelected()) {
            jCheckBox14.setSelected(true);
        } else if (!jCheckBox15.isSelected()) {
            jCheckBox15.setSelected(true);
        } else if (!jCheckBox16.isSelected()) {
            jCheckBox16.setSelected(true);
        }
    }

    private void successDeathST() {
        if (!jCheckBox3.isSelected()) {
            jCheckBox3.setSelected(true);
        } else if (!jCheckBox12.isSelected()) {
            jCheckBox12.setSelected(true);
        } else if (!jCheckBox13.isSelected()) {
            jCheckBox13.setSelected(true);
        }
    }

    private void checkStable() {
        if (jCheckBox3.isSelected() && jCheckBox12.isSelected() && jCheckBox13.isSelected()) {
            jCheckBox17.setSelected(true);
            jButton13.setText("Hours AFK");
        } else if (jCheckBox3.isSelected() && jCheckBox12.isSelected() && jCheckBox13.isSelected()) {
            jCheckBox17.setSelected(false);
            jCheckBox17.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField currHpScore;
    public javax.swing.JTextField hitDiceNumber;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JCheckBox jCheckBox12;
    public javax.swing.JCheckBox jCheckBox13;
    public javax.swing.JCheckBox jCheckBox14;
    public javax.swing.JCheckBox jCheckBox15;
    public javax.swing.JCheckBox jCheckBox16;
    public javax.swing.JCheckBox jCheckBox17;
    public javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel51;
    public javax.swing.JLabel jLabel60;
    public javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    // End of variables declaration//GEN-END:variables
}
