/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

/**
 *
 * @author BlueMoon
 */
public class TextPanel extends javax.swing.JPanel {

    /**
     * Creates new form TextPanel
     */
    public TextPanel() {
        initComponents();
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
        personality = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        idealsBonds = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        flaws = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        profsLanguages = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        featuresTraits = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        equipsGold = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        personality.setColumns(20);
        personality.setRows(3);
        personality.setText("Personality");
        jScrollPane1.setViewportView(personality);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        idealsBonds.setColumns(20);
        idealsBonds.setRows(3);
        idealsBonds.setText("Ideals & Bonds");
        jScrollPane2.setViewportView(idealsBonds);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        flaws.setColumns(20);
        flaws.setRows(3);
        flaws.setText("Flaws");
        jScrollPane3.setViewportView(flaws);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        profsLanguages.setColumns(20);
        profsLanguages.setRows(4);
        profsLanguages.setText("Proficiencies & Languages");
        jScrollPane6.setViewportView(profsLanguages);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        featuresTraits.setColumns(20);
        featuresTraits.setRows(5);
        featuresTraits.setText("Features & Traits");
        jScrollPane5.setViewportView(featuresTraits);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        equipsGold.setColumns(20);
        equipsGold.setRows(5);
        equipsGold.setText("Equipment & Gold");
        jScrollPane4.setViewportView(equipsGold);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea equipsGold;
    public javax.swing.JTextArea featuresTraits;
    public javax.swing.JTextArea flaws;
    public javax.swing.JTextArea idealsBonds;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JTextArea personality;
    public javax.swing.JTextArea profsLanguages;
    // End of variables declaration//GEN-END:variables
}
