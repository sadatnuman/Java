package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.Border;
import static javax.swing.JOptionPane.showMessageDialog;



public class Home extends JFrame 
{
    JFrame frame;
    JLabel imagelabel;
    JButton button1, button2, button3, button4;
    ImageIcon image;


    public Home() 
	{

        frame = new JFrame();
        frame.setUndecorated(true);
        frame.setBounds(0, 0, 100, 100);

        image = new ImageIcon("Image/logo.jpeg");
        frame.setIconImage(image.getImage());

        imagelabel = new JLabel();
        imagelabel.setIcon(new ImageIcon("Image/plan2.png"));
        Dimension size = imagelabel.getPreferredSize();
        imagelabel.setBounds(0, 0, size.width, size.height);

        button1 = new JButton("X");
        button1.setBounds(950,2, 30, 40);
        button1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button1.setForeground(new Color(255, 255, 255));
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1.setFocusPainted(false);
        button1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button1.setContentAreaFilled(false);

        button2 = new JButton("-");
        button2.setBounds(900,2,35,30);
        button2.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		button2.setForeground(new Color(255, 255, 255));
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setFocusPainted(false);
        button2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button2.setContentAreaFilled(false);

        button3 = new JButton("Next");
        button3.setBounds(300,400, 400, 40);
        button3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button3.setForeground(new Color(255, 255, 255));
        button3.setBackground(new Color(128,0, 128));
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3.setFocusPainted(false);
		Border boder=BorderFactory.createLineBorder(Color.BLUE);
		button3.setBorder(null);
		
	

        button4 = new JButton("Contribution");
        button4.setBounds(300,460, 400, 40);
        button4.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button4.setForeground(new Color(255, 255, 255));
        button4.setBackground(new Color(75,0, 130));
        button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button4.setFocusPainted(false);
		Border bodr=BorderFactory.createLineBorder(Color.BLUE);
		button4.setBorder(null);
	
		
		

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(imagelabel);

        frame.setSize(1000,700);
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
            }
        });

        button3.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == button3) 
				{
                    new Login("textfield1", "textfield2");
                    frame.setVisible(false);
				}
            }
        });

        button4.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == button4) 
				{
                    new Contribution();
                    frame.setVisible(false);
                }
            }
        });

    }

}
