package br.com.dio.sets.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaSet.remove(t);
                    break;
                }
            }
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public void contarTarefas() {
        System.out.println("Quantidade de tarefas: " + tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isFinalizada()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isFinalizada()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setFinalizada(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setFinalizada(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
            tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");

        System.out.println("Tarefas: ");
        listaTarefa.exibirTarefas();

        listaTarefa.contarTarefas();

        System.out.println("Tarefas concluídas: ");
        System.out.println(listaTarefa.obterTarefasConcluidas());

        System.out.println("Tarefas pendentes: ");
        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.marcarTarefaConcluida("Tarefa 2");

        System.out.println("Tarefas: ");
        listaTarefa.exibirTarefas();

        System.out.println("Tarefas concluídas: ");
        System.out.println(listaTarefa.obterTarefasConcluidas());

        System.out.println("Tarefas pendentes: ");
        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.marcarTarefaPendente("Tarefa 2");

        System.out.println("Tarefas: ");
        listaTarefa.exibirTarefas();

        System.out.println("Tarefas concluídas: ");
        System.out.println(listaTarefa.obterTarefasConcluidas());

        System.out.println("Tarefas pendentes: ");
        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.limparListaTarefas();

        System.out.println("Tarefas: ");
        listaTarefa.exibirTarefas();
    }
}
