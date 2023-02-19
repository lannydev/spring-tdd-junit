package com.Produto;

import com.exceptions.ProdutoInexistenteException;
import com.exceptions.ProdutoSemNomeException;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastroProdutoTeste {

    @Test
    public void criarCadastroDeProduto(){
        CadastroProduto cadastro = new CadastroProduto();
        Assertions.assertThat(cadastro.getProdutos()).isEmpty();
    }

    @Test
    public void adicionarProduto(){
        CadastroProduto cadastro = new CadastroProduto();
        Produto produto = new Produto();
        produto.setNome("CanetaPersonalizada");

        cadastro.adicionar(produto);

        Assertions.assertThat(cadastro.getProdutos())
                .isNotEmpty()
                .hasSize(1)
                .contains(produto);

    }

    @Test(expected = ProdutoSemNomeException.class)
    public void naoAdicionarProdutoSemNome(){
        CadastroProduto cadastro = new CadastroProduto();
        Produto produto = new Produto();
        cadastro.adicionar(produto);

    }

    @Test
    public void removerProduto(){
        CadastroProduto cadastro = new CadastroProduto();
        Produto produto = new Produto();
        produto.setNome("CanetaPersonalizada");
        cadastro.adicionar(produto);

        cadastro.remover(produto);
    }

    @Test(expected = ProdutoInexistenteException.class)
    public void removerProdutoInexistente(){
        CadastroProduto cadastro = new CadastroProduto();
        Produto produto = new Produto();

        cadastro.remover(produto);
    }
}
