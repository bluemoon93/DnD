/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author BlueMoon
 */
public class AcceptThread extends Thread{
    ServerSocket a;
    ArrayList<PrintWriter> out;
    JTextArea jt;
    
    public AcceptThread(ServerSocket a, JTextArea jt){
        this.a=a;
        out=new ArrayList();
        this.jt=jt;
    }
    
    @Override
    public void run(){
        System.out.println("Awaiting clients");
        while(true){
            try {
                Socket s = a.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                synchronized(out){
                    out.add(new PrintWriter(s.getOutputStream()));
                }
                ForwardThread thr = new ForwardThread(in, out, jt);
                thr.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
    }
}
