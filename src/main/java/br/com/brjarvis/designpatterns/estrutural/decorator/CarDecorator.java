package br.com.brjarvis.designpatterns.estrutural.decorator;

/**
 * <h2>Decorator</h2>
 * Decorator implementa a interface do componente e possui uma relação HAS-A com a interface do componente. A variável
 * do componente deve estar acessível para as classes do decorador da criança, portanto, faremos essa variável protegida.
 */
public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
