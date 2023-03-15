

package com.mycompany.quintoprojeto;

import java.util.Scanner;
/**
 *
 * @author roney
 */
public class QuintoProjeto {

    public static void main(String[] args) {
       

    Scanner num = new Scanner(System.in);
    
        System.out.println("Digite um numero: ");
        int numero = num.nextInt();
        System.out.println("Digite outro numero: ");
        int numero1 = num.nextInt();
        int valor = (numero + numero1);

        System.out.println("A soma do numero "+numero+" + o numero"+numero1+" é igual a "+valor);
    }
}
