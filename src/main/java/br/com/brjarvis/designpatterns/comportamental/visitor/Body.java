package br.com.brjarvis.designpatterns.comportamental.visitor;

public class Body {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
