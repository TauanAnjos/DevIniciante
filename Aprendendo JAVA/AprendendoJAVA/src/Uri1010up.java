public class Uri1010up {
    protected String codigoBlusa;
    protected int quantidadeBlusas;
    protected double valorUnitarioBlusa;
    protected String codigoShorte;
    protected int quantidadeShorte;
    protected double valorUnitarioShorte;

    public Uri1010up(String codigoBlusa, int quantidadeBlusas, String codigoShorte,
            int quantidadeShorte) {
        this.codigoBlusa = codigoBlusa;
        this.quantidadeBlusas = quantidadeBlusas;
        this.valorUnitarioBlusa = 10.0;
        this.codigoShorte = codigoShorte;
        this.quantidadeShorte = quantidadeShorte;
        this.valorUnitarioShorte = 12.0;
    }

    public double totalApagarBlusa(){
        return quantidadeBlusas * valorUnitarioBlusa;
    }

    public double totalApagarShortes(){
        return quantidadeShorte * valorUnitarioShorte;
    }

    public double totalApagar(){
        return quantidadeBlusas *valorUnitarioBlusa + quantidadeShorte * valorUnitarioShorte;
    }

    public void dadosVendas(){
        StringBuilder builder = new StringBuilder();
        builder.append("Código das Blusas: ").append(codigoBlusa).append("\n")
        .append("Quantidade de blusas: ").append(quantidadeBlusas).append("\n")
        .append("Valor únitario blusa: ").append(valorUnitarioBlusa).append("\n")
        .append("Código das shortes: ").append(codigoShorte).append("\n")
        .append("Quantidade de shortes: ").append(quantidadeShorte).append("\n")
        .append("Valor blusas: ").append(this.totalApagarBlusa()).append("\n")
        .append("Valor shortes: ").append(this.totalApagarShortes()).append("\n")
        .append("Total a pagar compra: ").append(this.totalApagar()).append("\n")
        .append("Valor únitario shorte: ").append(valorUnitarioShorte).append("\n");
        System.out.println(builder.toString());
    }
    
}
