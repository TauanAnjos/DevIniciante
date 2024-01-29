public class MainAluno {
    public static void main(String[] args) {
        // Criando alguns objetos Aluno para teste
        Aluno aluno1 = new Aluno("João", 20, 7.5, 8.0);
        Aluno aluno2 = new Aluno("Maria", 22, 6.0, 9.0);

        // Exibindo informações dos alunos
        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
    }
}

