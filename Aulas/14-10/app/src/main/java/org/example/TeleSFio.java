package org.example;

public class TeleSFio extends Telefone {

    private double frequencia;
    private int canais;
    private double distanciaOperacoes;

    public TeleSFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distanciaOperacoes) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacoes = distanciaOperacoes;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,Frequência= " + frequencia +
                ", Canais= " + canais +
                ", Distãncia de Operações= " + distanciaOperacoes;
    }
}
