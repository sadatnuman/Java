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
import javax.swing.JCheckBox;



public class Welcome extends JFrame implements ActionListener{

	private Container c;
	private ImageIcon logo, img, backIcon;
	private JLabel imgLabel, textLabel, wLable, wInfoLable, lLable, lUser, lPassword, l1, l2, rLable, name, birth, religion,
	 mail, password, rpassword,question, answer, captcha, gCaptcha, haveAccount, noAccount, l3, l4, l5, l6, l7, l8, l9, l10;
	private Font f1, f2, f3, f4, f5;
	private JTextField userFild, nameField, birthField, religionField, mailField, answerField, captchaField;
	private JPasswordField passFild, spasswordField, rpasswordField;
	private JPanel logoPanel, welcome, login, register, backPanel; 
	private JButton logoButton, exitButton, yesButton, noButton, backButton, loginButton, adminLoginButton, registerButton, signupButton, signinButton;
	private JComboBox qbox;
	private int a, b;
    private JCheckBox box11 ,box12,box13;

	public Welcome(){
		this.setUndecorated(true);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //exit out of application
 		this.setSize(900, 500); //sets the x-dimension, and y-dimension of frame
 		this.setLocationRelativeTo(null);//open middle of the screen

 		c = this.getContentPane();//contain frame into the container
 		c.setLayout(null);//remove defult layout settings
 		c.setBackground(new Color(0x252a34));//set background color

 		logo();
 		font();
 		exitButton();
        backButton();
 		logoPanel();
 		panels();
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
		exitButton = new JButton("Exit");
		exitButton.setBounds (820, 15, 40, 23);
		exitButton.setForeground(new Color(0xff5a4e));
		exitButton.setFont(f2);
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	exitButton.setBorder(null);
      	exitButton.addActionListener(this);
		exitButton.setFocusPainted(false);//remove selection
		exitButton.setContentAreaFilled(false);//remove background

		c.add(exitButton);
	}

    public void backButton(){
        backIcon = new ImageIcon (getClass().getResource("/images/back.png"));//use getResource from getClass

        backPanel = new JPanel();
        backPanel.setBounds(340, 15, backIcon.getIconWidth(), backIcon.getIconHeight());
        backPanel.setBackground(new Color(0x252a34));
        backPanel.setLayout(null);

        backButton = new JButton(backIcon);
        backButton.setBounds (0, 0, backIcon.getIconWidth(), backIcon.getIconHeight());
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setBorder(null);
        backButton.addActionListener(this);
        backButton.setFocusPainted(false);//remove selection
        backButton.setContentAreaFilled(false);//remove background

        backPanel.add(backButton);
        backPanel.setVisible(false);
        c.add(backPanel);
    }

	public void logoPanel(){
		logoPanel = new JPanel();
		logoPanel.setBackground(new Color(0x2a2f3a));
		logoPanel.setBounds(0, 0, 320, 500);
		logoPanel.setLayout(null);

		img = new ImageIcon (getClass().getResource("/images/Logo.png"));//use getResource from getClass

		logoButton = new JButton(img);
		logoButton.setBounds (60, 100, img.getIconWidth(), img.getIconHeight());
		logoButton.setToolTipText("Contribution");
		logoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Border border = new LineBorder(new Color(0x2a2f3a), 0, true);
      	logoButton.setBorder(border);
		logoButton.setFocusPainted(false);
		logoButton.setContentAreaFilled(false);
		logoButton.addActionListener(this);
		logoPanel.add(logoButton);

		
		textLabel = new JLabel();
		textLabel.setText ("Vidyasagar");
		textLabel.setBounds(70, 305, 360, 50);//combination of setLocation and setSize (x-axis, y-axis, weight, height)
		textLabel.setForeground(new Color(0xf8dab4));//change font color
		textLabel.setFont(f1);
		logoPanel.add(textLabel);

		c.add(logoPanel);
	}

