/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Aluno
 */
public class Exercicio1 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa";
        int idade = 30;
        int codigo = 3200;
        char sexo = 'f';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        System.out.println("Produtos:");
        System.out.printf(produto1+" com preço de R$"+"%.2f%n",preco1);
        System.out.printf(produto2+" com preço de R$"+"%.2f%n",preco2);
        System.out.println("Idade: "+idade+" Anos, código "+codigo+" e sexo "+sexo);
        System.out.printf("%.8f%n",medida);
        System.out.printf("%.3f%n",medida);
        
    }
}
