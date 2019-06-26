package br.com.brjarvis.designpatterns.criacional.abstractfactory.factory;

/**
 * AbstractFactory utilizada na implementação de Factory diversa
 *
 * @param <T>
 */
public interface AbstractFactory<T> {
    T create(String type);
}
