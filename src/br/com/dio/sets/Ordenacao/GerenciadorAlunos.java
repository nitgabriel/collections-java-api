package br.com.dio.sets.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota) {
        this.alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> listaOrdenada = new HashSet<>(this.alunosSet);
        listaOrdenada.stream()
                .sorted((a1, a2) -> a1.getNome().compareToIgnoreCase(a2.getNome()))
                .forEach(System.out::println);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> listaOrdenada = new HashSet<>(this.alunosSet);
        listaOrdenada.stream()
                .sorted((a1, a2) -> Double.compare(a1.getNota(), a2.getNota()))
                .forEach(System.out::println);
    }

    public void exibirAlunos() {
        this.alunosSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno("João", 1, 8.0);
        gerenciador.adicionarAluno("Maria", 2, 9.0);
        gerenciador.adicionarAluno("José", 3, 7.0);
        gerenciador.adicionarAluno("Ana", 4, 10.0);
        gerenciador.adicionarAluno("Carlos", 5, 6.0);

        System.out.println("Alunos ordenados por nome:");
        gerenciador.exibirAlunosPorNome();

        System.out.println("\nAlunos ordenados por nota:");
        gerenciador.exibirAlunosPorNota();

System.out.println("\nAlunos:");
        gerenciador.exibirAlunos();
    }

}
