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
public class Exercicio4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.println("Escreva 3 palavras");
            String palavra = sc.next();
            String pala = sc.next();
            String p = sc.next();
            System.out.println("As palavras são:"); 
            System.out.println(palavra);
            System.out.println(pala);
            System.out.println(p);
            
            sc.close();
               
    }
}
