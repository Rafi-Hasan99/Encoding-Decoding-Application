/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class Man_diffe extends JFrame implements ActionListener{
    JLabel jlb1,jlb2,jlb3;
    JButton jb1,jb2;
    JTextField jt;
    
    Man_diffe(){
        super("Manchester and Differential Manchester");
        jlb1=new JLabel("1. Manchester encode and decode.");
        jlb1.setFont(new Font("Serif",Font.PLAIN,20));
        jlb1.setBounds(50, 80, 500, 40);
        add(jlb1);
        
        jlb2=new JLabel("2. Differential Manchester encode and decode.");
        jlb2.setFont(new Font("Serif",Font.PLAIN,20));
        jlb2.setBounds(50, 130, 500, 40);
        add(jlb2);
        
        jlb3=new JLabel("Enter the number:");
        jlb3.setFont(new Font("Serif",Font.PLAIN,20));
        jlb3.setBounds(90, 200,200, 30);
        add(jlb3);
        
        //Text Field
        jt=new JTextField();
        jt.setBounds(240, 204, 50, 25);
        add(jt);
        
        //Button create
        jb1=new JButton("Previous");
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(90, 300, 100, 25);
        add(jb1);
        jb1.addActionListener(this);
        
        jb2=new JButton("Enter");
        jb2.setBackground(Color.black);
        jb2.setForeground(Color.white);
        jb2.setBounds(290, 300, 100, 25);
        add(jb2);
        jb2.addActionListener(this);
        
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String set=null;
        set=(jt.getText());
        //int press=Integer.parseInt(set);
        if (e.getSource().equals(jb1)) {
            dispose();
            Menu ca = new Menu(); 
        }
        if(e.getSource().equals(jb2)){
            if("1".equals(set)){
                //System.out.println("Character");
                dispose();
                Manchester m=new Manchester();
            }else if("2".equals(set)){
                //System.out.println("Bit");
                dispose();
                Differ_Manchester l=new Differ_Manchester();
            }else{
                JOptionPane.showMessageDialog(this,"Enter data into text Field");
            }
        }

    }
    
}
