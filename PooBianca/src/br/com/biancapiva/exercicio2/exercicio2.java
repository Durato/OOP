/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biancapiva.exercicio2;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio2 {
     public static void main(String[] args) {
        int soma = 0, diferenca = 0, produto = 0, media = 0, razao = 0, resto = 0;
        
        System.out.println("Digite dois numeros");
        Scanner scanner = new Scanner(System.in);
        int numeroum = scanner.nextInt();
        int numerodois = scanner.nextInt();
        
        soma = numeroum + numerodois;
        diferenca = numeroum - numerodois;
        produto = numeroum * numerodois;
        media = soma / 2;
        resto = numeroum % numerodois;
        
        if(numeroum > numerodois){
            razao = numeroum / numerodois;
        }
        else if(numeroum < numerodois){
            razao = numerodois / numeroum;
        }
        
        System.out.println("O resto e "+resto);
        System.out.println("A razao e "+razao);
        System.out.println("A media e "+media);
        System.out.println("O produto e "+produto);
        System.out.println("A soma e "+soma);
        System.out.println("A diferenca e "+diferenca);
        
    }
}
