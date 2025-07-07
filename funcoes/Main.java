package funcoes;

import funcoes.Calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("" +
                "Avaliação Git com Java");
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.somar(5, 3));
        System.out.println("Multiplicação: " + calc.multiplicar(5, 3));
    }
}

