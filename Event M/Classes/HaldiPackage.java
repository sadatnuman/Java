package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;

public class HaldiPackage extends JFrame implements ActionListener //,MouseListener
{	
	JLabel imagelabel;
	JPanel panel;
	JButton button1,button2,button3;
	ImageIcon image;
	
	public HaldiPackage()
	{
		super("Event-HaldiPackage");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		
		panel = new JPanel();
	    this.setSize(1000,700);
	    panel.setLayout(null);
		
		
	    button3 = new JButton();
        button3.setIcon(new ImageIcon("Image/return.png"));
        button3.setBounds(13,13,30,30);
        button3.setForeground(Color.white);
        button3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3.setFocusPainted(false);
        button3.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        button3.setContentAreaFilled(false);
		button3.addActionListener(this);
		panel.add(button3);
		
		image = new ImageIcon("Image/logo.jpeg");
        this.setIconImage(image.getImage());
	    
		image=new ImageIcon("Image/haldipack.png");
		imagelabel=new JLabel(image);
		imagelabel.setBounds(0,0,1000,700);
		panel.add(imagelabel);
		
		
		button1 = new JButton("OK");
        button1.setBounds(190,610,120,35);
		button1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button1.setForeground(new Color(255, 255, 255));
        button1.setBackground(new Color(128,0, 128));
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1.setFocusPainted(false);
		button1.addActionListener(this);
		//button1.addMouseListener(this);
	    this.add(button1);
		
		button2 = new JButton("OK");
		button2.setBounds(700,610,120,35);
		button2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button2.setForeground(new Color(255, 255, 255));
        button2.setBackground(new Color(128,0, 128));
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button2.addActionListener(this);
        button2.setFocusPainted(false);
		//button2.addMouseListener(this);
	    this.add(button2);
		
		
		this.add(panel);
		
	}
	
	
		public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		{
			
		    if(button3.getText().equals(command))       
		    {
			    Plan f = new Plan();
				this.setVisible(false);
				f.setVisible(true);
		    }
		    else if(button1.getText().equals(command))
		    {
			    new Payment();
			    this.setVisible(false);
			    
		    }
		    else if(button2.getText().equals(command))
		    {
			    new Payment();
			    this.setVisible(false);
		    }
		    
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
}