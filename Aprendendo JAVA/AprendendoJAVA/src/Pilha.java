import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Integer> p_par = new Stack<Integer>();
        Stack<Integer> p_impar = new Stack<Integer>();
        Stack<Integer> p = new Stack<>();
        for (int i = 1; i < 16; i++) {
            p.push(i);
        }
        for (int i = 1; i <= p.size(); i++){
            if ( i % 2 == 0){
                p_par.push(i);
            }else{
                p_impar.push(i);
            }
        }
        System.out.println(p);
        System.out.println("PILHA DE NÚMEROS PARES "+ p_par);
        System.out.println("PILHA DE NÚMEROS IMPARES "+ p_impar);
    }
}
