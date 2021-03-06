/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author BlueMoon
 */
public class AttackGroupPanel extends javax.swing.JPanel {

    public ArrayList<AttackPanel> l;
    Gui g;

    /**
     * Creates new form AttackGroupPane
     */
    public AttackGroupPanel() {
        initComponents();
        l = new ArrayList();

        JButton addButton = new JButton();
        addButton.setText("Add new attack");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewAP();
            }
        });
        jPanel1.add(addButton);
    }

    public void setListeners(Gui g) {
        this.g = g;

        addNewAP();
        addNewAP();
        addNewAP();
    }

    public synchronized void clearAPs() {
        for (; l.size() > 0;) {
            l.remove(0);
            jPanel1.remove(0);
        }

        this.revalidate();
        this.repaint();
    }

    public synchronized void addNewAP(AttackPanel ap) {
        ap.setListeners(g);
        jPanel1.add(ap, l.size());
        l.add(ap);

        this.revalidate();
        this.repaint();
    }

    public final synchronized void addNewAP() {
        AttackPanel ap = new AttackPanel();
        ap.setListeners(g);
        jPanel1.add(ap, l.size());
        l.add(ap);

        this.revalidate();
        this.repaint();
    }

    public final synchronized void removeAP(AttackPanel ap) {
        int index = l.indexOf(ap);
        l.remove(index);
        jPanel1.remove(index);

        this.revalidate();
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
