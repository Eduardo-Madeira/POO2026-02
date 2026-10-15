package org.example;

public class Dimensao {
    private float altura;
    private float largura;
    private float profundidade;

    public Dimensao(float altura, float largura, float profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return " ,Altura= " + altura +
                ", Largura= " + largura +
                ", Profundidade= " + profundidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }
}
