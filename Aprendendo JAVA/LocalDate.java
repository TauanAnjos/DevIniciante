import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.DataFormatException;
public class LocalDate {
    public static void main(String[] args) throws ParseException {
        Calendar date = Calendar.getInstance();
        date.set(2024, 01, 29);
        Date data = date.getTime();
        System.out.println(data);
        DateFormat dateFormat = DateFormat.getDateInstance();
        System.out.println(dateFormat.format(data));
        Date data2 = date.getTime();
        SimpleDateFormat tranDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data formatada "+tranDateFormat.format(data2));
        System.out.println("Data convertida pra String "+tranDateFormat.parse("29/01/2024"));
    }
}
