import java.util.*;
public class JogarDadoContarFaces {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos jogar dados e contar as faces?");

        Scanner scanner = new Scanner(System.in);
        int[] contagemFaces = new int[7];

        while(true){
            System.out.println("Pressione [Enter] para lançar o dado ou digite um valor fora do intervalo de 1-6 para [Sair]");
            String input = scanner.nextLine();

            if (input.isEmpty()){
                int faceLancada = (int) (Math.random() * 6) + 1;
                System.out.println("Face lançada: "+ faceLancada);
                contagemFaces[faceLancada]++;
            }else{
                try{
                    int valor = Integer.parseInt(input);

                    if ( valor < 1 || valor > 6){
                        System.out.println("Saindo do jogo...");
                        break;
                    }
                    int faceLancada = (int) (Math.random() * 6) + 1;
                    System.out.println("Face lançada: "+ faceLancada);
                    contagemFaces[faceLancada]++;
                } catch (NumberFormatException e){
                    System.out.println("Entrada inválida. Digite um número ou pressione [Enter] para lançar o dado. ");
                }
            }
        }
        for (int i = 1; i <= 6; i++){
            System.out.println("Face " + i + " caiu " + contagemFaces[i] + " vezes");
        }

        scanner.close();
    }
}
