package br.com.brjarvis.designpatterns.estrutural.decorator;

/**
 * <h2>Concrete Decorator</h2>
 * Estendendo a funcionalidade do decorador de base e modificando o comportamento do componente de acordo,
 * podemos ter classes concretas de decorator como LuxuryCar
 */
public class LuxuryCar extends CarDecorator {
    protected boolean luxurySteeringWheel;

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
        luxurySteeringWheel = true;
    }
}
