/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double n1;
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Qual o valor do primeiro depósito?");
        double dep = sc.nextDouble();
        int res = 0;
        while (res != 4){
        System.out.println("1-Novo Depósito");
        System.out.println("2-Saque");
        System.out.println("3-Saldo");
        System.out.println("4-Sair");
        res = sc.nextInt();
        switch (res){
            case 1:
                System.out.println("Quanto deseja depositar?");
                dep = dep + (n1 = sc.nextDouble());
                break;
            case 2:
                System.out.println("Quanto deseja sacar?");
                n1 = sc.nextDouble();
                if (n1>dep){
                 System.out.println("Alerta: seu saldo e menor do que o saque");
                    System.out.println("Saldo atual = "+dep);
                } else{
                dep = dep - n1;
                System.out.println("Saldo ="+dep);
                }
                break;
            case 3:
                System.out.println("Seu saldo é:"+dep);
                break;
            case 4:
                break;
            default:
                System.out.println("Opção invalida");
        }
            System.out.println("Você saiu");
        sc.close();
                  
    }
}
}
