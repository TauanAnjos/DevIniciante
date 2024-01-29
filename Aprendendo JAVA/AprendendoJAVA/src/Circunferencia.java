public class Circunferencia {
    public Ponto centro;
    public double raio;
    public String corDaLinha;
    public String corDoPreenchimento;

    public Circunferencia(Ponto centro, double raio){
        this.centro = centro;
        this.raio = raio;
    }
    public Circunferencia(Ponto centro, double raio, String corDaLinha){
        this.centro = centro;
        this.raio = raio;
        this.corDaLinha = corDaLinha;
    }
    public Circunferencia(Ponto centro, double raio, String corDaLinha, String corDoPreenchimento){
        this.centro = centro;
        this.raio = raio;
        this.corDaLinha = corDaLinha;
        this.corDoPreenchimento = corDoPreenchimento;
    }
    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }
    public double perimetro(){
        return 2 * Math.PI * raio;
    }
    public void imprimirDados(){
        System.out.println("Dados da Circunferência:");
        System.out.println("Centro: (" + centro.x + ", " + centro.y + ")");
        System.out.println("Raio: " + raio);
        System.out.println("Cor da Linha: " + corDaLinha);
        System.out.println("Cor do Preenchimento: " + corDoPreenchimento);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
