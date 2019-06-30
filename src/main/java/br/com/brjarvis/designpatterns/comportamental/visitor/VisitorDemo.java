package br.com.brjarvis.designpatterns.comportamental.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        final Car car = new Car();

        final Visitor printVisitor = new PrintVisitor();
        final Visitor doVisitor = new DoVisitor();

        car.accept(printVisitor);
        car.accept(doVisitor);
    }
}
