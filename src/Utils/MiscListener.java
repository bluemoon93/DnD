/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Swing.Gui;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author BlueMoon
 */
public class MiscListener implements DocumentListener {

    Gui g;
    String target;

    public MiscListener(Gui g, String s) {
        this.g = g;
        this.target = s;
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
        // doesnt get called
    }

    public void update() {
        switch (target) {
            case "HITDICE":
                updateHidDice();
                break;
            case "XP":
                updateXP();
                break;
            case "CURRHP":
                updateCurrHp();
                break;
            default:
                System.out.println("Trying to update "+target);
                break;
        }

    }
    
    private void updateHidDice(){
        int diceN = Integer.parseInt(g.hitDiceNumber.getText());
        int level = g.getCurrentLevel();
        int constMod = g.getModifier("CON");
        if (level == 1) {
            // Base HP at lvl 1
            g.jLabel61.setText("/ " + (diceN + constMod) + " HP");
        } else {
            // Base HP + (avg+con) per level
            g.jLabel61.setText("/ " + (diceN + constMod + ((diceN / 2) + 1 + constMod) * (level - 1)) + " HP");
        }
        g.jLabel60.setText(level + " Hit Dice Left");
    }
    
    private void updateCurrHp(){
        int hp = Integer.parseInt(g.currHpScore.getText());
        if (hp > 0) {
            g.jButton13.setEnabled(false);
            g.jCheckBox17.setSelected(false);
            g.jCheckBox3.setSelected(false);
            g.jCheckBox12.setSelected(false);
            g.jCheckBox13.setSelected(false);
            g.jCheckBox14.setSelected(false);
            g.jCheckBox15.setSelected(false);
            g.jCheckBox16.setSelected(false);

            g.jCheckBox17.setEnabled(false);
            g.jCheckBox3.setEnabled(false);
            g.jCheckBox12.setEnabled(false);
            g.jCheckBox13.setEnabled(false);
            g.jCheckBox14.setEnabled(false);
            g.jCheckBox15.setEnabled(false);
            g.jCheckBox16.setEnabled(false);

            g.stableButtonActionListener();

            g.jButton12.setEnabled(true);
            g.jButton11.setEnabled(true);
        } else {
            g.jButton13.setEnabled(true);
            g.jButton12.setEnabled(false);
            g.jButton11.setEnabled(false);

            g.jCheckBox17.setEnabled(true);
            g.jCheckBox3.setEnabled(true);
            g.jCheckBox12.setEnabled(true);
            g.jCheckBox13.setEnabled(true);
            g.jCheckBox14.setEnabled(true);
            g.jCheckBox15.setEnabled(true);
            g.jCheckBox16.setEnabled(true);
        }
    }
    
    private void updateXP(){
        int xp;
        try{
            xp = Integer.parseInt(g.xpScore.getText());
        }catch(Exception ex){
            return;
        }

        int level = 0, profBonus = 0;
        if (xp >= 355000) {
            level = 20;
            profBonus = 6;
        } else if (xp >= 305000) {
            level = 19;
            profBonus = 6;
        } else if (xp >= 265000) {
            level = 18;
            profBonus = 6;
        } else if (xp >= 225000) {
            level = 17;
            profBonus = 6;
        } else if (xp >= 195000) {
            level = 16;
            profBonus = 5;
        } else if (xp >= 165000) {
            level = 15;
            profBonus = 5;
        } else if (xp >= 140000) {
            level = 14;
            profBonus = 5;
        } else if (xp >= 120000) {
            level = 13;
            profBonus = 5;
        } else if (xp >= 100000) {
            level = 12;
            profBonus = 4;
        } else if (xp >= 85000) {
            level = 11;
            profBonus = 4;
        } else if (xp >= 64000) {
            level = 10;
            profBonus = 4;
        } else if (xp >= 48000) {
            level = 9;
            profBonus = 4;
        } else if (xp >= 34000) {
            level = 8;
            profBonus = 3;
        } else if (xp >= 23000) {
            level = 7;
            profBonus = 3;
        } else if (xp >= 14000) {
            level = 6;
            profBonus = 3;
        } else if (xp >= 6500) {
            level = 5;
            profBonus = 3;
        } else if (xp >= 2700) {
            level = 4;
            profBonus = 2;
        } else if (xp >= 900) {
            level = 3;
            profBonus = 2;
        } else if (xp >= 300) {
            level = 2;
            profBonus = 2;
        } else if (xp >= 0) {
            level = 1;
            profBonus = 2;
        }
        g.jLabel38.setText("XP - Level " + level);
        g.profScore.setText("+" + profBonus);
        g.stActionListener(g.jRadioButton1, g.strST, "STR");
        g.stActionListener(g.jRadioButton2, g.dexST, "DEX");
        g.stActionListener(g.jRadioButton3, g.conST, "CON");
        g.stActionListener(g.jRadioButton4, g.intST, "INT");
        g.stActionListener(g.jRadioButton5, g.wisST, "WIS");
        g.stActionListener(g.jRadioButton6, g.chaST, "CHA");

        //dex
        g.skillActionListener(g.jRadioButton11, g.acrobaticsCheckMod, "DEX");
        g.skillActionListener(g.jRadioButton22, g.sleightHandCheckMod, "DEX");
        g.skillActionListener(g.jRadioButton23, g.stealthCheckMod, "DEX");

        //wis
        g.skillActionListener(g.jRadioButton25, g.animalCheckMod, "WIS");
        g.skillActionListener(g.jRadioButton15, g.insightCheckMod, "WIS");
        g.skillActionListener(g.jRadioButton17, g.medicineCheckMod, "WIS");
        g.skillActionListener(g.jRadioButton18, g.perceptionCheckMod, "WIS");
        g.skillActionListener(g.jRadioButton24, g.survivalCheckMod, "WIS");

        //int
        g.skillActionListener(g.jRadioButton21, g.religionCheckMod, "INT");
        g.skillActionListener(g.jRadioButton10, g.arcanaCheckMod, "INT");
        g.skillActionListener(g.jRadioButton14, g.historyCheckMod, "INT");
        g.skillActionListener(g.jRadioButton16, g.investigationCheckMod, "INT");
        g.skillActionListener(g.jRadioButton9, g.natureCheckMod, "INT");

        //str
        g.skillActionListener(g.jRadioButton8, g.athleticsCheckMod, "STR");

        //cha
        g.skillActionListener(g.jRadioButton12, g.deceptionCheckMod, "CHA");
        g.skillActionListener(g.jRadioButton13, g.intimidationCheckMod, "CHA");
        g.skillActionListener(g.jRadioButton19, g.performanceCheckMod, "CHA");
        g.skillActionListener(g.jRadioButton20, g.persuasionCheckMod, "CHA");

        g.updatePassiveWisdom();
        g.hitDiceML.update();
        //g.hitDiceNumberActionPerformed(null);

    }
}
