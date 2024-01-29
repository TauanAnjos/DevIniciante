import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListTratamentoExcecao {
    public static void main(String[] args) {
        ArrayList<String> academia = new ArrayList<>();


        try{
            academia.add("Anilha");
            academia.add("Barra");
            System.out.println(academia.get(2));
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Erro: Não existe elementos nesse indice!");
        }
    }
}
