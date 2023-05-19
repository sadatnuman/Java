import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame{
    private Container c;
	private JRadioButton rbtn1,rbtn2,rbtn3,rbtn4,rbtn5,rbtn6,rbtn7,rbtn8;
	private ButtonGroup grp;
	private JLabel txt1,txt2,txt3,txt4,txt5;
	private JTextField tf1;
	private JPasswordField pass1;
	private JComboBox box1;
	private Font f1;
	private Cursor csr;
	private JButton btn1,btn2,btn3;
	private JCheckBox box10;
	private JButton exitButton;
	private ImageIcon exitIcon;
	public Payment()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,500);
		setLocationRelativeTo(null);
		setTitle("Payment");
		setResizable(false);
		initcomponents();
	}
	void initcomponents()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(0x252a34));
		csr=new Cursor(Cursor.HAND_CURSOR);
		txt4=new JLabel("Select any banking service and complete your payment : ");
		txt4.setBounds(15,15,700,30);
		txt4.setFont(new Font("Sherif",Font.BOLD,22));
		txt4.setForeground(new Color(211,84,0));
		c.add(txt4);
		txt1=new JLabel("MOBILE BANKING : ");
		txt1.setBounds(15,70,225,30);
		txt1.setFont(new Font("Sherif",Font.BOLD,22));
		txt1.setForeground(new Color(211,84,0));
		c.add(txt1);
		rbtn1=new JRadioButton("BKash");
		rbtn1.setBounds(250,70,100,30);
		rbtn1.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn1.setBackground(new Color(52,73,94));
		rbtn1.setForeground(Color.WHITE);
		rbtn1.setCursor(csr);
		rbtn1.setFocusable(false);
		rbtn1.setBorderPainted(false);
		c.add(rbtn1);
		rbtn2=new JRadioButton("Nagad");
		rbtn2.setBounds(350,70,100,30);
		rbtn2.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn2.setBackground(new Color(52,73,94));
		rbtn2.setForeground(Color.WHITE);
		rbtn2.setCursor(csr);
		rbtn2.setFocusable(false);
		rbtn2.setBorderPainted(false);
		c.add(rbtn2);
		rbtn3=new JRadioButton("Rocket");
		rbtn3.setBounds(450,70,100,30);
		rbtn3.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn3.setBackground(new Color(52,73,94));
		rbtn3.setForeground(Color.WHITE);
		rbtn3.setCursor(csr);
		rbtn3.setFocusable(false);
		rbtn3.setBorderPainted(false);
		c.add(rbtn3);
		rbtn4=new JRadioButton("Upay");
		rbtn4.setBounds(550,70,100,30);
		rbtn4.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn4.setBackground(new Color(52,73,94));
		rbtn4.setForeground(Color.WHITE);
		rbtn4.setCursor(csr);
		rbtn4.setFocusable(false);
		rbtn4.setBorderPainted(false);
		c.add(rbtn4);
		txt5=new JLabel("CARD : ");
		txt5.setBounds(145,125,100,30);
		txt5.setFont(new Font("Sherif",Font.BOLD,22));
		txt5.setForeground(new Color(211,84,0));
		c.add(txt5);
		rbtn5=new JRadioButton("Cradit");
		rbtn5.setBounds(250,125,100,30);
		rbtn5.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn5.setBackground(new Color(52,73,94));
		rbtn5.setForeground(Color.WHITE);
		rbtn5.setCursor(csr);
		rbtn5.setFocusable(false);
		rbtn5.setBorderPainted(false);
		c.add(rbtn5);
		rbtn6=new JRadioButton("Debit");
		rbtn6.setBounds(350,125,100,30);
		rbtn6.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn6.setBackground(new Color(52,73,94));
		rbtn6.setForeground(Color.WHITE);
		rbtn6.setCursor(csr);
		rbtn6.setFocusable(false);
		rbtn6.setBorderPainted(false);
		c.add(rbtn6);
		rbtn7=new JRadioButton("VISA");
		rbtn7.setBounds(450,125,100,30);
		rbtn7.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn7.setBackground(new Color(52,73,94));
		rbtn7.setForeground(Color.WHITE);
		rbtn7.setCursor(csr);
		rbtn7.setFocusable(false);
		rbtn7.setBorderPainted(false);
		c.add(rbtn7);
		rbtn8=new JRadioButton("MasterCard");
		rbtn8.setBounds(550,125,150,30);
		rbtn8.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn8.setBackground(new Color(52,73,94));
		rbtn8.setForeground(Color.WHITE);
		rbtn8.setCursor(csr);
		rbtn8.setFocusable(false);
		rbtn8.setBorderPainted(false);
		c.add(rbtn8);
		grp=new ButtonGroup();
		grp.add(rbtn1);
		grp.add(rbtn2);
		grp.add(rbtn3);
		grp.add(rbtn4);
		grp.add(rbtn5);
		grp.add(rbtn6);
		grp.add(rbtn7);
		grp.add(rbtn8);
		txt2=new JLabel("AC no : ");
		txt2.setBounds(30,200,100,30);
		txt2.setFont(new Font("Sherif",Font.BOLD,18));
		txt2.setForeground(Color.WHITE);
		c.add(txt2);
		txt3=new JLabel("PIN no : ");
		txt3.setBounds(30,260,100,30);
		txt3.setFont(new Font("Sherif",Font.BOLD,18));
		txt3.setForeground(Color.WHITE);
		c.add(txt3);
		tf1=new JTextField();
		tf1.setBounds(200,200,200,30);
		tf1.setBackground(Color.WHITE);
		tf1.setForeground(Color.BLACK);
		tf1.setFont(new Font("Sherif",Font.PLAIN,16));
		tf1.setHorizontalAlignment(JTextField.CENTER);
		c.add(tf1);
		pass1=new JPasswordField();
		pass1.setBounds(200,260,200,30);
		pass1.setBackground(Color.WHITE);
		pass1.setForeground(Color.BLACK);
		pass1.setFont(new Font("Sherif",Font.PLAIN,16));
		pass1.setHorizontalAlignment(JTextField.CENTER);
		pass1.setEchoChar('*');
		c.add(pass1);
		box10=new JCheckBox();
		box10.setText("Show pin");
		box10.setBounds(400,260,200,30);
		box10.setFont(new Font("Aerial",Font.BOLD,12));
		box10.setBackground(Color.WHITE);
		box10.setForeground(Color.WHITE);
		box10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent cb)
			{
				if(box10.isSelected())
				{
					pass1.setEchoChar((char)0);
				}
				else
				{
					pass1.setEchoChar('*');
				}
			}
		});
		c.add(box10);
		btn1=new JButton("Pay");
		btn1.setBounds(350,400,100,50);
		btn1.setBackground(new Color(34,167,240));
		btn1.setForeground(Color.blue);
		btn1.setFocusable(false);
		btn1.setBorderPainted(true);
		btn1.setCursor(csr);
		btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
		String str1 = tf1.getText();
		String str2 = pass1.getText();
        if (!(rbtn1.isSelected() || rbtn2.isSelected() || rbtn3.isSelected() || rbtn4.isSelected()|| rbtn5.isSelected()|| rbtn6.isSelected()|| rbtn7.isSelected()|| rbtn8.isSelected())) {
					JOptionPane.showMessageDialog(null, "Select a payment service", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
						 if(ae.getSource() == btn1){
							MatchETakaUser tUser = new MatchETakaUser(str1, str2);
							if (tUser.ok != 1){
								JOptionPane.showMessageDialog(null, "Wrong phone number or pin number !!", "Error", JOptionPane.ERROR_MESSAGE);
							}
							else if (tUser.ok == 1){
								ConfirmPayment cPay = new ConfirmPayment();
								cPay.setResizable(false); //prevent frame from being resized
								cPay.setVisible(true); //make frame visible
							}
						 }
					 }
			}
});
		c.add(btn1);
		btn2=new JButton("Back");
		btn2.setBounds(150,400,100,50);
		btn2.setBackground(new Color(34,167,240));
		btn2.setForeground(Color.blue);
		btn2.setFocusable(false);
		btn2.setBorderPainted(true);
		btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
//				UserDashboard obj = new UserDashboard("Asif","Boss");
//				obj.setVisible(true);
			}
		});
		c.add(btn2);

/*		
		btn3=new JButton("Exit");
		btn3.setBounds(780,30,100,50);
		btn3.setBackground(new Color(34,167,240));
		btn3.setForeground(Color.blue);
		btn3.setFocusable(false);
		btn3.setBorderPainted(true);
		btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn3.setFocusPainted(false);//remove selection
		btn3.setContentAreaFilled(false);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
//				Welcome obj = new Welcome();
//				obj.setVisible(true);
			}
		});
		c.add(btn3);
*/	
	}
}

