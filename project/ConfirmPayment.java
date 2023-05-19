import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class ConfirmPayment extends JFrame implements ActionListener{

	private Container c;
	private ImageIcon logo, img, exitIcon;
	private Font font;
	private JButton exitButton, cont;
	private JLabel background;

	public ConfirmPayment(){
		this.setUndecorated(true);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //exit out of application
 		this.setSize(800, 400); //sets the x-dimension, and y-dimension of frame
 		this.setLocationRelativeTo(null);//open middle of the screen

 		c = this.getContentPane();//contain frame into the container
 		c.setLayout(null);//remove defult layout settings

 		

 		logo();
 		font();
 		exitButton();
 		buttom();
 		background();
	}

	public void logo(){
		logo = new ImageIcon (getClass().getResource("/images/Logo.png"));//use getResource from getClass
		this.setIconImage (logo.getImage());//set logo
	}

	public void font(){
		font = new Font("Bogart", Font.PLAIN, 20);
	}

	public void exitButton(){
		exitIcon = new ImageIcon (getClass().getResource("/images/cross.png"));//use getResource from getClass
		exitButton = new JButton(exitIcon);
		exitButton.setBounds (750, 15, exitIcon.getIconWidth(), exitIcon.getIconHeight());
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	exitButton.setBorder(null);
      	exitButton.addActionListener(this);
		exitButton.setFocusPainted(false);//remove selection
		exitButton.setContentAreaFilled(false);//remove background

		c.add(exitButton);
	}

	public void buttom(){
		cont = new JButton("Continue");
		cont.setBounds (250, 318, 300, 60);
		cont.setForeground(Color.white);
		cont.setFont(font);
		cont.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	cont.setBorder(null);
      	cont.addActionListener(this);
		cont.setFocusPainted(false);//remove selection
		cont.setContentAreaFilled(false);//remove background

		c.add(cont);
	}

	public void background(){
		img = new ImageIcon (getClass().getResource("/images/completePay.png"));//use getResource from getClass
 		background = new JLabel("", img, JLabel.CENTER);
 		background.setBounds(0, 0, 800, 400);
 		c.add(background);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == exitButton){
			dispose();
		}else if(ae.getSource() == cont){
			dispose();
		}
	}
	public static void main(String[] args) {
		ConfirmPayment cPay = new ConfirmPayment();
		cPay.setResizable(false); //prevent frame from being resized
		cPay.setVisible(true); //make frame visible
	}
}