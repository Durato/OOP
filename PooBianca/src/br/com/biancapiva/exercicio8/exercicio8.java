/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.biancapiva.exercicio8;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Escreva um numero natural");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        
        
        do{
            System.out.println(escolha);
            escolha--;
            i++;}
            while(escolha >= 0);
            System.out.println("Total de numeros lidos: "+ i);
    }
}
