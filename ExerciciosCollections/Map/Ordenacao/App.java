package ExerciciosCollections.Map.Ordenacao;

public class App {

    public static void main(String[] args) {

        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("exemplo.com", "Java", "Carlos", 100);
        livraria.adicionarLivro("exemploUm.com", "API", "Vitor", 50);
        livraria.adicionarLivro("exemploDois.com", "FrameWork", "Ferreira", 200);

        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());

        System.out.println(livraria.obterLivroMaisBarato());

        System.out.println(livraria.obterLivroMaisCaro());

    }

}
