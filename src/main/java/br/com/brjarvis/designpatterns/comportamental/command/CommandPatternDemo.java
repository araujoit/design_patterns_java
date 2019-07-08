package br.com.brjarvis.designpatterns.comportamental.command;

/**
 * <p>
 * Padrão de design baseado em dados e cai na categoria de padrão comportamental.
 * </p>
 * <p>
 * Um pedido é empacotado sob um objeto como comando e passado para o objeto invocador.
 * </p>
 * <p>
 * O objeto invoker procura o objeto apropriado que pode manipular este comando e passa
 * o comando para o objeto correspondente que executa o comando.
 * </p>
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/command_pattern.htm">
 * https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 * </a>
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
