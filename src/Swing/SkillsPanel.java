/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import Utils.Formula;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author BlueMoon
 */
public class SkillsPanel extends javax.swing.JPanel {

    Gui g;
    Formula[] forms = new Formula[18];

    /**
     * Creates new form SkillsPanel
     */
    public SkillsPanel() {
        initComponents();
        forms[0] = new Formula("DEX");
        forms[1] = new Formula("WIS");
        forms[2] = new Formula("INT");
        forms[3] = new Formula("STR");
        forms[4] = new Formula("CHA");
        forms[5] = new Formula("INT");
        forms[6] = new Formula("WIS");
        forms[7] = new Formula("CHA");
        forms[8] = new Formula("INT");
        forms[9] = new Formula("WIS");
        forms[10] = new Formula("INT");
        forms[11] = new Formula("WIS");
        forms[12] = new Formula("CHA");
        forms[13] = new Formula("CHA");
        forms[14] = new Formula("INT");
        forms[15] = new Formula("DEX");
        forms[16] = new Formula("DEX");
        forms[17] = new Formula("WIS");
    }

    public void updateIntSkills() {
        skillActionListener(jRadioButton21, religionCheckMod, 14);
        skillActionListener(jRadioButton10, arcanaCheckMod, 2);
        skillActionListener(jRadioButton14, historyCheckMod, 5);
        skillActionListener(jRadioButton16, investigationCheckMod, 8);
        skillActionListener(jRadioButton9, natureCheckMod, 10);
    }

    public void updateWisSkills() {
        skillActionListener(jRadioButton25, animalCheckMod, 1);
        skillActionListener(jRadioButton15, insightCheckMod, 6);
        skillActionListener(jRadioButton17, medicineCheckMod,9);
        skillActionListener(jRadioButton18, perceptionCheckMod, 11);
        skillActionListener(jRadioButton24, survivalCheckMod, 17);
    }

    public void updateStrSkills() {
        skillActionListener(jRadioButton8, athleticsCheckMod, 3);
    }

    public void updateDexSkills() {
        skillActionListener(jRadioButton11, acrobaticsCheckMod, 0);
        skillActionListener(jRadioButton22, sleightHandCheckMod, 15);
        skillActionListener(jRadioButton23, stealthCheckMod, 16);
    }

    public void updateChaSkills() {
        skillActionListener(jRadioButton12, deceptionCheckMod,4);
        skillActionListener(jRadioButton13, intimidationCheckMod, 7);
        skillActionListener(jRadioButton19, performanceCheckMod, 12);
        skillActionListener(jRadioButton20, persuasionCheckMod, 13);
    }

    public void setListeners(Gui g) {
        this.g = g;

        addSkillActionListener(jRadioButton11, acrobaticsCheckMod, "DEX", 0);
        addSkillActionListener(jRadioButton25, animalCheckMod, "WIS", 1);
        addSkillActionListener(jRadioButton10, arcanaCheckMod, "INT", 2);
        addSkillActionListener(jRadioButton8, athleticsCheckMod, "STR", 3);
        addSkillActionListener(jRadioButton12, deceptionCheckMod, "CHA", 4);
        addSkillActionListener(jRadioButton14, historyCheckMod, "INT", 5);
        addSkillActionListener(jRadioButton15, insightCheckMod, "WIS", 6);
        addSkillActionListener(jRadioButton13, intimidationCheckMod, "CHA", 7);
        addSkillActionListener(jRadioButton16, investigationCheckMod, "INT", 8);
        addSkillActionListener(jRadioButton17, medicineCheckMod, "WIS", 9);
        addSkillActionListener(jRadioButton9, natureCheckMod, "INT", 10);
        addSkillActionListener(jRadioButton18, perceptionCheckMod, "WIS", 11);
        addSkillActionListener(jRadioButton19, performanceCheckMod, "CHA", 12);
        addSkillActionListener(jRadioButton20, persuasionCheckMod, "CHA", 13);
        addSkillActionListener(jRadioButton21, religionCheckMod, "INT", 14);
        addSkillActionListener(jRadioButton22, sleightHandCheckMod, "DEX", 15);
        addSkillActionListener(jRadioButton23, stealthCheckMod, "DEX", 16);
        addSkillActionListener(jRadioButton24, survivalCheckMod, "WIS", 17);
    }

