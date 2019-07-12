package br.com.brjarvis.designpatterns.comportamental.state;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop context");
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
