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
                g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton1, g.sTPanel1.strST, "STR");

                g.skillsPanel1.updateStrSkills();
                break;
            case "DEX":
                g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton2, g.sTPanel1.dexST, "DEX");

                g.skillsPanel1.updateDexSkills();
                break;
            case "CON":
                g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton3, g.sTPanel1.conST, "CON");
                
                //g.hitDiceNumberActionPerformed(null);
                g.hPPanel1.hitDiceML.update();
                break;
            case "INT":
                g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton4, g.sTPanel1.intST, "INT");

                g.skillsPanel1.updateIntSkills();
                break;
            case "WIS":
                g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton5, g.sTPanel1.wisST, "WIS");

                g.skillsPanel1.updateWisSkills();
                
                g.updatePassiveWisdom();
                break;
            case "CHA":
                g.sTPanel1.stActionListener(g.sTPanel1.jRadioButton6, g.sTPanel1.chaST, "CHA");

                g.skillsPanel1.updateChaSkills();
                break;
            default:
                System.out.println("Trying to update "+attribute);
                break;
        }

        ac.setText("" + g.acFormula.getValue(g.getModifier("STR"), g.getModifier("DEX"), g.getModifier("CON"),
                g.getModifier("INT"), g.getModifier("WIS"), g.getModifier("CHA"), g.getModifier("PROF")));
    }
}
