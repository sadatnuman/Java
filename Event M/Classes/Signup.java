package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


import static javax.swing.JOptionPane.showMessageDialog;


public class Signup extends JFrame implements ActionListener
{
	
	JPanel panel;
	JLabel fullnamelabel,userlabel,phonelabel,emaillabel,genderlabel,nidlabel,passlabel,confirmlabel,logolabel,l1,dateofbirth;
	JTextField fullnametf,usernametf,phonetf,emailtf,dateofbirthtf,nidtf,passtf,confirmtf;
	JButton signupBtn,backBtn,b3;
	JRadioButton r1,r2,r3;
	JComboBox combobox1,combobox2,combobox3;
	ImageIcon image1;
	
	public Signup()
	{
		super(" Register ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		
		panel = new JPanel();
	    this.setSize(1000,700);
	    panel.setBackground(new Color(186,85,211));
	    panel.setLayout(null);
		
		image1 = new ImageIcon("Image/logo.jpeg");
        this.setIconImage(image1.getImage());
        
		
		l1 = new JLabel("Create Profile");
		l1.setFont(new Font("Arial",Font.PLAIN,40));
		l1.setForeground(Color.white);
		l1.setBounds(260,20,400,30);
		panel.add(l1);
		
		fullnamelabel = new JLabel("Full Name :");
        fullnamelabel.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
	    fullnamelabel.setForeground(Color.white);
	    fullnamelabel.setBounds(200,80,100,30);
	    panel.add(fullnamelabel);
		
		fullnametf = new JTextField();
	    fullnametf.setBounds(380,80,200,40);
	    panel.add(fullnametf);
		
		userlabel = new JLabel();
	    userlabel.setText("User Name:");  //set text of label
	    userlabel.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
	    userlabel.setForeground(Color.white);
	    userlabel.setBounds(200,130,190,30);
	    panel.add(userlabel);
		
		usernametf= new JTextField();
	    usernametf.setBounds(380,130,200,40);
	    panel.add(usernametf);
		
		dateofbirth= new JLabel("Date of Birth :");
		dateofbirth.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
	    dateofbirth.setBounds(200,180,150,40);
		dateofbirth.setForeground(Color.white);
	    panel.add(dateofbirth);
		
		String items[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		combobox1=new JComboBox(items);
		combobox1.setBounds(200,220,80,40);
		panel.add(combobox1);
	
		
		String items2[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		combobox2=new JComboBox(items2);
		combobox2.setBounds(300,220,80,40);
		panel.add(combobox2);
		
		
		String items3[]={"1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
		combobox2=new JComboBox(items3);
		combobox2.setBounds(400,220,80,40);
		panel.add(combobox2);
	
		
		genderlabel = new JLabel("Gender :");
        genderlabel.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
	    genderlabel.setForeground(Color.white);
	    genderlabel.setBounds(200,280,100,30);
	    panel.add(genderlabel);
		
		r1=new JRadioButton("Male");    
        r1.setBounds(200,310,100,20);
        panel.add(r1);	
	
        r2=new JRadioButton("Female");    
        r2.setBounds(320,310,100,20);
	    panel.add(r2);
	
	    r3=new JRadioButton("Other");    
        r3.setBounds(440,310,100,20);
	    panel.add(r3);
		
		phonelabel = new JLabel();
	    phonelabel.setText("Phone:");  
	    phonelabel.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
	    phonelabel.setForeground(Color.white);
	    phonelabel.setBounds(200,360,100,30);
	    panel.add(phonelabel);
		
		phonetf= new JTextField();
	    phonetf.setBounds(380,360,200,40);
	    panel.add(phonetf); 
		
		emaillabel = new JLabel("Email :");
        emaillabel.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
	    emaillabel.setForeground(Color.white);
	    emaillabel.setBounds(200,410,100,30);
	    panel.add(emaillabel);
		
		emailtf= new JTextField();
	    emailtf.setBounds(380,410,200,40);
	    panel.add(emailtf);
		
	
		
		nidlabel = new JLabel("Nid No :");
        nidlabel.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
	    nidlabel.setForeground(Color.white);
	    nidlabel.setBounds(200,460,140,30);
	    panel.add(nidlabel);
		
		
		nidtf = new JTextField();
	    nidtf.setBounds(380,460,200,40);
	    panel.add(nidtf);
		
		passlabel = new JLabel("New Password :");
        passlabel.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
	    passlabel.setForeground(Color.white);
	    passlabel.setBounds(200,510,190,30);
	    panel.add(passlabel);
		
		passtf= new JTextField();                                  
	    passtf.setBounds(380,510,200,40);
	    panel.add(passtf);
		
		confirmlabel = new JLabel("Confirm Password :");
        confirmlabel.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
	    confirmlabel.setForeground(Color.white);
	    confirmlabel.setBounds(200,560,190,40);
	    panel.add(confirmlabel);
		
		confirmtf= new JTextField();
	    confirmtf.setBounds(380,560,200,40);
	    panel.add(confirmtf);
		
	

		
	    ButtonGroup g1 = new ButtonGroup();
	    g1.add(r1);
	    g1.add(r2);
	    g1.add(r3);
		
	  
	
	    
	
	    
		signupBtn = new JButton(" Sign Up ");
	    signupBtn.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	    signupBtn.setForeground(Color.black);
	    signupBtn.setBackground(Color.WHITE);
	    signupBtn.setBounds(750,550,125,30);
	    signupBtn.setFocusable(false);
		signupBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    //signupBtn.setBorder(null);
	    signupBtn.addActionListener(this);
		panel.add(signupBtn);
		
		
		backBtn = new JButton();
        backBtn.setIcon(new ImageIcon("Image/return.png"));
        backBtn.setBounds(13,13,30,30);
        backBtn.setForeground(Color.white);
        backBtn.setFont(new Font("Cooper Black MS", Font.BOLD, 25));
        backBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backBtn.setFocusPainted(false);
        backBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        backBtn.setContentAreaFilled(false);
		backBtn.addActionListener(this); 
		panel.add(backBtn);
		
		this.add(panel);
	}
	
	
		
		public void actionPerformed(ActionEvent ae)
        {
			String command=ae.getActionCommand();
	        {
				if(signupBtn.getText().equals(command))
                {
                    String fullName = fullnametf.getText();
                    String Nid = nidtf.getText();                    
                    String userEmail = emailtf.getText();
			        String userNumber = phonetf.getText();
                    String userName = usernametf.getText();
                    String userPassword = passtf.getText();
                    String userPasswordConfirm = confirmtf.getText();
					
			

                    if(fullName.isEmpty() ||  Nid.isEmpty() || userEmail.isEmpty() || userName.isEmpty() || userPassword.isEmpty() || userPasswordConfirm.isEmpty() || userNumber.isEmpty())
                    {
                        JOptionPane.showMessageDialog(this, "Fill your informations", "MISSING INFORMATION",JOptionPane.WARNING_MESSAGE);
                    }
                    else if(userPassword.equals(userPasswordConfirm))
                    {
                        CreateUserAccount cua1 = new CreateUserAccount(fullName, Nid, userEmail, userName, userPassword,userNumber,userPasswordConfirm);
                        cua1.addAccount();
                        JOptionPane.showMessageDialog(this, "Account Added");
                        usernametf.setText("");
                        nidtf.setText("");
                        emailtf.setText("");
                        fullnametf.setText("");
                        passtf.setText("");
				        phonetf.setText("");
                        confirmtf.setText("");
			
				        new Login("textfield1", "textfield2");
                        this.setVisible(false);
					
			        }
                    else if(userPassword.equals(userPasswordConfirm))
			        {
				        JOptionPane.showMessageDialog(this, "Check Password");
		            }
			    }
                else if(backBtn.getText().equals(command))
			    {
			        new Login("textfield1", "textfield2");
                    this.setVisible(false);
					
				}
			
			}
		
		}
		
}	   

