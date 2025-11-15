package lab7;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class guiApp extends JFrame {
    private static final long serialVersionUID = 1L;

    guiApp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Merge!");
        
        getContentPane().setBackground(new Color(0, 100, 230));
        setVisible(true); // mereu la final
    }
}

class AppButon extends JFrame {
    JButton b1 = new JButton("Apasa!");
}


public class Pb1 {
    public static void main(String[] args) {
        guiApp g = new guiApp();

        JButton b1 = new JButton("Apasa!");
        g.add(b1);
        b1.setBounds(100, 40, 200, 30);
        b1.addActionListener(e -> {
            System.out.println("APASAT");
            g.getContentPane().setBackground(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
        });

        ActionListener ascultator = e -> System.out.println("merge");
        b1.addActionListener(ascultator);

        g.setLayout(null);

        System.out.println("main");
    }
}
