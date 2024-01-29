import java.util.Scanner;

public class CalcImc {
    public static void main(String[] args) throws Exception {
        float peso = 0;
        float altura = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua altura: ");
        altura = scanner.nextFloat();
        scanner.nextLine(); // Consumir a nova linha pendente
        
        System.out.println("Digite seu peso: ");
        peso = scanner.nextFloat();
        scanner.nextLine(); // Consumir a nova linha pendente
        
        // Aqui você pode continuar com o resto do código, cálculos ou qualquer outra operação.
        float imc = peso / (altura * altura);
        System.out.println("Seu IMC é: "+ imc);

        if ( imc < 18.5){
            System.out.println("Magreza.");
            System.out.println("Você está abaixo do peso!");
        }
        else if (imc >= 18.5 && imc < 25){
            System.out.println("Peso normal.");
            System.out.println("Você está dentro do peso!");
        }
        else if (imc >= 25 && imc < 30){
            System.out.println("Sobrepeso.");
            System.out.println("Você está um pouco acima do peso!");
        }
        else if (imc >= 30 && imc < 35){
            System.out.println("Obesidade grau 1.");
            System.out.println("Cuide-se!");
        }
        else if (imc >= 35 && imc < 40){
            System.out.println("Obesidade grau 2.");
            System.out.println("Cuide-se!");
        }
        else if (imc >= 40){
            System.out.println("Obesidade grau 3.");
            System.out.println("Situação crítica. Cuide-se!");
        }
    }
}
