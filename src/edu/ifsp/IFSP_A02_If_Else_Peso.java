/**
 * Aula 02 - Fluxos Condicionais - If & Else
 * set 19, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import java.util.Scanner;

public class IFSP_A02_If_Else_Peso {

    public static void main(String[] args) {

        // variable declaration
        double peso = 0;
        double altura = 0;

        double maiorPeso = 0;
        double alturaMaiorPeso = 0;

        int i = 0, qtd = 0;

        // obtain input
        Scanner input = new Scanner(System.in);

        // prompt for and read
        System.out.print("Informe a qtde de pessoas: ");
        qtd = input.nextInt();

        // flow repetition
        while (i < qtd) {
            System.out.print("Digite a altura: ");
            altura = input.nextDouble();

            System.out.print("Digite o peso: ");
            peso = input.nextDouble();

            // flow selection
            if (i == 0) {           // primeira vez
                maiorPeso = peso;   // armazenar para comparar
                alturaMaiorPeso = altura;
            } else {
                if (peso > maiorPeso) { // se o peso for maior que o armazenado
                    maiorPeso = peso;           // novo maior peso
                    alturaMaiorPeso = altura;   // nova maior altura
                }
            }
            i++;
        }

        // display message
        System.out.println("\nAltura da pessoa mais pesada: " + alturaMaiorPeso);

        // close resource
        input.close();

    }

}
