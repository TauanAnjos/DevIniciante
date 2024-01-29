import java.util.Stack;

public class AlfabetoOrdenado {
    public static void main(String[] args) {
        // Criando as duas pilhas
        Stack<Character> p1 = new Stack<>();
        Stack<Character> p2 = new Stack<>();

        // Preenchendo p1 com os caracteres A, C, E, G, I, K, M, O, Q, S, U, W e Y
        char[] letrasP1 = {'A', 'C', 'E', 'G', 'I', 'K', 'M', 'O', 'Q', 'S', 'U', 'W', 'Y'};
        for (int i = letrasP1.length - 1; i >= 0; i--) {
            p1.push(letrasP1[i]); // Empilhando cada caractere em p1 na ordem inversa
        }

        // Preenchendo p2 com os caracteres B, D, F, H, J, L, N, P, R, T, V, X e Z
        char[] letrasP2 = {'B', 'D', 'F', 'H', 'J', 'L', 'N', 'P', 'R', 'T', 'V', 'X', 'Z'};
        for (int i = letrasP2.length - 1; i >= 0; i--) {
            p2.push(letrasP2[i]); // Empilhando cada caractere em p2 na ordem inversa
        }

        // Exibindo o alfabeto na ordem de A até Z
        while (!p1.isEmpty() || !p2.isEmpty()) {
            if (!p1.isEmpty()) {
                System.out.print(p1.pop() + " "); // Desempilhando e imprimindo o topo de p1
            }
            if (!p2.isEmpty()) {
                System.out.print(p2.pop() + " "); // Desempilhando e imprimindo o topo de p2
            }
        }
    }
}
