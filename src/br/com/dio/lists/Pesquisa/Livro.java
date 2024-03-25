package br.com.dio.lists.Pesquisa;


public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;


    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Ano de Publicação='" + anoPublicacao +
                '}';
    }
}
