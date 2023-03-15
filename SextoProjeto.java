
package com.mycompany.sextoprojeto;

import java.util.Scanner;
/**
 *
 * @author roney
 */
public class SextoProjeto {

    public static void main(String[] args) {
        Scanner circulo = new Scanner (System.in);
        
        System.out.println("Digite o raio do circulo: \n");
        double raio = circulo.nextDouble();
        double area = ((raio * raio)*22/7);
        System.out.println("A area desse circulo é "+area);
    }
}
