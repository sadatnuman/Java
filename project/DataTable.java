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
import java.nio.*;
import java.nio.file.*;
import javax.swing.table.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;
import java.util.List;
import java.util.Scanner;


public class DataTable{// implements ActionListener{// extends JFrame {

	private JTable table;
    private DefaultTableModel data;
    private static Scanner x;

	public DataTable(JPanel tablePanel){

        Font f5 = new Font("Bogart", Font.PLAIN, 14);

        String[] column = {"Name", "Account", "Birth", "Religion", "Password", "Email", "Question", "Answer", "Crerat"};
        String[] row = new String[9];

        data = new DefaultTableModel();
        data.setColumnIdentifiers(column);

        JTable table = new JTable(data);
//      table.setBounds(0, 0, 1000, 200);


        table.setModel(data);
        table.setFont(f5);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
        table.getColumnModel().getColumn(6).setPreferredWidth(100);
        table.getColumnModel().getColumn(7).setPreferredWidth(100);
        table.getColumnModel().getColumn(8).setPreferredWidth(100);
        

        try {

            BufferedReader reader = new BufferedReader(new FileReader("user_data.txt"));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i += 12) {
                String line = Files.readAllLines(Paths.get("user_data.txt")).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    String user = Files.readAllLines(Paths.get("user_data.txt")).get(i).substring(12);
                    String acc = Files.readAllLines(Paths.get("user_data.txt")).get((i+1)).substring(15);
                    String bith = Files.readAllLines(Paths.get("user_data.txt")).get((i+2)).substring(16);
                    String religion = Files.readAllLines(Paths.get("user_data.txt")).get((i+3)).substring(11);
                    String pass = Files.readAllLines(Paths.get("user_data.txt")).get((i + 4)).substring(11);
                    String email = Files.readAllLines(Paths.get("user_data.txt")).get((i + 5)).substring(8);
                    String q = Files.readAllLines(Paths.get("user_data.txt")).get((i+6)).substring(20);
                    String a = Files.readAllLines(Paths.get("user_data.txt")).get((i+7)).substring(9);
                    String time = Files.readAllLines(Paths.get("user_data.txt")).get((i+8)).substring(14);

                    data.addRow(new Object[]{user, acc, bith, religion, pass,email, q, a, time});
                    
                }
            }

        } catch (Exception ex) {
            System.out.println("error");
            return;
        }
/*          
            scroll = new JScrollPane(table);
            scroll.setBounds(1000, 50, 5, 500);
            scroll.setBackground(Color.WHITE);

            userInfoPanel.add(scroll);
*/
            JScrollPane scroll = new JScrollPane(table);
            scroll.setBounds(20, 50, 920, 350);
            scroll.setBackground(new Color(0x2a2f3a));
            tablePanel.add(scroll);
}}




 //         userInfoPanel.add(table);
  //          tablePanel.add(new JScrollPane(table));
