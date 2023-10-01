package ExerciciosCollections.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> listaDeNumerosInteiros;

    public SomaNumeros(){

        listaDeNumerosInteiros = new ArrayList<>();

    }

    void adicionarNumero(int numero){

        this.listaDeNumerosInteiros.add(numero);
    }

    int calcularSoma(){

        int somaDosNumeros = 0;

        for(Integer numero: this.listaDeNumerosInteiros){

            somaDosNumeros += numero;
        }

        return somaDosNumeros;

    }

    int encontraMaiorNumero(){

        int maiorNumero = Integer.MIN_VALUE;

        for(Integer numero: this.listaDeNumerosInteiros){

            if(numero > maiorNumero){

                maiorNumero = numero;
            }
        }

        return maiorNumero;

    }

    int encontraMenorNumero(){

        int menorNumero = Integer.MAX_VALUE;

        for(Integer numero: this.listaDeNumerosInteiros){

            if(numero < menorNumero){

                menorNumero = numero;
            }
        }

        return menorNumero;

    }
    
    void exibirNumeros(){

        System.out.println("=============== LISTA DOS NÚMEROS =============== ");

        for(Integer numero: this.listaDeNumerosInteiros){

            System.out.print(numero + " ");
        }

    }
    
}
