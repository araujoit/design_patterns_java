package br.com.brjarvis.designpatterns.estrutural.flyweigth;

import java.awt.*;

/**
 * Implementação concreta de nossa interface
 */
public class Car implements Vehicle {
    private Engine engine;
    private Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Starting Car... " + color);
    }

    @Override
    public void stop() {
        System.out.println("Stopping Car..." + color);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
