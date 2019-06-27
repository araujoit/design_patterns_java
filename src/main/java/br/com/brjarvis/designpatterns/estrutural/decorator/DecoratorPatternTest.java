package br.com.brjarvis.designpatterns.estrutural.decorator;

/**
 * <h2>Padrão Decorator</h2>
 * <p>
 * Suponha que queremos implementar diferentes tipos de carros - podemos criar interface de carro para definir o
 * método de montagem e, em seguida, podemos ter um carro básico, ainda mais podemos estendê-lo para carros esportivos
 * e carros de luxo. A hierarquia de implementação será semelhante à imagem abaixo.
 * </p>
 * <p>
 * <h2>Estrutura de herança:</h2>
 * <ul>
 * <li>Car</li>
 * <ul>
 * <li>Basic Car</li>
 * <ul>
 * <li>Sports Car</li>
 * <li>Luxury Car</li>
 * </ul>
 * </ul>
 * </ul>
 * <p>
 * Mas se quisermos ter um carro em tempo de execução que tenha os recursos do carro esportivo e do carro de luxo,
 * a implementação se torna complexa e, se quisermos especificar quais recursos devem ser adicionados primeiro,
 * fica ainda mais complexo. Agora imagine se tivermos dez tipos diferentes de carros, a lógica de implementação
 * usando herança e composição será impossível de gerenciar. Para resolver esse tipo de situação de programação,
 * aplicamos o padrão de decorador em java.
 * </p>
 *
 * @see <a href="https://www.journaldev.com/1540/decorator-design-pattern-in-java-example">https://www.journaldev.com/1540/decorator-design-pattern-in-java-example</a>
 */
public class DecoratorPatternTest {

    public static void main(String[] args) {
        final Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        final Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
