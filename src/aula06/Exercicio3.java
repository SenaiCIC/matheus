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
public class Exercicio3 {
    public static void main(String[] args) {
        //condiçãoes
        //If (condição){
        //comando 1
        //comando 2 
        //}
        //else{
        //comando 1
        //comando 2 
        //}
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int num = sc.nextInt();
        int res = num%2;
        if (res==0){
            System.out.println("O número é par");
        }else {
            System.out.println("O número é ímpar");
        }
        System.out.println("Que horas são?");
        int time = sc.nextInt();
        if (time<12){
            System.out.println("Então, Bom dia");        
        }
        if (time>=12&&time<18){
            System.out.println("Então,Boa tarde");
        }
        if (time>=18){       
            System.out.println("Então, Boa noite");
        }    
        sc.close();
    }
}
