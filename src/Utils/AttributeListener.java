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
public class AttributeListener implements DocumentListener {

    Gui g;
    JTextField textField;
    String attribute;
    JLabel modLabel;
    JLabel ac;

    public AttributeListener(Gui g, JTextField f, String s, JLabel l, JLabel ac) {
        this.g = g;
        this.textField = f;
        this.attribute = s;
        this.modLabel = l;
        this.ac = ac;
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

    private void update() {
        int val;
        try {
            val = Integer.parseInt(textField.getText());
        } catch (Exception ex) {
            return;
        }
        int mod = val / 2 - 5;
        modLabel.setText("" + mod);

        switch (attribute) {
            case "STR":
                g.stActionListener(g.jRadioButton1, g.strST, "STR");

                g.skillActionListener(g.jRadioButton8, g.athleticsCheckMod, "STR");
                break;
            case "DEX":
                g.stActionListener(g.jRadioButton2, g.dexST, "DEX");

                g.skillActionListener(g.jRadioButton11, g.acrobaticsCheckMod, "DEX");
                g.skillActionListener(g.jRadioButton22, g.sleightHandCheckMod, "DEX");
                g.skillActionListener(g.jRadioButton23, g.stealthCheckMod, "DEX");
                break;
            case "CON":
                g.stActionListener(g.jRadioButton3, g.conST, "CON");
                
                //g.hitDiceNumberActionPerformed(null);
                g.hitDiceML.update();
                break;
            case "INT":
                g.stActionListener(g.jRadioButton4, g.intST, "INT");

                g.skillActionListener(g.jRadioButton21, g.religionCheckMod, "INT");
                g.skillActionListener(g.jRadioButton10, g.arcanaCheckMod, "INT");
                g.skillActionListener(g.jRadioButton14, g.historyCheckMod, "INT");
                g.skillActionListener(g.jRadioButton16, g.investigationCheckMod, "INT");
                g.skillActionListener(g.jRadioButton9, g.natureCheckMod, "INT");
                break;
            case "WIS":
                g.stActionListener(g.jRadioButton5, g.wisST, "WIS");

                g.skillActionListener(g.jRadioButton25, g.animalCheckMod, "WIS");
                g.skillActionListener(g.jRadioButton15, g.insightCheckMod, "WIS");
                g.skillActionListener(g.jRadioButton17, g.medicineCheckMod, "WIS");
                g.skillActionListener(g.jRadioButton18, g.perceptionCheckMod, "WIS");
                g.skillActionListener(g.jRadioButton24, g.survivalCheckMod, "WIS");
                
                g.updatePassiveWisdom();
                break;
            case "CHA":
                g.stActionListener(g.jRadioButton6, g.chaST, "CHA");

                g.skillActionListener(g.jRadioButton12, g.deceptionCheckMod, "CHA");
                g.skillActionListener(g.jRadioButton13, g.intimidationCheckMod, "CHA");
                g.skillActionListener(g.jRadioButton19, g.performanceCheckMod, "CHA");
                g.skillActionListener(g.jRadioButton20, g.persuasionCheckMod, "CHA");
                break;
            default:
                System.out.println("Trying to update "+attribute);
                break;
        }

        ac.setText("" + g.acFormula.getValue(g.getModifier("STR"), g.getModifier("DEX"), g.getModifier("CON"),
                g.getModifier("INT"), g.getModifier("WIS"), g.getModifier("CHA"), g.getModifier("PROF")));
    }
}
