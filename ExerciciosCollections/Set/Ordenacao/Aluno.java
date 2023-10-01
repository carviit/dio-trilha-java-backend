package ExerciciosCollections.Set.Ordenacao;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private Long matricula;
    private double nota;

    public Aluno(String nome, Long matricula, double nota){

        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public int compareTo(Aluno o) {
        
        return this.nome.compareTo(o.nome);
    }
    
}
