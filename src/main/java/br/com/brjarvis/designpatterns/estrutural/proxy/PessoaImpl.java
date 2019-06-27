package br.com.brjarvis.designpatterns.estrutural.proxy;

/**
 * Objeto real
 */
public class PessoaImpl implements Pessoa {
    private String nome;
    private String id;

    public PessoaImpl(String id, String nome) {
        this.id = id;
        this.nome = nome;
        // apenas para simular algo...
        System.out.println("Retornou a pessoa do banco de dados ->  " + nome);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
