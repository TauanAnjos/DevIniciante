import java.util.Locale;
import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os dados da contas");
        System.out.println("Número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Títular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Saldo inicial");
        double saldoInicial = sc.nextDouble();
        System.out.println("Limite de saque");
        double limiteSaque = sc.nextDouble();
        ContaBancaria acc = new ContaBancaria(numero, titular, saldoInicial, limiteSaque);
        System.out.println();
        System.out.println("Informe a contia para sacar: ");
        double sacar = sc.nextDouble();

        
        
       try {
        acc.withdraw(sacar);
        System.out.println("Novo Saldo: " + acc.getBalance());

        }

        catch (BusinessException e){
            System.out.println(e);
        }
        
        sc.close();
    }
}
