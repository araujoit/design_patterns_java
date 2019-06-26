package br.com.brjarvis.designpatterns.criacional.factory.bean;

public class Mulher extends Pessoa {
    public Mulher(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Olá senhora " + this.nome;
    }
}
