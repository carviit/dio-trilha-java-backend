package ExerciciosCollections.Map.Pesquisa;

public class App {

    public static void main(String[] args) {

        ContagemPalavras mapPalavras = new ContagemPalavras();

        mapPalavras.adicionarPalavra("Carro", 2);
        mapPalavras.adicionarPalavra("Moto", 10);
        mapPalavras.exibirContagemPalavras();

        mapPalavras.encontrarPalavraMaisFrequente();

        mapPalavras.removerPalavra("Moto");
        mapPalavras.exibirContagemPalavras();

    }

}
