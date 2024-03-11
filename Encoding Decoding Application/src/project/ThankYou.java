/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Asus
 */
public class ThankYou extends JFrame implements ActionListener {
    JLabel jlb1;
    ThankYou(){
        super("Thank You");
        jlb1=new JLabel("Thank You");
        jlb1.setFont(new Font("Serif", Font.PLAIN, 50));
        jlb1.setBounds(110, 50, 550, 50);
        add(jlb1);
        
        setLayout(null);
        setSize(500, 300);
        setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }
    
    @Override
    public void actionPerformed(ActionEvent ee){
        
    }
    
}
