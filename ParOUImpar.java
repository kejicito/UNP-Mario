/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parouimpar;

import java.util.Scanner;

/**
 *
 * @author 12825137452
 */
public class ParOUImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número para verificação");
        int numero = scanner.nextInt();
        
        // Resto + Boolean para dar o resultado em 
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é Par");
            
        }
        
        else {
            System.out.println("O número " + numero +  " é Impar");
        }
        
        
        
    }
}
