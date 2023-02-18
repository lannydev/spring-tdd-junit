package org.example;

public class Calculadora {

    public int somar(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new RuntimeException("Operação não permitida para numeros negativos");
        }
         return num1 + num2;
    }

    public double subtrair(double num1, double num2){
        double resultadoSubtracao = num1 - num2;
        if (resultadoSubtracao < 0){
            throw new RuntimeException("A Operação não pode resultar em numero negativo");
        }
        return resultadoSubtracao;
    }

    public double multiplicar(double num1, double num2){
        if (num1 <= 0 || num2 <= 0){
            throw new RuntimeException("Operação não permitida para numeros menores ou igual a zero");
        }
        return num1 * num2;
    }

    public double dividir(double num1, double num2){
        if (num1 <= 0 || num2 <= 0){
            throw new RuntimeException("Operação não permitida para numeros menores ou igual a zero");
        }
        return num1 / num2;
    }
}
