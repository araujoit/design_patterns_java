package br.com.brjarvis.designpatterns.estrutural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>Proxy Pattern</h2>
 * <p>
 * O Pattern Proxy é um padrão Estrutural definido pelo GoF (Gang of Four). O seu objetivo principal é encapsular
 * um objeto através de um outro objeto que possui a mesma interface, de forma que o segundo objeto, conhecido
 * como “Proxy”, controla o acesso ao primeiro, que é o objeto real.
 *
 * <h3>Vantagens do Pattern Proxy</h3>
 * As principais vantagens de se utilizar o pattern Proxy são:
 * <p>
 * <ul>
 * <li>Permite deixar transparente o local (endereço) do objeto real. O cliente não precisa conhecer se o objeto
 * é remoto ou não, este tipo de proxy é conhecido como Remote Proxy.</li>
 * <li>O pattern Proxy é muito utilizado pela tecnologia J2EE, pelo objeto “javax.ejb.EJBObject”, que representa uma
 * referência remota ao EJB. Para o cliente que está utilizando a interface remote de um EJB, é transparente a chamada
 * remota ao servidor, permitindo que complexos sistemas distribuídos possam ser desenvolvidos como se fossem chamadas locais.</li>
 * <li>O consagrado framework Hibernate também utiliza o pattern Proxy, por exemplo, ao fazer o “lazy-loading”, técnica
 * utilizado para acessar o banco de dados apenas quando for necessário. Muitas vezes quando trabalhamos com o Hibernate,
 * e uma busca é realizada, por exemplo usando o método “session.load(id)”, um Proxy para o objeto real é retornado.
 * Neste caso o objeto ainda não está completamente preenchido, pois nenhum SQL foi realizado até este momento.
 * Apenas quando uma propriedade deste objeto (métodos getX) ou um relacionamento, como por exemplo
 * “empresa.getFuncionarios()” forem chamados, a consulta no banco será realizada. Tudo isto de forma transparente para o cliente.</li>
 * <li>Útil para realizar otimizações, como cache de objetos. Também pode ser implementado rotinas
 * de logs e controle de acesso (segurança). Este tipo de proxy é conhecido como Virtual Proxy.</li>
 * </ul>
 *
 * Exemplo adaptado de <a href="http://en.wikipedia.org/wiki/Proxy_pattern">http://en.wikipedia.org/wiki/Proxy_pattern</a>
 * @see <a href="https://www.devmedia.com.br/conheca-o-pattern-proxy-gof-gang-of-four/4066">https://www.devmedia.com.br/conheca-o-pattern-proxy-gof-gang-of-four/4066</a>
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        //Cria cada Proxy para encapsular o acesso a classe "PessoaImpl"
        pessoas.add(new ProxyPessoa("A"));
        pessoas.add(new ProxyPessoa("B"));
        pessoas.add(new ProxyPessoa("C"));

        System.out.println("Nome: " + pessoas.get(0).getNome());
        // busca do banco de dados
        System.out.println("Nome: " + pessoas.get(1).getNome());
        // busca do banco de dados
        System.out.println("Nome: " + pessoas.get(0).getNome());
        // já buscou esta pessoa... apenas retorna do cache...

        // A terceira pessoa nunca será consultada no banco de dados (melhor performance - lazy loading)
        System.out.println("Id da 3ª - " + pessoas.get(2).getId());
        //pode imprimir o ID do objeto, e o proxy nao será inicializado.
    }
}
