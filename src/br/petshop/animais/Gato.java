package br.petshop.animais;

public class Gato extends Animal {
    String tipoPelagem;

    public Gato(String nome, double peso, String tipoPelagem) {
        super(nome, peso);
        this.tipoPelagem = tipoPelagem;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    @Override
    public double calcularPrecoBase(){
    double precoBase = 0;

        if (tipoPelagem.equalsIgnoreCase("Curto")){
            precoBase = 45;
        } else if (tipoPelagem.equalsIgnoreCase("Longo")) {
            precoBase = 65;
        }
        return precoBase;
    }
}
