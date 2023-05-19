package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.Border;
import static javax.swing.JOptionPane.showMessageDialog;

public class Contribution {
    JFrame frame;
    JLabel imagelabel;
	JButton button1,button2,button3,button4;
    ImageIcon image;

    Contribution() {

        frame = new JFrame();
        frame.setUndecorated(true);

        image = new ImageIcon("Image/logo.jpeg");
        frame.setIconImage(image.getImage());

        imagelabel = new JLabel();
        //imagelabel.setIcon(new ImageIcon("Image/contributionn.png"));
        
        imagelabel.setBounds(0,0,400,700);

        button1 = new JButton("X");
        button1.setBounds(360,4, 30, 40);
		button1.setForeground(Color.white);
        button1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1.setFocusPainted(false);
        button1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button1.setContentAreaFilled(false);

        button2 = new JButton("-");
        button2.setBounds(340,4, 25, 30);
		button2.setForeground(Color.white);
        button2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setFocusPainted(false);
        button2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button2.setContentAreaFilled(false);

        button3 = new JButton("OK");
        button3.setBounds(120,620,170,50);
        button3.setForeground(new Color(255, 255, 255));
        button3.setBackground(new Color(128,0, 128));
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3.setFocusPainted(false);
		button3.setBorder(null);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(imagelabel);

        frame.setSize(400,700);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == button1) 
				{
                    frame.setVisible(false);
                }
            }
        });

        button2.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == button2) 
				{
                    frame.setState(Frame.ICONIFIED);
                } 
				else 
				{
                }
            }
        });

        button3.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == button3) 
				{
                    new Home();
                    frame.setVisible(false);
			    }
            }
        });
    }
}
