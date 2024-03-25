package br.com.dio.lists.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> integerList;

    public SomaNumeros() {this.integerList = new ArrayList<>();}

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : integerList) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        for (Integer numero : integerList) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        for (Integer numero : integerList) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return integerList;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "integerList=" + integerList +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Números: " + somaNumeros.exibirNumeros());
    }
}
