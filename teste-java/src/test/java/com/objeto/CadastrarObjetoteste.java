package com.objeto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.security.spec.ECField;

public class CadastrarObjetoteste {

    @Test
    public void criarCadastroObjeto(){
        CadastrarObjeto cadastrar = new CadastrarObjeto();

        Assertions.assertThat(cadastrar.getObjetos()).isEmpty();

    }

    @Test
    public void adicionarObjeto(){
        CadastrarObjeto cadastrar = new CadastrarObjeto();
        Objetos objeto = new Objetos();
        objeto.setNome("mesa");
        cadastrar.adicionar(objeto);

        Assertions.assertThat(cadastrar.getObjetos())
                .isNotEmpty()
                .hasSize(1)
                .contains(objeto);
    }

    @Test(expected = ObjetoSemNomeException.class)
    public void NaoAdicionarObjetoSemNome(){
        CadastrarObjeto cadastrar = new CadastrarObjeto();
        Objetos objeto = new Objetos();
        cadastrar.adicionar(objeto);

    }

    @Test
    public void removerObjeto(){
        CadastrarObjeto cadastrar = new CadastrarObjeto();
        Objetos objeto = new Objetos();
        objeto.setNome("mesa");
        cadastrar.adicionar(objeto);
        cadastrar.remover(objeto);

        Assertions.assertThat(cadastrar.getObjetos()).isEmpty();
    }

    @Test(expected = ObjetoInexistenteException.class)
    public void NaoRemoverObjetoInexistente(){
        CadastrarObjeto cadastrar = new CadastrarObjeto();
        Objetos objeto = new Objetos();
        objeto.setNome("mesa");
        cadastrar.remover(objeto);

    }
}
