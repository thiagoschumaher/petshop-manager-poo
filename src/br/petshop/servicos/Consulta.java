package br.petshop.servicos;
import br.petshop.animais.Animal;

public class Consulta extends Servico {

    public Consulta(String descricao, int duracaoMinutos) {
        super(descricao, duracaoMinutos);
    }

    @Override
    public double calcularCusto(Animal a) {
        return a.calcularPrecoBase() + 35.00;
    }
}
