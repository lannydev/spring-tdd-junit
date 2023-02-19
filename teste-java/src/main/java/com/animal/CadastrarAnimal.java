package com.animal;

import com.exceptions.AnimalInexistenteException;
import com.exceptions.AnimalSemNomeException;

import java.util.ArrayList;
import java.util.List;

public class CadastrarAnimal {
    private List<Animal> animais;

    public CadastrarAnimal() {
        this.animais = new ArrayList<>();
    }

    public List<Animal> getAnimais() {
        return this.animais;
    }

    public void adicionar(Animal animal) {
        if (animal.getNome() == null){
            throw new AnimalSemNomeException();
        }
        this.animais.add(animal);
    }

    public void remover(Animal animal) {
        if (!this.animais.contains(animal)){
            throw new AnimalInexistenteException();
        }
        this.animais.remove(animal);
    }
}
