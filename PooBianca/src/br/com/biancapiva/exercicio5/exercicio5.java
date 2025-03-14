/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biancapiva.exercicio5;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio5 {
    public static void main(String[] args) {
        
        System.out.println("Escolha um dia da semana");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 0:
                System.out.println("Bom Domingo");
                break;
            case 1:
                System.out.println("Bom Segunda");
                break;
            case 2:
                System.out.println("Bom Terca");
                break;
            case 3:
                System.out.println("Bom Quarta");
                break;
            case 4:
                System.out.println("Bom Quinta");
                break;
            case 5:
                System.out.println("Boa Sexta");
                break;
            case 6 :
                System.out.println("Bom Sabado");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
