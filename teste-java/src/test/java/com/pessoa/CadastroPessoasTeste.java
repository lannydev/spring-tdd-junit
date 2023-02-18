package com.pessoa;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastroPessoasTeste {

    @Test
    public void deveCriarCadastroDePessoas(){
        CadastroPessoas cadastro = new CadastroPessoas();

        Assertions.assertThat(cadastro.getPessoas()).isEmpty();
    }

    @Test
    public void deveAdcionarUmaPessoa(){
        CadastroPessoas cadastro = new CadastroPessoas();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Elaine");

        cadastro.adicionar(pessoa);

        Assertions.assertThat(cadastro.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    @Test(expected = PessoaSemNotException.class)
    public void naoDeveAdcionarPessoaComNomeVazio(){
        CadastroPessoas cadastro = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        cadastro.adicionar(pessoa);

    }

    @Test
    public void deveRemoverUmaPessoa(){
        CadastroPessoas cadastro = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Diego");
        cadastro.adicionar(pessoa);

        cadastro.remover(pessoa);

        Assertions.assertThat(cadastro.getPessoas()).isEmpty();

    }

    @Test(expected = PessoaInexistenteException.class)
    public void deveLancarErroAoTentarRemoverPessoaInexistente(){
        Pessoa pessoa = new Pessoa();
        CadastroPessoas cadastro = new CadastroPessoas();
        cadastro.remover(pessoa);
    }
}
