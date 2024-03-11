package project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome extends JFrame implements ActionListener {

    JLabel jlb;
    JButton jb1, jb2;

    Welcome() {
        jlb = new JLabel("Welcome to Encoding and Decoding Application");
        jlb.setFont(new Font("Serif", Font.PLAIN, 20));
        jlb.setBounds(10, 50, 550, 50);
        add(jlb);

        jb2 = new JButton("Enter");
        jb2.setBackground(Color.black);
        jb2.setForeground(Color.white);
        jb2.setBounds(220, 140, 130, 25);
        add(jb2);
        jb2.addActionListener(this);

        jb1 = new JButton("Close");
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(50, 140, 130, 25);
        add(jb1);
        jb1.addActionListener(this);

        setLayout(null);
        setSize(500, 300);
        setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(jb1)) {
            dispose();
            ThankYou thank=new ThankYou();
        }

        if (e.getSource().equals(jb2)) {
            dispose();
            Menu ca = new Menu();
            
        }

    }

}
