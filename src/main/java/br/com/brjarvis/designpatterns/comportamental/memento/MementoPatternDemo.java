package br.com.brjarvis.designpatterns.comportamental.memento;

/**
 * <p>
 * O padrão de lembrança é usado para restaurar o estado de um objeto para um estado anterior.
 * </p>
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/memento_pattern.htm">
 * https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
 * </a>
 */
public class MementoPatternDemo {

    /**
     * <p>
     * <h2>O padrão Memento usa três classes de atores.</h2>
     * </p>
     * <p>
     * Memento contém o estado de um objeto a ser restaurado.
     * O originador cria e armazena estados em objetos Memento e o objeto Caretaker é responsável
     * por restaurar o estado do objeto do Memento.
     * </p>
     * <p>
     * Nós criamos as classes Memento, Originador e CareTaker.
     * </p>
     */
    public static void main(String[] ignore) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
