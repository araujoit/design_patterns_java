package br.com.brjarvis.designpatterns.estrutural.flyweigth;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Fábrica para manipular objetos instanciação e cache
 */
public class VehicleFactory {
    private static Map<Color, Vehicle> vehiclesCache
            = new HashMap<>();

    public static Vehicle createVehicle(Color color) {
        Vehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor -> {
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });

        System.out.println("Cache of vehicles contains " + vehiclesCache.size() + " itens...");
        return newVehicle;
    }
}
