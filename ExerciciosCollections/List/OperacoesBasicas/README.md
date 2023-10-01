## Carrinho de Compras em Java

Neste projeto, criamos uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online em Java. O carrinho de compras é implementado como uma lista de itens, e cada item é representado por uma classe chamada "Item". A seguir, apresentamos os métodos implementados e sua funcionalidade:

### Métodos Implementados

- `adicionarItem(String nome, double preco, int quantidade)`: Este método permite adicionar um item ao carrinho de compras com o nome, preço e quantidade especificados.

- `removerItem(String nome)`: Este método permite remover um item do carrinho de compras com base em seu nome. Se houver vários itens com o mesmo nome, apenas um deles será removido.

- `calcularValorTotal()`: Este método calcula e retorna o valor total do carrinho de compras, levando em consideração o preço e a quantidade de cada item.

- `exibirItens()`: Este método exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.