import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Time {
    String date = "";
    public void getTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        date = dateFormat.format(calendar.getTime());
        System.out.println("Время отправки сообщения " + date);
    }
}
