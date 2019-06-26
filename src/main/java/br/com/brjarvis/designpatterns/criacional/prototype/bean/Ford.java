package br.com.brjarvis.designpatterns.criacional.prototype.bean;

public class Ford extends Carro {
    public Ford(String m) {
        nomeModelo = m;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
