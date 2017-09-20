/**
 * Aula 02 - Fluxos Condicionais - If & Else
 * Sep 18, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import java.util.Scanner;

public class IFSP_A02_If_Else_ParImpar {

    public static void main(String[] args) {

        // variable declaration
        int var = 0;

        // obtain input
        Scanner input = new Scanner(System.in);

        // prompt for and read
        System.out.print("Digitar num.: ");
        var = input.nextInt();

        // flow selection & display message
        if (var % 2 == 0) {
            System.out.println("Num. par: " + var);
        } else {
            System.out.println("Num. I'mpar: " + var);

        }
        // close resource
        input.close();

    }

}
