package ExerciciosCollections.Map.OperacoesBasicas;

import java.util.Objects;

public class Palavra {

    private String nomePalavra;
    private String definicao;

    public String getNomePalavra() {
        return nomePalavra;
    }

    public void setNomePalavra(String nomePalavra) {
        this.nomePalavra = nomePalavra;
    }

    public String getDefinicao() {
        return definicao;
    }

    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Palavra outraInstancia = (Palavra) obj;
        return Objects.equals(this.nomePalavra, outraInstancia.nomePalavra);
    }

}
