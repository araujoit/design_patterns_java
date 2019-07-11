package br.com.brjarvis.designpatterns.comportamental.iterator;

import java.util.Iterator;

/**
 * <h2>Iterator Pattern</h2>
 *
 * <p>
 * O padrão de iterador é um padrão de design muito usado no ambiente de programação Java e .Net.
 * Esse padrão é usado para obter uma maneira de acessar os elementos de um objeto de coleção de maneira seqüencial sem precisar conhecer sua representação subjacente.
 * </p>
 * <p>
 * O padrão do iterador cai na categoria de padrão comportamental.
 * </p>
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/iterator_pattern">
 * https://www.tutorialspoint.com/design_pattern/iterator_pattern
 * </a>
 */
public class IteratorPatternDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        final NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
