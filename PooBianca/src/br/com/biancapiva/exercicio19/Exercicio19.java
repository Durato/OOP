package br.com.biancapiva.exercicio19;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Digite o modelo do carro: ");
        carro.modelo = leia.nextLine();
        System.out.println("Digite a marca do carro: ");
        carro.marca = leia.nextLine();
        System.out.println("Digite o ano do carro: ");
        carro.ano = leia.nextInt();


        System.out.printf(" Modelo = " + carro.modelo + "\n ano = " + carro.ano + "\n Marca = " + carro.marca);
    }
}
