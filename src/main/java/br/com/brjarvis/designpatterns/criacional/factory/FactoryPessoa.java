package br.com.brjarvis.designpatterns.criacional.factory;

import br.com.brjarvis.designpatterns.criacional.factory.bean.Homem;
import br.com.brjarvis.designpatterns.criacional.factory.bean.Mulher;
import br.com.brjarvis.designpatterns.criacional.factory.bean.Pessoa;

public class FactoryPessoa {
    public Pessoa getPessoa(String nome, String sexo) {
        if (sexo.equals("M"))
            return new Homem(nome);
        if (sexo.equals("F"))
            return new Mulher(nome);
        return null;
    }
}
