import java.util.Scanner;
import java.util.InputMismatchException;
public class TratamentoExcecaoVetor {
    public static void main(String[] args) {

        int[] vetorInteiro = new int[10];
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int num;
        try{
            do{
                System.out.println("Digite um número inteiro ");
                num = entrada.nextInt();
                vetorInteiro[contador] = num;
                contador++;
            }while (num != 0);

        }catch(InputMismatchException e){
            System.out.println("Tipo inválido");
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("“Tamanho do vetor previsto foi excedido.”");
        }finally {
        	entrada.close();
        }




    }

}