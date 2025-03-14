/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.biancapiva.exercicio10;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0, media = 0, maior = 0;
        int[] vetor = new int[10];
        int escolha = 0;
        
        
        System.out.println("Escreva dez numeros naturais");
         Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i <= 9; i++ ){
           
            escolha = scanner.nextInt();            
            vetor[i] = escolha;
            soma = soma + escolha;
    }
        for(int e = 0; e <= 9; e++){
            if(e==0){
                maior = vetor[e];
            }
            if(vetor[e]>maior){
                maior = vetor[e];
            }
        }
        System.out.println("O maior e = "+maior);
        media = soma / 10;
        System.out.println("Resultado "+media);
    }
}
