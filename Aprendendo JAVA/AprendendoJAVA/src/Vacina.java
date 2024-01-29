
import java.time.LocalDate;
public class Vacina {
    String vacina;
    String lote;
    LocalDate datavencimento = LocalDate.now();
    
    public Vacina(String vacina, String lote, LocalDate datavencimento){
        this.vacina = vacina;
        this.lote = lote;
        this.datavencimento = datavencimento;
    }

    public String toString(){
        return "Vacina: " + vacina +  " Lote: " + lote + " Data de Vencimento: " + datavencimento;
    }
}
