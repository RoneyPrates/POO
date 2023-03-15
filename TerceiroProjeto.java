
package com.mycompany.terceiroprojeto;

import java.util.Scanner;
/**
 *
 * @author roney
 */
public class TerceiroProjeto {

    public static void main(String[] args) {
        Scanner teste = new Scanner (System.in);
        
        System.out.println("Informe a largura do triangulo: ");
        double larg = teste.nextDouble();
        System.out.println("Informe a altura do triangulo: ");
        double altura = teste.nextDouble();
        double area = ((larg * altura)/2);
        System.out.println("A area do triangulo em centimetros é "+ (area/100) + "cm e "+area+ "m");
    }
}
