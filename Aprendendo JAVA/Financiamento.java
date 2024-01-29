public class Financiamento {
    public double valorTotal;
    public double entrada;
    public int parcela;
    public Financiamento(double valorTotal, double entrada, int parcela) {
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcela = parcela;
    }
    
    public double prestacao(){
        validarEntrada(entrada);
        return (valorTotal - entrada)/parcela;
    }


    public void validarEntrada(double valorEntrada) {
        if ( valorEntrada < valorTotal * 0.2 ){
            throw new BusinessException("O valor mínimo de entrada é 20% do valor do produto");
        }
        if ( parcela < 6){
            throw new BusinessException("Número minimo de parcela é 6");
        }
    }
}
