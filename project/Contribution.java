import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contribution extends JFrame implements ActionListener{

	private Container c;
	private ImageIcon logo, exitIcon;
	private JLabel continue1, member1, member2, member3, member4, member5, in1, in2, in3, in4, in5;
	private Font f1, f2, f3;
	private JButton exitButton;

	public Contribution(){
		this.setUndecorated(true);
//		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //exit out of application
 		this.setSize(400, 550); //sets the x-dimension, and y-dimension of frame
 		this.setLocationRelativeTo(null);//open middle of the screen
 	//	this.setTitle("Vidyasagar"); //sets title of frame

 		c = this.getContentPane();//contain frame into the container
 		c.setLayout(null);//remove defult layout settings
 		c.setBackground(new Color(0x252a34));//set background color

 		logo();
 		font();
 		exitButton();
 		info();
	}

	public void logo(){
		logo = new ImageIcon (getClass().getResource("/images/Logo.png"));//use getResource from getClass
		this.setIconImage (logo.getImage());//set logo
	}

	public void font(){
		f1 = new Font("Bogart", Font.BOLD, 25);//PLAIN for normal style
		f2 = new Font("Bogart", Font.BOLD, 18);
		f2 = new Font("Bogart", Font.PLAIN, 16);
	}

	public void exitButton(){
		exitIcon = new ImageIcon (getClass().getResource("/images/cross.png"));//use getResource from getClass

		exitButton = new JButton(exitIcon);
		exitButton.setBounds (365, 10, exitIcon.getIconWidth(), exitIcon.getIconHeight());
//		exitButton.setForeground(new Color(0xff5a4e));
//		exitButton.setBackground(new Color(0xff5a4e));
//		exitButton.setFont(f2);
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		Border border = new LineBorder(new Color(0x2a2f3a), 0, true);
      	exitButton.setBorder(null);
      	exitButton.addActionListener(this);
		exitButton.setFocusPainted(false);//remove selection
//		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);//remove background

		c.add(exitButton);
	}

	public void info(){
		continue1 = new JLabel("CONTRIBUTION!!", JLabel.CENTER);
        continue1.setBounds(0, 70, 400, 40);
        continue1.setForeground(new Color(0x98abb2));
        continue1.setFont(f1);
        c.add(continue1);

        member1 = new JLabel("* MD. ASIF HOSSAIN", JLabel.CENTER);
        member1.setBounds(0, 135, 400, 40);
        member1.setForeground(new Color(0x98abb2));
        member1.setFont(f2);
        c.add(member1);

        in1 = new JLabel("22-48965-3", JLabel.CENTER);
        in1.setBounds(0, 165, 400,40);
        in1.setForeground(new Color(0x98abb2));
        in1.setFont(f2);
        c.add(in1);

        member2 = new JLabel("* MD. NAZMUS SADAT NUMAN", JLabel.CENTER);
        member2.setBounds(0, 200, 400,40);
        member2.setForeground(new Color(0x98abb2));
        member2.setFont(f2);
        c.add(member2);

        in2 = new JLabel("22-48497-3", JLabel.CENTER);
        in2.setBounds(0, 230, 400,40);
        in2.setForeground(new Color(0x98abb2));
        in2.setFont(f2);
        c.add(in2);

        member3 = new JLabel("* A.K.M TAMIM RAHMAN", JLabel.CENTER);
        member3.setBounds(0, 265, 400,40);
        member3.setForeground(new Color(0x98abb2));
        member3.setFont(f2);
        c.add(member3);

        in3 = new JLabel("22-49218-3", JLabel.CENTER);
        in3.setBounds(0, 295, 400,40);
        in3.setForeground(new Color(0x98abb2));
        in3.setFont(f2);
        c.add(in3);

        member4 = new JLabel("* MD. MAINUL ISLAM", JLabel.CENTER);
        member4.setBounds(0, 330, 400,40);
        member4.setForeground(new Color(0x98abb2));
        member4.setFont(f2);
        c.add(member4);

        in4 = new JLabel("22-49222-3", JLabel.CENTER);
        in4.setBounds(0, 360, 400,40);
        in4.setForeground(new Color(0x98abb2));
        in4.setFont(f2);
        c.add(in4);

        member5 = new JLabel("* AFSAR MAHBUB KHAN", JLabel.CENTER);
        member5.setBounds(0, 395, 400,40);
        member5.setForeground(new Color(0x98abb2));
        member5.setFont(f2);
        c.add(member5);

        in5 = new JLabel("22-49366-3", JLabel.CENTER);
        in5.setBounds(0, 425, 400,40);
        in5.setForeground(new Color(0x98abb2));
        in5.setFont(f2);
        c.add(in5);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == exitButton){
			dispose();
		}
	}

	public static void main(String[] args) {
		Contribution con = new Contribution();
		con.setResizable(false); //prevent frame from being resized
		con.setVisible(true); //make frame visible
	}

}