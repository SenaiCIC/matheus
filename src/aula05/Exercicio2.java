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
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Qual e seu nome?");
        String nome = sc.next();
        String nome2 = sc.nextLine();
        System.out.println("Seu nome é "+nome+nome2);
        
        sc.close();
    }
}
