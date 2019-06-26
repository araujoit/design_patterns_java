package br.com.brjarvis.designpatterns.criacional.factory;

import br.com.brjarvis.designpatterns.criacional.factory.FactoryPessoa;
import br.com.brjarvis.designpatterns.criacional.factory.bean.Pessoa;

/**
 * <b>FatoryMethod</b>
 * <p>
 * O Factory Method é bastante utilizado em diversos projetos, até mesmo nos casos em que temos apenas um
 * Creator (diagrama acima), pois mesmo nessas condições o padrão nos oferece um meio de desligar a implementação
 * de um Product. Adicionando ou alterando Products isso não irá afetar o Creator, pois eles não estão fortemente ligados.
 * <p>
 * Com o padrão Factory Method podemos encapsular o código que cria objetos. É muito comum termos classes que
 * instanciam classes concretas e essa parte do código normalmente sofre diversas modificações, portanto nesses casos
 * usamos um Factory Method que encapsula esse comportamento de instanciação.
 * <p>
 * Usando o Factory Method temos o nosso código de criação em um objeto ou método, evitando assim a duplicação ealém
 * disso temos um local único para fazer manutenção. O padrão também nos dá um código flexível e extensível para o futuro.
 *
 * @link https://www.devmedia.com.br/padrao-de-projeto-factory-method-em-java/26348
 */
public class FactoryMethodExample {

    public static class TesteApp {
        public static void main(String[] args) {
            final String nome = "Carlos";
            final String sexo = "M";

            final Pessoa pessoa = new FactoryPessoa().getPessoa(nome, sexo);
            System.out.println(pessoa);
        }
    }
}
