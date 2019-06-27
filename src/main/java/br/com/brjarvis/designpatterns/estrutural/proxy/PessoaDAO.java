package br.com.brjarvis.designpatterns.estrutural.proxy;

/**
 * Imagine que esta classe faz acessos ao banco de dados
 */
public class PessoaDAO {
    public static Pessoa getPessoaByID(String id) {
        System.out.println("select * from PESSOA where id=" + id);
        return new PessoaImpl(id, "Pessoa " + id);
    }
}
