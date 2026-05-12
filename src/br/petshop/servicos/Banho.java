package br.petshop.servicos;

import br.petshop.animais.Animal;
import br.petshop.animais.Passaro;

import javax.swing.JOptionPane;

public class Banho extends Servico {

    public Banho(String descricao, int duracaoMinutos) {
        super(descricao, duracaoMinutos);
    }

    @Override
    public double calcularCusto(Animal a) {

        if (a instanceof Passaro) {
            JOptionPane.showMessageDialog(null, "Atenção: Pássaros não aceitam o serviço de banho.");
            return 0.0;
        }

        return a.calcularPrecoBase() + (this.duracaoMinutos * 0.50);
    }
}
