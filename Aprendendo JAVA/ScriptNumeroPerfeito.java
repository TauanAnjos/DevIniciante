import java.util.Scanner;
import java.util.InputMismatchException;

public class ScriptNumeroPerfeito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean sinalizador = true;

        do{
            try{
             System.out.println("Digite um número inteiro, maior que 0 e menor que 32767:");
                num = entrada.nextInt();
                if(ehPerfeito(num)){
                    System.out.println(num + " é um número perfeito");
                }else{
                    System.out.println(num + " não é um número perfeito");
                }
            }   catch(ValidarInteiro e){
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("Tipo inválido. Digite um número inteiro.");
            }
        }while(!sinalizador);


        

    }
    public static boolean validarNum(int num)throws ValidarInteiro{
        if(num <= 0){
            throw new ValidarInteiro("Erro: dado inválido! O número tem que ser maior que 0.");
        }if (num > 32767){
            throw new ValidarInteiro("Erro: dado inválido! O número tem que ser menor que 32767.");
        }
        return true;
    }
    public static boolean ehPerfeito(int num)throws ValidarInteiro{
        int somaDivisores = 0;
        for (int i = 1; i < num ; i++){
            if (num % i == 0){
                somaDivisores += i;
                
            }
            
        }
        return somaDivisores == num;
    }
        

}
