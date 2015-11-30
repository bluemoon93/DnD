/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula;

import java.util.Random;

/**
 *
 * @author BlueMoon
 */
public class Formula {
    String form;
    public Formula(String s){
        form=s;
    }
    
    public int getValue(){
        return 0;
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
