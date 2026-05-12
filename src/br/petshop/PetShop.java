package br.petshop;

import br.petshop.animais.Animal;
import br.petshop.servicos.Servico;
import br.petshop.interfaces.Calculavel;
import br.petshop.interfaces.Relatorio;

import java.util.ArrayList;

public class PetShop implements Relatorio, Calculavel {

    private ArrayList<Animal> animais;
    private ArrayList<Servico> servicos;

    public PetShop() {
        this.animais = new ArrayList<>();
        this.servicos = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;

        for (Servico s : servicos) {
            total += s.calcularCusto(s.getAnimal());
        }

        return total;
    }

    // --- Implementação da Interface Relatorio ---
    @Override
    public String gerarResumo() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("=== RELATÓRIO DO PETSHOP ===\n\n");

        resumo.append("ANIMAIS ATENDIDOS:\n");
        for (Animal a : animais) {
            resumo.append("- ").append(a.getNome()).append(" (Peso: ").append(a.getPeso()).append("kg)\n");
        }

        resumo.append("\nSERVIÇOS PRESTADOS:\n");
        for (Servico s : servicos) {
            // Usa polimorfismo para pegar a descrição do serviço e o nome do animal associado
            resumo.append("- ").append(s.getDescricao())
                    .append(" para o animal: ").append(s.getAnimal().getNome())
                    .append(" | Custo: R$ ").append(String.format("%.2f", s.calcularCusto(s.getAnimal())))
                    .append("\n");
        }

        resumo.append("\n===========================\n");
        resumo.append("CONTA TOTAL DO DIA: R$ ").append(String.format("%.2f", calcularTotal()));

        return resumo.toString();
    }
}