package ExerciciosCollections.List.Pesquisa;

public class App {

    public static void main(String[] args) {
        
        SomaNumeros listaDeNumeros = new SomaNumeros();

        listaDeNumeros.adicionarNumero(1);
        listaDeNumeros.adicionarNumero(2);
        listaDeNumeros.adicionarNumero(3);
        listaDeNumeros.adicionarNumero(4);
        listaDeNumeros.adicionarNumero(5);

        System.out.println(listaDeNumeros.calcularSoma());
        System.out.println(listaDeNumeros.encontraMaiorNumero());
        System.out.println(listaDeNumeros.encontraMenorNumero());
        listaDeNumeros.exibirNumeros();

    }
    
}
