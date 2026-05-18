package br.petshop;

import br.petshop.animais.Animal;
import br.petshop.servicos.Atendimento;
import br.petshop.servicos.Servico;
import br.petshop.interfaces.Calculavel;
import br.petshop.interfaces.Relatorio;

import java.util.ArrayList;

public class PetShop implements Relatorio, Calculavel {

    private ArrayList<Animal> animais;
    private ArrayList<Servico> servicos;
    private ArrayList<Atendimento> atendimentos;

    public PetShop() {
        this.animais = new ArrayList<>();
        this.servicos = new ArrayList<>();
        this.atendimentos = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    @Override
    public double calcularTotal() {
        double total = 0;

        for (Atendimento a : atendimentos) {
            total += a.getServico().calcularCusto(a.getAnimal());
        }
        return total;
    }

    @Override
    public String gerarResumo() {
        String resumo = "RELATÓRIO DO PETSHOP\n\n";
        for (Animal a : animais) {
            resumo += "Animal: " + a.getNome() + "\n";
            resumo += "Preço Base: R$ " + a.calcularPrecoBase() + "\n\n";
        }
        return resumo;
    }
}
