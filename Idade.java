/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade;

import java.util.Scanner;

/**
 *
 * @author 12825137452
 */
public class Idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Print que aparece para o usuário
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        // Se a idade for maior ou igual a 18 anos, o usuário será maior de idade
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        
        }
        
        // Se a idade for menor de 18 anos, o usuário será menor de idade
        else {
            System.out.println("Você é menor de idade");
        }
        
        scanner.close();
        
       
        
    }
}
