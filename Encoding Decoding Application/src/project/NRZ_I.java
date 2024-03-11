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
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class NRZ_I extends JFrame implements ActionListener{
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6;
    JButton jb1,jb2,jb3;
    JTextField jt1,jt2;
    
    NRZ_I(){
        super("NRZ_I");
        jlb1=new JLabel("Input Data : ");
        jlb1.setFont(new Font("Serif",Font.PLAIN,20));
        jlb1.setBounds(40, 100, 150, 25);
        add(jlb1);
        
        jlb2=new JLabel("Current position : ");
        jlb2.setFont(new Font("Serif",Font.PLAIN,20));
        jlb2.setBounds(40, 150, 150, 25);
        add(jlb2);
        
        jlb3=new JLabel("Encoding : ");
        jlb3.setFont(new Font("Serif",Font.PLAIN,20));
        jlb3.setBounds(40, 200, 150, 25);
        add(jlb3);
        
        jlb4=new JLabel("Decoding : ");
        jlb4.setFont(new Font("Serif",Font.PLAIN,20));
        jlb4.setBounds(40, 250, 150, 25);
        add(jlb4);
        
        jlb5=new JLabel("Encoding");
        jlb5.setFont(new Font("Serif",Font.PLAIN,20));
        jlb5.setBounds(200, 200, 380, 25);
        add(jlb5);
        
        jlb6=new JLabel("Decoding");
        jlb6.setFont(new Font("Serif",Font.PLAIN,20));
        jlb6.setBounds(200, 250, 380, 25);
        add(jlb6);
        
        jt1=new JTextField();
        jt1.setBounds(200, 100, 150,25);
        add(jt1);
        
        jt2=new JTextField();
        jt2.setBounds(200, 150, 150,25);
        add(jt2);
        
        jb1=new JButton("Previous");
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(50, 300, 100, 25);
        add(jb1);
        jb1.addActionListener(this);
        
        jb2=new JButton("Enter");
        jb2.setBackground(Color.black);
        jb2.setForeground(Color.white);
        jb2.setBounds(200, 300, 80, 25);
        add(jb2);
        jb2.addActionListener(this);
        
        jb3=new JButton("close");
        jb3.setBackground(Color.black);
        jb3.setForeground(Color.white);
        jb3.setBounds(320, 300, 80, 25);
        add(jb3);
        jb3.addActionListener(this);
        
        setLayout(null);
        setSize(600,500);
        setVisible(true);
        Toolkit toolKit=getToolkit();
        Dimension size=toolKit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(jb1)) {
            dispose();
            NRZ nrz=new NRZ(); 
        }
        if(e.getSource().equals(jb2)){
            String en="";
            String data=jt1.getText();
            String cur=jt2.getText();
            int cu=Integer.parseInt(cur);
            System.out.println("Encoding : ");
            String cpy="";
            for(int i=0;i<data.length();i++){
                if(cu==1){
                    if(data.charAt(i)=='1'){
                        en=en+"-1 ";
                        cpy=cpy+"0";
                        //System.out.print("-1"+" ");
                        cu=-1;
                    }
                    if(data.charAt(i)=='0'){
                        en=en+"1 ";
                        cpy=cpy+"1";
                        //System.out.print("1"+" ");
                        cu=1;
                    }
                }
                else if(cu==-1){
                    if(data.charAt(i)=='1'){
                        en=en+"1 ";
                        cpy=cpy+"1";
                        //System.out.print("1"+" ");
                        cu=1;
                    }
                    if(data.charAt(i)=='0'){
                        en=en+"-1 ";
                        cpy=cpy+"0";
                        //System.out.print("-1"+" ");
                        cu=-1;
                    }
                }
            }
            //System.out.println();
            System.out.println(en);
            jlb5.setText(en);
        }
        if(e.getSource().equals(jb3)){
            dispose();
            ThankYou thank=new ThankYou();
        }

    }
}