	public void panels(){
		welcome = new JPanel();
		welcome.setBounds(320, 40, 800, 460);
		welcome.setBackground(new Color(0x252a34));
		welcome.setLayout(null);

		wLable = new JLabel("WELCOME !!", JLabel.CENTER);
        wLable.setBounds(0, 120, 600,40);
        wLable.setForeground(new Color(0x98abb2));
        wLable.setFont(f3);
        welcome.add(wLable);

        wInfoLable = new JLabel("Do you already have any account?", JLabel.CENTER);
        wInfoLable.setBounds(0, 180, 600,40);
        wInfoLable.setForeground(new Color(0x98abb2));
        wInfoLable.setFont(f2);
        welcome.add(wInfoLable);

        yesButton = new JButton("Yes");
		yesButton.setBounds (320, 250, 100, 40);
		yesButton.setForeground(new Color(0x98abb2));
		yesButton.setBackground(Color.WHITE);
		yesButton.setFont(f2);
		yesButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Border border1 = new LineBorder(new Color(0x98abb2), 2, true);
      	yesButton.setBorder(border1);
      	yesButton.addActionListener(this);
		yesButton.setFocusPainted(false);//remove selection
		yesButton.setOpaque(false);
      	welcome.add(yesButton);


        noButton = new JButton("No");
		noButton.setBounds (190, 250, 100, 40);
		noButton.setForeground(new Color(0x98abb2));
		noButton.setBackground(Color.white);
		noButton.setFont(f2);
		noButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Border border2 = new LineBorder(new Color(0x98abb2), 2, true);
      	noButton.setBorder(border2);
      	noButton.addActionListener(this);
		noButton.setFocusPainted(false);//remove selection
		noButton.setOpaque(false);
      	welcome.add(noButton);

		c.add(welcome);



		login = new JPanel();
		login.setBounds(320, 40, 800, 460);
		login.setBackground(new Color(0x252a34));
		login.setLayout(null);

		lLable = new JLabel("Login!!", JLabel.CENTER);
        lLable.setBounds(0, 100, 600,40);
        lLable.setForeground(new Color(0x98abb2));
        lLable.setFont(f3);
        login.add(lLable);

        lUser = new JLabel("User name:");
        lUser.setBounds(70, 160, 105, 40);
        lUser.setForeground(new Color(0x98abb2));
        lUser.setFont(f2);
        login.add(lUser);

        lPassword = new JLabel("Password:");
        lPassword.setBounds(70, 210, 105, 40);
        lPassword.setForeground(new Color(0x98abb2));
        lPassword.setFont(f2);
        login.add(lPassword);

        l1 = new JLabel("___________________________________________________");
        l1.setBounds(180, 163, 400, 40);
        l1.setForeground(new Color(0x98abb2));
        l1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        login.add(l1);

        l2 = new JLabel("___________________________________________________");
        l2.setBounds(180, 213, 400, 40);
        l2.setForeground(new Color(0x98abb2));
        l2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		login.add(l2);

		loginButton = new JButton("Login");
		loginButton.setBounds (120, 290, 150, 40);
		loginButton.setForeground(new Color(0x98abb2));
		loginButton.setBackground(Color.white);
		loginButton.setFont(f2);
		loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	loginButton.setBorder(border2);
      	loginButton.addActionListener(this);
		loginButton.setFocusPainted(false);//remove selection
		loginButton.setOpaque(false);
      	login.add(loginButton);

        adminLoginButton = new JButton("Admin Login");
        adminLoginButton.setBounds (290, 290, 150, 40);
        adminLoginButton.setForeground(new Color(0x98abb2));
        adminLoginButton.setBackground(Color.white);
        adminLoginButton.setFont(f2);
        adminLoginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminLoginButton.setBorder(border2);
        adminLoginButton.addActionListener(this);
        adminLoginButton.setFocusPainted(false);//remove selection
        adminLoginButton.setOpaque(false);
        login.add(adminLoginButton);

      	userFild = new JTextField();
        userFild.setBounds(180, 160, 300, 40);
        userFild.setFont(f2);
        userFild.setForeground(Color.white);
        userFild.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        userFild.setCaretColor(Color.white);
        userFild.setBorder(null);
        userFild.setOpaque(false);//**
        userFild.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        userFild.setHorizontalAlignment(JTextField.CENTER);//by default right
        login.add(userFild);

        passFild = new JPasswordField();
        passFild.setBounds(180, 210, 300, 40);
        passFild.setFont(f2);
        passFild.setForeground(Color.white);
        passFild.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        passFild.setCaretColor(Color.white);
        passFild.setEchoChar('*');
        passFild.setBorder(null);
        passFild.setOpaque(false);
        passFild.setHorizontalAlignment(JTextField.CENTER);//by default right
        login.add(passFild);

        box11=new JCheckBox();
        box11.setText("Show");
        box11.setBounds(490,215,70,30);
        box11.setFont(f5);
        box11.setBackground(Color.WHITE);
        box11.setForeground(new Color(0x98abb2));
        box11.setOpaque(false);
        box11.setFocusPainted(false);//remove selection
        box11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent cb)
            {
                if(box11.isSelected())
                {
                    passFild.setEchoChar((char)0);
                }
                else
                {
                    passFild.setEchoChar('*');
                }
            }
        });
        login.add(box11);

        noAccount = new JLabel("Don't have any account, then");
        noAccount.setBounds(125, 350, 270, 40);
        noAccount.setForeground(new Color(0x98abb2));
        noAccount.setFont(f4);
        login.add(noAccount);

        signupButton = new JButton("sign up");
		signupButton.setBounds (355, 359, 90, 23);
		signupButton.setForeground(new Color(0x99d5ea));
		signupButton.setBackground(new Color(0xff5a4e));
		signupButton.setFont(f4);
		signupButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	signupButton.setBorder(null);
      	signupButton.addActionListener(this);
		signupButton.setOpaque(false);
		signupButton.setContentAreaFilled(false);//remove background
		login.add(signupButton);



        register = new JPanel();
		register.setBounds(320, 40, 800, 460);
		register.setBackground(new Color(0x252a34));
		register.setLayout(null);

		rLable = new JLabel("Sign up!!", JLabel.CENTER);
        rLable.setBounds(0, 10, 600,40);
        rLable.setForeground(new Color(0x98abb2));
        rLable.setFont(f3);
        register.add(rLable);

        name = new JLabel("Name:");
        name.setBounds(70, 50, 180, 40);
        name.setForeground(new Color(0x98abb2));
        name.setFont(f2);
        register.add(name);

        birth  = new JLabel("Dath of Birth:");
        birth.setBounds(70, 80, 180, 40);
        birth.setForeground(new Color(0x98abb2));
        birth.setFont(f2);
        register.add(birth);

        religion  = new JLabel("Religion:");
        religion.setBounds(70, 110, 180, 40);
        religion.setForeground(new Color(0x98abb2));
        religion.setFont(f2);
        register.add(religion);

        mail = new JLabel("Mail Address:");
        mail.setBounds(70, 140, 180, 40);
        mail.setForeground(new Color(0x98abb2));
        mail.setFont(f2);
        register.add(mail);

        password = new JLabel("Set Password:");
        password.setBounds(70, 170, 180, 40);
        password.setForeground(new Color(0x98abb2));
        password.setFont(f2);
        register.add(password);

        rpassword = new JLabel("Re-type Password:");
        rpassword.setBounds(70, 200, 180, 40);
        rpassword.setForeground(new Color(0x98abb2));
        rpassword.setFont(f2);
        register.add(rpassword);

        question = new JLabel("Security Question:");
        question.setBounds(70, 230, 180, 40);
        question.setForeground(new Color(0x98abb2));
        question.setFont(f2);
        register.add(question);

        answer = new JLabel("Your Answer:");
        answer.setBounds(70, 260, 180, 40);
        answer.setForeground(new Color(0x98abb2));
        answer.setFont(f2);
        register.add(answer);

        captcha = new JLabel("Captcha:");
        captcha.setBounds(70, 290, 180, 40);
        captcha.setForeground(new Color(0x98abb2));
        captcha.setFont(f2);
        register.add(captcha);

        registerButton = new JButton("Register");
		registerButton.setBounds (240, 335, 150, 40);
		registerButton.setForeground(new Color(0x98abb2));
		registerButton.setBackground(Color.white);
		registerButton.setFont(f2);
		registerButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	registerButton.setBorder(border2);
      	registerButton.addActionListener(this);
		registerButton.setFocusPainted(false);//remove selection
		registerButton.setOpaque(false);
      	register.add(registerButton);

        l3 = new JLabel("________________________________________");
        l3.setBounds(255, 53, 300, 40);
        l3.setForeground(new Color(0x98abb2));
        l3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		register.add(l3);

		l4 = new JLabel("________________________________________");
        l4.setBounds(255, 83, 300, 40);
        l4.setForeground(new Color(0x98abb2));
        l4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		register.add(l4);

		l5 = new JLabel("________________________________________");
        l5.setBounds(255, 113, 300, 40);
        l5.setForeground(new Color(0x98abb2));
        l5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		register.add(l5);

		l6 = new JLabel("________________________________________");
        l6.setBounds(255, 143, 300, 40);
        l6.setForeground(new Color(0x98abb2));
        l6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		register.add(l6);

		l7 = new JLabel("________________________________________");
        l7.setBounds(255, 173, 300, 40);
        l7.setForeground(new Color(0x98abb2));
        l7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		register.add(l7);

		l8 = new JLabel("________________________________________");
        l8.setBounds(255, 203, 300, 40);
        l8.setForeground(new Color(0x98abb2));
        l8.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		register.add(l8);

		l9 = new JLabel("________________________________________");
        l9.setBounds(255, 263, 300, 40);
        l9.setForeground(new Color(0x98abb2));
        l9.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		register.add(l9);

		l10 = new JLabel("________________________________________");
        l10.setBounds(255, 293, 300, 40);
        l10.setForeground(new Color(0x98abb2));
        l10.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		register.add(l10);

      	haveAccount = new JLabel("Already have an account, then ");
        haveAccount.setBounds(160, 380, 270, 40);
        haveAccount.setForeground(new Color(0x98abb2));
        haveAccount.setFont(f4);
        register.add(haveAccount);

        nameField = new JTextField();
        nameField.setBounds(255, 50, 240, 40);
        nameField.setFont(f2);
        nameField.setForeground(Color.white);
        nameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        nameField.setCaretColor(Color.white);
        nameField.setBorder(null);
        nameField.setOpaque(false);//**
        nameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        nameField.setHorizontalAlignment(JTextField.CENTER);//by default right
        register.add(nameField);

        birthField = new JTextField();
        birthField.setBounds(255, 80, 240, 40);
        birthField.setFont(f2);
        birthField.setForeground(Color.white);
        birthField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        birthField.setCaretColor(Color.white);
        birthField.setBorder(null);
        birthField.setOpaque(false);//**
        birthField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        birthField.setHorizontalAlignment(JTextField.CENTER);//by default right
        register.add(birthField);

        religionField = new JTextField();
        religionField.setBounds(255, 110, 240, 40);
        religionField.setFont(f2);
        religionField.setForeground(Color.white);
        religionField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        religionField.setCaretColor(Color.white);
        religionField.setBorder(null);
        religionField.setOpaque(false);//**
        religionField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        religionField.setHorizontalAlignment(JTextField.CENTER);//by default right
        register.add(religionField);

        mailField = new JTextField();
        mailField.setBounds(255, 140, 240, 40);
        mailField.setFont(f2);
        mailField.setForeground(Color.white);
        mailField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        mailField.setCaretColor(Color.white);
        mailField.setBorder(null);
        mailField.setOpaque(false);//**
        mailField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        mailField.setHorizontalAlignment(JTextField.CENTER);//by default right
        register.add(mailField);

        spasswordField = new JPasswordField();
        spasswordField.setBounds(255, 170, 240, 40);
        spasswordField.setFont(f2);
        spasswordField.setForeground(Color.white);
        spasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        spasswordField.setCaretColor(Color.white);
        spasswordField.setEchoChar('*');
        spasswordField.setBorder(null);
        spasswordField.setOpaque(false);//**
        spasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        spasswordField.setHorizontalAlignment(JTextField.CENTER);//by default right
        register.add(spasswordField);

        box12=new JCheckBox();
        box12.setText("Show");
        box12.setBounds(500,180,70,30);
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
        register.add(box12);


        rpasswordField = new JPasswordField();
        rpasswordField.setBounds(255, 200, 240, 40);
        rpasswordField.setFont(f2);
        rpasswordField.setForeground(Color.white);
        rpasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        rpasswordField.setCaretColor(Color.white);
        rpasswordField.setEchoChar('*');
        rpasswordField.setBorder(null);
        rpasswordField.setOpaque(false);//**
        rpasswordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        rpasswordField.setHorizontalAlignment(JTextField.CENTER);//by default right
        register.add(rpasswordField);

        box13=new JCheckBox();
        box13.setText("Show");
        box13.setBounds(500,210,70,30);
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
        register.add(box13);

        answerField = new JTextField();
        answerField.setBounds(255, 260, 240, 40);
        answerField.setFont(f2);
        answerField.setForeground(Color.white);
        answerField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        answerField.setCaretColor(Color.white);
        answerField.setBorder(null);
        answerField.setOpaque(false);//**
        answerField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        answerField.setHorizontalAlignment(JTextField.CENTER);//by default right
        register.add(answerField);

        captchaField = new JTextField();
        captchaField.setBounds(255, 290, 240, 40);
        captchaField.setFont(f2);
        captchaField.setForeground(Color.white);
        captchaField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        captchaField.setCaretColor(Color.white);
        captchaField.setBorder(null);
        captchaField.setOpaque(false);//**
        captchaField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        captchaField.setHorizontalAlignment(JTextField.CENTER);//by default right
        register.add(captchaField);

        String[] que = { "Choose a security question", "What's your father's name?", "What's your mother's name?",
                "What's your favourite pet name?", "What's your favorite sports?", "What's your favourite movie?" };
        qbox = new JComboBox(que);
        qbox.setBounds(255, 243, 240, 20);
        qbox.setFont(f5);
        qbox.setSelectedIndex(0);
        qbox.setBackground(new Color(0x99d5ea));
        register.add(qbox);

        Random rand = new Random();
        a = rand.nextInt(10);
        b = rand.nextInt(10);

        gCaptcha = new JLabel();
        gCaptcha.setText("   " + a + " + " + b + "  ");
        gCaptcha.setBounds(170, 300, 55, 20);
        gCaptcha.setForeground(Color.black);
        gCaptcha.setBackground(new Color(0x99d5ea));
        gCaptcha.setFont(f5);
        gCaptcha.setBorder(null);
        gCaptcha.setOpaque(true);
        register.add(gCaptcha);

        signinButton = new JButton("sign in");
		signinButton.setBounds (400, 389, 90, 23);
		signinButton.setForeground(new Color(0x99d5ea));
		signinButton.setBackground(new Color(0xff5a4e));
		signinButton.setFont(f4);
		signinButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	signinButton.setBorder(null);
      	signinButton.addActionListener(this);
		signinButton.setOpaque(false);
		signinButton.setContentAreaFilled(false);//remove background
		register.add(signinButton);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == exitButton){
			System.exit(0);
		}else if(ae.getSource() == yesButton){
			c.remove(welcome);
			c.repaint();
            backPanel.setVisible(true);
			c.add(login);
		}else if(ae.getSource() == noButton){
			c.remove(welcome);
			c.repaint();
            backPanel.setVisible(true);
			c.add(register);
		}else if(ae.getSource() == backButton){
            c.remove(login);
            c.remove(register);
            c.repaint();
            backPanel.setVisible(false);
            c.add(welcome);
        }else if(ae.getSource() == signinButton){
			c.remove(register);
			c.repaint();
			c.add(login);
		}else if(ae.getSource() == signupButton){
			c.remove(login);
			c.repaint();
			c.add(register);
		}else if(ae.getSource() == logoButton){
			Contribution con = new Contribution();
			con.setResizable(false); //prevent frame from being resized
			con.setVisible(true); //make frame visible
		}else if(ae.getSource() == loginButton){
            String userName = userFild.getText();
            String password = new String(passFild.getPassword()); // Password
            MatchUser mUser = new MatchUser(userName, password, "Customer");
            if (mUser.ok == 1){
                UserDashboard uDash1 = new UserDashboard(userName, "Customer");
                uDash1.setResizable(false); //prevent frame from being resized
                uDash1.setVisible(true); //make frame visible
                dispose();
            }
        }else if(ae.getSource() == adminLoginButton){
            String userName = userFild.getText();
            String password = new String(passFild.getPassword()); // Password
            MatchUser mUser = new MatchUser(userName, password, "Admin");
            if (mUser.ok == 1){ // admin
                dispose();
                AdminDashboard aDash = new AdminDashboard(userName);
                aDash.setResizable(false); //prevent frame from being resized
                aDash.setVisible(true); //make frame visible
            }
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
                	UserDashboard uDash2 = new UserDashboard(userName, "Customer");
					uDash2.setResizable(false); //prevent frame from being resized
					uDash2.setVisible(true); //make frame visible
                	dispose();
                }
				
            }
		}
	}

	public static void main(String[] args) {
		Welcome wel = new Welcome();
		wel.setResizable(false); //prevent frame from being resized
		wel.setVisible(true); //make frame visible
	}
}