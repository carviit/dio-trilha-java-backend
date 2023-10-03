package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Integer produtoDosNumeros = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("O produto dos números da lista é: " + produtoDosNumeros);

    }
}
