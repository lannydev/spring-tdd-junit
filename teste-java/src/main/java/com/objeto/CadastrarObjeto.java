package com.objeto;

import java.util.ArrayList;
import java.util.List;

public class CadastrarObjeto {
    private List<Objetos> objetos;

    public CadastrarObjeto() {
        this.objetos = new ArrayList<>();
    }

    public List<Objetos> getObjetos() {
        return this.objetos;

    }

    public void adicionar(Objetos objeto) {
        if (objeto.getNome() == null){
            throw new ObjetoSemNomeException();
        }
        this.objetos.add(objeto);
    }

    public void remover(Objetos objeto) {
        if (this.objetos.isEmpty()){
            throw new ObjetoInexistenteException();
        }
        this.objetos.remove(objeto);
    }
}
