/*public class MainFinanciamento {
    public static void main(String[] args) {
        double valorTotal = 1000.00;
        double entrada = 200.00;
        int parcela = 7;

        try{
            Financiamento f = new Financiamento(valorTotal, entrada, parcela);
            System.out.println(f.prestacao());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
} */
import java.util.Scanner;

public class MainFinanciamento {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        try{
            System.out.println("Digite valor do produto");
            double valorTotal = sca.nextDouble();
            System.out.println("Digite o valor de entrada");
            double valorEntrada = sca.nextDouble();
            System.out.println("Digite número de parcelas");
            int parcela = sca.nextInt();
            Financiamento fin = new Financiamento(valorTotal, valorEntrada, parcela);
            System.out.println(fin.prestacao());
        }  catch(BusinessException e){
        System.out.println(e.getMessage());
        }
    }

}
