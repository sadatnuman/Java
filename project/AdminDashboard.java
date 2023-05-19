import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.util.Random;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;
import java.util.List;




public class AdminDashboard extends JFrame implements ActionListener{

	private Container c;
	private ImageIcon logo, img, exitIcon, minimizeIcon, userInfo1, userInfo2, addUser1, addUser2, addAdmin1, 
	  addAdmin2, home, contribution, adminInfo, logout;
	private JLabel imgLabel, pLogo, bookinfo, bookName, writer, price, bookName1, writer1, price1, book, rLable, name, birth, religion,
	 mail, password, rpassword, question, answer, captcha, gCaptcha, l3, l4, l5, l6, l7, l8, l9, l10, arLable, aname, abirth, areligion,
	 amail, apassword, arpassword, aquestion, aanswer, acaptcha, agCaptcha, al3, al4, al5, al6, al7, al8, al9, al10, uLable;
	private Font f1, f2, f3, f4, f5;
	private JTextField infoField, nameField, birthField, religionField, mailField, answerField, captchaField, 
	 anameField, abirthField, areligionField, amailField, aanswerField, acaptchaField;
	private JPasswordField spasswordField, rpasswordField, aspasswordField, arpasswordField;
	private JPanel manubar, userInfoPanel, addUserPanel, addAdminPanel;
	private JButton exitButton, minimizeButton, userInfoButton1, userInfoButton2, addUserButton1, addUserButton2, 
	   addAdminButton1, addAdminButton2, homeButton, contributionButton, adminInfoButton, logoutButton, registerButton, 
	   aregisterButton, deleteButton, refreshButton;
	private JScrollPane scroll;
	private String adminName;
	private JComboBox qbox, aqbox;
	private int a, b, e, d;
	private JCheckBox box11, box12, box13, abox11, abox12, abox13;
	private JTable table;


	public AdminDashboard(String adminName){
		this.adminName = adminName;

		this.setUndecorated(true);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //exit out of application
 		this.setSize(1050, 550); //sets the x-dimension, and y-dimension of frame
 		this.setLocationRelativeTo(null);//open middle of the screen

 		c = this.getContentPane();//contain frame into the container
 		c.setLayout(null);//remove defult layout settings
 		c.setBackground(new Color(0x2a2f3a));//set background color


 		logo();
 		font();
 		exitButton();
 		minimize();

 		manubar();
		userInfo();
 		adduser();
 		addAdmin();
	}

	public void logo(){
		logo = new ImageIcon (getClass().getResource("/images/Logo.png"));//use getResource from getClass
		this.setIconImage (logo.getImage());//set logo
	}

	public void font(){
		f1 = new Font("Bogart", Font.BOLD + Font.ITALIC, 30);//PLAIN for normal style
		f2 = new Font("Bogart", Font.PLAIN, 20);
		f3 = new Font("Bogart", Font.BOLD, 30);
		f4 = new Font("Bogart", Font.BOLD, 16);
		f5 = new Font("Bogart", Font.PLAIN, 14);
	}

	public void exitButton(){
		exitIcon = new ImageIcon (getClass().getResource("/images/cross.png"));//use getResource from getClass

		exitButton = new JButton(exitIcon);
		exitButton.setBounds (1000, 15, exitIcon.getIconWidth(), exitIcon.getIconHeight());
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      		exitButton.setBorder(null);
      		exitButton.addActionListener(this);
		exitButton.setFocusPainted(false);//remove selection
		exitButton.setContentAreaFilled(false);//remove background

		c.add(exitButton);
	}
	public void minimize(){
		minimizeIcon = new ImageIcon (getClass().getResource("/images/min.png"));//use getResource from getClass

		minimizeButton = new JButton(minimizeIcon);
		minimizeButton.setBounds (970, 15, exitIcon.getIconWidth(), exitIcon.getIconHeight());
		minimizeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		minimizeButton.setBorder(null);
    		minimizeButton.addActionListener(this);
		minimizeButton.setFocusPainted(false);//remove selection
		minimizeButton.setContentAreaFilled(false);//remove background

		c.add(minimizeButton);
	}

