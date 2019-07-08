package br.com.brjarvis.designpatterns.comportamental.chain;

/**
 * <p>
 * Como o nome sugere, o pattern cria uma cadeia de objetos receptores para uma solicitação.
 * </p>
 * <p>
 * Esse pattern separa o remetente e destinatário de uma solicitação com base no tipo de solicitação.
 * </p>
 * <p>Nesse pattern, normalmente cada receptor contém referência a outro receptor. Se um objeto não puder
 * manipular a soliciação, ele passará o mesmo para o próximo receptor e assim por diante.
 * </p>
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm">
 * https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm
 * </a>
 */
public class ChainPatternDemo {

    private static AbstractLogger gerChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = gerChainOfLoggers();

//        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
//        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

    }
}
