/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Qual e seu nome?");
        String nome = sc.next();
        System.out.println("Qual e a sua idade?");
        int idade = sc.nextInt();
        System.out.println("Qual e seu peso?");
        double peso = sc.nextDouble();
        System.out.println("Qual e a sua altura?");
        double altura = sc.nextDouble();
        
        System.out.println("seu nome é "+nome+", idade "+idade+" anos");
        double res = peso/(altura*altura);
        System.out.println("E seu IMC "+res);
                
        
        sc.close();
        
    }
}
