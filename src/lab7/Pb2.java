package lab7;


import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class guiApp1 extends JFrame {
    private static final long serialVersionUID = 1L;

    guiApp1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Merge!");

        // getContentPane().setBackground(new Color(0, 100, 230));

        JButton b1 = new JButton("Edit");
        JButton b2 = new JButton("NrChar");
        b1.setBounds(50, 200, 150, 30);
        b2.setBounds(200, 200, 150, 30);

        
        JTextField tf = new JTextField();
        tf.setBounds(50, 170, 300, 30);
        tf.setEditable(false);

        
        JTextArea ta = new JTextArea();
        ta.setBounds(50, 50, 300, 100);
        ta.setEditable(false);
        
        b1.addActionListener(e -> {
           ta.setEditable(true); 
        });

        b2.addActionListener(e -> {
            ta.setEditable(false);
            String text = ta.getText();
            int nrChar = text.length();
            tf.setText(String.valueOf(nrChar));
        });

        add(b1);
        add(b2);
        add(tf);
        add(ta);
        
        setLayout(null);
        setVisible(true); // mereu la final
    }
}

public class Pb2 {
    public static void main(String[] args) {
        new guiApp1();
        System.out.println("merge!123");
    }
}
