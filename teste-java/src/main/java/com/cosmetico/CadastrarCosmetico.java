package com.cosmetico;

import com.exceptions.CosmeticoInexistenteException;
import com.exceptions.CosmeticoSemNomeESemPrecoException;

import java.util.ArrayList;
import java.util.List;

public class CadastrarCosmetico {
    private List<Cosmetico> cosmeticos;

    public CadastrarCosmetico() {
        this.cosmeticos = new ArrayList<>();
    }

    public List<Cosmetico> getCosmeticos() {
        return this.cosmeticos;
    }

    public void adicionar(Cosmetico cosmetico) {
        if (cosmetico.getNome() == null || cosmetico.getValor() == 0){
            throw new CosmeticoSemNomeESemPrecoException();
        }
        this.cosmeticos.add(cosmetico);
    }

    public void remover(Cosmetico cosmetico) {
        if (!this.cosmeticos.contains(cosmetico)){
            throw new CosmeticoInexistenteException();
        }
        this.cosmeticos.remove(cosmetico);
    }
}
