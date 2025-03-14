/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biancapiva.exercicio7;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio7 {
      public static void main(String[] args) {
        int i = 1,fatorial = 1;
        System.out.println("Escreva um numero natural");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        if(escolha >= 0 && escolha % 1 == 0){
        while(i <= escolha ){
           fatorial = fatorial * i;
            System.out.println(fatorial);
            i++;
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
