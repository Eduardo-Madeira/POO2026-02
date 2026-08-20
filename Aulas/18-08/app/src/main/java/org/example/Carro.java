package org.example;

public class Carro {

    // Atributos
    private int veloAtual;

    // Métodos
    public void acelerar(int velocidade){
        veloAtual = Math.min(veloAtual+velocidade, 100)
    }

    public void frear(int freagem){
        if (veloAtual - freagem >= 0){
            veloAtual -= freagem;
        } else{
            veloAtual = 0;
        }

    }

    public int getVeloAtual() {
        return veloAtual;
    }
}
