package br.com.brjarvis.designpatterns.estrutural.flyweigth;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <h2>FlyWeigth Pattern</h2>
 * <p>
 * Esse padrão é usado para reduzir o consumo de memória. Ele também pode melhorar o desempenho em aplicativos em que a instanciação de objetos é cara.
 * <p>
 * Simplificando, o padrão flyweight é baseado em uma fábrica que recicla os objetos criados armazenando-os após a criação.
 * Cada vez que um objeto é solicitado, a fábrica consulta o objeto para verificar se ele já foi criado. Se tiver, o
 * objeto existente será retornado - caso contrário, um novo será criado, armazenado e, em seguida, retornado.
 * <p>
 * É muito importante que os objetos flyweight sejam imutáveis: qualquer operação no estado deve ser executada pela fábrica.
 *
 *
 * Casos de Uso:
 * <ul>
 *     <li>Compressão de dados</li>
 *     <ul>
 *         <li>O objetivo do padrão flyweight é reduzir o uso de memória compartilhando o máximo de dados possível,
 *         portanto, é uma boa base para algoritmos de compactação sem perdas. Nesse caso, cada objeto flyweight atua
 *         como um ponteiro, com seu estado extrínseco sendo a informação dependente do contexto.</li>
 *     </ul>
 *     <li>Cache de dados</li>
 *     <ul>
 *         <li>Muitos aplicativos modernos usam caches para melhorar o tempo de resposta. O padrão flyweight é
 *         semelhante ao conceito central de um cache e pode se encaixar bem nesse propósito.
 *         Naturalmente, existem algumas diferenças importantes na complexidade e na implementação entre esse padrão
 *         e um típico cache de uso geral.</li>
 *     </ul>
 * </ul>
 *
 * @see <a href="https://www.baeldung.com/java-flyweight">
 *     https://www.baeldung.com/java-flyweight
 *     </a>
 */
public class FlyWeigthTest {
    public static void main(String[] args) {
        final List<Vehicle> list = new ArrayList<>();

        list.add(VehicleFactory.createVehicle(Color.BLACK));
        list.add(VehicleFactory.createVehicle(Color.BLUE));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));
        list.add(VehicleFactory.createVehicle(Color.GRAY));

        System.out.println("\nCreated " + list.size() + " vehicles...");

        list.parallelStream().forEach(vehicle -> {
            vehicle.start();
            vehicle.stop();
        });
    }
}
