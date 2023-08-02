import java.time.LocalDate;
import java.util.Calendar;

public class LocalDates {
    public static void main(String[] args) {
        //current date
        LocalDate today = LocalDate.now();

        //adding one day to the localdate
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Today's Date: "+today);
        System.out.println("Tomorrow's Date: "+tomorrow);
        Calendar calendar = Calendar.getInstance();
        System.out.println("The Current Date is:" + calendar.getTime());
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 years later: " + calendar.getTime());
    }
}