/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author BlueMoon
 */
public class GetThread extends Thread {

    JTextArea t;
    BufferedReader in;

    public GetThread(BufferedReader in, JTextArea t) {
        this.in = in;
        this.t = t;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String text = in.readLine();
                t.setText(t.getText()+"\n"+text);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
