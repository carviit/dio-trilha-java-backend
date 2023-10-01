package ExerciciosCollections.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GerenciadorAlunos {

    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos(){

        listaAlunos = new HashSet<>();

    }

    void adicionarAluno(String nome, Long matricula, double media){

        Aluno aluno = new Aluno(nome, matricula, media);

        listaAlunos.add(aluno);

    }

    void removerAluno(long matricula){

        Aluno aluno = new Aluno("", null, 0);
        boolean flag = false;

        aluno.setMatricula(matricula);

        for(Aluno alunoRemover : listaAlunos){

            if(alunoRemover.equals(aluno)){

                listaAlunos.remove(alunoRemover);
                flag = true;

                System.out.println("O aluno de matrícula [" + matricula + "] foi removido da lista de alunos.");
                return;
            }
        }

        if(!flag){
            System.out.println("O aluno de matrícula [" +  matricula + "] não está na lista de alunos.");
        }
    }

    void exibirAlunosPorNome(){

        List<Aluno> alunos = new ArrayList<>(listaAlunos);

        Collections.sort(alunos);

        for(Aluno aluno : alunos){

            System.out.print(aluno.getNome() + " ");
        }

    }

    void exibirAlunosPorNota(){

        List<Aluno> alunos = new ArrayList<>(listaAlunos);

        Collections.sort(alunos, new CompararAlunoNota());

        System.out.println();

        for(Aluno aluno : alunos){

            System.out.print("["+ aluno.getNome() +"]" + "["  + aluno.getNota() + "]" + " ");
        }

    }

    void exibirAlunos(){

        System.out.println("\n\n=============== A L U N O S ===============");

        for(Aluno aluno : listaAlunos){

            System.out.println("NOME[" + aluno.getNome() + "]" + " MATRÍCULA [" + aluno.getMatricula() + "] NOTA[" + aluno.getNota() + "]");

        }

    }
    
}
