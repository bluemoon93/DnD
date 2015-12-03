/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online;

import Swing.PaintingPanel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author BlueMoon
 */
// This accepts new connections and creates a thread to handle clients
public class AcceptThread extends Thread{
    ServerSocket a;
    ArrayList<PrintWriter> out;
    JTextArea jt;
    PaintingPanel pp;
    
    public AcceptThread(ServerSocket a, JTextArea jt, PaintingPanel pp){
        this.a=a;
        out=new ArrayList();
        this.jt=jt;
        this.pp=pp;
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
                ForwardThread thr = new ForwardThread(in, out, jt, pp);
                thr.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
    }
}
