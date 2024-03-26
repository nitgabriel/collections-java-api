package br.com.dio.lists.Ordenacao;

import java.util.*;
public class OrdenacaoNumeros {
    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public List<Integer> ordernarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.integerList);

        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordernarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.integerList);
        Collections.sort(numerosDescendente, Collections.reverseOrder());
        return numerosDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(2);
        System.out.println("Números ordenados de forma ascendente: ");
        System.out.println(ordenacaoNumeros.ordernarAscendente());
        System.out.println("Números ordenados de forma descendente: ");
        System.out.println(ordenacaoNumeros.ordernarDescendente());
    }
}