    private void addSkillActionListener(JRadioButton b, JLabel l, String s, int fIndex) {
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //System.out.println(evt == null);

                if (b.isSelected()) {
                    forms[fIndex].form = s + "+PROF";
                } else {
                    forms[fIndex].form = s;
                }

                skillActionListener(b, l, fIndex);

            }
        });
    }

    public void skillActionListener(JRadioButton b, JLabel l, int fIndex) {
        //System.out.println("lol" == null);
        //if (b.isSelected()) {
        l.setText(forms[fIndex].getValue(g.getModifier("STR"), g.getModifier("DEX"),
                g.getModifier("CON"), g.getModifier("INT"), g.getModifier("WIS"),
                g.getModifier("CHA"), g.getModifier("PROF")) + "");
        //} else {
        //    l.setText(g.getModifier(s) + "");
        //}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        survivalCheckMod = new javax.swing.JLabel();
        stealthCheckMod = new javax.swing.JLabel();
        sleightHandCheckMod = new javax.swing.JLabel();
        religionCheckMod = new javax.swing.JLabel();
        persuasionCheckMod = new javax.swing.JLabel();
        performanceCheckMod = new javax.swing.JLabel();
        perceptionCheckMod = new javax.swing.JLabel();
        natureCheckMod = new javax.swing.JLabel();
        medicineCheckMod = new javax.swing.JLabel();
        investigationCheckMod = new javax.swing.JLabel();
        intimidationCheckMod = new javax.swing.JLabel();
        insightCheckMod = new javax.swing.JLabel();
        historyCheckMod = new javax.swing.JLabel();
        deceptionCheckMod = new javax.swing.JLabel();
        athleticsCheckMod = new javax.swing.JLabel();
        arcanaCheckMod = new javax.swing.JLabel();
        animalCheckMod = new javax.swing.JLabel();
        acrobaticsCheckMod = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton11.setText("Acrobatics");
        jRadioButton11.setToolTipText("Stay on your feet in a tricky situation.");

        jRadioButton25.setText("Animal Handling");
        jRadioButton25.setToolTipText("Handle animals");

        jRadioButton10.setText("Arcana");
        jRadioButton10.setToolTipText("Ability to recall lore about spells, magic items");

        jRadioButton8.setText("Athletics");
        jRadioButton8.setToolTipText("Climbing, jumping, or swimming");

        jRadioButton12.setText("Deception");
        jRadioButton12.setToolTipText("Hide the truth, either verbally or through your actions");

        jRadioButton14.setText("History");
        jRadioButton14.setToolTipText("Ability to recall lore about historical events");

        jRadioButton15.setText("Insight");
        jRadioButton15.setToolTipText("Determine the true intentions of a creature");

        jRadioButton13.setText("Intimidation");
        jRadioButton13.setToolTipText("Influence someone through threats, hostile actions, and physical violence");

        jRadioButton16.setText("Investigation");
        jRadioButton16.setToolTipText("Look around for clues and make deductions based on those clues");

        jRadioButton17.setText("Medicine");
        jRadioButton17.setToolTipText("Try to stabilize a dying companion or diagnose an illness.");

        jRadioButton9.setText("Nature");
        jRadioButton9.setToolTipText("Recall lore about terrain, plants and animals");

        jRadioButton18.setText("Perception");
        jRadioButton18.setToolTipText("Spot, hear, or otherwise detect the presence of something.");

        jRadioButton19.setText("Performance");
        jRadioButton19.setToolTipText("Delight an audience with music, dance, acting");

        jRadioButton20.setText("Persuasion");
        jRadioButton20.setToolTipText("Influence someone with tact, social graces, or good nature");

        jRadioButton21.setText("Religion");
        jRadioButton21.setToolTipText("Recall lore about deities, rites and prayers");

        jRadioButton22.setText("Sleight of Hand");
        jRadioButton22.setToolTipText("Planting/taking something on someone else or concealing an object.");

        jRadioButton23.setText("Stealth");
        jRadioButton23.setToolTipText("Conceal yourself from enemies");

        jRadioButton24.setText("Survival");
        jRadioButton24.setToolTipText("Follow tracks, hunt wild game, guide your group");

        survivalCheckMod.setText("0");

        stealthCheckMod.setText("0");

        sleightHandCheckMod.setText("0");

        religionCheckMod.setText("0");

        persuasionCheckMod.setText("0");

        performanceCheckMod.setText("0");

        perceptionCheckMod.setText("0");

        natureCheckMod.setText("0");

        medicineCheckMod.setText("0");

        investigationCheckMod.setText("0");

        intimidationCheckMod.setText("0");

        insightCheckMod.setText("0");

        historyCheckMod.setText("0");

        deceptionCheckMod.setText("0");

        athleticsCheckMod.setText("0");

        arcanaCheckMod.setText("0");

        animalCheckMod.setText("0");

        acrobaticsCheckMod.setText("0");

        jButton1.setText("Config");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(animalCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acrobaticsCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arcanaCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(athleticsCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deceptionCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(historyCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(survivalCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medicineCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(natureCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(perceptionCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(performanceCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(persuasionCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(religionCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stealthCheckMod))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton13)
                            .addComponent(jRadioButton15)
                            .addComponent(jRadioButton16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intimidationCheckMod, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insightCheckMod, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(investigationCheckMod, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jRadioButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sleightHandCheckMod)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(acrobaticsCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton25)
                    .addComponent(animalCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton10)
                    .addComponent(arcanaCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(athleticsCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton12)
                    .addComponent(deceptionCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton14)
                    .addComponent(historyCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15)
                    .addComponent(insightCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton13)
                    .addComponent(intimidationCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton16)
                    .addComponent(investigationCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton17)
                    .addComponent(medicineCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(natureCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton18)
                    .addComponent(perceptionCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton19)
                    .addComponent(performanceCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton20)
                    .addComponent(persuasionCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(religionCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton22)
                    .addComponent(sleightHandCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton23)
                    .addComponent(stealthCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton24)
                    .addComponent(survivalCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SkillsConfigFrame dialog = new SkillsConfigFrame(forms, g.getModifier("STR"), g.getModifier("DEX"), 
                        g.getModifier("CON"), g.getModifier("INT"), g.getModifier("WIS"), 
                        g.getModifier("CHA"), g.getModifier("PROF"));

                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel acrobaticsCheckMod;
    public javax.swing.JLabel animalCheckMod;
    public javax.swing.JLabel arcanaCheckMod;
    public javax.swing.JLabel athleticsCheckMod;
    public javax.swing.JLabel deceptionCheckMod;
    public javax.swing.JLabel historyCheckMod;
    public javax.swing.JLabel insightCheckMod;
    public javax.swing.JLabel intimidationCheckMod;
    public javax.swing.JLabel investigationCheckMod;
    private javax.swing.JButton jButton1;
    public javax.swing.JRadioButton jRadioButton10;
    public javax.swing.JRadioButton jRadioButton11;
    public javax.swing.JRadioButton jRadioButton12;
    public javax.swing.JRadioButton jRadioButton13;
    public javax.swing.JRadioButton jRadioButton14;
    public javax.swing.JRadioButton jRadioButton15;
    public javax.swing.JRadioButton jRadioButton16;
    public javax.swing.JRadioButton jRadioButton17;
    public javax.swing.JRadioButton jRadioButton18;
    public javax.swing.JRadioButton jRadioButton19;
    public javax.swing.JRadioButton jRadioButton20;
    public javax.swing.JRadioButton jRadioButton21;
    public javax.swing.JRadioButton jRadioButton22;
    public javax.swing.JRadioButton jRadioButton23;
    public javax.swing.JRadioButton jRadioButton24;
    public javax.swing.JRadioButton jRadioButton25;
    public javax.swing.JRadioButton jRadioButton8;
    public javax.swing.JRadioButton jRadioButton9;
    public javax.swing.JLabel medicineCheckMod;
    public javax.swing.JLabel natureCheckMod;
    public javax.swing.JLabel perceptionCheckMod;
    public javax.swing.JLabel performanceCheckMod;
    public javax.swing.JLabel persuasionCheckMod;
    public javax.swing.JLabel religionCheckMod;
    public javax.swing.JLabel sleightHandCheckMod;
    public javax.swing.JLabel stealthCheckMod;
    public javax.swing.JLabel survivalCheckMod;
    // End of variables declaration//GEN-END:variables
}
