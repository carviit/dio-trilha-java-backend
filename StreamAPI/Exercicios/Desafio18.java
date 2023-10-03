package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 13);

        boolean todosNumerosIguais = numeros.stream()
                .allMatch(numero -> numero.equals(numeros.get(0)));

        System.err.println(
                todosNumerosIguais ? "Todos os números da lista são iguais" : "Os números da lista são diferentes");

    }
}
