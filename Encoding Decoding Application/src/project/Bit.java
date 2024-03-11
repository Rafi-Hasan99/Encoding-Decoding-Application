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
public class Bit extends JFrame implements ActionListener{
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5;
    JButton jb1,jb2,jb3;
    JTextField jt1;
    
    Bit(){
        super("Bit");
        jlb1=new JLabel("Input Data : ");
        jlb1.setFont(new Font("Serif",Font.PLAIN,20));
        jlb1.setBounds(40, 100, 100, 25);
        add(jlb1);
        
        jlb2=new JLabel("Encoding : ");
        jlb2.setFont(new Font("Serif",Font.PLAIN,20));
        jlb2.setBounds(40, 150, 100, 25);
        add(jlb2);
        
        jlb3=new JLabel("Decoding : ");
        jlb3.setFont(new Font("Serif",Font.PLAIN,20));
        jlb3.setBounds(40, 200, 100, 25);
        add(jlb3);
        
        jlb4=new JLabel("Encoding");
        jlb4.setFont(new Font("Serif",Font.PLAIN,15));
        jlb4.setBounds(160, 150, 400, 25);
        add(jlb4);
        
        jlb5=new JLabel("Decoding");
        jlb5.setFont(new Font("Serif",Font.PLAIN,15));
        jlb5.setBounds(160, 200, 300, 25);
        add(jlb5);
        
        jt1=new JTextField();
        jt1.setBounds(160, 100, 300,25);
        add(jt1);
        
        jb1=new JButton("Previous");
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(50, 300, 100, 25);
        add(jb1);
        jb1.addActionListener(this);
        
        jb2=new JButton("Enter");
        jb2.setBackground(Color.black);
        jb2.setForeground(Color.white);
        jb2.setBounds(200, 300, 100, 25);
        add(jb2);
        jb2.addActionListener(this);
        
        jb3=new JButton("close");
        jb3.setBackground(Color.black);
        jb3.setForeground(Color.white);
        jb3.setBounds(330, 300, 80, 25);
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
            Menu main=new Menu(); 
        }
        if(e.getSource().equals(jb2)){
            String data=jt1.getText();
            String flag="01111110";
            String s="0";
            int count=0,index;
            for(int i=0;i<data.length();i++){
                 if(data.charAt(i)=='1'){
                    count++;
                }else{
                     count=0;
                }
                if(count==5){
                    index=i+1;
                    data=data.substring(0, index)+'0'+data.substring(index);
                    count=0;
                }
            }
            //System.out.println(data.length());
            String cpy=flag+data+flag;
            System.out.println("Encoding : ");
            System.out.println(cpy);
            jlb4.setText(cpy);
            //System.out.println(cpy.length());
            count =0;
            int del=0;
            StringBuilder des=new StringBuilder();
            for(int i=0;i<cpy.length();i++){
                if(cpy.charAt(i)=='1'){
                    count++;
                }else{
                    count=0;
                }
                des.append(cpy.charAt(i));
                if(count==5 && cpy.charAt(i+1)=='0'){
                    i++;
                    del++;
                    //System.out.println(i);
                }  
            }
            System.out.println("Decoding : ");
            data=des.substring(flag.length(), cpy.length()-flag.length()-del);
            System.out.println(data);
            jlb5.setText(data);
        }
        if(e.getSource().equals(jb3)){
            dispose();
            ThankYou thank=new ThankYou();
        }

    }
}
