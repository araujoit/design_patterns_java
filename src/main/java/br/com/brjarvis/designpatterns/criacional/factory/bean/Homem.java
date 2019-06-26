package br.com.brjarvis.designpatterns.criacional.factory.bean;

public class Homem extends Pessoa {
    public Homem(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Olá Senhor " + this.nome;
    }
}
