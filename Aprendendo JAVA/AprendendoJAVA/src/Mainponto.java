import java.util.Scanner;

public class Mainponto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário as coordenadas x e y
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();
        System.out.print("Digite o valor de y: ");
        double y = scanner.nextDouble();

        // Solicite ao usuário a cor do ponto
        System.out.print("Digite a cor do ponto: ");
        String corPonto = scanner.next();

        // Crie um objeto Ponto com os valores digitados
        Ponto ponto = new Ponto(x, y, corPonto);

        // Solicite ao usuário os detalhes da circunferência
        System.out.print("Digite o raio da circunferência: ");
        double raioCirculo = scanner.nextDouble();
        System.out.print("Digite a cor da linha da circunferência: ");
        String corLinhaCirculo = scanner.next();
        System.out.print("Digite a cor do preenchimento da circunferência: ");
        String corPreenchimentoCirculo = scanner.next();

        // Crie um objeto Circunferencia com os valores digitados
        Circunferencia circulo = new Circunferencia(ponto, raioCirculo, corLinhaCirculo, corPreenchimentoCirculo);

        // Imprima os detalhes da circunferência
        circulo.imprimirDados();

        // Altere a cor do ponto
        System.out.print("Digite a nova cor do ponto: ");
        String novaCorPonto = scanner.next();
        ponto.alterarCor(novaCorPonto);

        // Imprima os detalhes do ponto após a alteração
        ponto.imprimirDados();

        // Feche o Scanner
        scanner.close();
    }
}

