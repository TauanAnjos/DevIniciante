import java.util.InputMismatchException;

public class ContaPoupanca extends Conta{
    private double percRendimento;
    double calPeer;


    public ContaPoupanca(String agencia, int numConta, double saldo, String senha){
        super(agencia, numConta, saldo, senha);
    
    }

    public double getPercRendimento() {
        return percRendimento;
    }

    public void setPercRendimento(double percRendimento) {
        this.percRendimento = percRendimento;
    }


    public void calcularRendimento(){
        calPeer = super.getSaldo()*this.percRendimento;
        super.setSaldo(super.getSaldo()+calPeer);
    }

}
