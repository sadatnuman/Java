package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;

public class Plan extends JFrame implements ActionListener,MouseListener
{
	JLabel label,imagelabel;
	JButton wedbutton,akhdbutton,birthbutton,holudbutton,backbutton;
	JPanel panel;
	ImageIcon image;
	
	public Plan()
	{
		super(" Plan ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		
		panel = new JPanel();
	    this.setSize(1000,700);
	    panel.setBackground(new Color(186,85,211));
	    panel.setLayout(null);
		
		
		backbutton = new JButton();
        backbutton.setIcon(new ImageIcon("Image/return.png"));
        backbutton.setBounds(13,13,30,30);
        backbutton.setForeground(Color.white);
        backbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        backbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backbutton.setFocusPainted(false);
        backbutton.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        backbutton.setContentAreaFilled(false);
		backbutton.addActionListener(this);
		this.add(backbutton);
		
		label = new JLabel("Choose your Plan");
		label.setFont(new Font("Brush Script MT",Font.BOLD,55));
		label.setForeground(Color.WHITE);
		label.setBounds(100,80,900,120);
		this.add(label);
		
		
		wedbutton = new JButton("Wedding");
		wedbutton.setBounds(520,300,380,60);
		wedbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        wedbutton.setForeground(new Color(255, 255, 255));
        wedbutton.setBackground(new Color(128,0, 128));
        wedbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        wedbutton.setFocusPainted(false);
		wedbutton.addActionListener(this);
		wedbutton.addMouseListener(this);
	    this.add(wedbutton);
		
		akhdbutton = new JButton("Akhd");
		akhdbutton.setBounds(80,300,380,60);
		akhdbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        akhdbutton.setForeground(new Color(255, 255, 255));
        akhdbutton.setBackground(new Color(128,0, 128));
        akhdbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        akhdbutton.setFocusPainted(false);
		akhdbutton.addActionListener(this);
		akhdbutton.addMouseListener(this);
	    this.add(akhdbutton);
		
		birthbutton = new JButton("Birthday");
		birthbutton.setBounds(80,430,380,60);
		birthbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        birthbutton.setForeground(new Color(255, 255, 255));
        birthbutton.setBackground(new Color(128,0, 128));
        birthbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        birthbutton.setFocusPainted(false);
		birthbutton.addActionListener(this);
		birthbutton.addMouseListener(this);
	    this.add(birthbutton);
		
		holudbutton = new JButton("Haldi");
		holudbutton.setBounds(520,430,380,60);
		holudbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        holudbutton.setForeground(new Color(255, 255, 255));
        holudbutton.setBackground(new Color(128,0, 128));
        holudbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        holudbutton.setFocusPainted(false);
		holudbutton.addActionListener(this);
		holudbutton.addMouseListener(this);
	    this.add(holudbutton);
	
		
		
		image = new ImageIcon("Image/logo.jpeg");
        this.setIconImage(image.getImage());
		
		image=new ImageIcon("Image/plan.png");
		imagelabel=new JLabel(image);
		imagelabel.setBounds(0,0,1000,700);
		this.add(imagelabel);
		
		
		this.add(panel);
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==wedbutton)
		{
			wedbutton.setBackground(Color.BLUE);         
			wedbutton.setForeground(Color.WHITE);

		}
		
		else if(me.getSource()==akhdbutton)
		{
			akhdbutton.setBackground(Color.BLUE);
			akhdbutton.setForeground(Color.WHITE);
		}
		else if(me.getSource()==birthbutton)
		{
			birthbutton.setBackground(Color.BLUE);
			birthbutton.setForeground(Color.WHITE);
		}
		else if(me.getSource()==holudbutton)
		{
			holudbutton.setBackground(Color.BLUE);
			holudbutton.setForeground(Color.WHITE);
		}
		
	}
	
	
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==wedbutton)
		{
			wedbutton.setForeground(new Color(255, 255, 255));
            wedbutton.setBackground(new Color(128,0, 128));
		}
	
		else if(me.getSource()==akhdbutton)
		{
			akhdbutton.setForeground(new Color(255, 255, 255));
            akhdbutton.setBackground(new Color(128,0, 128));
		}
		else if(me.getSource()==birthbutton)
		{
			birthbutton.setForeground(new Color(255, 255, 255));
            birthbutton.setBackground(new Color(128,0, 128));
		}
		else if(me.getSource()==holudbutton)
		{
			holudbutton.setForeground(new Color(255, 255, 255));
            holudbutton.setBackground(new Color(128,0, 128));
		}
		

	}
	
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		{
			
		    if(backbutton.getText().equals(command))      
		    {
			    new Login("textfield1", "textfield2");
                this.setVisible(false);
		    }
		    else if(wedbutton.getText().equals(command))
		    {
			    WeddingPackage f = new WeddingPackage();
			    this.setVisible(false);
			    f.setVisible(true);
		    }
		    else if(akhdbutton.getText().equals(command))
		    {
			    AkhdPackage f = new AkhdPackage();
			    this.setVisible(false);
			    f.setVisible(true);
		    }
		    else if(birthbutton.getText().equals(command))
		    {
			    BirthdayPackage f = new BirthdayPackage();
			    this.setVisible(false);
			    f.setVisible(true);
		    }
		    else if(holudbutton.getText().equals(command))
		    {
			    HaldiPackage f = new HaldiPackage();
			    this.setVisible(false);
			    f.setVisible(true);
		    }
		 
	    }
	}
}
	