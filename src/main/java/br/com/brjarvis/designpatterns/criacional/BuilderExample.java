package br.com.brjarvis.designpatterns.criacional;

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

    /**
     * Define a classe Person
     */
    public static class Person {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String fathersName;
        private String mothersName;
        private double height;
        private double weight;

        /**
         * Impede a construção de objeto fora do Builder
         */
        private Person(String firstName, String middleName,
                       String lastName, int age, String fathersName,
                       String mothersName, double height, double weight) {

            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.age = age;
            this.fathersName = fathersName;
            this.mothersName = mothersName;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", fathersName='" + fathersName + '\'' +
                    ", mothersName='" + mothersName + '\'' +
                    ", height=" + height +
                    ", weight=" + weight +
                    '}';
        }

        /**
         * Implementa o Builder
         */
        @SuppressWarnings("SameParameterValue")
        static class Builder {
            private String firstName;
            private String middleName;
            private String lastName;
            private int age;
            private String fathersName;
            private String mothersName;
            private double height;
            private double weight;

            Builder() {
                super();
            }

            Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            Builder setMiddleName(String middleName) {
                this.middleName = middleName;
                return this;
            }

            Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            Builder setAge(int age) {
                this.age = age;
                return this;
            }

            Builder setFathersName(String fathersName) {
                this.fathersName = fathersName;
                return this;
            }

            Builder setMothersName(String mothersName) {
                this.mothersName = mothersName;
                return this;
            }

            Builder setHeight(double height) {
                this.height = height;
                return this;
            }

            Builder setWeight(double weight) {
                this.weight = weight;
                return this;
            }

            Person build() {
                return new Person(firstName, middleName, lastName, age, fathersName, mothersName, height, weight);
            }
        }
    }
}
