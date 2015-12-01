/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Random;

/**
 *
 * @author BlueMoon
 */
public class Formula {

    // AxB = maximum between A and B
    // AnB = minimum between A and B
    // AdB = sum of a random value between 1 and B, A times
    // +-/* = regular math
    /*public static void main(String[] args) {

        System.out.println(new Formula("   mi2dfg5+mi1*\\«10n(5+DEX) ").form);
        System.out.println(new Formula("   mi2dfg5+mi1*\\«10n(5+DEX) ").getValue(0, 0, 0, 0, 0, 0, 0));
    }*/

    public String form;

    public Formula(String s) {
        // remove all except: digits, +-*/, dxn, (), caps
        form = s.replaceAll("[^0-9+-/\\*dxn\\(\\)A-Z]|,", "");

        if (form.length() == 0) {
            form = "0";
        }

        if (!Character.isDigit(form.charAt(0))) {
            form = "0" + form;
        }
        /*if (form.charAt(0) != '+' && form.charAt(0) != '-') {
         form = "+" + form;
         }*/

    }

    public int getValue(int str, int dex, int con, int intl, int wis, int cha, int prof) {
        return getValue(form.replaceAll("STR", str + "").replaceAll("DEX", dex + "").replaceAll("CON", con + "")
                .replaceAll("INT", intl + "").replaceAll("WIS", wis + "").replaceAll("CHA", cha + "").replaceAll("PROF", prof + ""));
    }

    public int getValue(String f) {
        //System.out.println(f);
        int index = 0;

        while (f.contains("(")) {
            // doesnt work for nested ()
            int tRes = getValue(f.substring(f.indexOf("(") + 1, f.indexOf(")")));

            // replace just first ocurrence, to keep dice random
            f = f.replace(f.substring(f.indexOf("("), f.indexOf(")") + 1), tRes + "");
        }
        //System.out.println(f);
        //int startIndex=0;
        if (f.contains("+") || f.contains("-")) {
            index = getSmallestIndex(f, '+','-');

            if (f.charAt(index) == '+') {
                return getValue(f.substring(0, index)) + getValue(f.substring(index + 1));
            } else {
                return getValue(f.substring(0, index)) - getValue(f.substring(index + 1));
            }
        }
      //  System.out.println(f);
        if (f.contains("/") || f.contains("*")) {
            index = getSmallestIndex(f, '*','/');
            
            if (f.charAt(index) == '*') {
                return getValue(f.substring(0, index)) * getValue(f.substring(index + 1));
            } else {
                return getValue(f.substring(0, index)) / getValue(f.substring(index + 1));
            }
        }

        if (f.contains("d")||f.contains("n")||f.contains("x")) {
            index = getSmallestIndex(f, 'd','n','x');
            if (f.charAt(index) == 'd') {
                return getDice(getValue(f.substring(0, index)), getValue(f.substring(index + 1)));
            } else if (f.charAt(index) == 'n') {
                return Math.min(getValue(f.substring(0, index)), getValue(f.substring(index + 1)));
            } else {
                return Math.max(getValue(f.substring(0, index)), getValue(f.substring(index + 1)));
            }
        }

        try {
            return Integer.parseInt(f);
        } catch (Exception ex) {
            return 0;
        }
    }

    public static int getSmallestIndex(String f, char c1, char c2) {
        int index = f.indexOf(c1);
        int index2 = f.indexOf(c2);
        if (index == -1 || index2 != -1) {
            index = Math.min(index, index2);
        }
        return index;
    }
    
    public static int getSmallestIndex(String f, char c1, char c2, char c3) {
        int index = f.indexOf(c1);
        int index2 = f.indexOf(c2);
        if (index == -1){
            index=index2;
        }else if(index2 != -1) {
            index = Math.min(index, index2);
        }
        index2 = f.indexOf(c3);
        if (index == -1){
            index=index2;
        }else if(index2 != -1) {
            index = Math.min(index, index2);
        }
        return index;
    }

    public static int getDice(int howMany, int diceSize) {
        int val = 0;
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 1; i <= howMany; i++) {
            val += (Math.abs(rand.nextInt()) % diceSize + 1);
        }
        return val;
    }
}
