package br.com.brjarvis.designpatterns.estrutural.composite;

/**
 * <h1>Composite Pattern</h1>
 * <p>
 * <b>O padrão composto destina-se a permitir o tratamento de objetos individuais e composições de objetos, ou "compostos" da mesma maneira. </b>
 * <p/>
 * Ele pode ser visto como uma estrutura em árvore composta de tipos que herdam um tipo base e pode representar uma única parte ou uma hierarquia inteira de objetos.
 * <p/>
 * Podemos dividir o padrão em:
 * <ul>
 * <li>
 * <h2>Component</h2>
 * </li>
 * <ul>
 * <li>é a interface base para todos os objetos na composição. Deve ser uma interface ou uma classe abstrata com os métodos comuns para gerenciar os compostos filhos.</li>
 * </ul>
 *
 * <li>
 * <h2>Leaf</h2>
 * </li>
 * <ul>
 * <li>implementa o comportamento padrão do componente base. Não contém uma referência aos outros objetos.</li>
 * </ul>
 *
 * <li>
 * <h2>Composite</h2>
 * </li>
 * <ul>
 * <li>tem elementos foliares. Ele implementa os métodos do componente base e define as operações relacionadas a filhos.</li>
 * </ul>
 *
 * <li>
 * <h2>Cliente</h2>
 * </li>
 * <ul>
 * <li>tem acesso aos elementos de composição usando o objeto de componente base.</li>
 * </ul>
 * </ul>
 *
 * @see <a href="https://www.baeldung.com/java-composite-pattern">
 * https://www.baeldung.com/java-composite-pattern
 * </a>
 */
public class CompositeTest {

    /**
     * <h2>Cliente</h2>
     * <p>
     * Estrutura hierárquica de departamentos em uma companhia
     *
     * @param ignore ignore
     */
    public static void main(String[] ignore) {
        final Department salesDepartment = new SalesDepartment(
                1, "Sales department");
        final Department financialDepartment = new FinancialDepartment(
                2, "Financial department");

        final HeadDepartment headDepartment = new HeadDepartment(
                3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
