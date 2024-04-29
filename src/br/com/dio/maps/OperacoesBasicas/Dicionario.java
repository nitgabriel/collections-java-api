package br.com.dio.maps.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        } else {
            System.out.println("O dicionário está vazio.");
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Casa", "Lugar onde se mora.");
        dicionario.adicionarPalavra("Carro", "Veículo automotor.");
        dicionario.adicionarPalavra("Computador", "Máquina eletrônica.");
        dicionario.adicionarPalavra("Celular", "Telefone móvel.");
        dicionario.adicionarPalavra("Livro", "Obra literária.");

        System.out.println("Palavras:");
        dicionario.exibirPalavras();

        System.out.println("\nDefinição de Carro: " + dicionario.pesquisarPorPalavra("Carro"));

        dicionario.removerPalavra("Carro");
        System.out.println("\nPalavras após a remoção de Carro:");
        dicionario.exibirPalavras();
    }
}
