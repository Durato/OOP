package br.com.biancapiva.exercicio31;

public class Principal {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(10,30));
        System.out.println(calculadora.somar(2.4,3.1));
        System.out.println(calculadora.somar(2,3,4));
    }
}
