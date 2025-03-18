/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whilenumeros1;

import java.util.Scanner;

/**
 *
 * @author 12825137452
 */
public class Whilenumeros1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int contador = 1;
        int NF = scanner.nextInt();
        
        while(contador <= NF) {
            System.out.println("Repeticao nr: " + contador);
            contador ++;
    }
}
}