package ExerciciosCollections.List.OperacoesBasicas;

public class Item {

    private String nome;
    private double preço;
    private int quantidade;

    public Item(String nome, double preço, int quantidade) {

        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
