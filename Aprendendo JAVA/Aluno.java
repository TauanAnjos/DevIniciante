import java.lang.module.ModuleDescriptor.Builder;

public class Aluno {
    private String nome;
    private int idade;
    private double []nota;
    private double media;

    public Aluno(String nome, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota = new double[]{nota1,nota2};
        this.calcularMedia();
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nom){
        this.nome = nom;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idad){
        this.idade = idad;
    }

    public void calcularMedia(){
        double soma = 0;
        for (double notas: nota){
            soma += notas;
        }
        this.media = soma / nota.length;
    }

    public void exibirInformacoes(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nome do aluno: ").append(this.nome).append("\n");
        builder.append("Idade: ").append(this.idade);
        builder.append("Notas: ").append(this.nota[0]).append("\n");
        builder.append("Média: ").append(this.media).append("\n");
        System.out.println(builder.toString());

    }
}
