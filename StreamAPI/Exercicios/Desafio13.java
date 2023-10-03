package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 13);

        List<Integer> numerosNoIntervalo0e5 = numeros.stream()
                .filter(numero -> (numero > 5 && numero < 10))
                .toList();

        System.out.println("Os números no intervalo de   5 < x < 10 são: " + numerosNoIntervalo0e5);

    }

}
