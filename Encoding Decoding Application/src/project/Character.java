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
public class Character extends JFrame implements ActionListener{
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7;
    JButton jb1,jb2,jb3;
    JTextField jt1,jt2,jt3;
    
    Character(){
        super("Characher");
        jlb1=new JLabel("Input Data : ");
        jlb1.setFont(new Font("Serif",Font.PLAIN,20));
        jlb1.setBounds(40, 100, 100, 25);
        add(jlb1);
        
        jlb2=new JLabel("Flag Character : ");
        jlb2.setFont(new Font("Serif",Font.PLAIN,20));
        jlb2.setBounds(40, 150, 150, 25);
        add(jlb2);
        
        jlb3=new JLabel("Escape Character : ");
        jlb3.setFont(new Font("Serif",Font.PLAIN,20));
        jlb3.setBounds(40, 200, 150, 25);
        add(jlb3);
        
        jlb4=new JLabel("Encoding : ");
        jlb4.setFont(new Font("Serif",Font.PLAIN,20));
        jlb4.setBounds(40, 250, 100, 25);
        add(jlb4);
        
        jlb5=new JLabel("Decoding : ");
        jlb5.setFont(new Font("Serif",Font.PLAIN,20));
        jlb5.setBounds(40, 300, 100, 25);
        add(jlb5);
        
        jlb6=new JLabel("Encoding ");
        jlb6.setFont(new Font("Serif",Font.PLAIN,20));
        jlb6.setBounds(200, 250, 300, 25);
        add(jlb6);
        
        jlb7=new JLabel("Decoding ");
        jlb7.setFont(new Font("Serif",Font.PLAIN,20));
        jlb7.setBounds(200, 300, 200, 25);
        add(jlb7);
        
        jt1=new JTextField();
        jt1.setFont(new Font("Serif",Font.PLAIN,22));
        jt1.setBounds(200, 100, 150,25);
        add(jt1);
        
        jt2=new JTextField();
        jt2.setFont(new Font("Serif",Font.PLAIN,22));
        jt2.setBounds(200, 150, 150,25);
        add(jt2);
        
        jt3=new JTextField();
        jt3.setFont(new Font("Serif",Font.PLAIN,22));
        jt3.setBounds(200, 200, 150,25);
        add(jt3);
        
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
            String flag=jt2.getText();
            String esc=jt3.getText();
            String st=flag;
            char fl=flag.charAt(0);
            char es=esc.charAt(0);
            int i = 0, j = 1;
            while (i < data.length()) {
                if (data.charAt(i) == fl) {
                    st += esc;
                    st += data.charAt(i);
                     i++;
                } else {
                    st += data.charAt(i);
                    i++;
            }
        }
            st += flag;
            System.out.println("After stuffing : " + st);
            jlb6.setText(st);
            String ds = "";
             for (i = 1; i < st.length()-1; i++) {
                 if (st.charAt(i) == es && st.charAt(i + 1) == fl && st.charAt(i+2)!='\0') {
                     ds += st.charAt(i + 1);
                     i++;
                }else if (st.charAt(i) == fl) {
                    break;
                }else {
                     ds += st.charAt(i);
                }
            }
             
            System.out.println("After destuffing : " + ds);
            jlb7.setText(ds);
        }
        if(e.getSource().equals(jb3)){
            dispose();
            ThankYou thank=new ThankYou();
        }
    }
}
