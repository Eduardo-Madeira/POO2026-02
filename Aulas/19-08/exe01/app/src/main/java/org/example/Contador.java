package org.example;

public class Contador {

    private int valorAtual;

    public void definirValor (int add){
        valorAtual += add;
    }

    public void add (){
        valorAtual ++;
    }

    public void zerar(){
        valorAtual = 0;
    }

    public int getValorAtual() {
        return valorAtual;
    }
}