package com.mycompany.segundoprojeto;

import java.util.Scanner;
/**
 *
 * @author roney
 */
public class SegundoProjeto {

    public static void main(String[] args) {
    Scanner num = new Scanner (System.in);
    
    System.out.println("Adicione a base do triangulo: ");
    int base = num.nextInt();
    System.out.println("Adicione a altura do triangulo: ");
    int altura = num.nextInt();
    int area = ((base * altura) / 2);
    System.out.println("A area do triangulo é "+area);
    }
}
