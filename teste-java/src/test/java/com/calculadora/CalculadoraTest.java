package com.calculadora;

import com.calculadora.Calculadora;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {

    Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test(expected = RuntimeException.class)
    public void naoSomarNgativo(){
        int num1 = 5, num2 = -6;
        calculadora.somar(num1, num2);


    }

    @Test
    public void somardoisnumeros(){
        int num1 = 5, num2 = 6;
        calculadora.somar(num1, num2);

        Assertions.assertThat(calculadora.somar(num1, num2)).isEqualTo(11);

    }


    @Test(expected = RuntimeException.class)
    public void naoResultarEmNegativo(){
        double num1 = 5.0, num2 = 6.0;
        calculadora.subtrair(num1, num2);


    }

    @Test
    public void subtrairTest(){
        int num1 = 5, num2 = 4;
        calculadora.subtrair(num1, num2);

        Assertions.assertThat(calculadora.subtrair(num1, num2)).isEqualTo(1);

    }

    @Test(expected = RuntimeException.class)
    public void naomultiplicarnumerozero(){
        double num1 = 0, num2 = 3;
        calculadora.multiplicar(num1, num2);

    }

    @Test
    public void multiplicarTeste(){
        double num1 = 5, num2 = 6;
        calculadora.multiplicar(num1, num2);

        Assertions.assertThat(calculadora.multiplicar(num1, num2)).isEqualTo(30);

    }

    @Test(expected = RuntimeException.class)
    public void naodividirnumerozero(){
        double num1 = 6.0, num2 = 0.0;
        calculadora.dividir(num1, num2);

    }

    @Test
    public void dividirTeste(){
        double num1 = 6, num2 = 6;
        calculadora.dividir(num1, num2);


    }


}

