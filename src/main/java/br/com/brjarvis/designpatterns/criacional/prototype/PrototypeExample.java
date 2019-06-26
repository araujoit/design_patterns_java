package br.com.brjarvis.designpatterns.criacional.prototype;

import br.com.brjarvis.designpatterns.criacional.prototype.bean.Carro;
import br.com.brjarvis.designpatterns.criacional.prototype.bean.Chevrolet;
import br.com.brjarvis.designpatterns.criacional.prototype.bean.Ford;

/**
 * <b>Prototype</b>
 * <p>
 * O GoF define o Prototype como um padrão que especifica os tipos de objetos a
 * serem criados utilizando um protótipo. O padrão oferece um método alternativo para instanciar
 * novos objetos através da cópia ou clone de uma instância existente. A criação de uma nova
 * instância é bastante custosa, assim esse padrão ajuda a resolver esse problema.
 *
 * @link https://www.devmedia.com.br/implementando-padroes-criacionais-em-java/34185
 */
public class PrototypeExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Exemplo do padrão Prototype***\n");

        final Carro chevrolet = new Chevrolet("Cruze Sport v6");
        chevrolet.preco = 100000;
        final Carro ford = new Ford("Focus 2.0");
        ford.preco = 500000;

        //Clone do Objeto Chevrolet
        Carro bc1 = chevrolet.clone();

        //Configurando preço que será maior que 100000
        bc1.preco = chevrolet.preco + Carro.setPreco();
        System.out.println("Nome do Carro: " + bc1.getNomeModelo() + ", Preço do Carro: " + bc1.preco);

        //Clone do Objeto Ford
        bc1 = ford.clone();

        //Configurando preço que será maior que 500000
        bc1.preco = ford.preco + Carro.setPreco();
        System.out.println("Nome do Carro: " + bc1.getNomeModelo() + ", Preço do Carro: " + bc1.preco);
    }
}
