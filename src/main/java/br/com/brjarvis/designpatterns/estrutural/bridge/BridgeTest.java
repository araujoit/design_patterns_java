package br.com.brjarvis.designpatterns.estrutural.bridge;

/**
 * <h2>Bridge Pattern</h2>
 * <p>
 * Divide a lógica de negócios ou a classe enorme em hierarquias de classes separadas que podem ser desenvolvidas independentemente.
 *
 * @see <a href="https://refactoring.guru/design-patterns/bridge/java/example">
 * https://refactoring.guru/design-patterns/bridge/java/example
 * </a>
 */
public class BridgeTest {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        advancedRemote.device.printStatus();
    }
}
