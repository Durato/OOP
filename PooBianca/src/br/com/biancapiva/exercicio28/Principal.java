package br.com.biancapiva.exercicio28;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Tabuada tab = new Tabuada();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero natural: ");
        tab.setNumero(leia.nextInt());

        if(tab.getNumero() > 0 && tab.getNumero() % 2 == 0){
            System.out.println(tab.calcularTabuada());
        }
        else if(tab.getNumero() == 1){
            System.out.println(tab.calcularTabuada());
        }
        else{
            System.out.println("Numero Invalido");
        }

    }
}
