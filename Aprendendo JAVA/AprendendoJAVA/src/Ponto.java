public class Ponto {
    public double x;
    public double y;
    public String cor;


    public Ponto(double x, double y, String cor) {

        this(x,y);
        this.cor = cor;
    }


    public Ponto(double x, double y){
        this.x = x;
        this.y = y;

    }

    public void alterarCor(String cor){
        this.cor = cor;
    }
    public void imprimirDados(){
        System.out.println("Dados do Ponto:");
        System.out.println("Coordenada X: " + x);
        System.out.println("Coordenada Y: " + y);
        System.out.println("Cor: " + cor);
    }
}
