package ExerciciosCollections.Set.Ordenacao;

public class App {

    public static void main(String[] args) {

        GerenciadorAlunos listaAlunos = new GerenciadorAlunos();

        listaAlunos.adicionarAluno("Carlos", 20221l, 10.5);
        listaAlunos.adicionarAluno("Vitor", 20231l, 2.5);
        listaAlunos.adicionarAluno("Ferreira", 20211l, 3.6);
        listaAlunos.adicionarAluno("Moura", 20191l, 1.1);

        listaAlunos.exibirAlunosPorNome();

        listaAlunos.exibirAlunosPorNota();

        listaAlunos.exibirAlunos();
        listaAlunos.removerAluno(20221l);
        listaAlunos.removerAluno(2024l);


    }

    
    
}
