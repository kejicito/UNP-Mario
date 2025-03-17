/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diasdasemana;

import java.util.Scanner;

/**
 *
 * @author 12825137452
 */
public class DiasdaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite o número correspondente ao Dia da Semana");
        int diadasemana = scanner.nextInt();
        
        switch(diadasemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero invalido! Por favor, digite um numero de 1 a 7");
                break;
        }
        
    }
}
