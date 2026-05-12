package br.petshop.servicos;

import br.petshop.animais.Animal;

public abstract class Servico {
    protected String descricao;
    protected int duracaoMinutos;

    public Servico(String descricao, int duracaoMinutos) {
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }


    public abstract double calcularCusto(Animal a);
}
