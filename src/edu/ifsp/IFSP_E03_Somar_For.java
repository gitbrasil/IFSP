/**
 * Tarefa 03 - Somar de 0a a 10
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

public class IFSP_E03_Somar_For {

    public static void main(String[] args) {

        // variables
        int soma = 0, i = 0;

        // flow repetition
        System.out.println("Uso do for: ");
        soma = 0;
        for (int j = 0; j < 10; j++) {
            System.out.println("Num.: " + i + " - Soma: " + (soma = soma + j));
        }
    }
}
