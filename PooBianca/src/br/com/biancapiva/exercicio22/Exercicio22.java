package br.com.biancapiva.exercicio22;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a altura do retangulo: ");
        retangulo.altura = leia.nextInt();
        System.out.println("Digite a largura do retangulo: ");
        retangulo.largura = leia.nextInt();


        if(retangulo.altura == retangulo.largura){
            System.out.println("Isso e um quadrado nao um retangulo");
        }
        else{
            System.out.println(retangulo.calcularPerimetro());
            System.out.println(retangulo.calcularArea());
        }

    }
}
