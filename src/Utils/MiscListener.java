/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Swing.Gui;
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
        int diceN;
        try{
            diceN= Integer.parseInt(g.hPPanel1.hitDiceNumber.getText());
        }catch(Exception ex){
            return;
        } 
        int level = g.getCurrentLevel();
        int constMod = g.getModifier("CON");
        if (level == 1) {
            // Base HP at lvl 1
            g.hPPanel1.jLabel61.setText("/ " + (diceN + constMod) + " HP");
        } else {
            // Base HP + (avg+con) per level
            g.hPPanel1.jLabel61.setText("/ " + (diceN + constMod + ((diceN / 2) + 1 + constMod) * (level - 1)) + " HP");
        }
        g.hPPanel1.jLabel60.setText(level + " Hit Dice Left");
    }
    
    private void updateCurrHp(){
        int hp;
        try{
            hp= Integer.parseInt(g.hPPanel1.currHpScore.getText());
        }catch(Exception ex){
            return;
        }
        if (hp > 0) {
            g.hPPanel1.jButton13.setEnabled(false);
            g.hPPanel1.jCheckBox17.setSelected(false);
            g.hPPanel1.jCheckBox3.setSelected(false);
            g.hPPanel1.jCheckBox12.setSelected(false);
            g.hPPanel1.jCheckBox13.setSelected(false);
            g.hPPanel1.jCheckBox14.setSelected(false);
            g.hPPanel1.jCheckBox15.setSelected(false);
            g.hPPanel1.jCheckBox16.setSelected(false);

            g.hPPanel1.jCheckBox17.setEnabled(false);
            g.hPPanel1.jCheckBox3.setEnabled(false);
            g.hPPanel1.jCheckBox12.setEnabled(false);
            g.hPPanel1.jCheckBox13.setEnabled(false);
            g.hPPanel1.jCheckBox14.setEnabled(false);
            g.hPPanel1.jCheckBox15.setEnabled(false);
            g.hPPanel1.jCheckBox16.setEnabled(false);

            g.hPPanel1.stableButtonActionListener();

            g.hPPanel1.jButton12.setEnabled(true);
            g.hPPanel1.jButton11.setEnabled(true);
        } else {
            g.hPPanel1.jButton13.setEnabled(true);
            g.hPPanel1.jButton12.setEnabled(false);
            g.hPPanel1.jButton11.setEnabled(false);

            g.hPPanel1.jCheckBox17.setEnabled(true);
            g.hPPanel1.jCheckBox3.setEnabled(true);
            g.hPPanel1.jCheckBox12.setEnabled(true);
            g.hPPanel1.jCheckBox13.setEnabled(true);
            g.hPPanel1.jCheckBox14.setEnabled(true);
            g.hPPanel1.jCheckBox15.setEnabled(true);
            g.hPPanel1.jCheckBox16.setEnabled(true);
        }
    }
    
    private void updateXP(){
        int xp;
        try{
            xp = Integer.parseInt(g.namePanel1.xpScore.getText());
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
        g.namePanel1.jLabel38.setText("XP - Level " + level);
        g.aCPanel1.profScore.setText("+" + profBonus);
        g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton1, g.sTPanel1.strST, "STR");
        g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton2, g.sTPanel1.dexST, "DEX");
        g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton3, g.sTPanel1.conST, "CON");
        g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton4, g.sTPanel1.intST, "INT");
        g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton5, g.sTPanel1.wisST, "WIS");
        g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton6, g.sTPanel1.chaST, "CHA");

        g.skillsPanel1.updateDexSkills();
        g.skillsPanel1.updateWisSkills();
        g.skillsPanel1.updateIntSkills();
        g.skillsPanel1.updateStrSkills();
        g.skillsPanel1.updateChaSkills();
        
        g.updatePassiveWisdom();
        g.hPPanel1.hitDiceML.update();
        g.spellStats1.updateSpellVars();
    }
}
