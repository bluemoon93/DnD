/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import Online.OnlineGui;
import Utils.AttributeListener;
import Utils.FileIO;
import Utils.Formula;
import Utils.MiscListener;
import java.net.ServerSocket;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author BlueMoon
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
        strScore.getDocument().addDocumentListener(new AttributeListener(this, strScore, "STR", strModifier, acScore));
        dexScore.getDocument().addDocumentListener(new AttributeListener(this, dexScore, "DEX", dexModifier, acScore));
        conScore.getDocument().addDocumentListener(new AttributeListener(this, conScore, "CON", conModifier, acScore));
        intScore.getDocument().addDocumentListener(new AttributeListener(this, intScore, "INT", intModifier, acScore));
        wisScore.getDocument().addDocumentListener(new AttributeListener(this, wisScore, "WIS", wisModifier, acScore));
        chaScore.getDocument().addDocumentListener(new AttributeListener(this, chaScore, "CHA", chaModifier, acScore));
        //dicePanel=new DicePanel(this);

        addSTActionListener(jRadioButton1, strST, "STR");
        addSTActionListener(jRadioButton2, dexST, "DEX");
        addSTActionListener(jRadioButton3, conST, "CON");
        addSTActionListener(jRadioButton4, intST, "INT");
        addSTActionListener(jRadioButton5, wisST, "WIS");
        addSTActionListener(jRadioButton6, chaST, "CHA");

        addSkillActionListener(jRadioButton11, acrobaticsCheckMod, "DEX");
        addSkillActionListener(jRadioButton25, animalCheckMod, "WIS");
        addSkillActionListener(jRadioButton10, arcanaCheckMod, "INT");
        addSkillActionListener(jRadioButton8, athleticsCheckMod, "STR");
        addSkillActionListener(jRadioButton12, deceptionCheckMod, "CHA");
        addSkillActionListener(jRadioButton14, historyCheckMod, "INT");
        addSkillActionListener(jRadioButton15, insightCheckMod, "WIS");
        addSkillActionListener(jRadioButton13, intimidationCheckMod, "CHA");
        addSkillActionListener(jRadioButton16, investigationCheckMod, "INT");
        addSkillActionListener(jRadioButton17, medicineCheckMod, "WIS");
        addSkillActionListener(jRadioButton9, natureCheckMod, "INT");
        addSkillActionListener(jRadioButton18, perceptionCheckMod, "WIS");
        addSkillActionListener(jRadioButton19, performanceCheckMod, "CHA");
        addSkillActionListener(jRadioButton20, persuasionCheckMod, "CHA");
        addSkillActionListener(jRadioButton21, religionCheckMod, "INT");
        addSkillActionListener(jRadioButton22, sleightHandCheckMod, "DEX");
        addSkillActionListener(jRadioButton23, stealthCheckMod, "DEX");
        addSkillActionListener(jRadioButton24, survivalCheckMod, "WIS");
        
        hitDiceML=new MiscListener(this, "HITDICE");
        currHpML=new MiscListener(this, "CURRHP");
        xpML=new MiscListener(this, "XP");
        hitDiceNumber.getDocument().addDocumentListener(hitDiceML);
        currHpScore.getDocument().addDocumentListener(currHpML);
        xpScore.getDocument().addDocumentListener(xpML);
        
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stableButtonActionListener();
            }
        });
    }

    private void addSTActionListener(JRadioButton b, JLabel l, String s) {
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stActionListener(b, l, s);
            }
        });
    }

    public void stActionListener(JRadioButton b, JLabel l, String s) {
        if (b.isSelected()) {
            l.setText((getModifier(s) + getModifier("PROF")) + "");
        } else {
            l.setText(getModifier(s) + "");
        }
    }

    private void addSkillActionListener(JRadioButton b, JLabel l, String s) {
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillActionListener(b, l, s);
            }
        });
    }

    public void skillActionListener(JRadioButton b, JLabel l, String s) {
        if (b.isSelected()) {
            l.setText(getModifier(s) + getModifier("PROF") + "");
        } else {
            l.setText(getModifier(s) + "");
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        strScore = new javax.swing.JTextField();
        dexScore = new javax.swing.JTextField();
        conScore = new javax.swing.JTextField();
        intScore = new javax.swing.JTextField();
        wisScore = new javax.swing.JTextField();
        chaScore = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        strModifier = new javax.swing.JLabel();
        dexModifier = new javax.swing.JLabel();
        conModifier = new javax.swing.JLabel();
        intModifier = new javax.swing.JLabel();
        wisModifier = new javax.swing.JLabel();
        chaModifier = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        strST = new javax.swing.JLabel();
        dexST = new javax.swing.JLabel();
        conST = new javax.swing.JLabel();
        intST = new javax.swing.JLabel();
        wisST = new javax.swing.JLabel();
        chaST = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        speedScore = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        profScore = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        initScore = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        passWisScore = new javax.swing.JLabel();
        acScore = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        acrobaticsCheckMod = new javax.swing.JLabel();
        animalCheckMod = new javax.swing.JLabel();
        arcanaCheckMod = new javax.swing.JLabel();
        athleticsCheckMod = new javax.swing.JLabel();
        deceptionCheckMod = new javax.swing.JLabel();
        historyCheckMod = new javax.swing.JLabel();
        insightCheckMod = new javax.swing.JLabel();
        intimidationCheckMod = new javax.swing.JLabel();
        investigationCheckMod = new javax.swing.JLabel();
        medicineCheckMod = new javax.swing.JLabel();
        natureCheckMod = new javax.swing.JLabel();
        perceptionCheckMod = new javax.swing.JLabel();
        performanceCheckMod = new javax.swing.JLabel();
        persuasionCheckMod = new javax.swing.JLabel();
        religionCheckMod = new javax.swing.JLabel();
        sleightHandCheckMod = new javax.swing.JLabel();
        stealthCheckMod = new javax.swing.JLabel();
        survivalCheckMod = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        raceClass = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        xpScore = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        alignment = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        charName = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personality = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        idealsBonds = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        flaws = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        equipsGold = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        featuresTraits = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        profsLanguages = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        hitDiceNumber = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        currHpScore = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        dicePanel = new Swing.DicePanel();
        dicePanel.gui=this;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("CON");

        jLabel4.setText("INT");

        jLabel5.setText("WIS");

        jLabel6.setText("CHA");
        jLabel6.setToolTipText("");

        strScore.setText("10");

        dexScore.setText("10");

        conScore.setText("10");

        intScore.setText("10");

        wisScore.setText("10");

        chaScore.setText("10");

        jLabel1.setText("STR");

        jLabel2.setText("DEX");

        strModifier.setText("0");

        dexModifier.setText("0");

        conModifier.setText("0");

        intModifier.setText("0");

        wisModifier.setText("0");

        chaModifier.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(strScore, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(dexScore, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(conScore, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(intScore, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wisScore, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chaScore, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(strModifier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chaModifier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dexModifier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(conModifier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(intModifier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(wisModifier)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(strModifier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dexScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dexModifier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(conModifier))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(intModifier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wisScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(wisModifier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chaScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(chaModifier))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton1.setText("STR");

        jRadioButton2.setText("DEX");

        jRadioButton3.setText("CON");

        jRadioButton4.setText("INT");

        jRadioButton5.setText("WIS");

        jRadioButton6.setText("CHA");

        jLabel13.setText("Saving Throws");

        strST.setText("0");

        dexST.setText("0");

        conST.setText("0");

        intST.setText("0");

        wisST.setText("0");

        chaST.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(strST))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(intST))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dexST))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(wisST))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chaST))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(conST)))
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(strST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(dexST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(conST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(intST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(wisST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(chaST))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setText("Proficiency Bonus");
        jLabel32.setToolTipText("");

        jLabel33.setText("Armor Class");
        jLabel33.setToolTipText("");

        speedScore.setText("0");

        jLabel34.setText("Initiative");
        jLabel34.setToolTipText("");

        jLabel35.setText("Speed");
        jLabel35.setToolTipText("");

        profScore.setText("+2");

        jButton2.setText("Roll!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        initScore.setText("0");

        jLabel49.setText("Passive Wisdom");

        passWisScore.setText("12");

        acScore.setText("10");

        jButton16.setText("Set");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(profScore))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acScore)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedScore, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(initScore, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passWisScore, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jLabel35)
                            .addComponent(jLabel49))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(profScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(acScore)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jButton2)
                    .addComponent(initScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(passWisScore))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton14.setText("History");
        jRadioButton14.setToolTipText("Ability to recall lore about historical events");

        jRadioButton15.setText("Insight");
        jRadioButton15.setToolTipText("Determine the true intentions of a creature");

        jRadioButton16.setText("Investigation");
        jRadioButton16.setToolTipText("Look around for clues and make deductions based on those clues");

        jRadioButton17.setText("Medicine");
        jRadioButton17.setToolTipText("Try to stabilize a dying companion or diagnose an illness.");

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

        jRadioButton8.setText("Athletics");
        jRadioButton8.setToolTipText("Climbing, jumping, or swimming");

        jRadioButton9.setText("Nature");
        jRadioButton9.setToolTipText("Recall lore about terrain, plants and animals");

        jRadioButton10.setText("Arcana");
        jRadioButton10.setToolTipText("Ability to recall lore about spells, magic items");

        jRadioButton11.setText("Acrobatics");
        jRadioButton11.setToolTipText("Stay on your feet in a tricky situation.");

        jRadioButton12.setText("Deception");
        jRadioButton12.setToolTipText("Hide the truth, either verbally or through your actions");

        jRadioButton25.setText("Animal Handling");
        jRadioButton25.setToolTipText("Handle animals");

        jRadioButton13.setText("Intimidation");
        jRadioButton13.setToolTipText("Influence someone through threats, hostile actions, and physical violence");

        acrobaticsCheckMod.setText("0");

        animalCheckMod.setText("0");

        arcanaCheckMod.setText("0");

        athleticsCheckMod.setText("0");

        deceptionCheckMod.setText("0");

        historyCheckMod.setText("0");

        insightCheckMod.setText("0");

        intimidationCheckMod.setText("0");

        investigationCheckMod.setText("0");

        medicineCheckMod.setText("0");

        natureCheckMod.setText("0");

        perceptionCheckMod.setText("0");

        performanceCheckMod.setText("0");

        persuasionCheckMod.setText("0");

        religionCheckMod.setText("0");

        sleightHandCheckMod.setText("0");

        stealthCheckMod.setText("0");

        survivalCheckMod.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(animalCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acrobaticsCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arcanaCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(athleticsCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deceptionCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(historyCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(survivalCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medicineCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(natureCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(perceptionCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(performanceCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(persuasionCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(religionCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sleightHandCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stealthCheckMod))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton13)
                            .addComponent(jRadioButton15)
                            .addComponent(jRadioButton16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(investigationCheckMod, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insightCheckMod, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(intimidationCheckMod, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(acrobaticsCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton25)
                    .addComponent(animalCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton10)
                    .addComponent(arcanaCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(athleticsCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton12)
                    .addComponent(deceptionCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton14)
                    .addComponent(historyCheckMod))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insightCheckMod)
                    .addComponent(jRadioButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intimidationCheckMod)
                    .addComponent(jRadioButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton16)
                    .addComponent(investigationCheckMod))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton17)
                    .addComponent(medicineCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(natureCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton18)
                    .addComponent(perceptionCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton19)
                    .addComponent(performanceCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton20)
                    .addComponent(persuasionCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(religionCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton22)
                    .addComponent(sleightHandCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton23)
                    .addComponent(stealthCheckMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton24)
                    .addComponent(survivalCheckMod))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        raceClass.setText("?");

        jLabel37.setText("Race / Class");

        xpScore.setText("0");

        jLabel38.setText("XP - Level 1");

        alignment.setText("?");

        jLabel39.setText("Alignment");

        charName.setText("?");

        jLabel40.setText("Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(alignment, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(xpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(raceClass, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(charName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raceClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xpScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alignment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(charName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        personality.setColumns(20);
        personality.setRows(3);
        personality.setText("Personality");
        jScrollPane1.setViewportView(personality);

        idealsBonds.setColumns(20);
        idealsBonds.setRows(3);
        idealsBonds.setText("Ideals & Bonds");
        jScrollPane2.setViewportView(idealsBonds);

        flaws.setColumns(20);
        flaws.setRows(3);
        flaws.setText("Flaws");
        jScrollPane3.setViewportView(flaws);

        equipsGold.setColumns(20);
        equipsGold.setRows(5);
        equipsGold.setText("Equipment & Gold");
        jScrollPane4.setViewportView(equipsGold);

        featuresTraits.setColumns(20);
        featuresTraits.setRows(5);
        featuresTraits.setText("Features & Traits");
        jScrollPane5.setViewportView(featuresTraits);

        profsLanguages.setColumns(20);
        profsLanguages.setRows(4);
        profsLanguages.setText("Proficiencies & Languages");
        jScrollPane6.setViewportView(profsLanguages);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setText("ARoll");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel52.setText(" 0");

        jTextField7.setText("Awesome Bow");

        jTextField9.setText("0");
        jTextField9.setToolTipText("Attack Roll Modifier");

        jTextField11.setText("1d8+3");

        jTextField17.setText("Pierce");

        jCheckBox4.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
        jCheckBox4.setText("Melee");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Prof");

        jButton4.setText("DRoll");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField18.setText("Hammer");

        jTextField19.setText("0");
        jTextField19.setToolTipText("Attack Roll Modifier");

        jTextField20.setText("1d6");

        jTextField21.setText("Bludgeon");

        jCheckBox6.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
        jCheckBox6.setText("Melee");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("Prof");

        jButton5.setText("ARoll");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("DRoll");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel53.setText(" 0");

        jTextField22.setText("Sword");

        jTextField23.setText("0");
        jTextField23.setToolTipText("Attack Roll Modifier");

        jTextField24.setText("2d6");
        jTextField24.setToolTipText("");

        jTextField25.setText("Slash");

        jCheckBox8.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
        jCheckBox8.setText("Melee");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setText("Prof");

        jButton7.setText("ARoll");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("DRoll");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel54.setText(" 0");

        jTextField26.setText("Chemical Spray");

        jTextField27.setText("0");
        jTextField27.setToolTipText("Attack Roll Modifier");

        jTextField28.setText("1d8");

        jTextField29.setText("Acid");

        jCheckBox10.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
        jCheckBox10.setText("Melee");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox11.setText("Prof");

        jButton9.setText("ARoll");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("DRoll");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel55.setText(" 0");

        jLabel56.setText("0");

        jLabel57.setText("0");

        jLabel58.setText("0");

        jLabel59.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField24))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField17)
                            .addComponent(jTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jCheckBox6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jLabel56))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel57))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField29)
                            .addComponent(jTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel58))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jCheckBox10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel59)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel53))
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(7, 7, 7))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jLabel52)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel53)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jButton6)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel54)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jButton8)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jLabel55)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox11)
                    .addComponent(jButton10)
                    .addComponent(jLabel59))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton11.setText("Long Rest");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        hitDiceNumber.setText("10");

        jLabel51.setText("Dice Number");

        jLabel60.setText("1 Hit Dice Left");

        jLabel61.setText("/ 10 HP");

        currHpScore.setText("10");

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

        jCheckBox3.setEnabled(false);

        jLabel64.setText("Life");

        jLabel65.setText("Death");

        jCheckBox12.setEnabled(false);

        jCheckBox13.setEnabled(false);

        jCheckBox14.setEnabled(false);

        jCheckBox15.setEnabled(false);

        jCheckBox16.setEnabled(false);

        jCheckBox17.setText("Stable");
        jCheckBox17.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(currHpScore, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(hitDiceNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel65)
                    .addComponent(jLabel64)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jCheckBox15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox16))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jCheckBox12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox13))
                    .addComponent(jCheckBox17))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitDiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jButton13)
                    .addComponent(jLabel63)
                    .addComponent(jCheckBox17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel61)
                        .addComponent(currHpScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12)
                        .addComponent(jLabel64))
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(jButton11)
                        .addComponent(jLabel65))
                    .addComponent(jCheckBox14)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox16)
                        .addComponent(jCheckBox15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton14.setText("Save");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Load");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton17.setText("Connect");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Host");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton17)
                                    .addComponent(jButton18))
                                .addGap(7, 7, 7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton14)
                                .addComponent(jButton15)))
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //protected String acFormula = "+10+DEX";
    public Formula acFormula = new Formula("10+DEX");
    public OnlineGui online = null;
    public MiscListener hitDiceML, currHpML, xpML;

    public int getModifier(String stat) {
        switch (stat) {
            case "DEX":
                return Integer.parseInt(dexModifier.getText());
            case "STR":
                return Integer.parseInt(strModifier.getText());
            case "INT":
                return Integer.parseInt(intModifier.getText());
            case "CON":
                return Integer.parseInt(conModifier.getText());
            case "WIS":
                return Integer.parseInt(wisModifier.getText());
            case "CHA":
                return Integer.parseInt(chaModifier.getText());
            case "PROF":
                return Integer.parseInt(profScore.getText());
            default:
                try {
                    return Integer.parseInt(stat);
                } catch (Exception ex) {
                    return 0;
                }
        }
    }

    public void updatePassiveWisdom() {
        int val = 10;
        if (((DicePanel) dicePanel).hasAdvantage.isSelected()) {
            val += 5;
        } else if (((DicePanel) dicePanel).hasDisadvantage.isSelected()) {
            val -= 5;
        }
        passWisScore.setText((val + Integer.parseInt(wisModifier.getText()) + Integer.parseInt(profScore.getText())) + "");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Random rand = new Random();
        int numbah = Math.abs(rand.nextInt()) % 20 + 1 + Integer.parseInt(dexModifier.getText());
        initScore.setText(numbah + "");
        if (online != null) {
            online.print(" rolled INITIATIVE - " + numbah);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()) {
            jCheckBox4.setText(getNextAttackType(jCheckBox4.getText()));
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()) {
            jCheckBox6.setText(getNextAttackType(jCheckBox6.getText()));
            jCheckBox6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if (jCheckBox8.isSelected()) {
            jCheckBox8.setText(getNextAttackType(jCheckBox8.getText()));
            jCheckBox8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        if (jCheckBox10.isSelected()) {
            jCheckBox10.setText(getNextAttackType(jCheckBox10.getText()));
            jCheckBox10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private String getNextAttackType(String a) {
        switch (a) {
            case "Melee":
                return "Range";
            case "Range":
                return "Wisdm";
            case "Wisdm":
                return "Intel";
            case "Intel":
                return "Chrsm";
            case "Chrsm":
                return "None ";
            case "None ":
                return "Melee";
        }
        return "";
    }

    private int getAttackTypeModifier(String a) {
        switch (a) {
            case "Melee":
                return Integer.parseInt(strModifier.getText());
            case "Range":
                return Integer.parseInt(dexModifier.getText());
            case "Wisdm":
                return Integer.parseInt(wisModifier.getText());
            case "Intel":
                return Integer.parseInt(intModifier.getText());
            case "Chrsm":
                return Integer.parseInt(chaModifier.getText());
            case "None ":
                return 0;
        }
        return 0;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int mod = Integer.parseInt(jTextField9.getText());
        mod += getAttackTypeModifier(jCheckBox4.getText());

        if (jCheckBox5.isSelected()) {
            mod += Integer.parseInt(profScore.getText());
        }
        jLabel56.setText(mod + "");
        mod += Formula.getDice(1, 20);
        jLabel52.setText(mod + "");
        if (online != null) {
            online.print(" rolled ATTACK on " + jTextField7.getText() + " - " + mod);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int mod = 0;
        mod += getAttackTypeModifier(jCheckBox4.getText());

        jLabel56.setText(mod + "");
        String[] fields = jTextField11.getText().split("[d+]");
        mod += Formula.getDice(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]));
        if (fields.length == 3) {
            mod += Integer.parseInt(fields[2]);
        }
        jLabel52.setText(mod + "");
        if (online != null) {
            online.print(" rolled DAMAGE on " + jTextField7.getText() + " - " + mod);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int mod = Integer.parseInt(jTextField19.getText());
        mod += getAttackTypeModifier(jCheckBox6.getText());

        if (jCheckBox7.isSelected()) {
            mod += Integer.parseInt(profScore.getText());
        }
        jLabel57.setText(mod + "");
        mod += Formula.getDice(1, 20);
        jLabel53.setText(mod + "");
        if (online != null) {
            online.print(" rolled ATTACK on " + jTextField18.getText() + " - " + mod);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int mod = 0;
        mod += getAttackTypeModifier(jCheckBox6.getText());

        jLabel57.setText(mod + "");
        String[] fields = jTextField20.getText().split("[d+]");
        mod += Formula.getDice(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]));
        if (fields.length == 3) {
            mod += Integer.parseInt(fields[2]);
        }
        jLabel53.setText(mod + "");
        if (online != null) {
            online.print(" rolled DAMAGE on " + jTextField18.getText() + " - " + mod);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int mod = Integer.parseInt(jTextField23.getText());
        mod += getAttackTypeModifier(jCheckBox8.getText());

        if (jCheckBox9.isSelected()) {
            mod += Integer.parseInt(profScore.getText());
        }
        jLabel58.setText(mod + "");
        mod += Formula.getDice(1, 20);
        jLabel54.setText(mod + "");
        if (online != null) {
            online.print(" rolled ATTACK on " + jTextField22.getText() + " - " + mod);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int mod = 0;
        mod += getAttackTypeModifier(jCheckBox8.getText());

        jLabel58.setText(mod + "");
        String[] fields = jTextField24.getText().split("[d+]");
        mod += Formula.getDice(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]));
        if (fields.length == 3) {
            mod += Integer.parseInt(fields[2]);
        }
        jLabel54.setText(mod + "");
        if (online != null) {
            online.print(" rolled DAMAGE on " + jTextField22.getText() + " - " + mod);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int mod = Integer.parseInt(jTextField27.getText());
        mod += getAttackTypeModifier(jCheckBox10.getText());

        if (jCheckBox11.isSelected()) {
            mod += Integer.parseInt(profScore.getText());
        }
        jLabel59.setText(mod + "");
        mod += Formula.getDice(1, 20);
        jLabel55.setText(mod + "");
        if (online != null) {
            online.print(" rolled ATTACK on " + jTextField26.getText() + " - " + mod);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int mod = 0;
        mod += getAttackTypeModifier(jCheckBox10.getText());

        jLabel59.setText(mod + "");
        String[] fields = jTextField28.getText().split("[d+]");
        mod += Formula.getDice(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]));
        if (fields.length == 3) {
            mod += Integer.parseInt(fields[2]);
        }
        jLabel55.setText(mod + "");
        if (online != null) {
            online.print(" rolled DAMAGE on " + jTextField26.getText() + " - " + mod);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    public int getCurrentLevel() {
        return Integer.parseInt(jLabel38.getText().split(" ")[3]);
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // full hp, get half the max hit die; only 1 long rest per day
        //int diceN = Integer.parseInt(jTextField30.getText());
        int maxDice = getCurrentLevel();
        int currentDice = Integer.parseInt(jLabel60.getText().split(" ")[0]);
        currentDice += Math.ceil(maxDice / 2.0);
        if (currentDice > maxDice) {
            currentDice = maxDice;
        }
        if (online != null) {
            online.print(" has made a LONG REST. He now has " + currentDice + " Hit Dice Left");
        }
        jLabel60.setText(currentDice + " Hit Dice Left");
        jButton12.setEnabled(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // regen hit die + con; use as many hit die as needed per rest
        int currHP = Integer.parseInt(currHpScore.getText());
        int diceN = Integer.parseInt(hitDiceNumber.getText());
        int regenHP = Formula.getDice(1, diceN) + Integer.parseInt(conModifier.getText());
        currHP += regenHP;
        int maxHP = Integer.parseInt(jLabel61.getText().split(" ")[1]);
        if (currHP > maxHP) {
            currHP = maxHP;
        }
        int diceLeft = Integer.parseInt(jLabel60.getText().split(" ")[0]);
        if (diceLeft > 0) {
            if (online != null) {
                online.print(" has made a SHORT REST. He now has " + currHP + "/" + maxHP + " HP");
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
            if (online != null) {
                online.print(" is passed out for " + d + " hours");
            }
        } else {
            //dying
            int d = Formula.getDice(1, 20);
            jLabel63.setText(String.format("%2d", d));
            if (online != null) {
                online.print(" rolled a DEATH SAVE - " + d);
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

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        FileIO.formatTextBoxes(this);
        FileIO.saveFile(this);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        FileIO.loadFile(this);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        javax.swing.JFrame l = this;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AC dialog = new AC(l, true, getModifier("STR"), getModifier("DEX"), getModifier("CON"),
                        getModifier("INT"), getModifier("WIS"), getModifier("CHA"),
                        Integer.parseInt(strScore.getText()), acScore, getModifier("PROF"));

                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        ServerSocket sock;
        try {
            sock = new ServerSocket(0);
            //setVisible(false);
            //dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    online = new OnlineGui(sock);
                    online.setVisible(true);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        javax.swing.JFrame l = this;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Connect dialog = new Connect(l, true, charName.getText());
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton17ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel acScore;
    public javax.swing.JLabel acrobaticsCheckMod;
    public javax.swing.JTextField alignment;
    public javax.swing.JLabel animalCheckMod;
    public javax.swing.JLabel arcanaCheckMod;
    public javax.swing.JLabel athleticsCheckMod;
    public javax.swing.JLabel chaModifier;
    public javax.swing.JLabel chaST;
    public javax.swing.JTextField chaScore;
    public javax.swing.JTextField charName;
    public javax.swing.JLabel conModifier;
    public javax.swing.JLabel conST;
    public javax.swing.JTextField conScore;
    public javax.swing.JTextField currHpScore;
    public javax.swing.JLabel deceptionCheckMod;
    public javax.swing.JLabel dexModifier;
    public javax.swing.JLabel dexST;
    public javax.swing.JTextField dexScore;
    private Swing.DicePanel dicePanel;
    public javax.swing.JTextArea equipsGold;
    public javax.swing.JTextArea featuresTraits;
    public javax.swing.JTextArea flaws;
    public javax.swing.JLabel historyCheckMod;
    public javax.swing.JTextField hitDiceNumber;
    public javax.swing.JTextArea idealsBonds;
    private javax.swing.JLabel initScore;
    public javax.swing.JLabel insightCheckMod;
    public javax.swing.JLabel intModifier;
    public javax.swing.JLabel intST;
    public javax.swing.JTextField intScore;
    public javax.swing.JLabel intimidationCheckMod;
    public javax.swing.JLabel investigationCheckMod;
    private javax.swing.JButton jButton10;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public javax.swing.JCheckBox jCheckBox10;
    public javax.swing.JCheckBox jCheckBox11;
    public javax.swing.JCheckBox jCheckBox12;
    public javax.swing.JCheckBox jCheckBox13;
    public javax.swing.JCheckBox jCheckBox14;
    public javax.swing.JCheckBox jCheckBox15;
    public javax.swing.JCheckBox jCheckBox16;
    public javax.swing.JCheckBox jCheckBox17;
    public javax.swing.JCheckBox jCheckBox3;
    public javax.swing.JCheckBox jCheckBox4;
    public javax.swing.JCheckBox jCheckBox5;
    public javax.swing.JCheckBox jCheckBox6;
    public javax.swing.JCheckBox jCheckBox7;
    public javax.swing.JCheckBox jCheckBox8;
    public javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel60;
    public javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JRadioButton jRadioButton1;
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
    public javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JRadioButton jRadioButton20;
    public javax.swing.JRadioButton jRadioButton21;
    public javax.swing.JRadioButton jRadioButton22;
    public javax.swing.JRadioButton jRadioButton23;
    public javax.swing.JRadioButton jRadioButton24;
    public javax.swing.JRadioButton jRadioButton25;
    public javax.swing.JRadioButton jRadioButton3;
    public javax.swing.JRadioButton jRadioButton4;
    public javax.swing.JRadioButton jRadioButton5;
    public javax.swing.JRadioButton jRadioButton6;
    public javax.swing.JRadioButton jRadioButton8;
    public javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField17;
    public javax.swing.JTextField jTextField18;
    public javax.swing.JTextField jTextField19;
    public javax.swing.JTextField jTextField20;
    public javax.swing.JTextField jTextField21;
    public javax.swing.JTextField jTextField22;
    public javax.swing.JTextField jTextField23;
    public javax.swing.JTextField jTextField24;
    public javax.swing.JTextField jTextField25;
    public javax.swing.JTextField jTextField26;
    public javax.swing.JTextField jTextField27;
    public javax.swing.JTextField jTextField28;
    public javax.swing.JTextField jTextField29;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField9;
    public javax.swing.JLabel medicineCheckMod;
    public javax.swing.JLabel natureCheckMod;
    private javax.swing.JLabel passWisScore;
    public javax.swing.JLabel perceptionCheckMod;
    public javax.swing.JLabel performanceCheckMod;
    public javax.swing.JTextArea personality;
    public javax.swing.JLabel persuasionCheckMod;
    public javax.swing.JLabel profScore;
    public javax.swing.JTextArea profsLanguages;
    public javax.swing.JTextField raceClass;
    public javax.swing.JLabel religionCheckMod;
    public javax.swing.JLabel sleightHandCheckMod;
    public javax.swing.JTextField speedScore;
    public javax.swing.JLabel stealthCheckMod;
    public javax.swing.JLabel strModifier;
    public javax.swing.JLabel strST;
    public javax.swing.JTextField strScore;
    public javax.swing.JLabel survivalCheckMod;
    public javax.swing.JLabel wisModifier;
    public javax.swing.JLabel wisST;
    public javax.swing.JTextField wisScore;
    public javax.swing.JTextField xpScore;
    // End of variables declaration//GEN-END:variables
}
