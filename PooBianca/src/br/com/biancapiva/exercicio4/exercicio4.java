/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biancapiva.exercicio4;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio4 {
     public static void main(String[] args) {
         int numeroum = 0, numerodois = 0, numerotres = 0, soma = 0, media = 0;
    
        System.out.println("Escreva tres numeros");
        Scanner scanner = new Scanner(System.in);
        numeroum = scanner.nextInt();
        numerodois = scanner.nextInt();
        numerotres = scanner.nextInt();
         
        soma = numeroum + numerodois + numerotres;
        media = soma / 3;
        
         if(media > 7){
             System.out.println("O numero e maior que 7 o numero e :"+media);
         }
         else if(media < 7){
             System.out.println("O numero e menor que 7 o numero e : "+media);
         }
         else{
             System.out.println("O numero e igual a 7 o numero e :"+ media);
         }
     }
}
