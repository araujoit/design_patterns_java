package br.com.brjarvis.designpatterns.criacional.abstractfactory.factory;

import java.awt.*;

/**
 * Implementação de Factory
 */
public class ColorFactory implements AbstractFactory<Color> {

    /**
     * Utilizado na criação de cor
     *
     * @param color cor
     * @return objeto de cor
     */
    @Override
    public Color create(String color) {
        if ("Amarelo".equalsIgnoreCase(color))
            return Color.YELLOW;
        else if ("Azul".equalsIgnoreCase(color))
            return Color.BLUE;
        return null;
    }
}