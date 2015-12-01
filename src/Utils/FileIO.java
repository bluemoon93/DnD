/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Swing.Gui;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author BlueMoon
 */
public class FileIO {
    public static void formatTextBoxes(Gui g){
        if (g.strScore.getText().equals("")) {
            g.strScore.setText(" ");
        }
        if (g.dexScore.getText().equals("")) {
            g.dexScore.setText(" ");
        }
        if (g.conScore.getText().equals("")) {
            g.conScore.setText(" ");
        }
        if (g.intScore.getText().equals("")) {
            g.intScore.setText(" ");
        }
        if (g.wisScore.getText().equals("")) {
            g.wisScore.setText(" ");
        }
        if (g.chaScore.getText().equals("")) {
            g.chaScore.setText(" ");
        }

        if (g.speedScore.getText().equals("")) {
            g.speedScore.setText(" ");
        }
        if (g.hitDiceNumber.getText().equals("")) {
            g.hitDiceNumber.setText(" ");
        }
        if (g.currHpScore.getText().equals("")) {
            g.currHpScore.setText(" ");
        }

        if (g.raceClass.getText().equals("")) {
            g.raceClass.setText(" ");
        }
        if (g.xpScore.getText().equals("")) {
            g.xpScore.setText(" ");
        }
        if (g.alignment.getText().equals("")) {
            g.alignment.setText(" ");
        }
        if (g.charName.getText().equals("")) {
            g.charName.setText(" ");
        }

        if (g.jTextField7.getText().equals("")) {
            g.jTextField7.setText(" ");
        }
        if (g.jTextField9.getText().equals("")) {
            g.jTextField9.setText(" ");
        }
        if (g.jTextField11.getText().equals("")) {
            g.jTextField11.setText(" ");
        }
        if (g.jTextField17.getText().equals("")) {
            g.jTextField17.setText(" ");
        }

        if (g.jTextField18.getText().equals("")) {
            g.jTextField18.setText(" ");
        }
        if (g.jTextField19.getText().equals("")) {
            g.jTextField19.setText(" ");
        }
        if (g.jTextField20.getText().equals("")) {
            g.jTextField20.setText(" ");
        }
        if (g.jTextField11.getText().equals("")) {
            g.jTextField21.setText(" ");
        }

        if (g.jTextField22.getText().equals("")) {
            g.jTextField22.setText(" ");
        }
        if (g.jTextField23.getText().equals("")) {
            g.jTextField23.setText(" ");
        }
        if (g.jTextField24.getText().equals("")) {
            g.jTextField24.setText(" ");
        }
        if (g.jTextField25.getText().equals("")) {
            g.jTextField25.setText(" ");
        }

        if (g.jTextField26.getText().equals("")) {
            g.jTextField26.setText(" ");
        }
        if (g.jTextField27.getText().equals("")) {
            g.jTextField27.setText(" ");
        }
        if (g.jTextField28.getText().equals("")) {
            g.jTextField28.setText(" ");
        }
        if (g.jTextField29.getText().equals("")) {
            g.jTextField29.setText(" ");
        }
    }
    
