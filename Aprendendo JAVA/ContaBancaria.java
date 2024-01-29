public class ContaBancaria {
    private int number; //Número
    private String hold; //Reserva
    private double balance; //Saldo
    private double withdrawLimit; //Limite de saque
    
    public ContaBancaria(int number, String hold, double balance, double withdrawLimit){
        this.number = number;
        this.hold = hold;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    

    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }


    public String getHold() {
        return hold;
    }


    public void setHold(String hold) {
        this.hold = hold;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getWithdrawLimit() {
        return withdrawLimit;
    }


    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(double amount){
        this.balance += amount;
        

    }

    public void withdraw(double amount){
        validarWithdraw(amount);
        this.balance -= amount;
    }

    public void validarWithdraw(double amount){ // posso usar private
        if ( amount > getWithdrawLimit()){
            throw new BusinessException("Erro de saque. A quantia excede o limite de saque!");
        }
        if ( amount > getBalance()){
            throw new BusinessException ("Erro de saque: Saldo insuficiente!");
        }
    }
}
