
package aula03;


public class VariaveisPrimitivas {

    public static void main(String[] args) {
        String nome = "Matheus";
        int idade = 16;
        boolean escolha = true;    // true of false 
        char sexo = 'm';      //Caractere
        char letra = '\u0059';     //codigo unicode   
        byte n1 = 126;        //Numero 
        int n2 = 1000;         //Inteiro
        long n4 = 26777677769777L;        //Inteiro maiores
        float n5 = 25.80f;       //Décimais 
        double n6 = 25.51;      //Décimais duplos
        System.out.println(escolha);
        System.out.println(sexo);
        System.out.println(letra);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println("========");
        System.out.printf("%.6f%n",n5);
        System.out.printf("%.5f%n",n6);
        System.out.println("Matheus");
        System.out.printf("%s tem %d anos%n",nome,idade);
    }
}
