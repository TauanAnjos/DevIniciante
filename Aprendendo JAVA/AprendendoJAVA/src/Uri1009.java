import java.util.Scanner;

public class Uri1009{


    public static void main(String[] args) {
        String nomeVendedor;
        double salarioFixo;
        double vendaMensal;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite nome do vendedor: ");
        nomeVendedor = leitor.nextLine();
        System.out.println("Digite o sálario fixo: ");
        salarioFixo = leitor.nextDouble();
        System.out.println("Total de vendas efetuadas: ");
        vendaMensal = leitor.nextDouble();
        double total = ((vendaMensal * 15)/100) + salarioFixo;
        StringBuilder builder = new StringBuilder();
        builder.append("Nome do vendedor: ").append(nomeVendedor).append("\n")
        .append("Sálario do vendedor: R$").append(salarioFixo).append("\n")
        .append("Vendas mensal: ").append(vendaMensal).append("\n")
        .append("Sálario com comissão: R$").append(total);
        System.out.println(builder.toString());
        
    }

}