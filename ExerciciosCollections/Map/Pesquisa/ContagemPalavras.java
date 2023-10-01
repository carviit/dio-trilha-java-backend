package ExerciciosCollections.Map.Pesquisa;

import java.util.Hashtable;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> mapPalavras;

    public ContagemPalavras() {

        mapPalavras = new Hashtable<>();

    }

    void adicionarPalavra(String palavra, Integer contagem) {

        this.mapPalavras.put(palavra, contagem);

    }

    void removerPalavra(String palavra) {

        if (this.mapPalavras.containsKey(palavra)) {

            this.mapPalavras.remove(palavra);

        } else {

            System.out.println("A palavra [" + palavra + "] não está presente.");

        }

    }

    void exibirContagemPalavras() {

        for (Map.Entry<String, Integer> palavraIterada : this.mapPalavras.entrySet()) {
            String chave = palavraIterada.getKey();
            Integer valor = palavraIterada.getValue();
            System.out.println("Palavra: " + chave + ", Contagem: " + valor);
        }

    }

    void encontrarPalavraMaisFrequente() {

        Integer contagemMaior = Integer.MIN_VALUE;
        Palavra palavraMaisFrequente = new Palavra();

        for (Map.Entry<String, Integer> palavraIterada : this.mapPalavras.entrySet()) {

            if (palavraIterada.getValue() > contagemMaior) {

                palavraMaisFrequente.setNomePalavra(palavraIterada.getKey());
                palavraMaisFrequente.setContagem(palavraIterada.getValue());

                contagemMaior = palavraIterada.getValue();
            }

        }

        System.out.println("\n== Palavra mais frequente ===\n");
        System.out.print("Palavra [" + palavraMaisFrequente.getNomePalavra() + "] , Contagem ["
                + palavraMaisFrequente.getContagem() + "]");

    }

}
