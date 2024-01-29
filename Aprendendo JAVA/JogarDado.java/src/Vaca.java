public class Vaca {

    public String registro;
    public String raca;
    public String cor;
    public double tamanho;
    public int idade;
    public double peso;
    public Vaca () {
       
    }
    public void comer(String alimento, double quantidade){
        peso = peso + 0.05*quantidade;
        System.out.println("Comendo" + quantidade + "g de " + alimento + ".");
    }
    public void ruminar(){
        System.out.println("Ruminando a comida...");
    }
    public double produzirLeite(){
        return peso * 0.02;
    }
    public void caminhar(double distancia){
        System.out.println("Caminhando " + distancia + " metros.");
    }
}
