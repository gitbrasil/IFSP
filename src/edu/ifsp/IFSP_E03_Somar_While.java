/**
 * Tarefa 03 - Somar de 0a a 10
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

public class IFSP_E03_Somar_While {

    public static void main(String[] args) {

        // variables
        int soma = 0, i = 0;

        // flow repetition
        System.out.println("Uso do While");
        while (i < 10) {
            soma = soma + i;
            i++;
            System.out.println("Num.: " + i + " - Soma: " + soma);
        }
    }
}
