package ExerciciosCollections.Set.Ordenacao;

import java.util.Comparator;

public class CompararAlunoNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        // Comparação com base nas notas dos alunos
        double nota1 = aluno1.getNota();
        double nota2 = aluno2.getNota();

        if (nota1 < nota2) {
            return -1; // aluno1 tem uma nota menor
        } else if (nota1 > nota2) {
            return 1;  // aluno1 tem uma nota maior
        } else {
            return 0;  // as notas são iguais
        }
    }
}
