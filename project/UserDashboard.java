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



public class UserDashboard extends JFrame implements ActionListener{

	private Container c;
	private ImageIcon logo, img, exitIcon, minimizeIcon, all1, story1, novel1, detective1, userIcon1, info1, all2, story2, 
	 novel2, detective2, userIcon2, info2, bookImg, logout;
	private JLabel imgLabel, pLogo, bookinfo, bookName, writer, price, bookName1, writer1, price1, book;
	private Font f1, f2, f3;
	private JTextField infoField;
	private JPanel manubar, infoPanel, allPanel, storyPanel, novelPanel, detectivePanel;
	private JButton exitButton, minimizeButton, payButton, allButton1, storyButton1, novelButton1, detectiveButton1, 
	 userIconButton1, infoButton1, allButton2, storyButton2, novelButton2, detectiveButton2, userIconButton2, 
	 infoButton2, dashboardButton, logoutButton;
	private JScrollPane scroll;
	String accountHolder;
	String accType;


	public UserDashboard(String accountHolder, String accType){

		this.accountHolder = accountHolder;
		this.accType = accType;

		this.setUndecorated(true);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //exit out of application
 		this.setSize(1050, 550); //sets the x-dimension, and y-dimension of frame
 		this.setLocationRelativeTo(null);//open middle of the screen

 		c = this.getContentPane();//contain frame into the container
 		c.setLayout(null);//remove defult layout settings
 		c.setBackground(new Color(0x303643));//set background color

 		

 		logo();
 		font();
 		exitButton();
 		logout();
 		minimize();
 		manubar();
 		infoPanel();
 		allPanel();
 		storyPanel();
 		novelPanel();
 		detectivePanel();
	}

	public void logo(){
		logo = new ImageIcon (getClass().getResource("/images/Logo.png"));//use getResource from getClass
		this.setIconImage (logo.getImage());//set logo
	}

