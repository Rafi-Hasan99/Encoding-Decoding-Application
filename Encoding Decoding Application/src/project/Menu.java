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
public class Menu extends JFrame implements ActionListener{
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7;
    JButton jb1,jb2;
    JTextField jt;
    
    Menu(){
        super("Menu");
        jlb1=new JLabel("1. Character Encoding and Decoding.");
        jlb1.setFont(new Font("Serif",Font.PLAIN,20));
        jlb1.setBounds(30, 20, 500, 40);
        add(jlb1);
        
        jlb2=new JLabel("2. Bit Encoding and Decoding.");
        jlb2.setFont(new Font("Serif",Font.PLAIN,20));
        jlb2.setBounds(30, 60, 500, 40);
        add(jlb2);
        
        jlb3=new JLabel("3. Parity bit Encoding and Decoding.");
        jlb3.setFont(new Font("Serif",Font.PLAIN,20));
        jlb3.setBounds(30, 100, 500, 40);
        add(jlb3);
        
        jlb4=new JLabel("4. CRC Encoding and Decoding.");
        jlb4.setFont(new Font("Serif",Font.PLAIN,20));
        jlb4.setBounds(30, 140, 500, 40);
        add(jlb4);
        
        jlb5=new JLabel("5. NRZ Encoding and Decoding.");
        jlb5.setFont(new Font("Serif",Font.PLAIN,20));
        jlb5.setBounds(30, 180, 500, 40);
        add(jlb5);
        
        jlb6=new JLabel("6. Manchester Encoding and Decoding.");
        jlb6.setFont(new Font("Serif",Font.PLAIN,20));
        jlb6.setBounds(30, 220, 500, 40);
        add(jlb6);
        
        jlb7=new JLabel("Enter the number:");
        jlb7.setFont(new Font("Serif",Font.PLAIN,15));
        jlb7.setBounds(120, 300,200, 30);
        add(jlb7);
        
        //Text Field
        jt=new JTextField();
        jt.setBounds(230, 305, 50, 25);
        add(jt);
        
        //Button create
        jb1=new JButton("Previous");
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(90, 360, 100, 25);
        add(jb1);
        jb1.addActionListener(this);
        
        jb2=new JButton("Enter");
        jb2.setBackground(Color.black);
        jb2.setForeground(Color.white);
        jb2.setBounds(290, 360, 100, 25);
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
            Welcome main=new Welcome(); 
        }
        if(e.getSource().equals(jb2)){
            if("1".equals(set)){
                //System.out.println("Character");
                dispose();
                Character cha=new Character();
            }else if("2".equals(set)){
                //System.out.println("Bit");
                dispose();
                Bit bit=new Bit();
            }else if("3".equals(set)){
                dispose();
                EvenOddParity pr=new EvenOddParity();
            }else if("4".equals(set)){
                dispose();
                CRC crc=new CRC();
            }else if("5".equals(set)){
                dispose();
                NRZ nrz=new NRZ();
            }else if("6".equals(set)){
                dispose();
                Man_diffe man=new Man_diffe();
            }else{
                JOptionPane.showMessageDialog(this,"Enter data into text Field");
            }
        }

    }
    
}
