/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import Utils.Formula;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author BlueMoon
 */
public class SkillsConfigFrame extends javax.swing.JFrame {

    /**
     * Creates new form SkillsConfigFrame
     */
    public SkillsConfigFrame(Formula[] forms, int str, int dex, int con, int intl, int wis, int cha, int prof) {
        initComponents();

        jTextField1.getDocument().addDocumentListener(new skillListener(jTextField1, acrobaticsCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField2.getDocument().addDocumentListener(new skillListener(jTextField2, animalCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField3.getDocument().addDocumentListener(new skillListener(jTextField3, arcanaCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField4.getDocument().addDocumentListener(new skillListener(jTextField4, athleticsCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField5.getDocument().addDocumentListener(new skillListener(jTextField5, deceptionCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField6.getDocument().addDocumentListener(new skillListener(jTextField6, historyCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField7.getDocument().addDocumentListener(new skillListener(jTextField7, insightCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField8.getDocument().addDocumentListener(new skillListener(jTextField8, intimidationCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField9.getDocument().addDocumentListener(new skillListener(jTextField9, investigationCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField10.getDocument().addDocumentListener(new skillListener(jTextField10, medicineCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField11.getDocument().addDocumentListener(new skillListener(jTextField11, natureCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField12.getDocument().addDocumentListener(new skillListener(jTextField12, perceptionCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField13.getDocument().addDocumentListener(new skillListener(jTextField13, performanceCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField14.getDocument().addDocumentListener(new skillListener(jTextField14, persuasionCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField15.getDocument().addDocumentListener(new skillListener(jTextField15, religionCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField16.getDocument().addDocumentListener(new skillListener(jTextField16, sleightHandCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField17.getDocument().addDocumentListener(new skillListener(jTextField17, stealthCheckMod, str, dex, con, intl, wis, cha, prof));
        jTextField18.getDocument().addDocumentListener(new skillListener(jTextField18, survivalCheckMod, str, dex, con, intl, wis, cha, prof));

        
        jTextField1.setText(forms[0].form);
        jTextField2.setText(forms[1].form);
        jTextField3.setText(forms[2].form);
        jTextField4.setText(forms[3].form);
        jTextField5.setText(forms[4].form);
        jTextField6.setText(forms[5].form);
        jTextField7.setText(forms[6].form);
        jTextField8.setText(forms[7].form);
        jTextField9.setText(forms[8].form);
        jTextField10.setText(forms[9].form);
        jTextField11.setText(forms[10].form);
        jTextField12.setText(forms[11].form);
        jTextField13.setText(forms[12].form);
        jTextField14.setText(forms[13].form);
        jTextField15.setText(forms[14].form);
        jTextField16.setText(forms[15].form);
        jTextField17.setText(forms[16].form);
        jTextField18.setText(forms[17].form);

    }

    public class skillListener implements DocumentListener {

        JTextField t;
        JLabel l;
        int str, dex, con, intl, wis, cha, prof;

        public skillListener(JTextField t, JLabel l, int str, int dex, int con, int intl, int wis, int cha, int prof) {
            this.t=t;
            this.l=l;
            this.str=str;
            this.dex=dex;
            this.con=con;
            this.intl=intl;
            this.wis=wis;
            this.cha=cha;
            this.prof=prof;
        }

        @Override
        public void insertUpdate(DocumentEvent de) {
            update();
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
            update();
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
            //
        }

        private void update() {
            l.setText(""+new Formula(t.getText()).getValue(str, dex, con, intl, wis, cha, prof));
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

        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        investigationCheckMod = new javax.swing.JLabel();
        intimidationCheckMod = new javax.swing.JLabel();
        insightCheckMod = new javax.swing.JLabel();
        historyCheckMod = new javax.swing.JLabel();
        deceptionCheckMod = new javax.swing.JLabel();
        athleticsCheckMod = new javax.swing.JLabel();
        arcanaCheckMod = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        animalCheckMod = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        acrobaticsCheckMod = new javax.swing.JLabel();
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
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jRadioButton14.setText("History");
        jRadioButton14.setToolTipText("Ability to recall lore about historical events");

        jRadioButton15.setText("Insight");
        jRadioButton15.setToolTipText("Determine the true intentions of a creature");

        investigationCheckMod.setText("0");

        intimidationCheckMod.setText("0");

        insightCheckMod.setText("0");

        historyCheckMod.setText("0");

        deceptionCheckMod.setText("0");

        athleticsCheckMod.setText("0");

        arcanaCheckMod.setText("0");

        jRadioButton13.setText("Intimidation");
        jRadioButton13.setToolTipText("Influence someone through threats, hostile actions, and physical violence");

        animalCheckMod.setText("0");

        jRadioButton16.setText("Investigation");
        jRadioButton16.setToolTipText("Look around for clues and make deductions based on those clues");

        acrobaticsCheckMod.setText("0");

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

        jTextField1.setText("DEX");

        jTextField2.setText("WIS");

        jTextField3.setText("INT");

        jTextField4.setText("STR");

        jTextField5.setText("CHA");

        jTextField6.setText("INT");

        jTextField7.setText("WIS");

        jTextField8.setText("CHA");

        jTextField9.setText("INT");

        jTextField10.setText("WIS");

        jTextField11.setText("INT");

        jTextField12.setText("WIS");

        jTextField13.setText("CHA");

        jTextField14.setText("CHA");

        jTextField15.setText("INT");

        jTextField16.setText("DEX");

        jTextField17.setText("DEX");

        jTextField18.setText("WIS");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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
                                .addComponent(jRadioButton22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sleightHandCheckMod)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(acrobaticsCheckMod)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton25)
                    .addComponent(animalCheckMod)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton10)
                    .addComponent(arcanaCheckMod)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(athleticsCheckMod)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton12)
                    .addComponent(deceptionCheckMod)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton14)
                    .addComponent(historyCheckMod)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15)
                    .addComponent(insightCheckMod)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton13)
                    .addComponent(intimidationCheckMod)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton16)
                    .addComponent(investigationCheckMod)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton17)
                    .addComponent(medicineCheckMod)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(natureCheckMod)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton18)
                    .addComponent(perceptionCheckMod)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton19)
                    .addComponent(performanceCheckMod)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton20)
                    .addComponent(persuasionCheckMod)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(religionCheckMod)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton22)
                    .addComponent(sleightHandCheckMod)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton23)
                    .addComponent(stealthCheckMod)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton24)
                    .addComponent(survivalCheckMod)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
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