//		    tablePanel.validate();
/*
            JButton deleteButton = new JButton("Delete");
            Font f2 = new Font("Bogart", Font.PLAIN, 20);
            deleteButton.setBounds (300, 420, 150, 40);
            deleteButton.setForeground(new Color(0xff5a4e));
            deleteButton.setBackground(Color.white);
            deleteButton.setFont(f2);
            deleteButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            Border border = new LineBorder(new Color(0xff5a4e), 2, true);//new Color(0x98abb2)
            deleteButton.setBorder(border);
            deleteButton.addActionListener(this);
            deleteButton.setFocusPainted(false);//remove selection
            deleteButton.setOpaque(false);
            tablePanel.add(deleteButton);



	}public void actionPerformed(ActionEvent ae){
        int i = table.getSelectedRow();
        if(i >= 0){
            String ruser = Files.readAllLines(Paths.get("user_data.txt")).get(i*12);
            ruser.replaceAll(data.getValueAt(i*12, 0).toString());

            String acc = Files.readAllLines(Paths.get("user_data.txt")).get((i*12+1));
            acc.replaceAll(data.getValueAt(i*12+1, 0).toString());

            String bith = Files.readAllLines(Paths.get("user_data.txt")).get((i*12+2));
            bith.replaceAll(data.getValueAt(i*12+2, 0).toString());

            String religion = Files.readAllLines(Paths.get("user_data.txt")).get((i*12+3));
            religion.replaceAll(data.getValueAt(i*12+3, 0).toString());

            String rpass = Files.readAllLines(Paths.get("user_data.txt")).get((i*12 + 4));
            rpass.replaceAll(data.getValueAt(i*12+4, 0).toString());

            String email = Files.readAllLines(Paths.get("user_data.txt")).get((i*12 + 5));
            email.replaceAll(data.getValueAt(i*12+5, 0).toString());

            String q = Files.readAllLines(Paths.get("user_data.txt")).get((i*12+6));
            q.replaceAll(data.getValueAt(i*12+6, 0).toString());

            String a = Files.readAllLines(Paths.get("user_data.txt")).get((i*12+7));
            a.replaceAll(data.getValueAt(i*12+7, 0).toString());

            String time = Files.readAllLines(Paths.get("user_data.txt")).get((i*12+8));
            time.replaceAll(data.getValueAt(i*12+8, 0).toString());

            String l1 = Files.readAllLines(Paths.get("user_data.txt")).get((i*12+9));
            l1.replaceAll(data.getValueAt(i*12+9, 0).toString());

            String l2 = Files.readAllLines(Paths.get("user_data.txt")).get((i*12+10));
            l2.replaceAll(data.getValueAt(i*12+10, 0).toString());

            String l3 = Files.readAllLines(Paths.get("user_data.txt")).get((i*12+11));
            l3.replaceAll(data.getValueAt(i*12+11, 0).toString());

            data.removeRow(i);

           
           break;
        }  
    }
}
//       data.removeRow(table.getSelectedRow());                 
/*
        int row = table.getSelectedRow();
        String user = "User Name : " + table.getModel().getValueAt(row, 0).toString();
        String pass = "Password : " + table.getModel().getValueAt(row, 4).toString();

//        Data.DeleteUser(user,pass,email);


//        String oldString = user_parm+":"+pass_parm+":"+email_parm;

        //data hold string




        try {

            BufferedReader reader = new BufferedReader(new FileReader("user_data.txt"));
            FileWriter writer = new FileWriter("user_data.txt");

            int totalLines = 0;
            while (reader.readLine() != null){
                totalLines++;
            }
//            reader.close();

            for (int i = 0; i <= totalLines; i++) {
                String newString="";
                String oldContent = "";
                

                String name = Files.readAllLines(Paths.get("user_data.txt")).get(i);
                if (name.equals(user)) {
                    String cpass = Files.readAllLines(Paths.get("user_data.txt")).get((i + 4));
                    if (cpass.equals(pass)) {
                 }
                }       
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " Wrong User Name or Password ", "Message", -1);
        }
/*
        String newString=""; //blank don't change

//        File fileToBeModified = new File(user_db_txt_name);

        String oldContent = "";

        BufferedReader reader = null;

        FileWriter writer = null;



        try
        {
            reader = new BufferedReader(new FileReader("user_data.txt"));

            //Reading all the lines of input text file into oldContent

            String line = reader.readLine();

            while (line != null){
                oldContent = oldContent + line + System.lineSeparator();

                line = reader.readLine();
            }

            //Replacing oldString with newString in the oldContent

            String newContent = oldContent.replaceAll(oldString, newString);

            //Rewriting the input text file with newContent



            writer = new FileWriter("user_data.txt");

            String newCOtnentNEwlineRemooved = newContent.replaceAll("(?m)^\\s*$[\n\r]{1,}", ""); //for remove blank line from stirng

            writer.write(newCOtnentNEwlineRemooved);
        }catch (IOException e){
            e.printStackTrace();
        }


        finally
        {
            try
            {
                //Closing the resources

                reader.close();

                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        String ruser = Files.readAllLines(Paths.get("user_data.txt")).get(i);
//                        writer.write(ruser.replace(ruser, ""));

                        String acc = Files.readAllLines(Paths.get("user_data.txt")).get((i+1));
//                        writer.write(acc.replace(acc, ""));

                        String bith = Files.readAllLines(Paths.get("user_data.txt")).get((i+2));
//                        writer.write(bith.replace(bith, ""));

                        String religion = Files.readAllLines(Paths.get("user_data.txt")).get((i+3));
//                        writer.write(religion.replace(religion, ""));

                        String rpass = Files.readAllLines(Paths.get("user_data.txt")).get((i + 4));
//                        writer.write(rpass.replace(rpass, ""));

                        String email = Files.readAllLines(Paths.get("user_data.txt")).get((i + 5));
//                        writer.write(email.replace(email, ""));

                        String q = Files.readAllLines(Paths.get("user_data.txt")).get((i+6));
//                        writer.write(q.replace(email, ""));

                        String a = Files.readAllLines(Paths.get("user_data.txt")).get((i+7));
//                        writer.write(a.replace(email, ""));

                        String time = Files.readAllLines(Paths.get("user_data.txt")).get((i+8));
  //                      writer.write(time.replace(time, ""));

                        String l1 = Files.readAllLines(Paths.get("user_data.txt")).get((i+9));
//                        writer.write(l1.replace(l1, ""));

                        String l2 = Files.readAllLines(Paths.get("user_data.txt")).get((i+10));
  //                      writer.write(l2.replace(l2, ""));

                        String l3 = Files.readAllLines(Paths.get("user_data.txt")).get((i+11));
    //                    writer.write(l3.replace(l3, ""));

                        
                    }
                }

                        reader.close();
                        writer.close();
 



    }
	
}textId.setText(model.getValueAt(i, 0).toString());
           textFname.setText(model.getValueAt(i, 1).toString());
           textLname.setText(model.getValueAt(i, 2).toString());
           textAge.setText(model.getValueAt(i, 3).toString());


*/
