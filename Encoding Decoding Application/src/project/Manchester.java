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
public class Manchester extends JFrame implements ActionListener{
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5;
    JButton jb1,jb2,jb3;
    JTextField jt1;
    
    Manchester(){
        super("Manchester");
        jlb1=new JLabel("Input Data : ");
        jlb1.setFont(new Font("Serif",Font.PLAIN,20));
        jlb1.setBounds(40, 100, 100, 25);
        add(jlb1);
        
        jlb2=new JLabel("Encoding");
        jlb2.setFont(new Font("Serif",Font.PLAIN,20));
        jlb2.setBounds(40, 150, 100, 25);
        add(jlb2);
        
        jlb3=new JLabel("Decoding");
        jlb3.setFont(new Font("Serif",Font.PLAIN,20));
        jlb3.setBounds(40, 200, 100, 25);
        add(jlb3);
        
        jlb4=new JLabel("Encoding ");
        jlb4.setFont(new Font("Serif",Font.PLAIN,20));
        jlb4.setBounds(150, 150, 420, 25);
        add(jlb4);
        
        jlb5=new JLabel("Decoding ");
        jlb5.setFont(new Font("Serif",Font.PLAIN,20));
        jlb5.setBounds(150, 200, 400, 25);
        add(jlb5);
        
        jt1=new JTextField();
        jt1.setBounds(150, 100, 150,25);
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
        setSize(650,500);
        setVisible(true);
        Toolkit toolKit=getToolkit();
        Dimension size=toolKit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(jb1)) {
            dispose();
            Man_diffe man=new Man_diffe(); 
        }
        if(e.getSource().equals(jb2)){
            String data=jt1.getText();
            String en="";
            String cpy="";
            String de="";
            for(int i=0;i<data.length();i++){
                if(data.charAt(i)=='1'){
                    en=en+"-1>1 ";
                    cpy=cpy+"1";
                }
                if(data.charAt(i)=='0'){
                    en=en+"1>-1 ";
                    cpy=cpy+"0";
                }
            }
            System.out.println("Encoding : ");
            System.out.println(en);
            jlb4.setText(en);
            System.out.println("Decoding : ");
            for(int i=0;i<cpy.length();i++){
                if(cpy.charAt(i)=='1'){
                    de=de+"1";
                }else{
                    de=de+"0";
                }
            }
            System.out.println(de);
            jlb5.setText(de);
        }
        if(e.getSource().equals(jb3)){
            dispose();
            ThankYou thank=new ThankYou();
        }

    }
}
