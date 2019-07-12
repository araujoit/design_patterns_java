package br.com.brjarvis.designpatterns.comportamental.observer;

/**
 * Padrão de observador é usado quando há relação um-para-muitos entre objetos,
 * como se um objeto fosse modificado,seus objetos dependentes deveriam ser notificados automaticamente.
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/observer_pattern.htm">
 * https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 * </a>
 */
public class ObserverPatternDemo {
    /**
     * @param ignore
     */
    public static void main(String[] ignore) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
