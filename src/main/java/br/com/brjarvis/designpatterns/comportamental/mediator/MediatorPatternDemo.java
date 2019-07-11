package br.com.brjarvis.designpatterns.comportamental.mediator;

/**
 * <p>
 * <b>A intenção do Padrão Mediador é reduzir a complexidade e as dependências entre objetos fortemente acoplados que se comunicam diretamente uns com os outros .</b>
 * </p>
 * <p>
 * Isto é conseguido através da criação de um objeto mediador que cuida da interação entre objetos dependentes. Consequentemente, toda a comunicação passa pelo mediador.
 * </p>
 *
 * @see <a href="https://www.baeldung.com/java-mediator-pattern">https://www.baeldung.com/java-mediator-pattern</a>
 * @see <a href="https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm">
 * https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm
 * </a>
 */
public class MediatorPatternDemo {

    /**
     * <p>
     * Imagine que estamos construindo um sistema de refrigeração simples que consiste em um ventilador,
     * uma fonte de alimentação e um botão. Pressionar o botão liga ou desliga o ventilador.
     * </p>
     * <p>
     * Antes de ligarmos o ventilador, precisamos ligar a energia. Da mesma forma,
     * temos que desligar a energia logo após o ventilador ser desligado.
     * </p>
     */
    public static void main(String[] ignore) {
        final User robert = new User("Robert");
        final User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
