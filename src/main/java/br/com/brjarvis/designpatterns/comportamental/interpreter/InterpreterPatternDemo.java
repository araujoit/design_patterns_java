package br.com.brjarvis.designpatterns.comportamental.interpreter;

/**
 * <h2>Interpreter Pattern</h2>
 * <p>
 * O padrão de intérprete fornece uma maneira de avaliar a gramática ou expressão da linguagem.
 * </p>
 * <p>
 * Este tipo de padrão está sob padrão comportamental.
 * </p>
 * <p>
 * Esse padrão envolve a implementação de uma interface de expressão que informa para interpretar um contexto específico.
 * </p>
 * <p>
 * Esse padrão é usado na análise SQL, no mecanismo de processamento de símbolos, etc.
 * </p>
 *
 * @see <a href="https://www.geeksforgeeks.org/interpreter-design-pattern/">
 * https://www.geeksforgeeks.org/interpreter-design-pattern/
 * </a>
 * @see <a href="https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm">
 * https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm
 * </a>
 */
public class InterpreterPatternDemo {

    /**
     * @param ignore
     */
    public static void main(String[] ignore) {
        Expression person1 = new TerminalExpression("Kushagra");
        Expression person2 = new TerminalExpression("Lokesh");
        Expression isSingle = new OrExpression(person1, person2);

        Expression vikram = new TerminalExpression("Vikram");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);

        System.out.println(isSingle.interpret("Kushagra"));
        System.out.println(isSingle.interpret("Lokesh"));
        System.out.println(isSingle.interpret("Achint"));

        System.out.println(isCommitted.interpret("Committed, Vikram"));
        System.out.println(isCommitted.interpret("Single, Vikram"));
    }
}
