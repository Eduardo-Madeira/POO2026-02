package org.example;

public class Pessoa {

    private static int contador = 1;
    private  int id;
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.id = contador++;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa =:" + "\n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "E-mail: " + email + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }
}
