/**
 * Aula 02 - Fluxos Condicionais - If & Else
 * Sep 18, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import java.util.Scanner;

public class IFSP_A02_If_Else {

    public static void main(String[] args) {

        // variable declaration
        int num1 = 0, num2 = 0, resultado = 0;

        // obtain input
        Scanner input = new Scanner(System.in);

        // prompt for and read
        System.out.print("Informar o 1o num.: ");
        num1 = input.nextInt();

        System.out.print("Informar o 2o num.: ");
        num2 = input.nextInt();

        // basic calculation
        resultado = num1 + num2;

        // display message
        System.out.println("\nResultado: " + resultado);

        // flow selection
        if (resultado == 10) {
            System.out.println("Resultado igual a 10.");
        } else {
            if (resultado > 10) {
                System.out.println("Resultado maior que 10!");
            } else {
                System.out.println("Resultado menor que 10!");

            }
            // close resource
            input.close();
        }

    }

}
