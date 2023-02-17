package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void estruturaDeUmTeste(){

        int num1 = 5, num2 = 3;
        int soma = num1 + num2;

        Assert.assertEquals(8, soma);

    }
}
