package br.com.brjarvis.designpatterns.comportamental.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
