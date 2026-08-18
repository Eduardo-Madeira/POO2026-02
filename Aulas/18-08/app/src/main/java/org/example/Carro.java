package org.example;

public class Carro {

    // Atributos
    private int veloAtual;

    // Métodos
    public void acelerar(int velocidade){
        veloAtual+= velocidade;
        if (veloAtual > 100){
            veloAtual = 100;
        } else{

        }

    }

    public int getVeloAtual() {
        return veloAtual;
    }
}
