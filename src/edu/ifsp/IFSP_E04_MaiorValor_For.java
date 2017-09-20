/**
 * Tarefa 04 - Maior Valor Inteiro entre os escolhidos
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import java.util.Scanner;

public class IFSP_E04_MaiorValor_For {

    public static void main(String[] args) {

        // variables declaration
        int num = 0, numMaior = 0;
        byte qtde = 0;

        // obtain input
        Scanner input = new Scanner(System.in);

        // prompt for and read
        System.out.println("Qtde a ser comparada: ");
        qtde = input.nextByte();

        // flow repetition
        for (int i = 0; i < qtde; i++) {

            System.out.print("Informe um num.: ");
            num = input.nextInt();

            // flow selection
            if (qtde == 0) {
                numMaior = num;
            } else if (num > numMaior) {
                numMaior = num;
            }
        }
        // display message
        System.out.println("\nMaior valor informado: " + numMaior);
    }
}
