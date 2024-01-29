class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaOrdenada {
    private No inicio;

    // a) Verificar se um número pertence à lista
    public boolean pertence(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    // b) Inserir um novo elemento na lista mantendo a ordem
    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (inicio == null || valor < inicio.valor) {
            novoNo.proximo = inicio;
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null && atual.proximo.valor < valor) {
                atual = atual.proximo;
            }
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
        }
    }

    // c) Remover um elemento da lista
    public void remover(int valor) {
        if (inicio == null) {
            return;
        }
        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }
        No atual = inicio;
        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }
        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
    }

    // d) Imprimir os valores da lista
    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // e) Copiar uma lista L1 para uma lista L2
    public ListaOrdenada copiar() {
        ListaOrdenada novaLista = new ListaOrdenada();
        No atual = inicio;
        while (atual != null) {
            novaLista.inserir(atual.valor);
            atual = atual.proximo;
        }
        return novaLista;
    }

    // f) Concatenar uma lista L1 com uma lista L2
    public ListaOrdenada concatenar(ListaOrdenada lista2) {
        ListaOrdenada novaLista = this.copiar();
        No atual = lista2.inicio;
        while (atual != null) {
            novaLista.inserir(atual.valor);
            atual = atual.proximo;
        }
        return novaLista;
    }

    // g) Intercalar L1 e L2
    public ListaOrdenada intercalar(ListaOrdenada lista2) {
        ListaOrdenada novaLista = new ListaOrdenada();
        No atual1 = this.inicio;
        No atual2 = lista2.inicio;
        while (atual1 != null && atual2 != null) {
            if (atual1.valor < atual2.valor) {
                novaLista.inserir(atual1.valor);
                atual1 = atual1.proximo;
            } else {
                novaLista.inserir(atual2.valor);
                atual2 = atual2.proximo;
            }
        }
        while (atual1 != null) {
            novaLista.inserir(atual1.valor);
            atual1 = atual1.proximo;
        }
        while (atual2 != null) {
            novaLista.inserir(atual2.valor);
            atual2 = atual2.proximo;
        }
        return novaLista;
    }
}

public class PrimeiraQuestao {
    public static void main(String[] args) {
        ListaOrdenada lista = new ListaOrdenada();
        lista.inserir(5);
        lista.inserir(2);
        lista.inserir(7);
        lista.inserir(1);

        System.out.println("Lista original:");
        lista.imprimir();

        System.out.println("Verificar se 2 pertence à lista: " + lista.pertence(2));
        System.out.println("Verificar se 4 pertence à lista: " + lista.pertence(4));

        lista.remover(2);
        System.out.println("Após remover o valor 2:");
        lista.imprimir();

        ListaOrdenada lista2 = lista.copiar();
        System.out.println("Cópia da lista original:");
        lista2.imprimir();

        ListaOrdenada lista3 = new ListaOrdenada();
        lista3.inserir(4);
        lista3.inserir(6);
        System.out.println("Lista 3:");
        lista3.imprimir();

        ListaOrdenada concatenada = lista.concatenar(lista3);
        System.out.println("Lista concatenada:");
        concatenada.imprimir();

        ListaOrdenada intercalada = lista.intercalar(lista3);
        System.out.println("Lista intercalada:");
        intercalada.imprimir();
    }
}
