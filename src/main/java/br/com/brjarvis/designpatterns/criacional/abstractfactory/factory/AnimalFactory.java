package br.com.brjarvis.designpatterns.criacional.abstractfactory.factory;

import br.com.brjarvis.designpatterns.criacional.abstractfactory.bean.Animal;
import br.com.brjarvis.designpatterns.criacional.abstractfactory.bean.Dog;
import br.com.brjarvis.designpatterns.criacional.abstractfactory.bean.Duck;

/**
 * Implementação de Factory
 */
public class AnimalFactory implements AbstractFactory<Animal> {

    /**
     * Utilizado na definição de animal
     *
     * @param animal Animal
     * @return objeto animal
     */
    @Override
    public Animal create(String animal) {
        if ("Dog".equalsIgnoreCase(animal))
            return new Dog();
        else if ("Duck".equalsIgnoreCase(animal))
            return new Duck();

        return null;
    }
}
