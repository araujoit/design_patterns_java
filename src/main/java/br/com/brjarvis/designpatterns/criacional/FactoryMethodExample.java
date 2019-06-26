package br.com.brjarvis.designpatterns.criacional;

public class FactoryMethodExample {

    public static abstract class Pessoa {
        public String nome;
        public String sexo;
    }

    static class Homem extends Pessoa {
        public Homem(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Olá Senhor " + this.nome;
        }
    }

    static class Mulher extends Pessoa {
        public Mulher(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Olá senhora " + this.nome;
        }
    }

    public static class FactoryPessoa {
        public Pessoa getPessoa(String nome, String sexo) {
            if (sexo.equals("M"))
                return new Homem(nome);
            if (sexo.equals("F"))
                return new Mulher(nome);
            return null;
        }
    }

    public static class TesteApp {
        public static void main(String[] args) {
            final String nome = "Carlos";
            final String sexo = "M";
            Pessoa pessoa = new FactoryPessoa().getPessoa(nome, sexo);
            System.out.println(pessoa);
        }
    }
}
