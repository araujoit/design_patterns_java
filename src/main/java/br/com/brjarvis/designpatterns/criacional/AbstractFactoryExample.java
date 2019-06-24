package br.com.brjarvis.designpatterns.criacional;

import java.awt.*;
import java.util.Optional;

/**
 * When to Use Abstract Factory Pattern:
 * <li>The client is independent of how we create and compose the objects in the system</li>
 * <li>The system consists of multiple families of objects, and these families are designed to be used together</li>
 * <li>We need a run-time value to construct a particular dependency</li>
 */
@SuppressWarnings("WeakerAccess")
public class AbstractFactoryExample {

    /**
     * Interface base
     */
    @SuppressWarnings("unused")
    public interface Animal {
        String getAnimal();

        String makeSound();
    }

    /**
     * Implementação de animal
     */
    public static class Duck implements Animal {

        @Override
        public String getAnimal() {
            return "Duck";
        }

        @Override
        public String makeSound() {
            return "Squeks";
        }
    }

    /**
     * Implementação de animal
     */
    public static class Dog implements Animal {

        @Override
        public String getAnimal() {
            return "Dog";
        }

        @Override
        public String makeSound() {
            return "Woof";
        }
    }

    /**
     * AbstractFactory utilizada na implementação de Factory diversa
     *
     * @param <T>
     */
    public interface AbstractFactory<T> {
        T create(String type);
    }

    /**
     * Implementação de Factory
     */
    public static class AnimalFactory implements AbstractFactory<Animal> {

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

    /**
     * Implementação de Factory
     */
    public static class ColorFactory implements AbstractFactory<Color> {

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

    /**
     * Utilizado para instanciar implementações de Factory
     */
    public static class FactoryProvider {
        /**
         * @param choice option defined
         * @return AbstractFactory baseado nas implementações
         */
        public static AbstractFactory getFactory(String choice) {
            if ("Animal".equalsIgnoreCase(choice))
                return new AnimalFactory();
            else if ("Color".equalsIgnoreCase(choice))
                return new ColorFactory();
            return null;
        }
    }

    /**
     * Exemplo de uso
     *
     * @param ignore não utilizado
     */
    public static void main(String[] ignore) {
        final Optional<AbstractFactory> optionalColor = Optional
                .ofNullable(FactoryProvider.getFactory("Color"));

        if (optionalColor.isPresent()) {
            final Color color = (Color) optionalColor.get().create("AMARELO");
            if (color != null) {
                System.out.println(color);
                return;
            }
        }

        System.err.println("Falha ao tentar criar cor");
    }
}
