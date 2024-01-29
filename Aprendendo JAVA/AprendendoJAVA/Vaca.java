package AprendendoJAVA;

     public class Vaca {
        public String registro;
        public String raca;
        public String cor;
        public double tamanho;
        public int idade;
        public double peso;
        public Vaca() {
    
        }
        public void comer(String alimento, double quantidade){
            peso = peso + 0.05*quantidade;
        }
    }
