/**
 * Aula 02 - Fluxos Condicionais - IF
 * Sep 18, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import java.util.Scanner;

public class IFSP_A02_If {

    public static void main(String[] args) {

        // variable declaration
        int num1 = 0, num2 = 0;

        // obtain input 
        Scanner input = new Scanner(System.in);

        // prompt for and read
        System.out.print("Informar o 1o num.: ");
        num1 = input.nextInt();

        System.out.print("Informar o 2o num.: ");
        num2 = input.nextInt();

        // flow selection
        if (num1 == num2) {
            System.out.println("\n1o num. igual ao 2o num.");
        } else {
            if (num1 > num2) {
                System.out.println("\n1o num. maior ao 2o num.");
            } else {
                System.out.println("\n1o num. menor ao 2o num.");

            }
        }
        System.out.println("");

        // close resource
        input.close();

    }

}
