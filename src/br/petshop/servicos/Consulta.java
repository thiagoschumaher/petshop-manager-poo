package br.petshop.servicos;
import br.petshop.animais.Animal;

public class Consulta extends Servico {

    public Consulta(String descricao, int duracaoMinutos, Animal animal) {
        super(descricao, duracaoMinutos, animal);
    }

    @Override
    public double calcularCusto(Animal a) {
        return a.calcularPrecoBase() + 35.00;
    }
}
