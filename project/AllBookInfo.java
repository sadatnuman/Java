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



public class AllBookInfo extends JFrame{

	ImageIcon bookImg;
	JButton book;
	Font font;
	String bookName, writer, bookTyre, price, location;

	public AllBookInfo(int a, int b, String bookName, String writer, String bookTyre, String price, 
		   String location, JLabel name, JLabel wName, JLabel cost, JPanel all, JPanel infoPanel){


		this.bookName = bookName;
		this.writer = writer;
		this.bookTyre = bookTyre;
		this.price = price;
		this.location = location;

		bookImg = new ImageIcon (getClass().getResource(location));//use getResource from getClass
		book = new JButton();//bookName, bookImg, JLabel.CENTER
		book.setBounds(a, b, bookImg.getIconWidth()+20, bookImg.getIconHeight()+20);
		book.setIcon (bookImg);
//		book.setText(bookName);
//		font = new Font("Bogart", Font.PLAIN, 13);
//		book.setFont(font);

		book.setForeground(new Color(0x98abb2));
		book.setBackground(Color.WHITE);
		book.setBorder(null);
//		book.setVerticalTextPosition (JLabel.BOTTOM);
		book.setCursor(new Cursor(Cursor.HAND_CURSOR));
		book.setBorder(null);
		book.setFocusPainted(false);
 		book.setOpaque(false);
 		book.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                name.setText(bookName);
				wName.setText(writer);
				cost.setText(price);
			}
        });
 		all.add(book);
	
	}
}
