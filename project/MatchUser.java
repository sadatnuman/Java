//import Interfaces.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import javax.swing.JOptionPane;

public class MatchUser{// implements IloginOperation 
    String userName;
    String password;
    String accountType;
    int ok = 0;

    MatchUser(String userName,  String password, String accountType) {
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;

        
        try {
            String sUserName = "User Name : " + userName;
            String sPassword = "Password : " + password;
            String sAccount = "Account Type : " + accountType;

            BufferedReader reader = new BufferedReader(new FileReader("user_data.txt"));

            int totalLines = 0;
            while (reader.readLine() != null){
                totalLines++;
            }
            reader.close();

            for (int i = 0; i <= totalLines; i++) {

                String name = Files.readAllLines(Paths.get("user_data.txt")).get(i);
                if (name.equals(sUserName)) {
                    String pass = Files.readAllLines(Paths.get("user_data.txt")).get((i + 4));
                    if (pass.equals(sPassword)) {
                        String account = Files.readAllLines(Paths.get("user_data.txt")).get((i + 1));
                        if(account.equals(sAccount)){
                            ok = 1;
                            break;
                        }
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " Wrong User Name or Password ", "Message", -1);
        }
    }
}
