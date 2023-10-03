package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaNumerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();

        List<Integer> listaNumerosImpares = numeros.stream()
                .filter(numero -> numero % 2 != 0)
                .toList();

        System.out.println("Numeros Pares: " + listaNumerosPares);
        System.out.println("Numeros Pares: " + listaNumerosImpares);

    }

}
