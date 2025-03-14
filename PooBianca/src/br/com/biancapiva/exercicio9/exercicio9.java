/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biancapiva.exercicio9;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio9 {
      public static void main(String[] args) {
        int fatorial = 1;
        System.out.println("Escreva um numero natural");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        if(escolha >= 0 && escolha % 1 == 0){
        for(int i = 1; i <= escolha; i++ ){
           fatorial = fatorial * i;
            System.out.println(fatorial);
        }
        }
        else if(escolha == 0){
            System.out.println("O fatorial e 1");
        }
        else{
            System.out.println("Invalido");
        }
          System.out.println("O fatorial e "+ fatorial);
}}
