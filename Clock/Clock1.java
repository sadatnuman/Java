//this will show the time for one time.
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock1 {
    public static void main(String[] args) {
        // Get the current time
        Calendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Format the time as a string
        String time = String.format("%02d:%02d:%02d", hour, minute, second);

        // Print the time to the console
        System.out.println(time);
    }
}
