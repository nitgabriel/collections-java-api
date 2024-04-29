package br.com.dio.sets.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class CadastroProdutos {
    private Set<Produto> listaProdutos;

    public CadastroProdutos () {
        this.listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, String cod, double preco, int quantidade) {
        this.listaProdutos.add(new Produto(nome, cod, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> listaOrdenada = new HashSet<>(this.listaProdutos);
        listaOrdenada.stream()
                .sorted((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()))
                .forEach(System.out::println);
    }

    public void exibirProdutosPorPreco() {
        Set<Produto> listaOrdenada = new HashSet<>(this.listaProdutos);
        listaOrdenada.stream()
                .sorted(Comparator.comparingDouble(Produto::getPreco))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto("Arroz", "001", 10.0, 5);
        cadastro.adicionarProduto("Feijão", "002", 8.0, 3);
        cadastro.adicionarProduto("Macarrão", "003", 5.0, 2);
        cadastro.adicionarProduto("Óleo", "004", 12.0, 1);
        cadastro.adicionarProduto("Sal", "005", 2.0, 4);

        System.out.println("Produtos ordenados por nome:");
        cadastro.exibirProdutosPorNome();

        System.out.println("\nProdutos ordenados por preço:");
        cadastro.exibirProdutosPorPreco();
    }
}
