import java.time.LocalDate;
import java.util.InputMismatchException;

public class ContaEspecial extends Conta {
    private double limite;
    public final double jurus = 0.3;
    private double limiteMax;
    
    public ContaEspecial(String agencia, int numConta, double saldo, String senha, double limite){
        super(agencia, numConta, saldo, senha);
        this.limiteMax = limite;
        this.limite = limite;
    }
    

    public double getLimite() {
        return limite;
    }


    public void setLimite(double limite) {
        this.limite = limite;
    }

    

    public double getLimiteMax() {
        return limiteMax;
    }


    public void debitarJuros()throws SaldoExcecaoError{
        LocalDate dia = LocalDate.now();
        LocalDate data = LocalDate.of(dia.getYear(),dia.getMonth(),15);
        if(dia.equals(data)){
            if(getLimiteMax() != getLimite()){
                double varAux = this.getLimiteMax() - this.getLimite();
                varAux*=jurus;
                setLimite(this.getLimite() - varAux);
            }else{
                System.out.println("Conta não utilizou o limite.");
            }
        }
    }

    public void sacar(double valor)throws SaldoExcecaoError{
        double auxVar = this.getSaldo()+this.getLimite();;
        if(auxVar < valor){
            throw new SaldoExcecaoError("Erro: Saldo insuficiente.");
        }else{
            auxVar = auxVar - valor;
            if (auxVar <= getLimiteMax()){
                setSaldo(0);
                setLimite(auxVar);
            }else{
                this.setSaldo(this.getSaldo() - valor);
            }
            
        }
    }
}
