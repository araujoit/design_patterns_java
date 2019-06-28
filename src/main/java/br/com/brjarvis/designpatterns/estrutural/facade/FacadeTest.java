package br.com.brjarvis.designpatterns.estrutural.facade;

/**
 * <h2>Facade Pattern</h2>
 * <p>
 * Encapsula um subsistema complexo por trás de uma interface simples.
 * Ele esconde grande parte da complexidade e torna o subsistema fácil de usar.
 * <p>
 * Além disso, se precisarmos usar o subsistema complexo diretamente,
 * ainda podemos fazer isso; não somos obrigados a usar a fachada o tempo todo.
 * <p>
 * Além de uma interface muito mais simples, há mais um benefício de usar esse padrão de design.
 * Ele separa uma implementação do cliente do subsistema complexo. Graças a isso, podemos
 * fazer alterações no subsistema existente e não afetar um cliente.
 *
 * @see <a href="https://www.baeldung.com/java-facade-pattern">
 * https://www.baeldung.com/java-facade-pattern
 * </a>
 */
public class FacadeTest {
    public static void main(String[] args) {
        final CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        carEngineFacade.stopEngine();
    }
}
