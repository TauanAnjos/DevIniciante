import java.util.InputMismatchException;
public  class Conta implements Autenticavel{
    protected String agencia;
    protected int numConta;
    protected double saldo;
    protected String senha;
    
    public Conta(String agencia, int numConta, double saldo, String senha) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.senha = senha;
    }
    

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getSenha() {
        return senha;
    }

    public void depositar(double valor)throws NumberFormatException{
        try{
            this.saldo += valor;
        }catch (NullPointerException e){
            throw new NumberFormatException("Tipo inválido!");
        }
    }

    public void sacar(double valor)throws SaldoExcecaoError{
        if(valor > this.getSaldo()){
            throw new SaldoExcecaoError("Erro: Saldo insuficiente.");
        }else{
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    public boolean autenticar(String senha){
        if(this.getSenha().equals(senha)){
            System.out.println("Usuário validado!");
            return true;
        }else{
            System.out.println("Senha incorreta!");
            return false;
        }
    }
}
