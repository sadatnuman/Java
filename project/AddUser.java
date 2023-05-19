import java.io.*;
import java.nio.*;
import java.nio.file.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class AddUser{ // implements iRegistrationOperation 

    String userName;
    String birth;
    String religion;
    String mail;
    String password;
    String que;
    String ans;
    String accountType;
 //   int s = 0;

    public AddUser(String userName, String birth, String religion, String mail, String password, String que, String ans, String accountType) {
        this.userName = userName;
        this.birth = birth;
        this.religion = religion;
        this.mail = mail;
        this.password = password;
        this.que = que;
        this.ans = ans;
        this.accountType = accountType;

        try {

            File userInfo = new File("user_data.txt");//     .\\Data\\
            if (!userInfo.exists()) {
                userInfo.createNewFile();
            }
            FileWriter fileWrite = new FileWriter(userInfo, true);
            BufferedWriter bufferedWrite = new BufferedWriter(fileWrite);
            PrintWriter printWrite = new PrintWriter(bufferedWrite);

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

            String timeAndDate = myDateObj.format(myFormatObj);

            printWrite.println("User Name : " + userName);
            printWrite.println("Account Type : " + accountType);
            printWrite.println("Dath of Birth : " + birth);
            printWrite.println("Religion : " + religion);
            printWrite.println("Password : " + password);
            printWrite.println("Email : " + mail);
            printWrite.println("Security Question : " + que);
            printWrite.println("Answer : " + ans);
            printWrite.println("Time & Date : " + timeAndDate);
            printWrite.println("\n===============================================\n");
            printWrite.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
}
