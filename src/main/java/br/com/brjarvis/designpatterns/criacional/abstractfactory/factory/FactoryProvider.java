package br.com.brjarvis.designpatterns.criacional.abstractfactory.factory;

/**
 * Utilizado para instanciar implementações de Factory
 */
public class FactoryProvider {
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
