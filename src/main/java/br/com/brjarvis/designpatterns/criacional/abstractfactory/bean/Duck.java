package br.com.brjarvis.designpatterns.criacional.abstractfactory.bean;

/**
 * Implementação de animal
 */
public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}
