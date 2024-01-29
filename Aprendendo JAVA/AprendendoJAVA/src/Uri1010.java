import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        int codigoBlusa;
        int quantidadeBlusas;
        double valorUnitarioBlusa;
        int codigoShorte;
        int quantidadeShorte;
        double valorUnitarioShorte;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o código da Blusa: ");
        codigoBlusa = leitor.nextInt();
        System.out.println("Digite a quantidade de Blusas: ");
        quantidadeBlusas = leitor.nextInt();
        System.out.println("Digite o valor unitario: ");
        valorUnitarioBlusa = leitor.nextDouble();
        System.out.println("Digite o  código do Shorte: ");
        codigoShorte = leitor.nextInt();
        System.out.println("Digite a quantidade de Shortes: ");
        quantidadeShorte = leitor.nextInt();
        System.out.println("Digite o valor unitario: ");
        valorUnitarioShorte = leitor.nextDouble();
        double total = (quantidadeBlusas * valorUnitarioBlusa)+(quantidadeShorte * valorUnitarioShorte);
        System.out.println("Total a pagar: " + total);
    }

    
}
