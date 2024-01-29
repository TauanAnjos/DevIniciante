public class Recursividade {
    public static void main(String[] args) {
        int fatorial = 5;
        fatorial(fatorial);
        int recursividadeN = recursividade(fatorial);
        System.out.println(recursividadeN);
    }
    public static void fatorial(int number){
        int total = 1;
        for (int i = number; i > 1 ; i--){
            total = total * i;
        }
        System.out.println(total);
    }
    public static int recursividade( int num){
        if(num == 1){
            return 1;
        }
        return num*recursividade(num-1);
    }
}