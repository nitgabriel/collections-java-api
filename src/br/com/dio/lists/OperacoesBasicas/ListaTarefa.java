package br.com.dio.lists.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributos
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
            System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Estudar Spring");
        listaTarefa.adicionarTarefa("Estudar Spring");
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("Descrição das tarefas: ");
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Estudar Spring");
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("Descrição das tarefas: ");
        listaTarefa.obterDescricoesTarefas();
    }


}
