package br.com.brjarvis.designpatterns.criacional.builder;

import br.com.brjarvis.designpatterns.criacional.builder.bean.Person;

/**
 * <b>Builder Pattern</b>
 * <p>
 * O padrão do construtor é usado para criar uma instância de um objeto muito complexo
 * com um construtor telescópico da maneira mais fácil.
 *
 * <ul>
 * <li>Construtor complexo</li>
 * <li>Grande número de parâmetros</li>
 * <li>Imutabiliadde</li>
 * </ul>
 *
 * <p>
 * Prós:
 * <ul>
 * <li>O código é mais sustentável se o número de campos necessários para criar
 * o objeto for maior que 4 ou 5;</li>
 * <li>Objeto Código de criação menos sujeito a erros, pois o usuário saberá o
 * que está passando devido à chamada explícita do método;</li>
 * <li>Robustez do aumento do padrão do Construtor, já que apenas objetos
 * totalmente construídos estarão disponíveis para o cliente;</li>
 * <li>Você pode forçar a imutabilidade ao objeto uma vez criado.</li>
 * </ul>
 *
 * <p>
 * Contras:
 * <ul>
 * <li>O padrão do construtor é detalhado e requer duplicação de código, pois o
 * Construtor precisa copiar todos os campos da classe Original ou Item.</li>
 * </ul>
 *
 * @link https://medium.com/@ajinkyabadve/builder-design-patterns-in-java-1ffb12648850
 */
public class BuilderExample {
    public static void main(String[] args) {
        final Person person = new Person.Builder()
                .setAge(10)
                .setFathersName("Fathers Name")
                .setFirstName("First Name")
                .setHeight(1.8D)
                .setLastName("Last Name")
                .setMiddleName("Middle Name")
                .setMothersName("Mothers Name")
                .setWeight(80D)
                .build();
        System.out.println(person);
    }
}
