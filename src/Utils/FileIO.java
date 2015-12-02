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
        if (g.attributesPanel1.strScore.getText().equals("")) {
            g.attributesPanel1.strScore.setText(" ");
        }
        if (g.attributesPanel1.dexScore.getText().equals("")) {
            g.attributesPanel1.dexScore.setText(" ");
        }
        if (g.attributesPanel1.conScore.getText().equals("")) {
            g.attributesPanel1.conScore.setText(" ");
        }
        if (g.attributesPanel1.intScore.getText().equals("")) {
            g.attributesPanel1.intScore.setText(" ");
        }
        if (g.attributesPanel1.wisScore.getText().equals("")) {
            g.attributesPanel1.wisScore.setText(" ");
        }
        if (g.attributesPanel1.chaScore.getText().equals("")) {
            g.attributesPanel1.chaScore.setText(" ");
        }

        if (g.aCPanel1.speedScore.getText().equals("")) {
            g.aCPanel1.speedScore.setText(" ");
        }
        if (g.hPPanel1.hitDiceNumber.getText().equals("")) {
            g.hPPanel1.hitDiceNumber.setText(" ");
        }
        if (g.hPPanel1.currHpScore.getText().equals("")) {
            g.hPPanel1.currHpScore.setText(" ");
        }

        if (g.namePanel1.raceClass.getText().equals("")) {
            g.namePanel1.raceClass.setText(" ");
        }
        if (g.namePanel1.xpScore.getText().equals("")) {
            g.namePanel1.xpScore.setText(" ");
        }
        if (g.namePanel1.alignment.getText().equals("")) {
            g.namePanel1.alignment.setText(" ");
        }
        if (g.namePanel1.charName.getText().equals("")) {
            g.namePanel1.charName.setText(" ");
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

                g.attributesPanel1.strScore.setText(fin.nextLine().split("=")[1]);
                g.attributesPanel1.dexScore.setText(fin.nextLine().split("=")[1]);
                g.attributesPanel1.conScore.setText(fin.nextLine().split("=")[1]);
                g.attributesPanel1.intScore.setText(fin.nextLine().split("=")[1]);
                g.attributesPanel1.wisScore.setText(fin.nextLine().split("=")[1]);
                g.attributesPanel1.chaScore.setText(fin.nextLine().split("=")[1]);
                /*g.strScoreActionPerformed(null);
                g.dexScoreActionPerformed(null);
                g.conScoreActionPerformed(null);
                g.intScoreActionPerformed(null);
                g.wisScoreActionPerformed(null);
                g.chaScoreActionPerformed(null);*/

                g.sTPanel1.jRadioButton1.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.sTPanel1.jRadioButton2.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.sTPanel1.jRadioButton3.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.sTPanel1.jRadioButton4.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.sTPanel1.jRadioButton5.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                g.sTPanel1.jRadioButton6.setSelected(Boolean.parseBoolean(fin.nextLine().split("=")[1]));
                /*g.stActionListener(g.jRadioButton1, g.strST, "STR");
                g.stActionListener(g.jRadioButton2, g.dexST, "DEX");
                g.stActionListener(g.jRadioButton3, g.conST, "CON");
                g.stActionListener(g.jRadioButton4, g.intST, "INT");
                g.stActionListener(g.jRadioButton5, g.wisST, "WIS");
                g.stActionListener(g.jRadioButton6, g.chaST, "CHA");*/
                

                g.acFormula = new Formula(fin.nextLine().split("=")[1]);
                g.aCPanel1.speedScore.setText(fin.nextLine().split("=")[1]);
                g.hPPanel1.hitDiceNumber.setText(fin.nextLine().split("=")[1]);
                g.hPPanel1.currHpScore.setText(fin.nextLine().split("=")[1]);
                g.aCPanel1.acScore.setText("" + g.acFormula.getValue(g.getModifier("STR"), g.getModifier("DEX"), g.getModifier("CON"),
                        g.getModifier("INT"), g.getModifier("WIS"), g.getModifier("CHA"), g.getModifier("PROF")));
                
                //jTextField10ActionPerformed(null);
                //g.hitDiceNumberActionPerformed(null);
                //g.currHpScoreActionPerformed(null);
                g.hPPanel1.hitDiceML.update();
                g.hPPanel1.currHpML.update();

                String [] nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton11.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[0].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton25.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[1].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton10.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[2].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton8.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[3].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton12.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[4].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton14.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[5].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton15.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[6].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton13.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[7].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton16.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[8].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton17.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[9].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton9.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[10].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton18.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[11].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton19.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[12].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton20.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[13].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton21.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[14].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton22.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[15].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton23.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[16].form=nextLine[2];
                
                nextLine = fin.nextLine().split("=");
                g.skillsPanel1.jRadioButton24.setSelected(Boolean.parseBoolean(nextLine[1]));
                if(nextLine.length>2) g.skillsPanel1.forms[17].form=nextLine[2];

                g.skillsPanel1.updateChaSkills();
                g.skillsPanel1.updateDexSkills();
                g.skillsPanel1.updateStrSkills();
                g.skillsPanel1.updateIntSkills();
                g.skillsPanel1.updateWisSkills();

                g.namePanel1.raceClass.setText(fin.nextLine().split("=")[1]);
                g.namePanel1.xpScore.setText(fin.nextLine().split("=")[1]);
                g.namePanel1.alignment.setText(fin.nextLine().split("=")[1]);
                g.namePanel1.charName.setText(fin.nextLine().split("=")[1]);
                //jTextField12ActionPerformed(null);
                //g.xpScoreActionPerformed(null);
                g.namePanel1.xpML.update();
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
                g.textPanel1.personality.setText(person);

                String ideals = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    ideals += temp + "\n";
                    temp = fin.nextLine();
                }
                ideals += temp.substring(0, temp.length() - 1);
                g.textPanel1.idealsBonds.setText(ideals);

                String flaws2 = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    flaws2 += temp + "\n";
                    temp = fin.nextLine();
                }
                flaws2 += temp.substring(0, temp.length() - 1);
                g.textPanel1.flaws.setText(flaws2);

                String equips = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    equips += temp + "\n";
                    temp = fin.nextLine();
                }
                equips += temp.substring(0, temp.length() - 1);
                g.textPanel1.equipsGold.setText(equips);

                String features = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    features += temp + "\n";
                    temp = fin.nextLine();
                }
                features += temp.substring(0, temp.length() - 1);
                g.textPanel1.featuresTraits.setText(features);

                String profs = "";
                temp = fin.nextLine().split("=")[1].substring(1);
                while (!temp.contains(">")) {
                    profs += temp + "\n";
                    temp = fin.nextLine();
                }
                profs += temp.substring(0, temp.length() - 1);
                g.textPanel1.profsLanguages.setText(profs);

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
                    out.println("str=" + g.attributesPanel1.strScore.getText());
                    out.println("dex=" + g.attributesPanel1.dexScore.getText());
                    out.println("con=" + g.attributesPanel1.conScore.getText());
                    out.println("int=" + g.attributesPanel1.intScore.getText());
                    out.println("wis=" + g.attributesPanel1.wisScore.getText());
                    out.println("cha=" + g.attributesPanel1.chaScore.getText());

                    out.println("STstr=" + g.sTPanel1.jRadioButton1.isSelected());
                    out.println("STdex=" + g.sTPanel1.jRadioButton2.isSelected());
                    out.println("STcon=" + g.sTPanel1.jRadioButton3.isSelected());
                    out.println("STint=" + g.sTPanel1.jRadioButton4.isSelected());
                    out.println("STwis=" + g.sTPanel1.jRadioButton5.isSelected());
                    out.println("STcha=" + g.sTPanel1.jRadioButton6.isSelected());

                    out.println("ac=" + g.acFormula.form);
                    out.println("speed=" + g.aCPanel1.speedScore.getText());
                    out.println("diceN=" + g.hPPanel1.hitDiceNumber.getText());
                    out.println("hp=" + g.hPPanel1.currHpScore.getText());

                    out.println("acr=" + g.skillsPanel1.jRadioButton11.isSelected()+"="+g.skillsPanel1.forms[0].form);
                    out.println("ah=" + g.skillsPanel1.jRadioButton25.isSelected()+"="+g.skillsPanel1.forms[1].form);
                    out.println("arcana=" + g.skillsPanel1.jRadioButton10.isSelected()+"="+g.skillsPanel1.forms[2].form);
                    out.println("athl=" + g.skillsPanel1.jRadioButton8.isSelected()+"="+g.skillsPanel1.forms[3].form);
                    out.println("decep=" + g.skillsPanel1.jRadioButton12.isSelected()+"="+g.skillsPanel1.forms[4].form);
                    out.println("histo=" + g.skillsPanel1.jRadioButton14.isSelected()+"="+g.skillsPanel1.forms[5].form);
                    out.println("insigh=" + g.skillsPanel1.jRadioButton15.isSelected()+"="+g.skillsPanel1.forms[6].form);
                    out.println("intim=" + g.skillsPanel1.jRadioButton13.isSelected()+"="+g.skillsPanel1.forms[7].form);
                    out.println("inves=" + g.skillsPanel1.jRadioButton16.isSelected()+"="+g.skillsPanel1.forms[8].form);
                    out.println("medic=" + g.skillsPanel1.jRadioButton17.isSelected()+"="+g.skillsPanel1.forms[9].form);
                    out.println("nature=" + g.skillsPanel1.jRadioButton9.isSelected()+"="+g.skillsPanel1.forms[10].form);
                    out.println("perce=" + g.skillsPanel1.jRadioButton18.isSelected()+"="+g.skillsPanel1.forms[11].form);
                    out.println("perf=" + g.skillsPanel1.jRadioButton19.isSelected()+"="+g.skillsPanel1.forms[12].form);
                    out.println("persu=" + g.skillsPanel1.jRadioButton20.isSelected()+"="+g.skillsPanel1.forms[13].form);
                    out.println("relig=" + g.skillsPanel1.jRadioButton21.isSelected()+"="+g.skillsPanel1.forms[14].form);
                    out.println("SoH=" + g.skillsPanel1.jRadioButton22.isSelected()+"="+g.skillsPanel1.forms[15].form);
                    out.println("stealth=" + g.skillsPanel1.jRadioButton23.isSelected()+"="+g.skillsPanel1.forms[16].form);
                    out.println("survi=" + g.skillsPanel1.jRadioButton24.isSelected()+"="+g.skillsPanel1.forms[17].form);

                    out.println("raceclass=" + g.namePanel1.raceClass.getText());
                    out.println("xp=" + g.namePanel1.xpScore.getText());
                    out.println("align=" + g.namePanel1.alignment.getText());
                    out.println("name=" + g.namePanel1.charName.getText());

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

                    out.println("person=<" + g.textPanel1.personality.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("ideals=<" + g.textPanel1.idealsBonds.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("flaws=<" + g.textPanel1.flaws.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("equipsGold=<" + g.textPanel1.equipsGold.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("featuresTraits=<" + g.textPanel1.featuresTraits.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                    out.println("profsLangs=<" + g.textPanel1.profsLanguages.getText().replaceAll("<", "").replaceAll(">", "") + ">");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
