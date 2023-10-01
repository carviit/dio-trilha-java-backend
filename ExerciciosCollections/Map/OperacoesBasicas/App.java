package ExerciciosCollections.Map.OperacoesBasicas;

public class App {

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalvra("Carro", "Veículo de 4 rodas");
        dicionario.adicionarPalvra("Moto", "Veículo de 2 rodas");
        dicionario.adicionarPalvra("Avião", "Veículo que voa");

        dicionario.removerPalavra("Carro");
        dicionario.removerPalavra("Barco");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Avião");

    }
    
}
