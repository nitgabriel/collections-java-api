package br.com.dio.maps.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : agendaEventosMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.println("Próximo evento: " + proximoEvento.getNome() + " - " + proximaData);
        } else {
            System.out.println("Não há eventos futuros.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2021, 10, 10), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2021, 10, 15), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2021, 10, 20), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2021, 10, 25), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Evento 5", "Atração 5");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
