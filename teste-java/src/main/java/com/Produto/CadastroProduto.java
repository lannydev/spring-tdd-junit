package com.Produto;

import java.util.ArrayList;
import java.util.List;

public class CadastroProduto {
    private List<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void adicionar(Produto produto) {
        if(produto.getNome() == null){
            throw new ProdutoSemNomeException();
        }
        this.produtos.add(produto);
    }

    public void remover(Produto produto) {
        if (!this.produtos.contains(produto)){
            throw new ProdutoInexistenteException();
        }
        this.produtos.remove(produto);
    }
}
