package br.petshop.servicos;

import br.petshop.animais.Animal;

public class Atendimento {

    private Animal animal;
    private Servico servico;

    public Atendimento(Animal animal, Servico servico) {
        this.animal = animal;
        this.servico = servico;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }


    @Override
    public String toString() {
        return "Atendimento {" +
                ", Animal=" + animal + // Vai chamar o toString() da classe Animal
                ", Servico=" + servico + // Vai chamar o toString() da classe Servico
                '}';
    }
}