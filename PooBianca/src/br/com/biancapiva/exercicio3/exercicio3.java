/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biancapiva.exercicio3;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio3 {
    public static void main(String[] args) {
    int numeroum = 0;
    
        System.out.println("Escreva um numero");
        Scanner scanner = new Scanner(System.in);
        numeroum = scanner.nextInt();
        
            if(numeroum % 2 == 0){
                System.out.println("Seu numero e par ");
            }
            else{
                System.out.println("Seu numero e impar ");
            }
    }
    }
