package br.com.brjarvis.designpatterns.estrutural.facade;

public class FuelInjector {
    public void on() {
        System.out.println("On Fuel Injector");
    }

    public void inject() {
        System.out.println("Injecting Fuel");
    }

    public void off() {
        System.out.println("Off Fuel Injector");
    }
}
