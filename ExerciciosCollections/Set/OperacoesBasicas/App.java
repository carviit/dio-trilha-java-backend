package ExerciciosCollections.Set.OperacoesBasicas;

public class App {

    public static void main(String[] args) {
        
        ConjuntoPalavrasUnicas conjuntoDePalavras = new ConjuntoPalavrasUnicas();

        conjuntoDePalavras.adicionarPalavra("Carlos");
        conjuntoDePalavras.adicionarPalavra("Vitor");
        conjuntoDePalavras.adicionarPalavra("Ferreira");
        conjuntoDePalavras.adicionarPalavra("De");
        conjuntoDePalavras.adicionarPalavra("Moura");
        conjuntoDePalavras.exibirPalavrasUnicas();

        conjuntoDePalavras.verificarPalavra("Carlos");
        conjuntoDePalavras.verificarPalavra("Soares");

        conjuntoDePalavras.removerPalavra("Carlos");
        conjuntoDePalavras.exibirPalavrasUnicas();
    }
    
}
