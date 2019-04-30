/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercico1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número");        
        int x = sc.nextInt();
        System.out.println("Digite outro número");
        int y = sc.nextInt();
        int result = x + y;
        System.out.println("a soma dos dois números é = "+result);
               
          
        
        
        
        sc.close();
    }
}
