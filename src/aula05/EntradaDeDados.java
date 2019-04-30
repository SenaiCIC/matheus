
package aula05;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número inteiro");
            int x = sc.nextInt();
            System.out.println("Você digitou o número : "+x);
           
        
        sc.close();
         
        
    }
}
