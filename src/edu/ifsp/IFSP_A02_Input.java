/**
 * Aula 02 - Leitura de Dados - Scanner
 * Sep 18, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import java.util.Scanner;

public class IFSP_A02_Input {

    public static void main(String[] args) {

        // variable declaration
        int idade = 0;

        // prompt for and read  
        Scanner input = new Scanner(System.in);

        // prompt for and read
        System.out.print("Informar a idade: ");
        idade = input.nextInt();

        // display message
        System.out.println("Idade informada: " + idade);

        // close resource
        input.close();

    }

}
