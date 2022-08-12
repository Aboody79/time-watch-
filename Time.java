
package time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Time {
    public static void main(String[] args) {
        Date date = Calendar.getInstance().getTime();
          DateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyy,hh:sss.SSS a");
        String today = formatter.format(date);
        System.out.println("today:" +today);
        
    }
}