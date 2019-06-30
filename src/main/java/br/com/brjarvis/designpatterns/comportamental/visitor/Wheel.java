package br.com.brjarvis.designpatterns.comportamental.visitor;

public class Wheel {
    private String name;

    Wheel(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
