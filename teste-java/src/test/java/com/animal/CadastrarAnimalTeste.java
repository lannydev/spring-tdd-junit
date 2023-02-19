package com.animal;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastrarAnimalTeste {

    @Test
    public void criarCadastroAnimal(){
        CadastrarAnimal cadastrar = new CadastrarAnimal();

        Assertions.assertThat(cadastrar.getAnimais()).isEmpty();
    }

    @Test
    public void adicionarAnimal(){
        CadastrarAnimal cadastrar = new CadastrarAnimal();
        Animal animal = new Animal();
        animal.setNome("cachorro");
        cadastrar.adicionar(animal);

        Assertions.assertThat(cadastrar.getAnimais())
                .isNotEmpty()
                .contains(animal)
                .hasSize(1);
    }

    @Test(expected = AnimalSemNomeException.class)
    public void naoAdicionarAnimalSemNome(){
        CadastrarAnimal cadastrar = new CadastrarAnimal();
        Animal animal = new Animal();

        cadastrar.adicionar(animal);

    }

    @Test
    public void removerAnimal(){
        CadastrarAnimal cadastrar = new CadastrarAnimal();
        Animal animal = new Animal();
        animal.setNome("gato");
        cadastrar.adicionar(animal);
        cadastrar.remover(animal);

        Assertions.assertThat(cadastrar.getAnimais()).isEmpty();


    }

    @Test(expected = AnimalInexistenteException.class)
    public void naoRemoverAnimalInexistente(){
        CadastrarAnimal cadastrar = new CadastrarAnimal();
        Animal animal = new Animal();
        cadastrar.remover(animal);



    }
}
