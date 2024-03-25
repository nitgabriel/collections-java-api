package br.com.dio.lists.Ordenacao;

import java.util.*;
public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        pessoaList.sort(Comparator.comparing(Pessoa::getIdade));
    }


}