	public void manubar(){
		manubar = new JPanel();
		manubar.setBackground(new Color(0x252a34));
		manubar.setBounds(0, 0, 80, 550);
		manubar.setLayout(null);

		img = new ImageIcon (getClass().getResource("/images/Logo1.png"));//use getResource from getClass
		pLogo = new JLabel("", img, JLabel.CENTER);
 		pLogo.setBounds(23, 30, img.getIconWidth(), img.getIconHeight());
 		manubar.add(pLogo);

 		userInfo1 = new ImageIcon (getClass().getResource("/images/userInfo1.png"));
 		addUser1 = new ImageIcon (getClass().getResource("/images/addUser1.png"));
 		addAdmin1 = new ImageIcon (getClass().getResource("/images/addAdmin1.png"));

 		userInfo2 = new ImageIcon (getClass().getResource("/images/userInfo2.png"));
 		addUser2 = new ImageIcon (getClass().getResource("/images/addUser2.png"));
 		addAdmin2 = new ImageIcon (getClass().getResource("/images/addAdmin2.png"));

 		home = new ImageIcon (getClass().getResource("/images/home.png"));
 		contribution = new ImageIcon (getClass().getResource("/images/info1.png"));
 		adminInfo = new ImageIcon (getClass().getResource("/images/user1.png"));
 		logout = new ImageIcon (getClass().getResource("/images/logout.png"));

 		homeButton = new JButton(home);
		homeButton.setBounds (24, 85, 32, 32);
		homeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
 	    	homeButton.setBorder(null);
	    	homeButton.addActionListener(this);
		homeButton.setFocusPainted(false);//remove selection
		homeButton.setContentAreaFilled(false);//remove background
		manubar.add(homeButton);

		adminInfoButton = new JButton(adminInfo);
		adminInfoButton.setBounds (24, 330, 32, 32);
		adminInfoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
   	   	adminInfoButton.setBorder(null);
   	   	adminInfoButton.addActionListener(this);
		adminInfoButton.setFocusPainted(false);//remove selection
		adminInfoButton.setContentAreaFilled(false);//remove background
		manubar.add(adminInfoButton);

		contributionButton = new JButton(contribution);
		contributionButton.setBounds (24, 440, 32, 32);
		contributionButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
   	   	contributionButton.setBorder(null);
  	    	contributionButton.addActionListener(this);
		contributionButton.setFocusPainted(false);//remove selection
		contributionButton.setContentAreaFilled(false);//remove background
		manubar.add(contributionButton);

		logoutButton = new JButton(logout);
		logoutButton.setBounds (24, 490, 32, 32);
		logoutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
   	   	logoutButton.setBorder(null);
   	   	logoutButton.addActionListener(this);
		logoutButton.setFocusPainted(false);//remove selection
		logoutButton.setContentAreaFilled(false);//remove background
		manubar.add(logoutButton);

 		userInfoButton1 = new JButton(userInfo1);
		userInfoButton1.setBounds (24, 180, 32, 32);
		userInfoButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
 	    	userInfoButton1.setBorder(null);
	    	userInfoButton1.addActionListener(this);
		userInfoButton1.setFocusPainted(false);//remove selection
		userInfoButton1.setContentAreaFilled(false);//remove background
		userInfoButton1.setVisible(false);
		manubar.add(userInfoButton1);

		userInfoButton2 = new JButton(userInfo2);
		userInfoButton2.setBounds (24, 180, 32, 32);
		userInfoButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
      		userInfoButton2.setBorder(null);
      		userInfoButton2.addActionListener(this);
		userInfoButton2.setFocusPainted(false);//remove selection
		userInfoButton2.setContentAreaFilled(false);//remove background
		manubar.add(userInfoButton2);

		addUserButton1 = new JButton(addUser1);
		addUserButton1.setBounds (24, 230, 32, 32);
		addUserButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
 	    	addUserButton1.setBorder(null);
 	    	addUserButton1.addActionListener(this);
		addUserButton1.setFocusPainted(false);//remove selection
		addUserButton1.setContentAreaFilled(false);//remove background
		manubar.add(addUserButton1);

		addUserButton2 = new JButton(addUser2);
		addUserButton2.setBounds (24, 230, 32, 32);
		addUserButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
  	    	addUserButton2.setBorder(null);
  	    	addUserButton2.addActionListener(this);
		addUserButton2.setFocusPainted(false);//remove selection
		addUserButton2.setContentAreaFilled(false);//remove background
		addUserButton2.setVisible(false);
		manubar.add(addUserButton2);

		addAdminButton1 = new JButton(addAdmin1);
		addAdminButton1.setBounds (24, 280, 32, 32);
		addAdminButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
   	   	addAdminButton1.setBorder(null);
  	    	addAdminButton1.addActionListener(this);
		addAdminButton1.setFocusPainted(false);//remove selection
		addAdminButton1.setContentAreaFilled(false);//remove background
		manubar.add(addAdminButton1);

		addAdminButton2 = new JButton(addAdmin2);
		addAdminButton2.setBounds (24, 280, 32, 32);
		addAdminButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
 	   	addAdminButton2.setBorder(null);
 	    	addAdminButton2.addActionListener(this);
		addAdminButton2.setFocusPainted(false);//remove selection
		addAdminButton2.setContentAreaFilled(false);//remove background
		addAdminButton2.setVisible(false);
		manubar.add(addAdminButton2);
		c.add(manubar);
	}

