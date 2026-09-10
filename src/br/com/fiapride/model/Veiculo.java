package br.com.fiapride.model;

public class Veiculo {

    private final String proprietario;
    private final String placa;
    private double nivelCombustivel;

    public Veiculo(String proprietario, String placa) {
        if (proprietario == null || proprietario.isBlank()) {
            throw new IllegalArgumentException("O proprietario nao pode ser vazio.");
        }
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa nao pode ser vazia.");
        }
        this.proprietario = proprietario;
        this.placa = placa;
        this.nivelCombustivel = 0;
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void adicionarCombustivel(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("A quantidade adicionada deve ser maior que zero.");
        }
        this.nivelCombustivel += litros;
    }

    public void consumirCombustivel(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("A quantidade consumida deve ser maior que zero.");
        }
        if (litros > this.nivelCombustivel) {
            throw new IllegalArgumentException(
                "Combustivel insuficiente: disponivel " + this.nivelCombustivel + "L, solicitado " + litros + "L.");
        }
        this.nivelCombustivel -= litros;
    }

    @Override
    public String toString() {
        return "Dono: " + proprietario + " | Placa: " + placa + " | Gasolina: " + nivelCombustivel;
    }
}
