package br.com.brjarvis.designpatterns.comportamental.state;

/**
 * <p>
 * No padrão de estado, um comportamento de classe muda com base em seu estado.
 * Esse tipo de padrão de design vem sob padrão de comportamento.
 * </p>
 * <p>
 * Em Padrão de estado, criamos objetos que representam vários estados e um objeto
 * de contexto cujo comportamento varia conforme o objeto de estado é alterado.
 * </p>
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm">
 * https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm
 * </a>
 */
public class StatePatternDemo {
    /**
     *
     * @param ignore
     */
    public static void main(String[] ignore) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
