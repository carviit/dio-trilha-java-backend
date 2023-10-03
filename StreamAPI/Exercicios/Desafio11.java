package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, 16, 17);

        Integer somaDosQuadrados = numeros.stream()
                .map(numero -> numero * numero)
                .reduce(0, Integer::sum);

        System.out.println("A soma dos quadrados do número da lista é: " + somaDosQuadrados);

    }

}
