package br.com.brjarvis.designpatterns.estrutural.flyweigth;

import java.awt.*;

/**
 * Interface que define as operações que o código do cliente pode executar no objeto flyweight
 */
public interface Vehicle {
    void start();

    void stop();

    Color getColor();
}
