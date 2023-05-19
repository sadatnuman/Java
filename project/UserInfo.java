import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class UserInfo extends JFrame implements ActionListener{

	private Container c;
	private ImageIcon logo, exitIcon;
	private JLabel uInfo, id1, id2, id3, id4, id5;
	private Font f1, f2, f3;
	private JButton exitButton;
	String accountHolder, abbType, birth, religion, mail;

	public UserInfo(String accountHolder){
		this.accountHolder = "User Name : " + accountHolder;

		this.setUndecorated(true);
 		this.setSize(400, 550); //sets the x-dimension, and y-dimension of frame
 		this.setLocationRelativeTo(null);//open middle of the screen

 		c = this.getContentPane();//contain frame into the container
 		c.setLayout(null);//remove defult layout settings
 		c.setBackground(new Color(0x252a34));//set background color

 		logo();
 		font();
 		exitButton();
 		infoCheck();
 		info();
	}

	public void logo(){
		logo = new ImageIcon (getClass().getResource("/images/Logo.png"));//use getResource from getClass
		this.setIconImage (logo.getImage());//set logo
	}

	public void font(){
		f1 = new Font("Bogart", Font.BOLD, 25);//PLAIN for normal style
		f2 = new Font("Bogart", Font.BOLD, 18);
		f3 = new Font("Bogart", Font.PLAIN, 16);
	}

	public void exitButton(){
		exitIcon = new ImageIcon (getClass().getResource("/images/cross.png"));//use getResource from getClass

		exitButton = new JButton(exitIcon);
		exitButton.setBounds (365, 10, exitIcon.getIconWidth(), exitIcon.getIconHeight());
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	exitButton.setBorder(null);
      	exitButton.addActionListener(this);
		exitButton.setFocusPainted(false);//remove selection
		exitButton.setContentAreaFilled(false);//remove background

		c.add(exitButton);
	}

	public void infoCheck(){
		try {
            BufferedReader reader = new BufferedReader(new FileReader("user_data.txt"));

            int totalLines = 0;
            while (reader.readLine() != null){
                totalLines++;
            }
            reader.close();

            for (int i = 0; i <= totalLines; i++) {

                String name = Files.readAllLines(Paths.get("user_data.txt")).get(i);
                if (name.equals(accountHolder)) {
                    abbType = Files.readAllLines(Paths.get("user_data.txt")).get((i + 1));
                    birth = Files.readAllLines(Paths.get("user_data.txt")).get((i + 2));
                    religion = Files.readAllLines(Paths.get("user_data.txt")).get((i + 3));
                    mail = Files.readAllLines(Paths.get("user_data.txt")).get((i + 5));
                }
            }
        } catch (Exception ex) { }
	}

	public void info(){//accountHolder, abbType, birth, religion, mail,;
		uInfo = new JLabel("USER INFO!!", JLabel.CENTER);
        uInfo.setBounds(0, 100, 400, 40);
        uInfo.setForeground(new Color(0x98abb2));
        uInfo.setFont(f1);
        c.add(uInfo);

        id1 = new JLabel(accountHolder, JLabel.CENTER);
        id1.setBounds(0, 165, 400,40);
        id1.setForeground(new Color(0x98abb2));
        id1.setFont(f3);
        c.add(id1);

        id2 = new JLabel(abbType, JLabel.CENTER);
        id2.setBounds(0, 230, 400,40);
        id2.setForeground(new Color(0x98abb2));
        id2.setFont(f3);
        c.add(id2);

        id3 = new JLabel(birth, JLabel.CENTER);
        id3.setBounds(0, 295, 400,40);
        id3.setForeground(new Color(0x98abb2));
        id3.setFont(f3);
        c.add(id3);


        id4 = new JLabel(religion, JLabel.CENTER);
        id4.setBounds(0, 360, 400,40);
        id4.setForeground(new Color(0x98abb2));
        id4.setFont(f3);
        c.add(id4);

        id5 = new JLabel(mail, JLabel.CENTER);
        id5.setBounds(0, 425, 400,40);
        id5.setForeground(new Color(0x98abb2));
        id5.setFont(f3);
        c.add(id5);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == exitButton){
			dispose();
		}
	}

	public static void main(String[] args) {
		UserInfo info = new UserInfo("Asif");
		info.setResizable(false); //prevent frame from being resized
		info.setVisible(true); //make frame visible
	}

}