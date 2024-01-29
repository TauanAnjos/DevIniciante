import java.util.LinkedList;

public class TerceiraQuestao {
    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<Integer> lista2 = new LinkedList<>();

        // Adicione elementos às listas
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);

        lista2.add(2);
        lista2.add(4);
        lista2.add(6);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        // Passo A: Verifique se as listas estão ordenadas
        if (!verificarOrdenacao(lista1)) {
            // Passo B: Ordene a primeira lista
            lista1.sort(null);
        }

        if (!verificarOrdenacao(lista2)) {
            // Passo B: Ordene a segunda lista
            lista2.sort(null);
        }

        // Passo C: Mesclar os elementos da segunda lista na primeira mantendo a ordenação
        mesclaLista(lista1, lista2);

        System.out.println("Lista final mesclada: " + lista1);
    }

    // Método para verificar se uma lista está ordenada
    public static boolean verificarOrdenacao(LinkedList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }
        return true;
    }

    // Método para mesclar duas listas ordenadas em uma única lista ordenada
    public static void mesclaLista(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mescleList = new LinkedList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mescleList.add(list1.get(i));
                i++;
            } else {
                mescleList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mescleList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mescleList.add(list2.get(j));
            j++;
        }

        // Limpa a lista original e copia a lista mesclada de volta para a lista original
        list1.clear();
        list1.addAll(mescleList);
    }
}

