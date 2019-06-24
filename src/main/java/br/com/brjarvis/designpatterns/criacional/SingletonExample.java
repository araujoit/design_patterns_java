package br.com.brjarvis.designpatterns.criacional;

/**
 * Constrói uma instância única para o projeto inteiro.
 */
public class SingletonExample {
    private static SingletonExample instance;

    /**
     * Construtor necessário para impedir criação de outras instâncias.
     */
    private SingletonExample() {
        super();
    }

    /**
     * Define uma instância única, caso não exista, para o projeto.
     *
     * @return a instância única no projeto
     */
    public static SingletonExample getInstance() {
        if (instance == null)
            instance = new SingletonExample();
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonExample{}";
    }
}