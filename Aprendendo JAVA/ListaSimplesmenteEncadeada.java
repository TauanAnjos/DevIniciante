public class ListaSimplesmenteEncadeada {

    private static class No{
        public No prox; // próximo nó na lista
        public int valor; // elemento (valor) armazenado na lista
       
        public No (int val){ //construtor do nó da lista
            valor = val; prox = null;
        }
    }
   
    private No inicio; //representa a cabeça (início) da lista
   
    public ListaSimplesmenteEncadeada(){   // construtor da lista
        inicio = null;
    }

  public boolean isEmpty(){
    return inicio == null;
  }
   
public boolean search( int elem){
    for(No nodo = inicio; nodo != null; nodo = nodo.prox)
       if (elem == nodo.valor) return true; //econtrou o elemento
    return false;                     // não encontrou o elemento
           
  }

  public void insereInicio(int elem){ //insere no início da lista
        No novoNo = new No(elem);
        novoNo.prox = inicio; //novoNo -> inicio antigo
        inicio = novoNo;      // inicio -> novoNo
    }
   
    public void removeInicio(){ //elimina o primiro item da lista
        inicio = inicio.prox; // elimina o elemento e reposiciona o início
    }
   
    public void insereMeio(int elem, int posicao){
        No novoNo = new No(elem);
        if (posicao == 0 || inicio == null){
            insereInicio(elem);
        }else{
            No anterior = null;
            No atual = inicio;
            int contador = 0;
            while (contador < posicao && atual != null) {
                anterior = atual;
                atual = atual.prox;
                contador++;
            }
            if (anterior != null) {
                anterior.prox = novoNo;
                novoNo.prox = atual;
            }
        }
    }

    public void removeMeio(int posicao) {
        if (inicio == null) {
            return; // Lista vazia, não há nada para remover.
        }
    
        if (posicao == 0) {
            removeInicio();
        } else {
            No anterior = null;
            No atual = inicio;
            int contador = 0;
    
            while (contador < posicao && atual != null) {
                anterior = atual;
                atual = atual.prox;
                contador++;
            }
    
            if (atual != null) {
                anterior.prox = atual.prox;
            }
        }
    }

    public String exibeLista(){
        if(isEmpty()) return "Lista vazia\n"; //teste de lista vazia
        String str = "Lista Encadeada: ";
        for (No nodo = inicio; nodo != null; nodo = nodo.prox)
            str+= " "+ nodo.valor;
        return str + "\n";
    }

    public static void main(String[] args) throws Exception {        
        ListaSimplesmenteEncadeada objetoLista = new ListaSimplesmenteEncadeada();
        objetoLista.insereInicio(1);
        objetoLista.insereInicio(2);
        objetoLista.insereInicio(3);
        objetoLista.insereInicio(4);
        System.out.println(objetoLista.exibeLista());
        
        objetoLista.insereMeio(5, 2); // Insere o elemento 5 na posição 2 (0-based).
    
        System.out.println(objetoLista.exibeLista()); // Deve imprimir: Lista Encadeada: 4 3 5 2 1
    
        objetoLista.removeMeio(2); // Remove o elemento na posição 2 (0-based).
        
        System.out.println(objetoLista.exibeLista()); // Deve imprimir: Lista Encadeada: 4 3 2 1
    }
}// fim da classe Lista