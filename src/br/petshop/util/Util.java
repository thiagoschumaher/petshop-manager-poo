package br.petshop.util;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    public void menu(){
        int opcao = 0;
        String aux;

        aux = """
                [1] Cadastrar Animal
                [2] Cadastrar Serviço
                [3] Calcular Conta Total
                [4] Imprimir Relatório
                [5] Finalizar
                """;

        do {
            try {

            opcao = parseInt(showInputDialog(aux));
            }
            catch (NumberFormatException e) {
                showMessageDialog(null, "Você deve digitar um valor i");
            }
        } while (opcao != 5);
    }
}
