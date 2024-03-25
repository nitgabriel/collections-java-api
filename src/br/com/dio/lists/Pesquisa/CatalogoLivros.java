package br.com.dio.lists.Pesquisa;

import java.util.*;
public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {this.catalogo = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int ano) {
        catalogo.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }

        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalo.add(livro);
                }
            }
        }

        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Java", "Deitel", 2021);
        catalogoLivros.adicionarLivro("Java", "Deitel", 2022);
        catalogoLivros.adicionarLivro("Spring", "Rod Johnson", 2021);
        catalogoLivros.adicionarLivro("Quarkus", "Rodrigo", 2023);
        catalogoLivros.adicionarLivro("JSF", "Rodrigo", 1994);
        System.out.println("Livros por autor: " + catalogoLivros.pesquisarPorAutor("Rodrigo"));
        System.out.println("Livros por intervalo de anos: " + catalogoLivros.pesquisarPorIntervaloAnos(2021, 2023));
        System.out.println("Livro por título: " + catalogoLivros.pesquisarPorTitulo("Java"));
    }
}
