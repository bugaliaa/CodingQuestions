import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Timeone {
    public static void main(String[] args) {
        Date date = new Calendar.Builder().setTimeOfDay(14, 0, 0).build().getTime();
        
        Calendar indiaTime = new GregorianCalendar(TimeZone.getTimeZone("Asia/Kolkata"));
		indiaTime.setTimeInMillis(date.getTime());
		int hour = indiaTime.get(Calendar.HOUR);
		int minute = indiaTime.get(Calendar.MINUTE);
        int t = indiaTime.get(Calendar.AM_PM);
        String mer = t == 0 ? "AM" : "PM"; 

        System.out.printf("%02d:%02d %S\n", hour, minute, mer);
    }
}
