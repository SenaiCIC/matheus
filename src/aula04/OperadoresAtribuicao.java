/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Aluno
 */
public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int a = 10;
        int result = 0;
        result= a +=5;
        System.out.println(a+" "+result);
        System.out.println(a -= 2);
        System.out.println(a *= 3);
        
        
        a++;
        System.out.println(a);
        int b = ++a;
        System.out.println(b +" "+a);
        
        
        
    }
}
