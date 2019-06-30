package br.com.brjarvis.designpatterns.comportamental.visitor;

public class Engine {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
