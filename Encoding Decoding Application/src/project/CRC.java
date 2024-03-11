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
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class CRC extends JFrame implements ActionListener{
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6;
    JButton jb1,jb2,jb3;
    JTextField jt1,jt2;
    
    CRC(){
        super("Odd Parity");
        jlb1=new JLabel("Input Data : ");
        jlb1.setFont(new Font("Serif",Font.PLAIN,20));
        jlb1.setBounds(40, 100, 140, 25);
        add(jlb1);
        
        jt1=new JTextField();
        jt1.setFont(new Font("Serif",Font.PLAIN,22));
        jt1.setBounds(180, 100, 200,25);
        add(jt1);
        
        
        jlb2=new JLabel("Polynomial Bit:");
        jlb2.setFont(new Font("Serif",Font.PLAIN,20));
        jlb2.setBounds(40, 150, 140, 25);
        add(jlb2);
        
        jt2=new JTextField();
        jt2.setFont(new Font("Serif",Font.PLAIN,22));
        jt2.setBounds(180, 150, 200,25);
        add(jt2);
        
        jlb3=new JLabel("Encoding");
        jlb3.setFont(new Font("Serif",Font.PLAIN,20));
        jlb3.setBounds(40, 200, 100, 25);
        add(jlb3);
        
        jlb4=new JLabel("Encoding");
        jlb4.setFont(new Font("Serif",Font.PLAIN,20));
        jlb4.setBounds(180, 200, 300, 25);
        add(jlb4);
        
        jlb5=new JLabel("Decoding");
        jlb5.setFont(new Font("Serif",Font.PLAIN,20));
        jlb5.setBounds(40, 250, 100, 25);
        add(jlb5);
        
        jlb6=new JLabel("Decoding");
        jlb6.setFont(new Font("Serif",Font.PLAIN,20));
        jlb6.setBounds(180, 250, 300, 25);
        add(jlb6);
        
        
        
        jb1=new JButton("Previous");
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(50, 350, 100, 25);
        add(jb1);
        jb1.addActionListener(this);
        
        jb2=new JButton("Enter");
        jb2.setBackground(Color.black);
        jb2.setForeground(Color.white);
        jb2.setBounds(200, 350, 80, 25);
        add(jb2);
        jb2.addActionListener(this);
        
        jb3=new JButton("close");
        jb3.setBackground(Color.black);
        jb3.setForeground(Color.white);
        jb3.setBounds(330, 350, 80, 25);
        add(jb3);
        jb3.addActionListener(this);
        
        
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        Toolkit toolKit=getToolkit();
        Dimension size=toolKit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(jb1)) {
            dispose();
            Menu me=new Menu(); 
        }
        if(e.getSource().equals(jb2)){
            //dispose();
            
            String data = jt1.getText();
            System.out.print("Enter the data: "+data);
            String pol = jt2.getText();
            System.out.println("Enter the polynomial bit: "+pol);

            int lpol = pol.length();
            int ldata = data.length();
        
            char[] temp = new char[ldata + lpol - 1];
        
            for (int i = 0; i < ldata; i++) {
                temp[i] = data.charAt(i);
            }
        
            for (int k = ldata; k < lpol + ldata - 1; k++) {
                temp[k] = '0';
        }
        
        System.out.println("\nAfter adding polynomial bit: " + new String(temp) + "\n");
        
        for (int i = 0; i < ldata; i++) {
            if (temp[i] == '1') {
                for (int j = 0; j < lpol; j++) {
                    if (temp[i + j] == pol.charAt(j)) {
                        temp[i + j] = '0';
                    } else {
                        temp[i + j] = '1';
                    }
                }
            }
        }
        
        System.out.println("Remainder: " + new String(temp) + "\n");
        
        String string=new String(temp);
        string=data.substring(0, ldata)+string.substring(string.length()-pol.length()+1, string.length());
        
        System.out.println("Transmitted data: " + string);
        jlb4.setText(string);
                for(int i=0;i<string.length();i++){
            temp[i]=string.charAt(i);
        }
        for (int i = 0; i < ldata; i++) {
            if (temp[i] == '1') {
                for (int j = 0; j < lpol; j++) {
                    if (temp[i + j] == pol.charAt(j)) {
                        temp[i + j] = '0';
                    } else {
                        temp[i + j] = '1';
                    }
                }
            }
        }
        System.out.println(temp);
        string=new String(temp);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (temp[i] == '0') {
                count++;
            }
        }
        
        if (count == string.length()) {
            System.out.println("Transmitted data is perfect.");
            jlb6.setText("Transmitted data is perfect.");
        } else {
            System.out.println("Transmitted data has errors.");
            jlb6.setText("Transmitted data has errors.");
        }
    }
        
        if(e.getSource().equals(jb3)){
            dispose();
            ThankYou thank=new ThankYou();
        }

    }
    public static void main(String args[]){
        CRC pa=new CRC();
    }
}
