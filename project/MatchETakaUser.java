//import Interfaces.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import javax.swing.JOptionPane;

public class MatchETakaUser{// implements IloginOperation 
    String phone;
    String pin;
    int ok = 0;

    MatchETakaUser(String phone,  String pin) {
        this.phone = phone;
        this.pin = pin;

        
        try {
            String check = phone + ':' + pin;
            
            BufferedReader reader = new BufferedReader(new FileReader("eTakaData.txt"));

            int totalLines = 0;
            while (reader.readLine() != null){
                totalLines++;
            }
            reader.close();

            for (int i = 0; i <= totalLines; i++) {

                String line = Files.readAllLines(Paths.get("eTakaData.txt")).get(i);
                if (line.equals(check)) {
                    ok = 1;
                    break;
                }
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, " Wrong User phone number or pin number ", "Message", -1);
        }
    }
}
