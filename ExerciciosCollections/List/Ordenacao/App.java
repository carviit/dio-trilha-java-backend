package ExerciciosCollections.List.Ordenacao;

public class App {

    public static void main(String[] args) {
        
        OrdenacaoNumeros listaDeNumeros = new OrdenacaoNumeros();

        listaDeNumeros.adicionarNumero(2);
        listaDeNumeros.adicionarNumero(4);
        listaDeNumeros.adicionarNumero(5);
        listaDeNumeros.adicionarNumero(3);
        listaDeNumeros.adicionarNumero(1);
        listaDeNumeros.adicionarNumero(0);

        listaDeNumeros.ordenarAscendente();

        listaDeNumeros.exibirNumeros();

        listaDeNumeros.ordenarDescendente();

        listaDeNumeros.exibirNumeros();

    }
    
}
