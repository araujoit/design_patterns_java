package br.com.brjarvis.designpatterns.criacional.prototype.bean;

import java.util.Random;

public abstract class Carro implements Cloneable {
    public String nomeModelo;
    public int preco;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public static int setPreco() {
        int preco = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        preco = p;

        return preco;
    }

    public Carro clone() throws CloneNotSupportedException {
        return (Carro) super.clone();
    }
}
