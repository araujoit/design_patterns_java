package br.com.brjarvis.designpatterns.criacional.abstractfactory.bean;

import br.com.brjarvis.designpatterns.criacional.abstractfactory.bean.Animal;

/**
 * Implementação de animal
 */
public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
