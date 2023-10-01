package ExerciciosCollections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{

    private List<Integer> listaDeNumerosInteiros;

    public OrdenacaoNumeros(){

        this.listaDeNumerosInteiros = new ArrayList<>();

    }

    void adicionarNumero(int numero){

        this.listaDeNumerosInteiros.add(numero);

    }

    void ordenarAscendente(){

        Collections.sort(this.listaDeNumerosInteiros);

    }

    void ordenarDescendente(){

        this.listaDeNumerosInteiros.sort(Collections.reverseOrder());
    }

    void exibirNumeros(){

        System.out.println(this.listaDeNumerosInteiros);
    }
    
}
