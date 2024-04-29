package br.com.dio.maps.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
            contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("A Contagem está vazia.");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : contagemPalavrasMap.values()) {
            contagemTotal += contagem;
        }
        return  contagemTotal;
    }

    public Map.Entry<String, Integer> buscarPalavraMaisFrequente() {
        Map.Entry<String, Integer> palavraMaisFrequente = null;
        int contagemMaisAlta = Integer.MIN_VALUE;
        if (!contagemPalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> palavra : contagemPalavrasMap.entrySet()) {
                if (palavra.getValue() > contagemMaisAlta) {
                    contagemMaisAlta = palavra.getValue();
                    palavraMaisFrequente = palavra;
                }
            }
        } else {
            System.out.println("A Contagem está vazia.");
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();
        contagem.adicionarPalavra("Java", 10);
        contagem.adicionarPalavra("Python", 15);
        contagem.adicionarPalavra("JavaScript", 20);
        contagem.adicionarPalavra("C#", 5);
        contagem.adicionarPalavra("C++", 3);

        System.out.println("Contagem de Palavras:" + contagem.exibirContagemPalavras());


        System.out.println("\nPalavra mais frequente: " + contagem.buscarPalavraMaisFrequente());

        contagem.removerPalavra("JavaScript");
        System.out.println("\nContagem após a remoção de JavaScript:" + contagem.exibirContagemPalavras());
        contagem.exibirContagemPalavras();
    }
}
