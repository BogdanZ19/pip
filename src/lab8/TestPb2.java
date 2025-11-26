package lab8;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class TestPb2 extends JFrame {
    private JScrollBar scrollBarOrizont = new JScrollBar(JScrollBar.HORIZONTAL, 0, 20, 0, 300);
    private JScrollBar scrollBarVertical = new JScrollBar(JScrollBar.VERTICAL, 0, 20, 0, 400);
    private int latime = 0;
    private int inaltime = 0;

    private void initialize() {
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        
        scrollBarVertical.addAdjustmentListener(listener);
        scrollBarOrizont.addAdjustmentListener(listener);
        
        getContentPane().add(scrollBarVertical, BorderLayout.WEST);
        getContentPane().add(scrollBarOrizont, BorderLayout.SOUTH);
    }

    AdjustmentListener listener = new AdjustmentListener() {
        public void adjustmentValueChanged(AdjustmentEvent arg0) {
            JScrollBar scrollBar = (JScrollBar) arg0.getSource();
            int valoare = scrollBar.getValue();
            
            if (scrollBar == scrollBarVertical) {
                inaltime = valoare;
            } else {
                latime = valoare;
            }
            
            repaint();
        
            //calcul suprafata
            int suprafata = latime * inaltime;
            System.out.println("Suprafata dreptunghiului = " + suprafata + " pixeli²");
        }
    };

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.drawRect(60, 60, latime, inaltime);
    }

    public static void main(String[] args) {
        TestPb2 gui = new TestPb2();
        gui.initialize();
        gui.setVisible(true);
    }
}