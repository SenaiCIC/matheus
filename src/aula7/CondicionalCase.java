/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CondicionalCase {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Tecle um número de 1 a 7");
       int dia = sc.nextInt();
       String dsemana;
       switch (dia){
           case 1:
               dsemana = "domingo";
               break;
           case 2:
               dsemana = "Segunda";
               break;
           case 3:
               dsemana = "Terça";
           case 4:
               dsemana = "Quarta";
           case 5:
               dsemana = "Quinta";
           case 7:
               dsemana = "Sexta";
           case 8:
               dsemana = "Sabado";
           default:
               dsemana = "número Inválido";
       }
        System.out.println(dsemana);
       }  
    }

