//this will show the time continuously untill it off
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    public static void main(String[] args) {
        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = currentTime.format(formatter);
            System.out.println(formattedTime);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
