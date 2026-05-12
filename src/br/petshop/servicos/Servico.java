package br.petshop.servicos;

import br.petshop.animais.Animal;

public abstract class Servico {
    protected String descricao;
    protected int duracaoMinutos;
    protected  Animal animal;

    public Servico(String descricao, int duracaoMinutos, Animal animal) {
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
        this.animal = animal;
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public abstract double calcularCusto(Animal a);
}
