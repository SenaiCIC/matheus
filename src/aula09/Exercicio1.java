/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      double x = 0;
      double res;
        while (x>=0){
            System.out.println("Digite um número;");
            x = sc.nextDouble();
            res = Math.sqrt(x);
            System.out.printf("%.3f%n",res);
        } 
        System.out.println("Número negativo");
        
    }
}
