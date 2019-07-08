package br.com.brjarvis.designpatterns.comportamental.command;

/**
 * Classe concreta de venda
 */
public class SellStock implements Order {
    private final Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
