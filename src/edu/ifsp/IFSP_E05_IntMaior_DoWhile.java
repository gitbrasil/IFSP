/**
 * Tarefa 05 - Maior valor entre 10 e 100
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import java.util.Scanner;

public class IFSP_E05_IntMaior_DoWhile {

    public static void main(String[] args) {

        // variables declaration
        int num = 0;

        // obtain input
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite um num. entre 10 e 100: ");
            num = input.nextInt();
        } while (num >= 10 && num <= 100);
}
}
