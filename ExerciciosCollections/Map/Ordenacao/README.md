### Livraria Online

Foi criada uma classe chamada "LivrariaOnline" que representa uma livraria online. Esta classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implementa-se os seguintes métodos:

- `adicionarLivro(String link, String título, String autor, double preço)`: Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
- `removerLivro(String título)`: Remove um livro da livraria, dado o título do livro.
- `exibirLivrosOrdenadosPorPreço()`: Exibe os livros da livraria em ordem crescente de preço.
- `pesquisarLivrosPorAutor(String autor)`: Retorna uma lista de todos os livros escritos por um determinado autor.
- `obterLivroMaisCaro()`: Retorna o livro mais caro disponível na livraria.
- `obterLivroMaisBarato()`: Retorna o livro mais barato disponível na livraria.
