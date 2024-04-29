package br.com.dio.maps.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {

            for (Produto produto : estoqueProdutosMap.values()) {
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }

        } else {
            System.out.println("O estoque está vazio.");
        }
        return  valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double precoMaisAlto = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if(produto.getPreco() > precoMaisAlto) {
                    precoMaisAlto = produto.getPreco();
                    produtoMaisCaro = produto;
                }
            }
        } else {
            System.out.println("O estoque está vazio.");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double precoMaisBaixo = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if(produto.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = produto.getPreco();
                    produtoMaisBarato = produto;
                }
            }
        } else {
            System.out.println("O estoque está vazio.");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1, "Arroz", 10.0, 100);
        estoque.adicionarProduto(2, "Feijão", 8.0, 50);
        estoque.adicionarProduto(3, "Macarrão", 5.0, 80);
        estoque.adicionarProduto(4, "Óleo", 15.0, 30);
        estoque.adicionarProduto(5, "Açúcar", 7.0, 70);

        System.out.println("Produtos:");
        estoque.exibirProdutos();

        System.out.println("\nValor total do estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("\nProduto mais caro: " + estoque.obterProdutoMaisCaro());

        System.out.println("\nProduto mais barato: " + estoque.obterProdutoMaisBarato());

        System.out.println("\nProduto com maior quantidade e maior valor total no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
