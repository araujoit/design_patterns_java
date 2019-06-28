package br.com.brjarvis.designpatterns.estrutural.adapter;

/**
 * <h1>Adapter Pattern</h1>
 * Um padrão de adaptador atua como um conector entre duas interfaces incompatíveis que, de outra forma, não podem ser conectadas diretamente.
 * <p/>
 * Um Adaptador envolve uma classe existente com uma nova interface para que ela se torne compatível com a interface do cliente.
 * <p/>
 * O motivo principal por trás do uso desse padrão é converter uma interface existente em outra interface que o cliente espera. Geralmente é implementado depois que o aplicativo é projetado.
 * <p/>
 *
 * Vantagens:
 * <ul>
 *     <li>Quando um componente externo fornece funcionalidade cativante que gostaríamos de reutilizar, mas é incompatível
 *     com nosso aplicativo atual . Um adaptador adequado pode ser desenvolvido para torná-los compatíveis entre si</li>
 *     <li>Quando nossa aplicação não é compatível com a interface que nosso cliente está esperando</li>
 *     <li>Quando queremos reutilizar código legado em nosso aplicativo sem fazer qualquer modificação no código original</li>
 * </ul>
 * @see <a href="https://www.baeldung.com/java-adapter-pattern">
 * https://www.baeldung.com/java-adapter-pattern
 * </a>
 */
public class AdapterTest {
    public static void main(String[] args) {
        final Movable bugattiVeyron = new BugattiVeyron();
        System.out.println("BugattiVeryon tem velocidade igual a " + bugattiVeyron.getSpeed() + " MP/H");
        final MovableAdapterImpl bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println("BugattiVeryon tem velocidade igual a " + bugattiVeyronAdapter.getSpeed() + " KM/H");

        if (431.30312 == bugattiVeyronAdapter.getSpeed())
            System.out.println("Velocidade convertida para " + bugattiVeyronAdapter.getSpeed());
        else System.out.println("Velocidade não convertida: " + bugattiVeyronAdapter.getSpeed());
    }
}
