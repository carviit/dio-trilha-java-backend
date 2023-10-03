package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, 16, 17);

        Long quantidadeDeNumerosSemRepeticoes = numeros.stream()
                .distinct()
                .count();

        System.out.println((numeros.size() != quantidadeDeNumerosSemRepeticoes) ? "A lista possui números repetidos"
                : "A lista não possui números repetidos");

    }

}
