/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biancapiva.exercicio6;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio6 {
      public static void main(String[] args) {
        
        System.out.println("Escreva um dia da semana");
        Scanner scanner = new Scanner(System.in);
        String dia = scanner.nextLine();
        
        if( "domingo".equals(dia)){
            System.out.println("Dia Bom");
        }
        else if("sabado".equals(dia)){
            System.out.println("Dia Bom");
        }
        else if("segunda".equals(dia)){
            System.out.println("Pessimo Dia");
        }
        else if("terca".equals(dia)){
            System.out.println("Mau Dia");
        }
        else if("quarta".equals(dia)){
            System.out.println("Mau Dia");
        }
        else if("quinta".equals(dia)){
            System.out.println("Mau Dia");
        }
         else if("sexta".equals(dia)){
            System.out.println("Mau Dia");
        }
         else{
             System.out.println("invalido");
         }
      }      
}
