package ExerciciosCollections.List.OperacoesBasicas;

public class App {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();

        carrinho1.adicionarItem("Banana", 2.50, 10);

        carrinho1.adicionarItem("Maça", 3.50, 10);

        System.out.printf("Valor total = R$ %.2f%n", carrinho1.calcularValorTotal());

        carrinho1.exibirItens();

    }

}
