import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacaoUsoConta {

	public static void main(String[] args) throws SaldoExcecaoError {
		
		Scanner entrada=new Scanner(System.in);
		int opcao;
		ControleConta controle=new ControleConta();
		Conta conta;
		do {
			System.out.println("""
					1.Cadastrar uma conta
					2.Realizar Saque
					3.Realizar Deposito
					4.Calcular rendimento de poupança
					5.Debitar Juros de Conta Especial
					6.Sair
					Digite opção: 
		    """);
			opcao=entrada.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("1.Conta Corrente\n2.Conta Especial\n3.Conta poupança");
				controle.cadastrarConta(entrada.nextInt());
				break;
			case 2:
				System.out.println("Digite numero da conta: ");
				conta=controle.busca(entrada.nextInt());
				controle.realizaSaque(conta);
				break;
			case 3:
				System.out.println("Digite numero da conta: ");
				conta=controle.busca(entrada.nextInt());
				controle.realizaDeposito(conta);
				break;
			case 4:
				System.out.println("Digite numero da conta: ");
				conta=controle.busca(entrada.nextInt());
				controle.calculaRendimento(conta);
				break;
			case 5:	
				System.out.println("Digite numero da conta: ");
				conta=controle.busca(entrada.nextInt());
				controle.debitarJuros(conta);
			}
		}while(opcao!=6);
		entrada.close();
	}
	
}
