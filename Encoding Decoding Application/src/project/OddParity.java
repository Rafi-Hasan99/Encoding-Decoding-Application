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
public class OddParity extends JFrame implements ActionListener{
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5;
    JButton jb1,jb2,jb3;
    JTextField jt1;
    
    OddParity(){
        super("Odd Parity");
        jlb1=new JLabel("Input Data : ");
        jlb1.setFont(new Font("Serif",Font.PLAIN,20));
        jlb1.setBounds(40, 100, 100, 25);
        add(jlb1);
        
        jlb2=new JLabel("Encoding");
        jlb2.setFont(new Font("Serif",Font.PLAIN,20));
        jlb2.setBounds(40, 150, 100, 25);
        add(jlb2);
        
        jlb3=new JLabel("Encoding");
        jlb3.setFont(new Font("Serif",Font.PLAIN,15));
        jlb3.setBounds(160, 150, 300, 25);
        add(jlb3);
        
        jlb4=new JLabel("Decoding");
        jlb4.setFont(new Font("Serif",Font.PLAIN,20));
        jlb4.setBounds(40, 200, 100, 25);
        add(jlb4);
        
        jlb5=new JLabel("Decoding");
        jlb5.setFont(new Font("Serif",Font.PLAIN,15));
        jlb5.setBounds(160, 200, 300, 25);
        add(jlb5);
        
        jt1=new JTextField();
        jt1.setBounds(140, 100, 150,25);
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
        jb3.setBounds(330, 300, 80, 25);
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
            EvenOddParity parity=new EvenOddParity(); 
        }
        if(e.getSource().equals(jb2)){
            //dispose();
            String data=jt1.getText();
            char ch[]=new char[data.length()+1];
            int count=0;
            for(int i=0;i<data.length();i++){
                ch[i]=data.charAt(i);
            }
            int i;
            for(i=0;i<data.length();i++){
                if(ch[i]=='1'){
                    count++;
                }
            }
            if(count%2==0){
                ch[i]='1';
            }else{
                ch[i]='0';
            }
            String da=new String(ch);
            System.out.println(da);
            jlb3.setText(da);
        }
        if(e.getSource().equals(jb3)){
            dispose();
            ThankYou thank=new ThankYou();
        }

    }
    public static void main(String args[]){
        OddParity pa=new OddParity();
    }
}
