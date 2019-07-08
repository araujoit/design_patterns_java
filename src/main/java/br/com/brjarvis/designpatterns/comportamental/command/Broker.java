package br.com.brjarvis.designpatterns.comportamental.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de chamado de comando.
 * Invoker
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
