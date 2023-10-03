package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 30, 45, 3);

        List<Integer> numerosMultiplosDeTresCinco = numeros.stream()
                .filter(numero -> ((numero % 3 == 0) && (numero % 5 == 0)))
                .toList();

        System.out.println(numerosMultiplosDeTresCinco);

    }

}
