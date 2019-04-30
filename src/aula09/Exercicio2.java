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
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantos números você deseja somar?");
        int x = sc.nextInt();
        int c = 0;
        double res = 0;
        while (c<x){
            System.out.println("Digite 0 "+c+"° valor");
            double z = sc.nextDouble();
            res = res + z;
            c++;
        }
        System.out.println("A soma dos números são = "+res);
    }
}
