package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Carlos", "ABC-1234");

        v1.adicionarCombustivel(50);

        try {
            v1.consumirCombustivel(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Operacao bloqueada: " + e.getMessage());
        }

        System.out.println("Dono: " + v1.getProprietario() + " | Placa: " + v1.getPlaca()
                + " | Gasolina: " + v1.getNivelCombustivel());
    }
}
