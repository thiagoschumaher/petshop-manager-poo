package br.petshop.animais;

public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPrecoBase() {
        double precoBase;

        if (peso <= 10){
            precoBase = 40;
        } else if (peso <= 25) {
            precoBase = 60;
        } else {
            precoBase = 85;
        }

        return precoBase;
    }

}
