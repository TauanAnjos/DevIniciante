import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleConta {
	
	public ArrayList<Conta> carteira=new ArrayList<Conta>();
	Scanner entrada=new Scanner(System.in);
	
	public ControleConta() {
		
	}

	public void cadastrarConta(int tipo) {
		switch(tipo) {
		case 1:
			System.out.println("Digite: agencia, conta, saldo, senha");
			Conta a= new Conta(entrada.next(), entrada.nextInt(), entrada.nextDouble(), entrada.next());
			carteira.add(a);
			break;
		case 2:
			System.out.println("Digite: agencia, conta, saldo, senha, limite");
			ContaEspecial b= new ContaEspecial(entrada.next(), entrada.nextInt(), entrada.nextDouble(), entrada.next(),entrada.nextDouble());
			carteira.add(b);
			break;
		case 3:
			System.out.println("Digite: agencia, conta, saldo, senha");
			ContaPoupanca c= new ContaPoupanca(entrada.next(), entrada.nextInt(), entrada.nextDouble(), entrada.next());
			carteira.add(c);
			break;
		}
	}
	
	public Conta busca(int numero) {
		for(Conta elemento:carteira) {
			if(elemento.getNumConta()==numero)
				return elemento;
		}		
		return null;
	}
	
	public void realizaSaque(Conta conta) {
		if(conta!=null){
			try {
				System.out.println("Digite a senha:");
			 	if (conta.autenticar(entrada.next())){
			 		System.out.println("Valor para saque: ");
			 		conta.sacar(entrada.nextDouble());
			 	}
			}
			catch(SaldoExcecaoError e) {
				System.out.println(e.getMessage());
			}
			finally {
				if(conta instanceof Conta || conta instanceof ContaPoupanca) 
					System.out.println("Saldo: "+conta.getSaldo());
				else
					System.out.println("Saldo: "+(((ContaEspecial)conta).getSaldo()+((ContaEspecial)conta).getLimite()));
			}
		}
		else
			System.out.println("Conta inexistente.");
		
	}

	public void realizaDeposito( Conta conta) {
		double valor;
		boolean flag=true;
		if(conta!=null){					
				do {	
					try {
						System.out.println("Digite valor a depositar");
						valor=entrada.nextDouble();
						conta.depositar(valor);
						flag=false;
					}
					catch(InputMismatchException e) {
						System.out.println("Tipo inválido.");
						valor=0;
						entrada.next();
					}
				}while(flag==true);
				
				if(conta instanceof Conta || conta instanceof ContaPoupanca)
					System.out.println("Saldo: "+conta.getSaldo());
				else
					System.out.println("Saldo: "+(conta.getSaldo()+((ContaEspecial)conta).getLimite()));
			}
			else
			System.out.println("Conta inexistente.");
	}
	
	public void calculaRendimento(Conta conta) {
		if(conta!=null){
			if (conta instanceof ContaPoupanca ){
				System.out.println("Taxa de rendimento: ");
				((ContaPoupanca)conta).setPercRendimento(entrada.nextDouble());
				((ContaPoupanca)conta).calcularRendimento();
				System.out.println("Saldo: "+conta.getSaldo());
			}
		}
		else
			System.out.println("Conta inexistente.");
	}
	
	public void debitarJuros(Conta conta) throws SaldoExcecaoError{
		if (conta instanceof ContaEspecial ){
			if(conta!=null){
				((ContaEspecial)conta).debitarJuros();
			}
		}
		else
			System.out.println("Conta inexistente.");
	}
	
}