	public void font(){
		f1 = new Font("Bogart", Font.BOLD + Font.ITALIC, 25);//PLAIN for normal style
		f2 = new Font("Bogart", Font.PLAIN, 20);
		f3 = new Font("Bogart", Font.PLAIN, 16);
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

	public void logout(){
		logout = new ImageIcon (getClass().getResource("/images/logout.png"));

		logoutButton = new JButton(logout);
		logoutButton.setBounds (920, 12, 32, 32);
		logoutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
   	   	logoutButton.setBorder(null);
   	   	logoutButton.addActionListener(this);
		logoutButton.setFocusPainted(false);//remove selection
		logoutButton.setContentAreaFilled(false);//remove background
		c.add(logoutButton);
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

 		if(accType.equals("Admin")){
 			dashboardButton = new JButton(new ImageIcon (getClass().getResource("/images/userInfo1.png")));
			dashboardButton.setBounds (24, 85, 32, 32);
			dashboardButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
 	    		dashboardButton.setBorder(null);
	    		dashboardButton.addActionListener(this);
			dashboardButton.setFocusPainted(false);//remove selection
			dashboardButton.setContentAreaFilled(false);//remove background
			manubar.add(dashboardButton);
 		}

 		all1 = new ImageIcon (getClass().getResource("/images/all1.png"));
 		story1 = new ImageIcon (getClass().getResource("/images/story1.png"));
 		novel1 = new ImageIcon (getClass().getResource("/images/novels1.png"));
 		detective1 = new ImageIcon (getClass().getResource("/images/detective1.png"));
 		userIcon1 = new ImageIcon (getClass().getResource("/images/user1.png"));
 		info1 = new ImageIcon (getClass().getResource("/images/info1.png"));

 		all2 = new ImageIcon (getClass().getResource("/images/all2.png"));
 		story2 = new ImageIcon (getClass().getResource("/images/story2.png"));
 		novel2 = new ImageIcon (getClass().getResource("/images/novels2.png"));
 		detective2 = new ImageIcon (getClass().getResource("/images/detective2.png"));

 		allButton1 = new JButton(all1);
		allButton1.setBounds (24, 150, 32, 32);
		allButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
 	     	allButton1.setBorder(null);
	      	allButton1.addActionListener(this);
		allButton1.setFocusPainted(false);//remove selection
		allButton1.setContentAreaFilled(false);//remove background
		allButton1.setVisible(false);
//		manubar.add(allButton1);

		allButton2 = new JButton(all2);
		allButton2.setBounds (24, 150, 32, 32);
		allButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
      		allButton2.setBorder(null);
      		allButton2.addActionListener(this);
		allButton2.setFocusPainted(false);//remove selection
		allButton2.setContentAreaFilled(false);//remove background
//		manubar.add(allButton2);

		storyButton1 = new JButton(story1);
		storyButton1.setBounds (24, 200, 32, 32);
		storyButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
 	     	storyButton1.setBorder(null);
 	     	storyButton1.addActionListener(this);
		storyButton1.setFocusPainted(false);//remove selection
		storyButton1.setContentAreaFilled(false);//remove background
		manubar.add(storyButton1);

		storyButton2 = new JButton(story2);
		storyButton2.setBounds (24, 200, 32, 32);
		storyButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
  	    	storyButton2.setBorder(null);
  	    	storyButton2.addActionListener(this);
		storyButton2.setFocusPainted(false);//remove selection
		storyButton2.setContentAreaFilled(false);//remove background
		storyButton2.setVisible(true);
		manubar.add(storyButton2);

		novelButton1 = new JButton(novel1);
		novelButton1.setBounds (24, 250, 32, 32);
		novelButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
   	   	novelButton1.setBorder(null);
  	    	novelButton1.addActionListener(this);
		novelButton1.setFocusPainted(false);//remove selection
		novelButton1.setContentAreaFilled(false);//remove background
		manubar.add(novelButton1);

		novelButton2 = new JButton(novel2);
		novelButton2.setBounds (24, 250, 32, 32);
		novelButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
 	     	novelButton2.setBorder(null);
 	     	novelButton2.addActionListener(this);
		novelButton2.setFocusPainted(false);//remove selection
		novelButton2.setContentAreaFilled(false);//remove background
		novelButton2.setVisible(false);
		manubar.add(novelButton2);

		detectiveButton1 = new JButton(detective1);
		detectiveButton1.setBounds (24, 300, 32, 32);
		detectiveButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    	  	detectiveButton1.setBorder(null);
   	   	detectiveButton1.addActionListener(this);
		detectiveButton1.setFocusPainted(false);//remove selection
		detectiveButton1.setContentAreaFilled(false);//remove background
		manubar.add(detectiveButton1);

		detectiveButton2 = new JButton(detective2);
		detectiveButton2.setBounds (24, 300, 32, 32);
		detectiveButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
 	     	detectiveButton2.setBorder(null);
  	    	detectiveButton2.addActionListener(this);
		detectiveButton2.setFocusPainted(false);//remove selection
		detectiveButton2.setContentAreaFilled(false);//remove background
		detectiveButton2.setVisible(false);
		manubar.add(detectiveButton2);

		infoButton1 = new JButton(info1);
		infoButton1.setBounds (24, 440, 32, 32);
		infoButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
   	   	infoButton1.setBorder(null);
   	   	infoButton1.addActionListener(this);
		infoButton1.setFocusPainted(false);//remove selection
		infoButton1.setContentAreaFilled(false);//remove background
		manubar.add(infoButton1);

		userIconButton1 = new JButton(userIcon1);
		userIconButton1.setBounds (24, 490, 32, 32);
		userIconButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
   	   	userIconButton1.setBorder(null);
  	    	userIconButton1.addActionListener(this);
		userIconButton1.setFocusPainted(false);//remove selection
		userIconButton1.setContentAreaFilled(false);//remove background
		manubar.add(userIconButton1);

		c.add(manubar);
	}

	public void infoPanel(){ 
		infoPanel = new JPanel();
		infoPanel.setBackground(new Color(0x2a2f3a));
		infoPanel.setBounds(80, 0, 300, 550);
		infoPanel.setLayout(null);

		
		bookinfo = new JLabel("Book Info:", JLabel.CENTER);
   	        bookinfo.setBounds(0, 150, 300, 40);
  	        bookinfo.setForeground(new Color(0x98abb2));
 	        bookinfo.setFont(f1);
 	        infoPanel.add(bookinfo);

        

		bookName = new JLabel("Book Name:", JLabel.CENTER);
       		bookName.setBounds(0, 230, 300, 40);
        	bookName.setForeground(new Color(0x98abb2));
        	bookName.setFont(f2);
        	infoPanel.add(bookName);

       	 	bookName1 = new JLabel("", JLabel.CENTER);
        	bookName1.setBounds(0, 260, 300, 40);
        	bookName1.setForeground(new Color(0x98abb2));
        	bookName1.setFont(f3);
        	infoPanel.add(bookName1);

        	writer = new JLabel("Writer:", JLabel.CENTER);
       		writer.setBounds(0, 300, 300, 40);
        	writer.setForeground(new Color(0x98abb2));
        	writer.setFont(f2);
        	infoPanel.add(writer);

        	writer1 = new JLabel("", JLabel.CENTER);
        	writer1.setBounds(0, 325, 300, 40);
        	writer1.setForeground(new Color(0x98abb2));
        	writer1.setFont(f3);
        	infoPanel.add(writer1);

        	price = new JLabel("Price:", JLabel.CENTER);
        	price.setBounds(0, 360, 300, 40);
        	price.setForeground(new Color(0x98abb2));
        	price.setFont(f2);
        	infoPanel.add(price);

        	price1 = new JLabel("", JLabel.CENTER);
        	price1.setBounds(0, 385, 300, 40);
        	price1.setForeground(new Color(0x98abb2));
        	price1.setFont(f3);
        	infoPanel.add(price1);

        payButton = new JButton("BUY");
		payButton.setBounds (50, 480, 200, 40);
		payButton.setForeground(new Color(0x98abb2));
		payButton.setBackground(Color.WHITE);
		payButton.setFont(f2);
		payButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Border border1 = new LineBorder(new Color(0x98abb2), 2, true);
      		payButton.setBorder(border1);
      		payButton.addActionListener(this);
		payButton.setFocusPainted(false);//remove selection
		payButton.setOpaque(false);
      		infoPanel.add(payButton);


		c.add(infoPanel);
	}
	
	public void allPanel(){
		allPanel = new JPanel();
		allPanel.setBackground(new Color(0x303643));
		allPanel.setBounds(380, 41, 670, 1000);
		allPanel.setLayout(null);

		
/*
The Lord of the Rings:J.R.R. Tolkien:Story Book:500 BDT:/bookPic/TheLordOfTheRings.png
Pride & Prejudice:Jane Austen:Story Book:380 BDT:/bookPic/Pride&Prejudice.png
*/
		new AllBookInfo (50, 0, "Gucchagalpa", "Rabingranath Tagore", "Story Book", "350 BDT","/bookPic/Gucchagalpa.png",
		 bookName1, writer1, price1, allPanel, infoPanel);
 		
 		new AllBookInfo (250, 0, "Srestha Galpa", "Kaji Nazrul Islam", "Story Book", "300 BDT", "/bookPic/SresthaGalpa.png",
		 bookName1, writer1, price1, allPanel, infoPanel);

 		new AllBookInfo (450, 0, "The Greatest Short Stories", "Leo Tolstoy", "Story Book", "400 BDT", "/bookPic/TheGreatestShortStories.png",
		 bookName1, writer1, price1, allPanel, infoPanel);

 		new AllBookInfo (50, 250, "Harry Potter", "J.K. Rowling", "Story Book", "450 BDT", "/bookPic/HarryPotter.png",
		 bookName1, writer1, price1, allPanel, infoPanel);

 		new AllBookInfo (250, 250, "Grandma's Bag of Story", "Sudha Murty", "Story Book", "330 BDT", "/bookPic/GrandmasBagofStory.png",
		 bookName1, writer1, price1, allPanel, infoPanel);

 		new AllBookInfo (450, 250, "Charlotte's Web", "E.B.White", "Story Book", "400 BDT","/bookPic/CharlottesWeb.png",
		 bookName1, writer1, price1, allPanel, infoPanel);

 		
/*
        scroll = new JScrollPane(allPanel);
       scroll.setPreferredSize(allPanel.getPreferredSize());
		scroll.setBounds(1036,50,10,500);
		
this.getContentPane().add(scroll);
*/
// 		c.add(allPanel);
 //		c.add(scroll);
 		

	}

	public void storyPanel(){
		storyPanel = new JPanel();
		storyPanel.setBackground(new Color(0x303643));
		storyPanel.setBounds(380, 41, 670, 509);
		storyPanel.setLayout(null);

		new AllBookInfo (50, 0, "To Kill a Mockingbird", "Harper", "Story Book", "450 BDT", "/bookPic/ToKillAMockingbird.png",
		 bookName1, writer1, price1, storyPanel, infoPanel);

		new AllBookInfo (250, 0, "The Lord of the Rings", "J.R.R. Tolkien", "Story Book", "500 BDT", "/bookPic/TheLordOfTheRings.png",
		 bookName1, writer1, price1, storyPanel, infoPanel);

		new AllBookInfo (450, 0, "Pride & Prejudice", "Jane Austen", "Story Book", "380 BDT", "/bookPic/Pride&Prejudice.png",
		 bookName1, writer1, price1, storyPanel, infoPanel);

		new AllBookInfo (50, 250, "Gucchagalpa", "Rabingranath Tagore", "Story Book", "350 BDT","/bookPic/Gucchagalpa.png",
		 bookName1, writer1, price1, storyPanel, infoPanel);

		new AllBookInfo (250, 250, "Grandma's Bag of Story", "Sudha Murty", "Story Book", "330 BDT", "/bookPic/GrandmasBagofStory.png",
		 bookName1, writer1, price1, storyPanel, infoPanel);

 		new AllBookInfo (450, 250, "Charlotte's Web", "E.B.White", "Story Book", "400 BDT","/bookPic/CharlottesWeb.png",
		 bookName1, writer1, price1, storyPanel, infoPanel);
 		c.add(storyPanel);
	}

	public void novelPanel(){
		novelPanel = new JPanel();
		novelPanel.setBackground(new Color(0x303643));
		novelPanel.setBounds(380, 41, 670, 509);
		novelPanel.setLayout(null);

		new AllBookInfo (50, 0, "The Old Man and the Sea", "Ernest Hemingway", "Novel Book", "400 BDT","/bookPic/TheOldManandtheSea.png",
		 bookName1, writer1, price1, novelPanel, infoPanel);

		new AllBookInfo (250, 0, "One Hundred Years of Solitude", "Gabriel Garcia Marquez", "Novel Book", "420 BDT","/bookPic/OneHundredYearsofSolitude.png",
		 bookName1, writer1, price1, novelPanel, infoPanel);

		new AllBookInfo (450, 0, "Pather Panchali", "Bibhutibhushan Bandyopadhyay", "Novel Book", "480 BDT","/bookPic/PatherPanchali.png",
		 bookName1, writer1, price1, novelPanel, infoPanel);

		new AllBookInfo (50, 250, "Srestha Galpa", "Kaji Nazrul Islam", "Story Book", "300 BDT", "/bookPic/SresthaGalpa.png",
		 bookName1, writer1, price1, novelPanel, infoPanel);

 		new AllBookInfo (450, 250, "The Greatest Short Stories", "Leo Tolstoy", "Story Book", "400 BDT", "/bookPic/TheGreatestShortStories.png",
		 bookName1, writer1, price1, novelPanel, infoPanel);

		new AllBookInfo (250, 250, "Himu", "Humayun Ahmed", "Novel Book", "500 BDT","/bookPic/Himu.png",
		 bookName1, writer1, price1, novelPanel, infoPanel);
	}

	public void detectivePanel(){
		detectivePanel = new JPanel();
		detectivePanel.setBackground(new Color(0x303643));
		detectivePanel.setBounds(380, 41, 670, 509);
		detectivePanel.setLayout(null);

		new AllBookInfo (50, 0, "Murder on the Orient Express", "Agatha Christie", "Detective Book", "450 BDT","/bookPic/MurderontheOrientExpress.png",
		 bookName1, writer1, price1, detectivePanel, infoPanel);

		new AllBookInfo (250, 0, "The Maltese Falcon", "Dashiell Hammett", "Detective Book","400 BDT","/bookPic/TheMalteseFalcon.png",
		 bookName1, writer1, price1, detectivePanel, infoPanel);		

		new AllBookInfo (450, 0, "The Big Sleep", "Raymond Chandler", "Detective Book", "300 BDT","/bookPic/TheBigSleep.png",
		 bookName1, writer1, price1, detectivePanel, infoPanel);		

		new AllBookInfo (50, 250, "Misir Ali", "Humayun Ahmed", "Detective Book", "500 BDT","/bookPic/MisirAli.png",
		 bookName1, writer1, price1, detectivePanel, infoPanel);

		new AllBookInfo (250, 250, "Sherlock Homes", "Arthur Conan", "Detective Book", "600 BDT","/bookPic/SherlockHomes.png",
		 bookName1, writer1, price1, detectivePanel, infoPanel);

		new AllBookInfo (450, 250, "Harry Potter", "J.K. Rowling", "Story Book", "450 BDT", "/bookPic/HarryPotter.png",
		 bookName1, writer1, price1, detectivePanel, infoPanel);		 		
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == minimizeButton){
			setState(JFrame.ICONIFIED);;
		}else if(ae.getSource() == exitButton){
			System.exit(0);
		}else if (ae.getSource() == allButton1){ 
			allButton1.setVisible(false);
			allButton2.setVisible(true);
			storyButton1.setVisible(true);
			storyButton2.setVisible(false);
			novelButton1.setVisible(true);
			novelButton2.setVisible(false);
			detectiveButton1.setVisible(true);
			detectiveButton2.setVisible(false);
			

			c.remove(storyPanel);
			c.remove(novelPanel);
			c.remove(detectivePanel);
			c.repaint();
			c.add(allPanel);
		}else if (ae.getSource() == storyButton1){ 
			allButton1.setVisible(true);
			allButton2.setVisible(false);
			storyButton1.setVisible(false);
			storyButton2.setVisible(true);
			novelButton1.setVisible(true);
			novelButton2.setVisible(false);
			detectiveButton1.setVisible(true);
			detectiveButton2.setVisible(false);
			

			c.remove(allPanel);
			c.remove(novelPanel);
			c.remove(detectivePanel);
			c.repaint();
			c.add(storyPanel);
		}else if (ae.getSource() == novelButton1){ 
			allButton1.setVisible(true);
			allButton2.setVisible(false);
			storyButton1.setVisible(true);
			storyButton2.setVisible(false);
			novelButton1.setVisible(false);
			novelButton2.setVisible(true);
			detectiveButton1.setVisible(true);
			detectiveButton2.setVisible(false);
			
			c.remove(allPanel);
			c.remove(storyPanel);
			c.remove(detectivePanel);
			c.repaint();
			c.add(novelPanel);
		}else if (ae.getSource() == detectiveButton1){ 
			allButton1.setVisible(true);
			allButton2.setVisible(false);
			storyButton1.setVisible(true);
			storyButton2.setVisible(false);
			novelButton1.setVisible(true);
			novelButton2.setVisible(false);
			detectiveButton1.setVisible(false);
			detectiveButton2.setVisible(true);
			

			c.remove(allPanel);
			c.remove(storyPanel);
			c.remove(novelPanel);
			c.repaint();
			c.add(detectivePanel);
		}else if (ae.getSource() == userIconButton1){ //book bookName1 writer1 price1
			UserInfo info = new UserInfo(accountHolder);
			info.setResizable(false); //prevent frame from being resized
			info.setVisible(true); //make frame visible
		}else if (ae.getSource() == infoButton1){ 
			Contribution con = new Contribution();
			con.setResizable(false); //prevent frame from being resized
			con.setVisible(true); //make frame visible
		}else if (ae.getSource() == payButton){ 
			Payment pay = new Payment();
			pay.setResizable(false); //prevent frame from being resized
			pay.setVisible(true); //make frame visible
		}else if (ae.getSource() == dashboardButton){ 
			dispose();
                	AdminDashboard aDash = new AdminDashboard(accountHolder);
                	aDash.setResizable(false); //prevent frame from being resized
                	aDash.setVisible(true); //make frame visible
		}else if (ae.getSource() == logoutButton){ 
			dispose();
			Welcome wel = new Welcome();
			wel.setResizable(false); //prevent frame from being resized
			wel.setVisible(true); //make frame visible
		}
	}
		
	public static void main(String[] args) {
		UserDashboard uDash = new UserDashboard("Asif", "Admin");
		uDash.setResizable(false); //prevent frame from being resized
		uDash.setVisible(true); //make frame visible
	}
}