    public static void loadFile(Gui g){
        JFileChooser openFile = new JFileChooser();
        openFile.setCurrentDirectory(new File("."));

        if (openFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File a = openFile.getSelectedFile();
            try {
                Scanner fin = new Scanner(a);

                g.strScore.setText(fin.nextLine().split("=")[1]);
                g.dexScore.setText(fin.nextLine().split("=")[1]);
                g.conScore.setText(fin.nextLine().split("=")[1]);
                g.intScore.setText(fin.nextLine().split("=")[1]);
                g.wisScore.setText(fin.nextLine().split("=")[1]);
                g.chaScore.setText(fin.nextLine().split("=")[1]);
                /*g.strScoreActionPerformed(null);
                g.dexScoreActionPerformed(null);
                g.conScoreActionPerformed(null);
                g.intScoreActionPerformed(null);
                g.wisScoreActionPerformed(null);
                g.chaScoreActionPerformed(null);*/

                g.jRadioButton1.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton2.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton3.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton4.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton5.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton6.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                /*g.stActionListener(g.jRadioButton1, g.strST, "STR");
                g.stActionListener(g.jRadioButton2, g.dexST, "DEX");
                g.stActionListener(g.jRadioButton3, g.conST, "CON");
                g.stActionListener(g.jRadioButton4, g.intST, "INT");
                g.stActionListener(g.jRadioButton5, g.wisST, "WIS");
                g.stActionListener(g.jRadioButton6, g.chaST, "CHA");*/
                

                g.acFormula = new Formula(fin.nextLine().split("=")[1]);
                g.speedScore.setText(fin.nextLine().split("=")[1]);
                g.hitDiceNumber.setText(fin.nextLine().split("=")[1]);
                g.currHpScore.setText(fin.nextLine().split("=")[1]);
                g.acScore.setText("" + g.acFormula.getValue(g.getModifier("STR"), g.getModifier("DEX"), g.getModifier("CON"),
                        g.getModifier("INT"), g.getModifier("WIS"), g.getModifier("CHA"), g.getModifier("PROF")));
                
                //jTextField10ActionPerformed(null);
                //g.hitDiceNumberActionPerformed(null);
                //g.currHpScoreActionPerformed(null);
                g.hitDiceML.update();
                g.currHpML.update();

                g.jRadioButton11.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton25.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton10.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton8.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton12.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton14.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton15.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton13.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton16.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton17.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton9.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton18.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton19.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton20.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton21.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton22.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton23.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.jRadioButton24.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                /*g.jRadioButton11ActionPerformed(null);
                g.jRadioButton25ActionPerformed(null);
                g.jRadioButton10ActionPerformed(null);
                g.jRadioButton8ActionPerformed(null);
                g.jRadioButton12ActionPerformed(null);
                g.jRadioButton14ActionPerformed(null);
                g.jRadioButton15ActionPerformed(null);
                g.jRadioButton13ActionPerformed(null);
                g.jRadioButton16ActionPerformed(null);
                g.jRadioButton16ActionPerformed(null);
                g.jRadioButton9ActionPerformed(null);
                g.jRadioButton18ActionPerformed(null);
                g.jRadioButton19ActionPerformed(null);
                g.jRadioButton20ActionPerformed(null);
                g.jRadioButton21ActionPerformed(null);
                g.jRadioButton22ActionPerformed(null);
                g.jRadioButton23ActionPerformed(null);
                g.jRadioButton24ActionPerformed(null);*/

                g.raceClass.setText(fin.nextLine().split("=")[1]);
                g.xpScore.setText(fin.nextLine().split("=")[1]);
                g.alignment.setText(fin.nextLine().split("=")[1]);
                g.charName.setText(fin.nextLine().split("=")[1]);
                //jTextField12ActionPerformed(null);
                //g.xpScoreActionPerformed(null);
                g.xpML.update();
                //jTextField14ActionPerformed(null);
                //jTextField15ActionPerformed(null);

                g.jTextField7.setText(fin.nextLine().split("=")[1]);
                g.jTextField9.setText(fin.nextLine().split("=")[1]);
                g.jTextField11.setText(fin.nextLine().split("=")[1]);
                g.jTextField17.setText(fin.nextLine().split("=")[1]);
                g.jCheckBox4.setText(fin.nextLine().split("=")[1]);
                g.jCheckBox5.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));

                g.jTextField18.setText(fin.nextLine().split("=")[1]);
                g.jTextField19.setText(fin.nextLine().split("=")[1]);
                g.jTextField20.setText(fin.nextLine().split("=")[1]);
                g.jTextField21.setText(fin.nextLine().split("=")[1]);
                g.jCheckBox6.setText(fin.nextLine().split("=")[1]);
                g.jCheckBox7.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));

                g.jTextField22.setText(fin.nextLine().split("=")[1]);
                g.jTextField23.setText(fin.nextLine().split("=")[1]);
                g.jTextField24.setText(fin.nextLine().split("=")[1]);
                g.jTextField25.setText(fin.nextLine().split("=")[1]);
                g.jCheckBox8.setText(fin.nextLine().split("=")[1]);
                g.jCheckBox9.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));

                g.jTextField26.setText(fin.nextLine().split("=")[1]);
                g.jTextField27.setText(fin.nextLine().split("=")[1]);
                g.jTextField28.setText(fin.nextLine().split("=")[1]);
                g.jTextField29.setText(fin.nextLine().split("=")[1]);
                g.jCheckBox10.setText(fin.nextLine().split("=")[1]);
                g.jCheckBox11.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));

                String person = "";
                String temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    person += temp + "\n";
                    temp = fin.nextLine();
                }
                person += temp.substring(0, temp.length() - 1);
                g.personality.setText(person);

                String ideals = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    ideals += temp + "\n";
                    temp = fin.nextLine();
                }
                ideals += temp.substring(0, temp.length() - 1);
                g.idealsBonds.setText(ideals);

                String flaws2 = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    flaws2 += temp + "\n";
                    temp = fin.nextLine();
                }
                flaws2 += temp.substring(0, temp.length() - 1);
                g.flaws.setText(flaws2);

                String equips = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    equips += temp + "\n";
                    temp = fin.nextLine();
                }
                equips += temp.substring(0, temp.length() - 1);
                g.equipsGold.setText(equips);

                String features = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    features += temp + "\n";
                    temp = fin.nextLine();
                }
                features += temp.substring(0, temp.length() - 1);
                g.featuresTraits.setText(features);

                String profs = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    profs += temp + "\n";
                    temp = fin.nextLine();
                }
                profs += temp.substring(0, temp.length() - 1);
                g.profsLanguages.setText(profs);

                fin.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void saveFile(Gui g){
        

        JFileChooser saveFile = new JFileChooser();
        saveFile.setCurrentDirectory(new File("."));
        if (saveFile.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            File a = saveFile.getSelectedFile();
            try {
                try (PrintWriter out = new PrintWriter(a)) {
                    out.println("str=" + g.strScore.getText());
                    out.println("dex=" + g.dexScore.getText());
                    out.println("con=" + g.conScore.getText());
                    out.println("int=" + g.intScore.getText());
                    out.println("wis=" + g.wisScore.getText());
                    out.println("cha=" + g.chaScore.getText());

                    out.println("STstr=" + g.jRadioButton1.isSelected());
                    out.println("STdex=" + g.jRadioButton2.isSelected());
                    out.println("STcon=" + g.jRadioButton3.isSelected());
                    out.println("STint=" + g.jRadioButton4.isSelected());
                    out.println("STwis=" + g.jRadioButton5.isSelected());
                    out.println("STcha=" + g.jRadioButton6.isSelected());

                    out.println("ac=" + g.acFormula.form);
                    out.println("speed=" + g.speedScore.getText());
                    out.println("diceN=" + g.hitDiceNumber.getText());
                    out.println("hp=" + g.currHpScore.getText());

                    out.println("acr=" + g.jRadioButton11.isSelected());
                    out.println("ah=" + g.jRadioButton25.isSelected());
                    out.println("arcana=" + g.jRadioButton10.isSelected());
                    out.println("athl=" + g.jRadioButton8.isSelected());
                    out.println("decep=" + g.jRadioButton12.isSelected());
                    out.println("histo=" + g.jRadioButton14.isSelected());
                    out.println("insigh=" + g.jRadioButton15.isSelected());
                    out.println("intim=" + g.jRadioButton13.isSelected());
                    out.println("inves=" + g.jRadioButton16.isSelected());
                    out.println("medic=" + g.jRadioButton17.isSelected());
                    out.println("nature=" + g.jRadioButton9.isSelected());
                    out.println("perce=" + g.jRadioButton18.isSelected());
                    out.println("perf=" + g.jRadioButton19.isSelected());
                    out.println("persu=" + g.jRadioButton20.isSelected());
                    out.println("relig=" + g.jRadioButton21.isSelected());
                    out.println("SoH=" + g.jRadioButton22.isSelected());
                    out.println("stealth=" + g.jRadioButton23.isSelected());
                    out.println("survi=" + g.jRadioButton24.isSelected());

                    out.println("raceclass=" + g.raceClass.getText());
                    out.println("xp=" + g.xpScore.getText());
                    out.println("align=" + g.alignment.getText());
                    out.println("name=" + g.charName.getText());

                    out.println("wep1name=" + g.jTextField7.getText());
                    out.println("wep1Amod=" + g.jTextField9.getText());
                    out.println("wep1dmg=" + g.jTextField11.getText());
                    out.println("wep1Dtype=" + g.jTextField17.getText());
                    out.println("wep1Wtype=" + g.jCheckBox4.getText());
                    out.println("wep1prof=" + g.jCheckBox5.isSelected());

                    out.println("wep2name=" + g.jTextField18.getText());
                    out.println("wep2Amod=" + g.jTextField19.getText());
                    out.println("wep2dmg=" + g.jTextField20.getText());
                    out.println("wep2Dtype=" + g.jTextField21.getText());
                    out.println("wep2Wtype=" + g.jCheckBox6.getText());
                    out.println("wep2prof=" + g.jCheckBox7.isSelected());

                    out.println("wep3name=" + g.jTextField22.getText());
                    out.println("wep3Amod=" + g.jTextField23.getText());
                    out.println("wep3dmg=" + g.jTextField24.getText());
                    out.println("wep3Dtype=" + g.jTextField25.getText());
                    out.println("wep3Wtype=" + g.jCheckBox8.getText());
                    out.println("wep3prof=" + g.jCheckBox9.isSelected());

                    out.println("wep4name=" + g.jTextField26.getText());
                    out.println("wep4Amod=" + g.jTextField27.getText());
                    out.println("wep4dmg=" + g.jTextField28.getText());
                    out.println("wep4Dtype=" + g.jTextField29.getText());
                    out.println("wep4Wtype=" + g.jCheckBox10.getText());
                    out.println("wep4prof=" + g.jCheckBox11.isSelected());

                    out.println("person=<" + g.personality.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("ideals=<" + g.idealsBonds.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("flaws=<" + g.flaws.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("equipsGold=<" + g.equipsGold.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("featuresTraits=<" + g.featuresTraits.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("profsLangs=<" + g.profsLanguages.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
