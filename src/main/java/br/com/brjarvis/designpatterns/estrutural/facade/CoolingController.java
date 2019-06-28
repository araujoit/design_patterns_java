package br.com.brjarvis.designpatterns.estrutural.facade;

public class CoolingController {
    public void setTemperatureUpperLimit(int defaultCoolingTemp) {
        System.out.println("Setting cooling temperature upper limit " + defaultCoolingTemp);
    }

    public void run() {
        System.out.println("Run cooling");
    }

    public void cool(int maxAllowedTemp) {
        System.out.println("Cooling to maxTemperature " + maxAllowedTemp);
    }

    public void stop() {
        System.out.println("Stopping cooling");
    }
}
