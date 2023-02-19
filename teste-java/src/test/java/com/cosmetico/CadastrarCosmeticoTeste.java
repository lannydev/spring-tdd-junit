package com.cosmetico;

import com.exceptions.CosmeticoInexistenteException;
import com.exceptions.CosmeticoSemNomeESemPrecoException;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class CadastrarCosmeticoTeste {
    @Test
    public void criarCadastroCosmetico(){
        CadastrarCosmetico cadastrarCosmetico = new CadastrarCosmetico();

        Assertions.assertThat(cadastrarCosmetico.getCosmeticos()).isEmpty();
    }

    @Test
    public void adicionarCosmetico(){
        CadastrarCosmetico cadastrar = new CadastrarCosmetico();
        Cosmetico cosmetico = new Cosmetico();
        cosmetico.setNome("Batom");
        cosmetico.setvalor(10.99);

        cadastrar.adicionar(cosmetico);

        Assertions.assertThat(cadastrar.getCosmeticos())
                .isNotEmpty()
                .hasSize(1)
                .contains(cosmetico);
    }

    @Test(expected = CosmeticoSemNomeESemPrecoException.class)
    public void naoAdicionarCosmeticoSemNomeePreco(){
        CadastrarCosmetico cadastrar = new CadastrarCosmetico();
        Cosmetico cosmetico = new Cosmetico();
        // cosmetico.setNome("Batom");
        cosmetico.setvalor(10.99);
        cadastrar.adicionar(cosmetico);
    }

    @Test
    public void removerCosmetico(){
        CadastrarCosmetico cadastrar = new CadastrarCosmetico();
        Cosmetico cosmetico = new Cosmetico();
        cosmetico.setNome("Batom");
        cosmetico.setvalor(10.99);

        cadastrar.adicionar(cosmetico);
        cadastrar.remover(cosmetico);

    }
    @Test(expected = CosmeticoInexistenteException.class)
    public void naoRemoverCosmeticoInexistente() {
        CadastrarCosmetico cadastrar = new CadastrarCosmetico();
        Cosmetico cosmetico = new Cosmetico();
        // cosmetico.setNome("Batom");
        //cosmetico.setvalor(10.99);
        cadastrar.remover(cosmetico);
    }





    }
