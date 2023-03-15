
package com.mycompany.quartoprojeto;

import java.util.Scanner;
/**
 *
 * @author roney
 */
public class QuartoProjeto {

    public static void main(String[] args) {
    Scanner aluno = new Scanner (System.in);

    System.out.println("Digite seu nome: \n");
    String nome = aluno.nextLine();
    System.out.println("Informe o seu sexo: \n");
    
    char sexo = aluno.next().charAt(0);
    
        switch (sexo) {
            case 'M', 'm' -> System.out.println("Sexo Masculino");
            
            case 'F', 'f' -> System.out.println("Sexo Feminino");
            
            default -> System.out.println("Sexo indefinido");
        }
    System.out.println("Seu nome é "+nome+" e seu sexo é"+sexo);
    }
}
