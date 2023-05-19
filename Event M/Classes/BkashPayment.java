package Classes;

import java.awt.*;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class BkashPayment 
{
    JFrame frame;
    JPanel p1;
    JLabel l1;
    JButton b1, b2, b3, b4;
    JTextField tf1;
	JPasswordField pass;
    ImageIcon i1;

    BkashPayment() 
	{

        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("Image/logo.jpeg");
        frame.setIconImage(i1.getImage());

        p1 = new JPanel();
        p1.setBounds(0, 0,1000,700);
        p1.setBackground(new Color(25, 118, 211));

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("Image/bkashbg.png"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(0, 0, size.width, size.height);

        b1 = new JButton("X");
        b1.setBounds(960,4, 30, 40);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(920, 4, 25, 30);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton();
        b3.setIcon(new ImageIcon("Image/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);

        b4 = new JButton("Pay");
        b4.setBounds(400,550,200,50);
        b4.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        b4.setForeground(new Color(255, 255, 255));
        b4.setBackground(new Color(128,0, 128));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
		b4.setBorder(null);

 
        tf1 = new JTextField();
        tf1.setBounds(300,330,380,50);
        tf1.setFont(new Font("Serif", Font.PLAIN, 18));

        pass = new JPasswordField();
        pass.setBounds(300,460,380,50);
        pass.setFont(new Font("Serif", Font.PLAIN, 18));

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);


        frame.add(tf1);
        frame.add(pass);

        frame.add(l1);
        frame.add(p1);

        frame.setSize(1000,700);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    frame.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b2) {
                    frame.setState(Frame.ICONIFIED);
                }

            }
        });

       b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    new Payment();
                    frame.setVisible(false);
                }
            }
        });

        b4.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == b4) 
				{
                    if (tf1.getText().equals("") || pass.getText().equals(""))
                    {
                        showMessageDialog(null, " You need to give all information ", "Message",  -1);
                    }

                    else 
					{
                        showMessageDialog(null, "Payment Complete", "Thank You", -1);
						new ThankYou();
                        frame.setVisible(false);
                        
                        

                    }
                }
            }
        });

    }
}
