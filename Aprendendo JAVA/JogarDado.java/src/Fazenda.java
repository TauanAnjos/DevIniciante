

public class Fazenda {
    public static void main(String[] args){
        Vaca mimosa = new Vaca();
        mimosa.peso=250;
        System.out.println("Peso da vaca: "+ mimosa.peso);
        mimosa.comer("capim ", 500);
        System.out.println("Peso da vaca: "+ mimosa.peso);
        mimosa.ruminar();
        mimosa.caminhar(10.0);

    }
}
