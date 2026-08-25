package org.example;

public class Caneta {

    private String cor; // Definido como padrão "null"
    private double nivelTinta; // Definido como padrão 0
    private final double CONSUMO = 0.01;

    public Caneta(String cor, int nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }

    public Caneta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
        cor = "azul";
    }

    public Caneta() {
        cor = "azul";
        nivelTinta = 100;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public String toString(){
        return "cor: " + cor + "\nTinta: " + nivelTinta;
    }

    // Metodo desenhar que recebe as coordenadas iniciais e final
    // se houver tinta suficiente, debite o consumo e retorne qual foi o consumo
    // se não houver tinra suficiente, retorne -1

    public double desenhar (int x1, int x2, int y1, int y2){

        double gasto = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        gasto = gasto*CONSUMO;

        if (nivelTinta < gasto){
            return -1;
        }

        nivelTinta = nivelTinta - gasto;
        return gasto;
    }
}
