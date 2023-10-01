package ExerciciosCollections.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas(){

        conjuntoPalavras = new HashSet<>();
    }

    void adicionarPalavra(String palavra){

        this.conjuntoPalavras.add(palavra);

    }

    void removerPalavra(String palavra){

        this.conjuntoPalavras.remove(palavra);

    }

    void verificarPalavra(String palavra){

        if(this.conjuntoPalavras.contains(palavra)){

            System.out.println("A palavra [" + palavra +"] está no conjunto de palavras." );

        }else{

            System.out.println("A palavra [" + palavra +"] não está no conjunto de palavras." );
        }

    }

    void exibirPalavrasUnicas(){

        System.out.println(this.conjuntoPalavras);

    }
    
}
