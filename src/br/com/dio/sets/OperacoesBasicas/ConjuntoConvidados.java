package br.com.dio.sets.OperacoesBasicas;

import java.util.*;

public class ConjuntoConvidados {
    //Atributos
    private Set<Convidado> convidadoSet;

    //Construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //Métodos
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoARemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoARemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoARemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        System.out.println("Convidados: ");
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        System.out.println("Convidados: ");
        conjuntoConvidados.exibirConvidados();
    }
}
