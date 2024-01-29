import java.util.Scanner;

public class CalculadoraQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Digite um número para calcular o quadrado");

            double num = scan.nextDouble();

            double quadrado = num * num;
            System.out.println("O quadrado de " + num + " é " + quadrado);
        }
        catch(java.util.InputMismatchException e){
           System.out.println("Por favor, insira um número valido.");
        }
        finally{
            scan.close();
        }
    }
}
