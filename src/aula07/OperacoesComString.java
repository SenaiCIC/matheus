/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author Aluno
 */
public class OperacoesComString {
    public static void main(String[] args) {
        String nome = "Adailton";
        String nM = nome.toUpperCase();
        //.toUpperCase serve para escrever todas maiuscula
        System.out.println("Maiúscula = "+nM);
        String nm = nome.toLowerCase();
        //toLowerCase serve para escrever todas em minsuculas
        System.out.println("Minusculo = "+nm);
        String rec = "Senai CIC e o melhor do Brasil";
        String sub = rec.substring(6,30);
        //.substring serve para cortar palavras
        System.out.println("sub = "+sub);
        String rep = rec.replace("Brasil","mundo");
        //replace serve para trocar palavras por outras
        System.out.println("replace = "+rep);
        int loc = rec.indexOf("ai");
        //indexOP serve para localizar palavras
        System.out.println("Localizado = "+loc);
        loc = rec.lastIndexOf("si");
        System.out.println("Localizado = "+loc  );
        String sp = "laranja maçã banana";
        String[]vect = sp.split(" ");
        //Slit e vetor
        String word1 = vect [0];
        String word2 = vect [1];
        String word3 = vect [2];
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        
        
    }
}
