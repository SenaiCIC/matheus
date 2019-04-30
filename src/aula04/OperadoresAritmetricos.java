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
public class OperadoresAritmetricos {
    public static void main(String[] args) {
        //Operadores + soma
        //Operadores - subtração
        //Operadores / divisão
        //Operadores * Multiplicação
        //Operadores % Módulo
        
        int a = 5;
        int b = 2;
        int result;
        result=  a % b;
        System.out.println("modulode a e b :"+result);
        result = a + b;
        System.out.println("soma de a e b:"+result);
        result = a- b;
        System.out.println("subtração de a e b:"+result);
        result = a * b;
        System.out.println("multiplicação de a e b"+result);
        double resultado;
        resultado = (double) a/b;
        System.out.println("divisão de a e b"+resultado);

        
    }
    
    
}
