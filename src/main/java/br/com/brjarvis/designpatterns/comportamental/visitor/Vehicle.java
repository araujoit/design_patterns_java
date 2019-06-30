package br.com.brjarvis.designpatterns.comportamental.visitor;

public class Vehicle {
    protected Engine engine = new Engine();
    protected Body body = new Body();
    protected Wheel[] wheels;

    public Engine getEngine() {
        return this.engine;
    }

    public Body getBody() {
        return this.body;
    }

    public Wheel[] getWheels() {
        return this.wheels;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
