package br.com.brjarvis.designpatterns.criacional.abstractfactory;

import br.com.brjarvis.designpatterns.criacional.abstractfactory.factory.AbstractFactory;
import br.com.brjarvis.designpatterns.criacional.abstractfactory.factory.FactoryProvider;

import java.awt.*;
import java.util.Optional;

/**
 * Quando usar o padrão de fábrica abstrata:
 * <li> O cliente é independente de como criamos e compomos os objetos no sistema </ li>
 * <li> O sistema consiste em várias famílias de objetos, e essas famílias são projetadas para serem usadas juntas </ li>
 * <li> Precisamos de um valor de tempo de execução para construir uma dependência específica </ li>
 */
@SuppressWarnings("WeakerAccess")
public class AbstractFactoryExample {

    /**
     * Exemplo de uso
     *
     * @param ignore não utilizado
     */
    public static void main(String[] ignore) {
        final Optional<AbstractFactory> optionalColor = Optional
                .ofNullable(FactoryProvider.getFactory("Color"));

        if (optionalColor.isPresent()) {
            final Color color = (Color) optionalColor.get().create("AMARELO");
            if (color != null) {
                System.out.println(color);
                return;
            }
        }

        System.err.println("Falha ao tentar criar cor");
    }
}
