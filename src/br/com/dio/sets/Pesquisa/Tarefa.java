package br.com.dio.sets.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean finalizada;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.finalizada = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public String toString() {
        return "Tarefa: {" +
                "descricao='" + descricao + '\'' +
                ", finalizada=" + finalizada +
                '}';
    }
}
