public class Uri1009up {
    protected String nomeVendedor;
    protected double salarioVendedor;
    protected double vendaMensal;

    public Uri1009up(String nomeVendedor, double salarioVendedor, double vendaMensal){
        this.nomeVendedor = nomeVendedor;
        this.salarioVendedor = salarioVendedor;
        this.vendaMensal = vendaMensal;
    }

    public double inserirComissao(){
        return  ((vendaMensal * 15)/100) + salarioVendedor;
    }


    public void dadosVendedor(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nome do vendedor: ").append(nomeVendedor).append("\n")
        .append("Salário do vendedor: ").append(salarioVendedor).append("\n")
        .append("Vendas mensal: ").append(vendaMensal).append("\n")
        .append("Salário com comissão: ").append(this.inserirComissao());
        System.out.println(builder.toString());
    }
    
    
}
