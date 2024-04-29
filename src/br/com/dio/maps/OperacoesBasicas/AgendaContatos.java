package br.com.dio.maps.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda está vazia.");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer buscarContato(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("A agenda está vazia.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("José", 456789123);
        agenda.adicionarContato("Ana", 654321987);
        agenda.adicionarContato("Carlos", 321987654);

        System.out.println("Contatos:");
        agenda.exibirContatos();

        System.out.println("\nNúmero de Maria: " + agenda.buscarContato("Maria"));

        agenda.removerContato("Maria");
        System.out.println("\nContatos após a remoção de Maria:");
        agenda.exibirContatos();
    }
}
