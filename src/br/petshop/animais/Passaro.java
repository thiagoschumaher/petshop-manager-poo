package br.petshop.animais;

public class Passaro extends Animal{

    public Passaro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPrecoBase() {
        double precoBase = 30;
        return precoBase;
    }
}
