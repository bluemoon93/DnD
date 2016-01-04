/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import Online.OnlineGui;
import Utils.BasicPaint;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JToolBar;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author BlueMoon
 */
public final class PaintingPanel extends javax.swing.JPanel {

    private SpinnerNumberModel strokeModel;
    private BufferedImage canvasImage;
    private Color color = Color.BLACK;

    private final BufferedImage colorSample = new BufferedImage(16, 16, BufferedImage.TYPE_INT_RGB);
    private final JLabel imageLabel;//, output;
    private int activeTool = 1;

    public static final int DRAW_TOOL = 1;
    public static final int TEXT_TOOL = 2;

    //private Rectangle selection;
    private Stroke stroke = new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1.7f);
    private final RenderingHints renderingHints;

    /**
     * Creates new form PaintingPanel
     */
    OnlineGui og = null;

    public void setParent(OnlineGui og) {
        this.og = og;
    }

    public PaintingPanel() {
        initComponents();

        PaintingPanel gui = this;

        Map<RenderingHints.Key, Object> hintsMap = new HashMap();
        hintsMap.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        hintsMap.put(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        hintsMap.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        renderingHints = new RenderingHints(hintsMap);

        setImage(new BufferedImage(1044, 425, BufferedImage.TYPE_INT_RGB));
        //gui = new JPanel(new BorderLayout(4, 4));
        setBorder(new EmptyBorder(5, 3, 5, 3));

        JPanel imageView = new JPanel(new GridBagLayout());
        imageView.setPreferredSize(new Dimension(480, 320));
        imageLabel = new JLabel(new ImageIcon(canvasImage));
        JScrollPane imageScroll = new JScrollPane(imageView);
        imageView.add(imageLabel);
        imageLabel.addMouseMotionListener(new ImageMouseMotionListener());
        imageLabel.addMouseListener(new ImageMouseListener());
        add(imageScroll, BorderLayout.CENTER);

        JToolBar tb = new JToolBar();
        tb.setFloatable(false);
        JButton colorButton = new JButton("Color");
        colorButton.setMnemonic('o');
        colorButton.setToolTipText("Choose a Color");
        ActionListener colorListener = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Color c = JColorChooser.showDialog(gui, "Choose a color", color);
                if (c != null) {
                    setColor(c);
                }
            }
        };
        colorButton.addActionListener(colorListener);
        colorButton.setIcon(new ImageIcon(colorSample));
        tb.add(colorButton);

        setColor(color);

        strokeModel = new SpinnerNumberModel(5, 1, 16, 1);
        JSpinner strokeSize = new JSpinner(strokeModel);
        ChangeListener strokeListener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                Object o = strokeModel.getValue();
                stroke = new BasicStroke((Integer) o, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1.7f);
            }
        };
        strokeSize.addChangeListener(strokeListener);
        strokeSize.setMaximumSize(strokeSize.getPreferredSize());
        tb.add(strokeSize);

        tb.addSeparator();

        ActionListener clearListener = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                clear(canvasImage);
            }
        };
        JButton clearButton = new JButton("Fill");
        tb.add(clearButton);
        tb.addSeparator();
        clearButton.addActionListener(clearListener);

        add(tb, BorderLayout.PAGE_START);

        final JRadioButton draw = new JRadioButton("Draw", true);
        final JRadioButton text = new JRadioButton("Text");
        tb.add(draw);
        tb.add(text);

        ButtonGroup bg = new ButtonGroup();
        bg.add(text);
        bg.add(draw);
        ActionListener toolGroupListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == draw) {
                    activeTool = DRAW_TOOL;
                } else if (ae.getSource() == text) {
                    activeTool = TEXT_TOOL;
                }
            }
        };
        draw.addActionListener(toolGroupListener);
        text.addActionListener(toolGroupListener);

        clear(colorSample);

        Graphics2D g = canvasImage.createGraphics();
        g.setRenderingHints(renderingHints);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, canvasImage.getWidth(), canvasImage.getHeight());
        g.dispose();
        imageLabel.repaint();
    }

    public void setColor(Color color) {
        this.color = color;
        clear(colorSample);
    }
    
    public void clear(BufferedImage bi) {
        Graphics2D g = bi.createGraphics();
        g.setRenderingHints(renderingHints);
        g.setColor(color);
        g.fillRect(0, 0, bi.getWidth(), bi.getHeight());

        g.dispose();
        imageLabel.repaint();

        if(bi==canvasImage)
            reportPositionAndColor(null, color, null);
    }
    
    public void clear(Color c) {
        Graphics2D g = canvasImage.createGraphics();
        g.setRenderingHints(renderingHints);
        g.setColor(c);
        g.fillRect(0, 0, canvasImage.getWidth(), canvasImage.getHeight());

        g.dispose();
        imageLabel.repaint();
    }

    public void setImage(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();
        canvasImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g = this.canvasImage.createGraphics();
        g.setRenderingHints(renderingHints);
        g.drawImage(image, 0, 0, this);
        g.dispose();

        //selection = new Rectangle(0, 0, w, h);
        if (this.imageLabel != null) {
            imageLabel.setIcon(new ImageIcon(canvasImage));
            this.imageLabel.repaint();
        }
        if (this != null) {
            this.invalidate();
        }
    }

    public void text(Point point) {
        String text = JOptionPane.showInputDialog(this, "Text to add", "Text");
        if (text != null) {
            Graphics2D g = this.canvasImage.createGraphics();
            g.setRenderingHints(renderingHints);
            g.setColor(color);

            g.drawString(text, point.x, point.y);
            g.dispose();
            this.imageLabel.repaint();

            reportPositionAndColor(point, color, text);
        }
    }

    public void text(Point point, Color c, String text) {
        Graphics2D g = this.canvasImage.createGraphics();
        g.setRenderingHints(renderingHints);
        g.setColor(c);

        g.drawString(text, point.x, point.y);
        g.dispose();
        this.imageLabel.repaint();
    }

    public void draw(Point point) {
        Graphics2D g = this.canvasImage.createGraphics();
        g.setRenderingHints(renderingHints);
        g.setColor(color);
        g.setStroke(stroke);

        g.drawLine(point.x, point.y, point.x, point.y);
        g.dispose();
        this.imageLabel.repaint();

        reportPositionAndColor(point, color, null);
    }

    public void draw(Point point, Color c, int o) {
        Graphics2D g = this.canvasImage.createGraphics();
        g.setRenderingHints(renderingHints);
        g.setColor(c);
        g.setStroke(new BasicStroke(o, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1.7f));

        g.drawLine(point.x, point.y, point.x, point.y);
        g.dispose();
        this.imageLabel.repaint();
    }

    class ImageMouseListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent arg0) {
            // TODO Auto-generated method stub
            if (activeTool == BasicPaint.DRAW_TOOL) {
                // TODO
                draw(arg0.getPoint());
            } else if (activeTool == BasicPaint.TEXT_TOOL) {
                // TODO
                text(arg0.getPoint());
            } else {
                System.out.println("error");
            }
        }

        @Override
        public void mouseReleased(MouseEvent arg0) {
            //
        }
    }

    class ImageMouseMotionListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent arg0) {
            //reportPositionAndColor(arg0, true);
            if (activeTool == BasicPaint.DRAW_TOOL) {
                draw(arg0.getPoint());
            }
        }

        @Override
        public void mouseMoved(MouseEvent arg0) {
            //reportPositionAndColor(arg0, false);
        }

    }

    private void reportPositionAndColor(Point p, Color c, String text) {
        String send;
        if (text != null) {
            send = ("/t" + p.x + "," + p.y + ";" + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ";"
                    + text.replaceAll(";", ""));
        } else {
            if (p != null) {
                send = ("/c" + p.x + "," + p.y + ";" + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ";"
                        + strokeModel.getValue());
            } else {
                send = ("/f" + c.getRed() + "," + c.getGreen() + "," + c.getBlue());
            }
        }
        System.out.println(send);
        if (og != null) {
            og.command(send);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout(4, 4));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
