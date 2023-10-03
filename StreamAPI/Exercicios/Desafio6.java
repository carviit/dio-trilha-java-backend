package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 13);

        boolean verificaNumeroMaiorQue10 = numeros.stream()
                .anyMatch(numero -> numero > 10);

        System.out.println(verificaNumeroMaiorQue10 ? "A lista possui um ou mais números maior(es) que 10"
                : "A lista não possui números maiores que 10");

    }

}
