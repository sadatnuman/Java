package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import java.nio.file.*;
import java.util.*;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;



public class Login extends Log 
{
    JFrame frame;
    JPanel panel;
    JLabel imagelabel,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,l8;
    JTextField textfield;
    JPasswordField passfield;
    JButton button1,button2,button3,button4,button5,button6,button7,button8;
    JCheckBox rememberbox;
	JRadioButton radioadmin,radiouser;
    JComboBox combobox;
    ImageIcon image1;
    ButtonGroup bg1;
    int pc = 0;

    public Login(String textfield1, String textfield2) 
	{
        super("textfield1", "textfield2");
        
        frame = new JFrame("Log In");
        frame.setUndecorated(true);
		frame.setBounds(0, 0,100, 100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        image1 = new ImageIcon("Image/logo.jpeg");
        frame.setIconImage(image1.getImage());

        panel = new JPanel();
        panel.setBounds(0, 0,1000,700);
        panel.setBackground(new Color(186,85,211));

        label1 = new JLabel("Log In");
        label1.setBounds(460,90, 200, 60);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Segoe UI", Font.BOLD, 35));

        label2 = new JLabel("Let's plan with us");
        label2.setBounds(440, 140, 300, 40);
        label2.setForeground(Color.white);
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        label3 = new JLabel("User Name");
        label3.setBounds(320, 250, 300, 40);
        label3.setForeground(Color.white);
        label3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));

        label4 = new JLabel("Password");
        label4.setBounds(320, 350, 150, 40);
        label4.setForeground(Color.white);
        label4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));

        label5 = new JLabel("Plan With us");
        label5.setBounds(340,700, 400, 40);
        label5.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));

        label6 = new JLabel("________________________________________________________");
        label6.setBounds(320, 300, 400, 40);
        label6.setForeground(Color.white);
        label6.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        label7 = new JLabel("________________________________________________________");
        label7.setBounds(320, 400, 400, 40);
        label7.setForeground(Color.white);
        label7.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        label8 = new JLabel();
        label8.setIcon(new ImageIcon("Image/log.jpg"));
        label8.setBounds(0,0,0,0);

        label9 = new JLabel("Don't have profile?");
        label9.setBounds(370, 600, 240, 40);
        label9.setForeground(Color.white);
        label9.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		

        label10 = new JLabel();
        label10.setIcon(new ImageIcon("Image/user.png"));
        label10.setBounds(730,260,85,85);
     
        textfield = new JTextField();
        textfield.setBounds(320,290, 380, 30);
        textfield.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
        textfield.setForeground(Color.white);
        textfield.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        textfield.setCaretColor(Color.white);
        textfield.setBorder(null);
        textfield.setOpaque(false);

        passfield = new JPasswordField();
        passfield.setBounds(320,390, 380, 30);
        passfield.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
        passfield.setForeground(Color.white);
        passfield.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        passfield.setCaretColor(Color.white);
        passfield.setBorder(null);
        passfield.setOpaque(false);

     
        button1 = new JButton("X");
        button1.setBounds(950, 4, 30, 40);
        button1.setForeground(Color.white);
        button1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1.setFocusPainted(false);
        button1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button1.setContentAreaFilled(false);

      
        button3 = new JButton("Login");
        button3.setBounds(320,520, 400, 40);
        button3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button3.setForeground(new Color(255, 255, 255));
        button3.setBackground(new Color(128,0, 128));
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3.setFocusPainted(false);
		button3.setBorder(null);

        button4 = new JButton("Register");
        button4.setBounds(570,600, 90, 40);
        button4.setForeground(Color.white);
        button4.setFont(new Font("Cooper Black MS", Font.BOLD, 20));
        button4.setForeground(new Color(255, 255, 255));
        button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button4.setFocusPainted(false);
        button4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button4.setContentAreaFilled(false);

        button5 = new JButton();
        button5.setIcon(new ImageIcon("Image/eye2.png"));    
        button5.setBounds(730, 400, 25, 20);
        button5.setForeground(Color.white);
        button5.setFont(new Font("Cooper Black MS", Font.PLAIN, 25));
        button5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button5.setFocusPainted(false);
        button5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button5.setContentAreaFilled(false);

        button6 = new JButton();
        button6.setIcon(new ImageIcon("Image/eye.png"));
        button6.setBounds(730, 400, 25, 20);
        button6.setForeground(Color.white);
        button6.setFont(new Font("Cooper Black MS", Font.PLAIN, 25));
        button6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button6.setFocusPainted(false);
        button6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button6.setContentAreaFilled(false);
        button6.setVisible(false);

        button7 = new JButton("-");
        button7.setBounds(910, 4, 25, 30);
        button7.setForeground(Color.white);
        button7.setFont(new Font("Cooper Black MS", Font.BOLD, 40));
        button7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button7.setFocusPainted(false);
        button7.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button7.setContentAreaFilled(false);

        button8 = new JButton();
        button8.setIcon(new ImageIcon("Image/return.png"));
        button8.setBounds(13,13,30,30);
        button8.setForeground(Color.white);
        button8.setFont(new Font("Cooper Black MS", Font.BOLD, 25));
        button8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button8.setFocusPainted(false);
        button8.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        button8.setContentAreaFilled(false);
		
		l8 = new JLabel();
        l8.setIcon(new ImageIcon("Image/login.png"));
        Dimension size = l8.getPreferredSize();
        l8.setBounds(0, 0, size.width, size.height);



        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
		frame.add(label10);
        frame.add(textfield);
        frame.add(passfield);
        frame.add(button1);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
		frame.add(l8);
    
        frame.add(panel);

        frame.setSize(1000,700);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button1) {
                    frame.setVisible(false);
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button4) {
                    Signup s1=new Signup();
                    frame.setVisible(false);
					s1.setVisible(true);

                }
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button5) {
                    if (passfield.getEchoChar() != '\u0000') {
                        passfield.setEchoChar('\u0000');
                        button5.setVisible(false);
                        button6.setVisible(true);
                    }
                }
            }
        });

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button6) {
                    passfield.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                    button6.setVisible(false);
                    button5.setVisible(true);
                } else {
                }
            }
        });

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button7) {
                    frame.setState(Frame.ICONIFIED);
                } 
				else 
				{
                }
            }
        });

        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button8) {
                    new Home();
                    frame.setVisible(false);
                }
            }
        });


        button3.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent ae) 
			{

                if(ae.getSource()==button3)
			    {
				
		            String userName = textfield.getText();
			        String userPassword = passfield.getText();
			        CreateUserAccount cua1 = new CreateUserAccount();
			
				
				    if(cua1.getAccount(userName, userPassword))
				    {
					    JOptionPane.showMessageDialog(null,"Login Successful");
					    Plan p = new Plan();
					    frame.setVisible(false);
					    p.setVisible(true);
				    }
                    //else if(cua1.getAccount(userName, userPassword))
			    }
					else 
					{
                        showMessageDialog(null, " Fill all fields ", "Message", -1);
					}
			}
		});
	}
 }
