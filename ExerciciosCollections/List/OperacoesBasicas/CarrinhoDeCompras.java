package ExerciciosCollections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {

        listaDeItens = new ArrayList<>();
    }

    void adicionarItem(String nome, double preco, int quantidade) {

        Item item = new Item(nome, preco, quantidade);

        this.listaDeItens.add(item);

    }

    void removerItem(String nome) {

        Item itemParaSerRemovido = null;

        for (Item item : this.listaDeItens) {

            if (item.getNome().equals(nome)) {

                itemParaSerRemovido = item;

            }

        }

        if (itemParaSerRemovido != null) {

            this.listaDeItens.remove(itemParaSerRemovido);
        }

    }

    double calcularValorTotal() {

        double valorTotal = 0;

        for (Item item : this.listaDeItens) {

            valorTotal += (item.getQuantidade() * item.getPreço());
        }

        return valorTotal;
    }

    void exibirItens() {

        System.out.println("\n============ C A R R I N H O ===========\n");

        for (Item item : this.listaDeItens) {

            System.out.println("Nome: " + item.getNome());
            System.out.printf("Preço: R$ %.2f%n", item.getPreço());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println();

        }

    }

    public List<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(List<Item> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }
}