	public void userInfo(){
		userInfoPanel = new JPanel();
		userInfoPanel.setBackground(new Color(0x2a2f3a));
		userInfoPanel.setBounds(80, 41, 970, 1000);
		userInfoPanel.setLayout(null);//new FlowLayout()

		uLable = new JLabel("User Information!!", JLabel.CENTER);
        	uLable.setBounds(0, 10, 970,40);
 	     	uLable.setForeground(new Color(0x98abb2));
        	uLable.setFont(f3);
        	userInfoPanel.add(uLable);

		DataTable dt = new DataTable(userInfoPanel);
	      	refreshButton = new JButton("Refresh");
	        refreshButton.setBounds (400, 420, 150, 40);//
		refreshButton.setForeground(new Color(0x98abb2));
		refreshButton.setBackground(Color.white);
		refreshButton.setFont(f2);
		refreshButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
 		Border border1 = new LineBorder(new Color(0x98abb2), 2, true);//new Color(0x98abb2)
		refreshButton.setBorder(border1);
	      	refreshButton.addActionListener(this);
		refreshButton.setFocusPainted(false);//remove selection
		refreshButton.setOpaque(false);
	      	userInfoPanel.add(refreshButton);

		c.add(userInfoPanel);
	}

	public void adduser(){
		addUserPanel = new JPanel();
		addUserPanel.setBackground(new Color(0x2a2f3a));
		addUserPanel.setBounds(80, 41, 970, 1000);
		addUserPanel.setLayout(null);

		rLable = new JLabel("Add Customer Account!!", JLabel.CENTER);
        	rLable.setBounds(0, 10, 970,40);
 	     	rLable.setForeground(new Color(0x98abb2));
        	rLable.setFont(f3);
        	addUserPanel.add(rLable);

	        name = new JLabel("Name:");
	        name.setBounds(270, 70, 180, 40);
	        name.setForeground(new Color(0x98abb2));
	        name.setFont(f2);
	        addUserPanel.add(name);

	        birth  = new JLabel("Dath of Birth:");
	        birth.setBounds(270, 100, 180, 40);
	        birth.setForeground(new Color(0x98abb2));
	        birth.setFont(f2);
	        addUserPanel.add(birth);

	        religion  = new JLabel("Religion:");
	        religion.setBounds(270, 130, 180, 40);
	        religion.setForeground(new Color(0x98abb2));
	        religion.setFont(f2);
	        addUserPanel.add(religion);

	        mail = new JLabel("Mail Address:");
	        mail.setBounds(270, 160, 180, 40);
	        mail.setForeground(new Color(0x98abb2));
	        mail.setFont(f2);
	        addUserPanel.add(mail);

	        password = new JLabel("Set Password:");
	        password.setBounds(270, 190, 180, 40);
	        password.setForeground(new Color(0x98abb2));
	        password.setFont(f2);
	        addUserPanel.add(password);

	        rpassword = new JLabel("Re-type Password:");
	        rpassword.setBounds(270, 220, 180, 40);
	        rpassword.setForeground(new Color(0x98abb2));
	        rpassword.setFont(f2);
	        addUserPanel.add(rpassword);

	        question = new JLabel("Security Question:");
	        question.setBounds(270, 250, 180, 40);
	        question.setForeground(new Color(0x98abb2));
	        question.setFont(f2);
	        addUserPanel.add(question);

	        answer = new JLabel("Your Answer:");
	        answer.setBounds(270, 280, 180, 40);
	        answer.setForeground(new Color(0x98abb2));
	        answer.setFont(f2);
	        addUserPanel.add(answer);

	        captcha = new JLabel("Captcha:");
	        captcha.setBounds(270, 310, 180, 40);
	        captcha.setForeground(new Color(0x98abb2));
	        captcha.setFont(f2);
	        addUserPanel.add(captcha);

	        registerButton = new JButton("Register");
	        registerButton.setBounds (430, 370, 150, 40);
		registerButton.setForeground(new Color(0x98abb2));
		registerButton.setBackground(Color.white);
		registerButton.setFont(f2);
		registerButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
 		Border border = new LineBorder(new Color(0x98abb2), 2, true);//new Color(0x98abb2)
		registerButton.setBorder(border);
	      	registerButton.addActionListener(this);
		registerButton.setFocusPainted(false);//remove selection
		registerButton.setOpaque(false);
	      	addUserPanel.add(registerButton);

	        l3 = new JLabel("________________________________________");
	        l3.setBounds(455, 73, 300, 40);
	        l3.setForeground(new Color(0x98abb2));
	        l3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addUserPanel.add(l3);

		l4 = new JLabel("________________________________________");
	        l4.setBounds(455, 103, 300, 40);
	        l4.setForeground(new Color(0x98abb2));
	        l4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addUserPanel.add(l4);

		l5 = new JLabel("________________________________________");
	        l5.setBounds(455, 133, 300, 40);
	        l5.setForeground(new Color(0x98abb2));
	        l5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addUserPanel.add(l5);

		l6 = new JLabel("________________________________________");
	        l6.setBounds(455, 163, 300, 40);
	        l6.setForeground(new Color(0x98abb2));
	        l6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addUserPanel.add(l6);

		l7 = new JLabel("________________________________________");
	        l7.setBounds(455, 193, 300, 40);
	        l7.setForeground(new Color(0x98abb2));
	        l7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addUserPanel.add(l7);

		l8 = new JLabel("________________________________________");
	        l8.setBounds(455, 223, 300, 40);
	        l8.setForeground(new Color(0x98abb2));
	        l8.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addUserPanel.add(l8);

		l9 = new JLabel("________________________________________");
	        l9.setBounds(455, 283, 300, 40);
	        l9.setForeground(new Color(0x98abb2));
	        l9.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addUserPanel.add(l9);

		l10 = new JLabel("________________________________________");
	        l10.setBounds(455, 313, 300, 40);
	        l10.setForeground(new Color(0x98abb2));
	        l10.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addUserPanel.add(l10);

	        nameField = new JTextField();
	        nameField.setBounds(455, 70, 240, 40);
	        nameField.setFont(f2);
	        nameField.setForeground(Color.white);
	        nameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        nameField.setCaretColor(Color.white);
	        nameField.setBorder(null);
	        nameField.setOpaque(false);//**
	        nameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        nameField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addUserPanel.add(nameField);

	        birthField = new JTextField();
	        birthField.setBounds(455, 100, 240, 40);
	        birthField.setFont(f2);
	        birthField.setForeground(Color.white);
	        birthField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        birthField.setCaretColor(Color.white);
	        birthField.setBorder(null);
	        birthField.setOpaque(false);//**
	        birthField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        birthField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addUserPanel.add(birthField);

	        religionField = new JTextField();
	        religionField.setBounds(455, 130, 240, 40);
	        religionField.setFont(f2);
	        religionField.setForeground(Color.white);
	        religionField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        religionField.setCaretColor(Color.white);
	        religionField.setBorder(null);
	        religionField.setOpaque(false);//**
	        religionField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        religionField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addUserPanel.add(religionField);

	        mailField = new JTextField();
	        mailField.setBounds(455, 160, 240, 40);
	        mailField.setFont(f2);
	        mailField.setForeground(Color.white);
	        mailField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        mailField.setCaretColor(Color.white);
	        mailField.setBorder(null);
	        mailField.setOpaque(false);//**
	        mailField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        mailField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addUserPanel.add(mailField);

	        spasswordField = new JPasswordField();
	        spasswordField.setBounds(455, 190, 240, 40);
	        spasswordField.setFont(f2);
	        spasswordField.setForeground(Color.white);
	        spasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        spasswordField.setCaretColor(Color.white);
	        spasswordField.setEchoChar('*');
	        spasswordField.setBorder(null);
	        spasswordField.setOpaque(false);//**
	        spasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        spasswordField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addUserPanel.add(spasswordField);

	        box12=new JCheckBox();
	        box12.setText("Show");
	        box12.setBounds(700,200,70,30);
	        box12.setFont(f5);
	        box12.setBackground(Color.WHITE);
	        box12.setForeground(new Color(0x98abb2));
	        box12.setOpaque(false);
	        box12.setFocusPainted(false);//remove selection
	        box12.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent cb)
	            {
	                if(box12.isSelected())
	                {
	                    spasswordField.setEchoChar((char)0);
	                }
	                else
	                {
	                    spasswordField.setEchoChar('*');
	                }
	            }
	        });
	        addUserPanel.add(box12);


	        rpasswordField = new JPasswordField();
	        rpasswordField.setBounds(455, 220, 240, 40);
	        rpasswordField.setFont(f2);
	        rpasswordField.setForeground(Color.white);
	        rpasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        rpasswordField.setCaretColor(Color.white);
	        rpasswordField.setEchoChar('*');
	        rpasswordField.setBorder(null);
	        rpasswordField.setOpaque(false);//**
	        rpasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        rpasswordField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addUserPanel.add(rpasswordField);

	        box13=new JCheckBox();
	        box13.setText("Show");
	        box13.setBounds(700,230,70,30);
	        box13.setFont(f5);
	        box13.setBackground(Color.WHITE);
	        box13.setForeground(new Color(0x98abb2));
	        box13.setOpaque(false);
	        box13.setFocusPainted(false);//remove selection
	        box13.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent cb)
	            {
	                if(box13.isSelected())
	                {
	                    rpasswordField.setEchoChar((char)0);
	                }
	                else
	                {
	                    rpasswordField.setEchoChar('*');
	                }
	            }
	        });
	        addUserPanel.add(box13);

	        answerField = new JTextField();
	        answerField.setBounds(455, 280, 240, 40);
	        answerField.setFont(f2);
	        answerField.setForeground(Color.white);
	        answerField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        answerField.setCaretColor(Color.white);
	        answerField.setBorder(null);
	        answerField.setOpaque(false);//**
	        answerField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        answerField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addUserPanel.add(answerField);

	        captchaField = new JTextField();
	        captchaField.setBounds(455, 310, 240, 40);
	        captchaField.setFont(f2);
	        captchaField.setForeground(Color.white);
	        captchaField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        captchaField.setCaretColor(Color.white);
	        captchaField.setBorder(null);
	        captchaField.setOpaque(false);//**
	        captchaField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        captchaField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addUserPanel.add(captchaField);

	        String[] que = { "Choose a security question", "What's your father's name?", "What's your mother's name?",
	                "What's your favourite pet name?", "What's your favorite sports?", "What's your favourite movie?" };
	        qbox = new JComboBox(que);
	        qbox.setBounds(455, 263, 240, 20);
	        qbox.setFont(f5);
	        qbox.setSelectedIndex(0);
	        qbox.setBackground(new Color(0x99d5ea));
	        addUserPanel.add(qbox);

	        Random rand = new Random();
	        a = rand.nextInt(10);
	        b = rand.nextInt(10);

	        gCaptcha = new JLabel();
	        gCaptcha.setText("   " + a + " + " + b + "  ");
	        gCaptcha.setBounds(370, 320, 55, 20);
	        gCaptcha.setForeground(Color.black);
	        gCaptcha.setBackground(new Color(0x99d5ea));
	        gCaptcha.setFont(f5);
	        gCaptcha.setBorder(null);
	        gCaptcha.setOpaque(true);
	        addUserPanel.add(gCaptcha);
	}

	public void addAdmin(){
		addAdminPanel = new JPanel();
		addAdminPanel.setBackground(new Color(0x2a2f3a));
		addAdminPanel.setBounds(80, 41, 970, 1000);
		addAdminPanel.setLayout(null);

		arLable = new JLabel("Add Admin Account!!", JLabel.CENTER);
        	arLable.setBounds(0, 10, 970,40);
 	     	arLable.setForeground(new Color(0x98abb2));
        	arLable.setFont(f3);
        	addAdminPanel.add(arLable);

	        aname = new JLabel("Name:");
	        aname.setBounds(270, 70, 180, 40);
	        aname.setForeground(new Color(0x98abb2));
	        aname.setFont(f2);
	        addAdminPanel.add(aname);

	        abirth  = new JLabel("Dath of Birth:");
	        abirth.setBounds(270, 100, 180, 40);
	        abirth.setForeground(new Color(0x98abb2));
	        abirth.setFont(f2);
	        addAdminPanel.add(abirth);

	        areligion  = new JLabel("Religion:");
	        areligion.setBounds(270, 130, 180, 40);
	        areligion.setForeground(new Color(0x98abb2));
	        areligion.setFont(f2);
	        addAdminPanel.add(areligion);

	        amail = new JLabel("Mail Address:");
	        amail.setBounds(270, 160, 180, 40);
	        amail.setForeground(new Color(0x98abb2));
	        amail.setFont(f2);
	        addAdminPanel.add(amail);

	        apassword = new JLabel("Set Password:");
	        apassword.setBounds(270, 190, 180, 40);
	        apassword.setForeground(new Color(0x98abb2));
	        apassword.setFont(f2);
	        addAdminPanel.add(apassword);

	        arpassword = new JLabel("Re-type Password:");
	        arpassword.setBounds(270, 220, 180, 40);
	        arpassword.setForeground(new Color(0x98abb2));
	        arpassword.setFont(f2);
	        addAdminPanel.add(arpassword);

	        aquestion = new JLabel("Security Question:");
	        aquestion.setBounds(270, 250, 180, 40);
	        aquestion.setForeground(new Color(0x98abb2));
	        aquestion.setFont(f2);
	        addAdminPanel.add(aquestion);

	        aanswer = new JLabel("Your Answer:");
	        aanswer.setBounds(270, 280, 180, 40);
	        aanswer.setForeground(new Color(0x98abb2));
	        aanswer.setFont(f2);
	        addAdminPanel.add(aanswer);

	        acaptcha = new JLabel("Captcha:");
	        acaptcha.setBounds(270, 310, 180, 40);
	        acaptcha.setForeground(new Color(0x98abb2));
	        acaptcha.setFont(f2);
	        addAdminPanel.add(acaptcha);

	        aregisterButton = new JButton("Register");
	        aregisterButton.setBounds (430, 370, 150, 40);
		aregisterButton.setForeground(new Color(0x98abb2));
		aregisterButton.setBackground(Color.white);
		aregisterButton.setFont(f2);
		aregisterButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
 		Border border1 = new LineBorder(new Color(0x98abb2), 2, true);//new Color(0x98abb2)
		aregisterButton.setBorder(border1);
	      	aregisterButton.addActionListener(this);
		aregisterButton.setFocusPainted(false);//remove selection
		aregisterButton.setOpaque(false);
	      	addAdminPanel.add(aregisterButton);

	        al3 = new JLabel("________________________________________");
	        al3.setBounds(455, 73, 300, 40);
	        al3.setForeground(new Color(0x98abb2));
	        al3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminPanel.add(al3);

		al4 = new JLabel("________________________________________");
	        al4.setBounds(455, 103, 300, 40);
	        al4.setForeground(new Color(0x98abb2));
	        al4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminPanel.add(al4);

		al5 = new JLabel("________________________________________");
	        al5.setBounds(455, 133, 300, 40);
	        al5.setForeground(new Color(0x98abb2));
	        al5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminPanel.add(al5);

		al6 = new JLabel("________________________________________");
	        al6.setBounds(455, 163, 300, 40);
	        al6.setForeground(new Color(0x98abb2));
	        al6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminPanel.add(al6);

		al7 = new JLabel("________________________________________");
	        al7.setBounds(455, 193, 300, 40);
	        al7.setForeground(new Color(0x98abb2));
	        al7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminPanel.add(al7);

		al8 = new JLabel("________________________________________");
	        al8.setBounds(455, 223, 300, 40);
	        al8.setForeground(new Color(0x98abb2));
	        al8.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminPanel.add(al8);

		al9 = new JLabel("________________________________________");
	        al9.setBounds(455, 283, 300, 40);
	        al9.setForeground(new Color(0x98abb2));
	        al9.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminPanel.add(al9);

		al10 = new JLabel("________________________________________");
	        al10.setBounds(455, 313, 300, 40);
	        al10.setForeground(new Color(0x98abb2));
	        al10.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminPanel.add(al10);

	        anameField = new JTextField();
	        anameField.setBounds(455, 70, 240, 40);
	        anameField.setFont(f2);
	        anameField.setForeground(Color.white);
	        anameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        anameField.setCaretColor(Color.white);
	        anameField.setBorder(null);
	        anameField.setOpaque(false);//**
	        anameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        anameField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addAdminPanel.add(anameField);

	        abirthField = new JTextField();
	        abirthField.setBounds(455, 100, 240, 40);
	        abirthField.setFont(f2);
	        abirthField.setForeground(Color.white);
	        abirthField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        abirthField.setCaretColor(Color.white);
	        abirthField.setBorder(null);
	        abirthField.setOpaque(false);//**
	        abirthField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        abirthField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addAdminPanel.add(abirthField);

	        areligionField = new JTextField();
	        areligionField.setBounds(455, 130, 240, 40);
	        areligionField.setFont(f2);
	        areligionField.setForeground(Color.white);
	        areligionField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        areligionField.setCaretColor(Color.white);
	        areligionField.setBorder(null);
	        areligionField.setOpaque(false);//**
	        areligionField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        areligionField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addAdminPanel.add(areligionField);

	        amailField = new JTextField();
	        amailField.setBounds(455, 160, 240, 40);
	        amailField.setFont(f2);
	        amailField.setForeground(Color.white);
	        amailField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        amailField.setCaretColor(Color.white);
	        amailField.setBorder(null);
	        amailField.setOpaque(false);//**
	        amailField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        amailField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addAdminPanel.add(amailField);

	        aspasswordField = new JPasswordField();
	        aspasswordField.setBounds(455, 190, 240, 40);
	        aspasswordField.setFont(f2);
	        aspasswordField.setForeground(Color.white);
	        aspasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        aspasswordField.setCaretColor(Color.white);
	        aspasswordField.setEchoChar('*');
	        aspasswordField.setBorder(null);
	        aspasswordField.setOpaque(false);//**
	        aspasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        aspasswordField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addAdminPanel.add(aspasswordField);

	        abox12=new JCheckBox();
	        abox12.setText("Show");
	        abox12.setBounds(700,200,70,30);
	        abox12.setFont(f5);
	        abox12.setBackground(Color.WHITE);
	        abox12.setForeground(new Color(0x98abb2));
	        abox12.setOpaque(false);
	        abox12.setFocusPainted(false);//remove selection
	        abox12.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent cb)
	            {
	                if(abox12.isSelected())
	                {
	                    aspasswordField.setEchoChar((char)0);
	                }
	                else
	                {
	                    aspasswordField.setEchoChar('*');
	                }
	            }
	        });
	        addAdminPanel.add(abox12);


	        arpasswordField = new JPasswordField();
	        arpasswordField.setBounds(455, 220, 240, 40);
	        arpasswordField.setFont(f2);
	        arpasswordField.setForeground(Color.white);
	        arpasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        arpasswordField.setCaretColor(Color.white);
	        arpasswordField.setEchoChar('*');
	        arpasswordField.setBorder(null);
	        arpasswordField.setOpaque(false);//**
	        arpasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        arpasswordField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addAdminPanel.add(arpasswordField);

	        abox13=new JCheckBox();
	        abox13.setText("Show");
	        abox13.setBounds(700,230,70,30);
	        abox13.setFont(f5);
	        abox13.setBackground(Color.WHITE);
	        abox13.setForeground(new Color(0x98abb2));
	        abox13.setOpaque(false);
	        abox13.setFocusPainted(false);//remove selection
	        abox13.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent cb)
	            {
	                if(abox13.isSelected())
	                {
	                    arpasswordField.setEchoChar((char)0);
	                }
	                else
	                {
	                    arpasswordField.setEchoChar('*');
	                }
	            }
	        });
	        addAdminPanel.add(abox13);

	        aanswerField = new JTextField();
	        aanswerField.setBounds(455, 280, 240, 40);
	        aanswerField.setFont(f2);
	        aanswerField.setForeground(Color.white);
	        aanswerField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        aanswerField.setCaretColor(Color.white);
	        aanswerField.setBorder(null);
	        aanswerField.setOpaque(false);//**
	        aanswerField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        aanswerField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addAdminPanel.add(aanswerField);

	        acaptchaField = new JTextField();
	        acaptchaField.setBounds(455, 310, 240, 40);
	        acaptchaField.setFont(f2);
	        acaptchaField.setForeground(Color.white);
	        acaptchaField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        acaptchaField.setCaretColor(Color.white);
	        acaptchaField.setBorder(null);
	        acaptchaField.setOpaque(false);//**
	        acaptchaField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	        acaptchaField.setHorizontalAlignment(JTextField.CENTER);//by default right
	        addAdminPanel.add(acaptchaField);

	        String[] aque = { "Choose a security question", "What's your father's name?", "What's your mother's name?",
	                "What's your favourite pet name?", "What's your favorite sports?", "What's your favourite movie?" };
	        aqbox = new JComboBox(aque);
	        aqbox.setBounds(455, 263, 240, 20);
	        aqbox.setFont(f5);
	        aqbox.setSelectedIndex(0);
	        aqbox.setBackground(new Color(0x99d5ea));
	        addAdminPanel.add(aqbox);

	        Random rand1 = new Random();
	        e = rand1.nextInt(10);
	        d = rand1.nextInt(10);

	        agCaptcha = new JLabel();
	        agCaptcha.setText("   " + e + " + " + d + "  ");
	        agCaptcha.setBounds(370, 320, 55, 20);
	        agCaptcha.setForeground(Color.black);
	        agCaptcha.setBackground(new Color(0x99d5ea));
	        agCaptcha.setFont(f5);
	        agCaptcha.setBorder(null);
	        agCaptcha.setOpaque(true);
	        addAdminPanel.add(agCaptcha);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == minimizeButton){
			setState(JFrame.ICONIFIED);;
		}else if(ae.getSource() == exitButton){
			System.exit(0);
		}else if (ae.getSource() == userInfoButton1){ 
			userInfoButton1.setVisible(false);
			userInfoButton2.setVisible(true);
			addUserButton1.setVisible(true);
			addUserButton2.setVisible(false);
			addAdminButton1.setVisible(true);
			addAdminButton2.setVisible(false);

			c.remove(addAdminPanel);
			c.remove(addUserPanel);
			c.repaint();
			c.add(userInfoPanel);
		}else if (ae.getSource() == addUserButton1){ 
			userInfoButton1.setVisible(true);
			userInfoButton2.setVisible(false);
			addUserButton1.setVisible(false);
			addUserButton2.setVisible(true);
			addAdminButton1.setVisible(true);
			addAdminButton2.setVisible(false);

			c.remove(addAdminPanel);
			c.remove(userInfoPanel);
			c.repaint();
			c.add(addUserPanel);

		}else if (ae.getSource() == addAdminButton1){ 
			userInfoButton1.setVisible(true);
			userInfoButton2.setVisible(false);
			addUserButton1.setVisible(true);
			addUserButton2.setVisible(false);
			addAdminButton1.setVisible(false);
			addAdminButton2.setVisible(true);
			
			c.remove(addUserPanel);
			c.remove(userInfoPanel);
			c.repaint();
			c.add(addAdminPanel);

		}else if (ae.getSource() == adminInfoButton){ //book bookName1 writer1 price1
			UserInfo info = new UserInfo(adminName);
			info.setResizable(false); //prevent frame from being resized
			info.setVisible(true); //make frame visible
		}else if (ae.getSource() == contributionButton){ 
			Contribution con = new Contribution();
			con.setResizable(false); //prevent frame from being resized
			con.setVisible(true); //make frame visible
		}else if (ae.getSource() == homeButton){ 
			dispose();
			UserDashboard uDash = new UserDashboard(adminName, "Admin");
			uDash.setResizable(false); //prevent frame from being resized
			uDash.setVisible(true); //make frame visible
		}else if (ae.getSource() == logoutButton){ 
			dispose();
			Welcome wel = new Welcome();
			wel.setResizable(false); //prevent frame from being resized
			wel.setVisible(true); //make frame visible
		}else if(ae.getSource() == registerButton){
			String userName = nameField.getText(); // Name
            		String birth = birthField.getText(); // Date Of Birth
            		String religion = religionField.getText(); // religion
            		String mail = mailField.getText().toLowerCase(); // User mail
            		String password = spasswordField.getText(); // Password
            		String rpassword = rpasswordField.getText(); // Retype Password
            		String ans = answerField.getText(); // Security Question Answer
            		String aCaptcha = captchaField.getText(); // Capcha
            		String sQuestion = String.valueOf(qbox.getSelectedItem()); // Security Question
          
          		int intCaptcha = 0;
            	

            		if (userName.isEmpty() || birth.isEmpty() || religion.isEmpty() || mail.isEmpty()
               		        || password.isEmpty() || rpassword.isEmpty() || ans.isEmpty()
                        	|| aCaptcha.isEmpty() || ((qbox.getSelectedIndex()) == 0)) {
                		JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
           		}else{

                		try {
                    			intCaptcha = Integer.parseInt(aCaptcha);
                		}catch (Exception ef) {
                    			JOptionPane.showMessageDialog(null, "Wrong captcha input ", "null", 2);
                    			ef.printStackTrace();
                		}

                		if (intCaptcha != (a + b)) {
                    			JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                		}else if (!password.equals(rpassword)) {
                    			JOptionPane.showMessageDialog(null, "Password & Re-type Password must be same", "null", 2);
                		}else{
                			AddUser aUser = new AddUser(userName, birth, religion, mail, password, sQuestion, ans, "Customer");
/*
                			userInfoButton1.setVisible(false);
					userInfoButton2.setVisible(true);
					addUserButton1.setVisible(false);
					addUserButton2.setVisible(true);
			
					c.remove(addUserPanel);
					c.repaint();
					c.add(userInfoPanel);
*/
					dispose();
					AdminDashboard aDash = new AdminDashboard(adminName);
					aDash.setResizable(false); //prevent frame from being resized
					aDash.setVisible(true); //make frame visible					
                		}
				
            		}
		}else if(ae.getSource() == aregisterButton){
			String auserName = anameField.getText(); // Name
            		String abirth = abirthField.getText(); // Date Of Birth
            		String areligion = areligionField.getText(); // religion
            		String amail = amailField.getText().toLowerCase(); // User mail
            		String apassword = aspasswordField.getText(); // Password
            		String arpassword = arpasswordField.getText(); // Retype Password
            		String aans = aanswerField.getText(); // Security Question Answer
            		String aaCaptcha = acaptchaField.getText(); // Capcha
            		String asQuestion = String.valueOf(aqbox.getSelectedItem()); // Security Question
          
          		int aintCaptcha = 0;
            	

            		if (auserName.isEmpty() || abirth.isEmpty() || areligion.isEmpty() || amail.isEmpty()
               		        || apassword.isEmpty() || arpassword.isEmpty() || aans.isEmpty()
                        	|| aaCaptcha.isEmpty() || ((aqbox.getSelectedIndex()) == 0)) {
                		JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
           		}else{

                		try {
                    			aintCaptcha = Integer.parseInt(aaCaptcha);
                		}catch (Exception ef) {
                    			JOptionPane.showMessageDialog(null, "Wrong captcha input ", "null", 2);
                    			ef.printStackTrace();
                		}

                		if (aintCaptcha != (e + d)) {
                    			JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                		}else if (!apassword.equals(arpassword)) {
                    			JOptionPane.showMessageDialog(null, "Password & Re-type Password must be same", "null", 2);
                		}else{
                			AddUser aUser = new AddUser(auserName, abirth, areligion, amail, apassword, asQuestion, aans, "Admin");

                			dispose();
					AdminDashboard aDash = new AdminDashboard(adminName);
					aDash.setResizable(false); //prevent frame from being resized
					aDash.setVisible(true); //make frame visible					
                		}
				
            		}
		}else if (ae.getSource() == refreshButton){ //book bookName1 writer1 price1
			dispose();
			AdminDashboard aDash = new AdminDashboard(adminName);
			aDash.setResizable(false); //prevent frame from being resized
			aDash.setVisible(true); //make frame visible					
		}
	}

	public static void main(String[] args) {
		AdminDashboard aDash = new AdminDashboard("Asif");
		aDash.setResizable(false); //prevent frame from being resized
		aDash.setVisible(true); //make frame visible
	}
}