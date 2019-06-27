package br.com.brjarvis.designpatterns.estrutural.decorator;

/**
 * <h2>Component Implementation</h2>
 * A implementação básica da interface do componente. Podemos ter BasicCarclasse como nossa implementação de componentes.
 */
public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
