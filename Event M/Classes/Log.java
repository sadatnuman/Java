package Classes;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import Interfaces.*;



import static javax.swing.JOptionPane.showMessageDialog;

public class Log implements LogImplements {
    String textfield1;
    String textfield2;
    int s = 0;

    Log(String textfield1, String textfield2) 
	{
        this.textfield1 = textfield1;
        this.textfield2 = textfield2;
    }

 
    public void matchUser(String textfield1, String textfield2)
	{

        try 
		{
            String userNameS = "User Name : " + textfield1;
            String passwordS = "Password : " + textfield2;
            BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

            int totalLines = 0;
            while (reader.readLine() != null)
            totalLines++;
            reader.close();

            for (int i = 0; i <= totalLines; i++) 
			{
                String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                if (line.equals(userNameS)) 
				{
                    String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt"))
                            .get((i + 1));
                    if (line2.equals(passwordS)) 
					{

                        //p1.setVisible(false);
                        //new Plan();
                        s = 2;
                        break;
                    }
                }
            }
        } 
		catch (Exception ex)
		{
            showMessageDialog(null, " Wrong User Name or Password ", "Message", -1);
        }
    }
}
