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
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite sua nota");
        double n1 = sc.nextDouble();
        System.out.println("Digite sua nota");
        double n2 = sc.nextDouble();
        System.out.println("Digite sua nota");
        double n3 = sc.nextDouble();
        System.out.println("Digite sua nota");
        double n4 = sc.nextDouble();
        double media = (n1+n2+n3+n4)/4;
       
        if (media<5){
            System.out.println("Reprovado "+media);        
        }
        if (media>=5&&media<6){
            System.out.println("Recuperação "+media);
        }
        if (media>=6&&media<9){       
            System.out.println("Aprovado "+media);
        }    
        if (media>=9){
            System.out.println("Aprovado com loucor - PARABÉNS "+media);
        }
        sc.close();
                
    }
}
