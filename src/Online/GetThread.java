/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online;

import Swing.PaintingPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author BlueMoon
 */
public class GetThread extends Thread {

    JTextArea t;
    PaintingPanel pp;
    BufferedReader in;

    public GetThread(BufferedReader in, JTextArea t, PaintingPanel pp) {
        this.in = in;
        this.t = t;
        this.pp = pp;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String text = in.readLine();
                System.out.println("got: " + text);
                if (text.startsWith("/")) {
                    if (text.startsWith("/c")) {
                        String[] fields = text.substring(2).split(";");
                        String[] points = fields[0].split(",");
                        String[] rgb = fields[1].split(",");
                        pp.draw(new Point(Integer.parseInt(points[0]), Integer.parseInt(points[1])),
                                new Color(Integer.parseInt(rgb[0]), Integer.parseInt(rgb[1]),
                                        Integer.parseInt(rgb[2])), Integer.parseInt(fields[2]));
                    } else if (text.startsWith("/f")) {
                        String[] rgb = text.substring(2).split(",");
                        pp.clear(new Color(Integer.parseInt(rgb[0]), Integer.parseInt(rgb[1]),
                                Integer.parseInt(rgb[2])));
                    } else if (text.startsWith("/t")) {
                        String[] fields = text.substring(2).split(";");
                        String[] points = fields[0].split(",");
                        String[] rgb = fields[1].split(",");
                        pp.text(new Point(Integer.parseInt(points[0]), Integer.parseInt(points[1])),
                                new Color(Integer.parseInt(rgb[0]), Integer.parseInt(rgb[1]),
                                        Integer.parseInt(rgb[2])), fields[2]);
                    }
                } else {
                    t.setText(t.getText() + "\n" + text);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
