import java.util.Scanner;
import java.util.Stack;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma sequência de caracteres: ");
        String texto = scanner.nextLine();

        // Remova espaços e pontos do texto e converta para minúsculas
        texto = texto.replaceAll("[ .]", "").toLowerCase();

        // Passo A: Imprimir o texto na ordem inversa
        String textoInverso = inverterTexto(texto);
        System.out.println("Texto na ordem inversa: " + textoInverso);

        // Passo B: Verificar se o texto é um palíndromo
        boolean ePalindromo = verificarPalindromo(texto);
        if (ePalindromo) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }

        scanner.close();
    }

    // Método para inverter o texto usando uma pilha
    public static String inverterTexto(String texto) {
        Stack<Character> pilha = new Stack<>();
        for (char c : texto.toCharArray()) {
            pilha.push(c);
        }

        StringBuilder textoInverso = new StringBuilder();
        while (!pilha.isEmpty()) {
            textoInverso.append(pilha.pop());
        }

        return textoInverso.toString();
    }

    // Método para verificar se o texto é um palíndromo
    public static boolean verificarPalindromo(String texto) {
        String textoInverso = inverterTexto(texto);
        return texto.equals(textoInverso);
    }
}
