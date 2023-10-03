package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 13);

        int somaDosDigitos = numeros.stream()
                .map(numero -> numero.toString().split(""))
                .flatMap(Arrays::stream)
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("A soma dos dígitos dos números da lista é: " + somaDosDigitos);

    }

}
