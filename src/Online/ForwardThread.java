/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author BlueMoon
 */
public class ForwardThread extends Thread{
    BufferedReader in;
    ArrayList<PrintWriter> out;
    JTextArea jt;
    public ForwardThread(BufferedReader in, ArrayList<PrintWriter> out, JTextArea jt){
        this.in=in;
        this.out=out;
        this.jt=jt;
    }
    
    @Override
    public void run(){
        System.out.println("Started thread!");
        try {
            while (true) {
                String text = in.readLine();
                jt.setText(jt.getText()+"\n"+text);
                synchronized(out){
                    for(PrintWriter o : out){
                        o.println(text);
                        o.flush();
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
