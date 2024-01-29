
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TreinoData {
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println(hoje.format(formatador));
    } 
}
