package br.com.brjarvis.designpatterns.criacional;

/**
 * Constrói uma instância única para o projeto inteiro.
 */
public class Singleton {
    private static Singleton instance;

    /**
     * Construtor necessário para impedir criação de outras instâncias.
     */
    private Singleton() {
        super();
    }

    /**
     * Define uma instância única, caso não exista, para o projeto.
     *
     * @return a instância única no projeto
     */
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{}";
    }
}