package org.example;

public class Personagem {

    private String name;
    private double altura;
    private String arma;

    public void setNome (String nome){
        name = nome;
    }

    public void setAltura (double a){
        altura = a;
    }

    public void setArma (String arm){
        arma = arm;
    }

    public void trocarArma (String arm){
        arma = arm;
    }

    public String informaçãoPersnagem() {
        return this.name + " " + this.altura + " " + this.arma;
    }

}
