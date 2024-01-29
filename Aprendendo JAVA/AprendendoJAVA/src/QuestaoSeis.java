import java.util.Stack;
import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar uma pilha
        Stack<Integer> pilha = new Stack<>();

        // Preencher a pilha com alguns elementos de exemplo
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);

        // Solicitar ao usuário a chave do item a ser removido
        System.out.print("Digite a chave do item a ser removido: ");
        int chaveRemover = scanner.nextInt();

        // Criar uma pilha auxiliar para restauração
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        boolean encontrado = false;

        // Remover o item com a chave fornecida e copiar os elementos para a pilha auxiliar
        while (!pilha.isEmpty()) {
            int elemento = pilha.pop();
            if (elemento == chaveRemover) {
                encontrado = true;
            } else {
                pilhaAuxiliar.push(elemento);
            }
        }

        // Restaurar a pilha original
        while (!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }

        if (encontrado) {
            System.out.println("Item com a chave " + chaveRemover + " foi removido com sucesso!");
        } else {
            System.out.println("Item com a chave " + chaveRemover + " não encontrado na pilha.");
        }

        // Exibir a pilha resultante após a remoção
        System.out.println("Pilha após a remoção: " + pilha);

        scanner.close();
    }
}
