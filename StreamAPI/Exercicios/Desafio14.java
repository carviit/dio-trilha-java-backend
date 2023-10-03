package StreamAPI.Exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio14 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 13);

        List<Integer> listaDeNumerosPrimos = numeros.stream()
                .filter(numero -> ePrimo(numero))
                .toList();

        System.out.println(
                "Maior número primo da lista: " + listaDeNumerosPrimos.stream().max(Comparator.naturalOrder()).get());

    }

    // Método para verificar se um número é primo
    public static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
