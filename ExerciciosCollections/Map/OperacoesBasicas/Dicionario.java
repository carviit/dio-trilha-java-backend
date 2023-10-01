package ExerciciosCollections.Map.OperacoesBasicas;

import java.util.Hashtable;
import java.util.Map;

public class Dicionario {

    Map<String, String> mapPalavras;

    public Dicionario() {

        mapPalavras = new Hashtable<>();

    }

    void adicionarPalvra(String palavra, String definicao) {

        this.mapPalavras.put(palavra, definicao);

    }

    void removerPalavra(String palavra) {

        if (this.mapPalavras.containsKey(palavra)) {

            this.mapPalavras.remove(palavra);

            System.out.println("A palavra [" + palavra + "] foi removida do Dicionário.");

        } else {

            System.out.println("A palavra [" + palavra + "] não está no Dicionário.");
        }

    }

    void exibirPalavras() {

        for (Map.Entry<String, String> palavraIterada : this.mapPalavras.entrySet()) {
            String chave = palavraIterada.getKey();
            String valor = palavraIterada.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

    }

    void pesquisarPorPalavra(String palavra) {

        boolean flag = false;

        for (Map.Entry<String, String> palavraIterada : this.mapPalavras.entrySet()) {

            if (palavraIterada.getKey().equals(palavra)) {

                System.out.println("Palavra [" + palavra + "], Sigificado [" + palavraIterada.getValue() + "]");

                flag = true;
            }

        }

        if (!flag) {

            System.out.println("A palavra [" + palavra + "] não está no Dicionário.");
        }

    }

}
