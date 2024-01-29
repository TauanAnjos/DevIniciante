import java.util.Scanner;
import java.util.InputMismatchException;
public class ValorFGTS {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String nome;
	double salario;
	boolean sinalizador = false;
	Scanner entrada = new Scanner(System.in);
	double total;
	do{
		try {
			System.out.println("Digite seu nome: ");
			nome = entrada.nextLine();
			sinalizador = validarNomeFGTS(nome);
		}catch(InputMismatchException e) {
			System.out.println("Erro: O nome não pode conter números ou caracteres especiais");
		}catch(NomeValidarException e){
			System.out.println("ERRO: Número de caracteres inválido!");
		}
	}while(!sinalizador);
	do {
		try {
			System.out.println("Digite seu salário: ");
			salario = entrada.nextDouble();
			sinalizador = validarSalarioFGTS(salario);
			total = (salario*0.08) + salario;
			System.out.println("Salário com FGTS: " + total );
			
		}catch(InputMismatchException e) {
			System.out.println("Tipo inválido.");
		}catch(SalarioInvalidoException e) {
			System.out.println(e.getMessage());
		}finally{
			entrada.close();
		}
	
	}while(!sinalizador);


	}
	public static boolean validarSalarioFGTS(double salario) throws SalarioInvalidoException {
		if (salario < 1100) {
			throw new SalarioInvalidoException("O salário é inferior a 1100");
		}
		return true;
	}
	public static boolean validarNomeFGTS(String nome) throws NomeValidarException{
		if (nome.length() < 5 || nome.length() > 50) {
			throw new NomeValidarException("ERRO: Número de caracteres inválido!");
			
		}if (!nome.matches("[a-zA-Z ]*$")){
			throw new InputMismatchException();
		}
		return true;
		
		
		
	}

}
