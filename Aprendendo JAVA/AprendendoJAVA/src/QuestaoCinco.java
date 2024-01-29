public class QuestaoCinco {
    private int tamanhoMaximo = 80;
    private int[] vetor = new int[tamanhoMaximo];
    private int topo1 = -1; // Topo da primeira pilha
    private int topo2 = tamanhoMaximo; // Topo da segunda pilha

    public void empilharPilha1(int elemento) {
        if (topo1 < tamanhoMaximo / 2 - 1) { // Verifica se a primeira pilha não está cheia
            topo1++;
            vetor[topo1] = elemento;
        } else {
            System.out.println("Estouro de pilha 1");
        }
    }

    public void empilharPilha2(int elemento) {
        if (topo2 > tamanhoMaximo / 2) { // Verifica se a segunda pilha não está cheia
            topo2--;
            vetor[topo2] = elemento;
        } else {
            System.out.println("Estouro de pilha 2");
        }
    }

    public int desempilharPilha1() {
        if (topo1 >= 0) {
            int elemento = vetor[topo1];
            topo1--;
            return elemento;
        } else {
            System.out.println("Pilha 1 vazia");
            return -1; // Valor de sentinela para indicar pilha vazia
        }
    }

    public int desempilharPilha2() {
        if (topo2 < tamanhoMaximo) {
            int elemento = vetor[topo2];
            topo2++;
            return elemento;
        } else {
            System.out.println("Pilha 2 vazia");
            return -1; // Valor de sentinela para indicar pilha vazia
        }
    }

    public static void main(String[] args) {
        QuestaoCinco pilhas = new QuestaoCinco();

        // Exemplo de uso
        pilhas.empilharPilha1(10);
        pilhas.empilharPilha1(20);
        pilhas.empilharPilha2(1);
        pilhas.empilharPilha2(2);

        System.out.println("Desempilhando da primeira pilha: " + pilhas.desempilharPilha1());
        System.out.println("Desempilhando da segunda pilha: " + pilhas.desempilharPilha2());
    }
}

