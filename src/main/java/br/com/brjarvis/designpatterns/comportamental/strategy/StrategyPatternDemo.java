package br.com.brjarvis.designpatterns.comportamental.strategy;

/**
 * No pattern Strategy, um comportamento de classe ou seu algoritmo pode ser alterado no tempo de execução.
 * Neste pattern criamos objetos que representam várias estratégias e um objeto de contexto cujo comportamento varia.
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm">
 * https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 * </a>
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
