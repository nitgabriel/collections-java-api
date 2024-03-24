package br.com.dio.lists.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(item);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public float calcularValorTotal() {
        float valorTotal = 0;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Arroz", 5, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 7, 3);
        carrinhoDeCompras.adicionarItem("Macarrão", 3, 1);
        carrinhoDeCompras.adicionarItem("Macarrão", 3, 1);
        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
        System.out.println("Itens do carrinho: ");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Macarrão");
        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
        System.out.println("Itens do carrinho: ");
        carrinhoDeCompras.exibirItens();
    }
}
