package br.com.brjarvis.designpatterns.comportamental.state;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start context");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
