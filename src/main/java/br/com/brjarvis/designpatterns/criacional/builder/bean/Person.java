package br.com.brjarvis.designpatterns.criacional.builder.bean;

public class Person {
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
    public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String fathersName;
        private String mothersName;
        private double height;
        private double weight;

        public Builder() {
            super();
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFathersName(String fathersName) {
            this.fathersName = fathersName;
            return this;
        }

        public Builder setMothersName(String mothersName) {
            this.mothersName = mothersName;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(firstName, middleName, lastName, age, fathersName, mothersName, height, weight);
        }
    }
}
