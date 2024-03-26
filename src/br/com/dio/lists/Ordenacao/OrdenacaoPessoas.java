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

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("João", 25, 1.75);
        ordenacaoPessoas.adicionarPessoa("Maria", 30, 1.65);
        ordenacaoPessoas.adicionarPessoa("José", 20, 1.80);
        ordenacaoPessoas.adicionarPessoa("Ana", 35, 1.70);
        System.out.println("Pessoas ordenadas por idade: ");
        for (Pessoa pessoa : ordenacaoPessoas.ordenarPorIdade()) {
            System.out.println(pessoa);
        }
        System.out.println("Pessoas ordenadas por altura: ");
        for (Pessoa pessoa : ordenacaoPessoas.ordenarPorAltura()) {
            System.out.println(pessoa);
        }
    }


}
