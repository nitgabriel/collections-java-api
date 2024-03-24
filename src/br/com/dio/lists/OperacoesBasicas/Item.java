package br.com.dio.lists.OperacoesBasicas;

public class Item {
    private String nome;
    private int quantidade;
    private float preco;

    public Item(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                "preco='" + preco + '\'' +
                "quantidade='" + quantidade + '\'' +
                '}';
    }
}
