package br.edu.unoesc.exercicio_operacoes.controller;

public class Calculadora {

    public static Double soma(Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double subtracao(Double num1, Double num2) {
        return num1 - num2;
    }

    public static Double multiplicacao(Double num1, Double num2) {
        return num1 * num2;
    }

    public static Double divisao(Double num1, Double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        return num1 / num2;
    }

    public static Double media(Double num1, Double num2) {
        return (num1 + num2) / 2;
    }

    public static Double potencia(Double num1, Double num2) {
        return Math.pow(num1, num2);
    }

    public static Double raizQuadrada(Double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Raiz de número negativo");
        }
        return Math.sqrt(num);
    }

}