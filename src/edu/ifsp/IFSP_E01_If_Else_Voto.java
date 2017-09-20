/**
 * Tarefa 01 - Fluxos Condicionais - If & Else
 * Sep 18, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import java.util.Scanner;

public class IFSP_E01_If_Else_Voto {

    public static void main(String[] args) {

        // variable declaration
        int anoAtual = 0;
        int anoNascimento = 0;
        int idade = 0;

        // obtain input
        Scanner input = new Scanner(System.in);

        // prompt for and read
        System.out.print("Informe o Ano de Nascimento:\t");
        anoNascimento = input.nextInt();

        System.out.print("Informe o Ano Atual:\t\t");
        anoAtual = input.nextInt();

        // flow selection
        if (anoAtual < anoNascimento) {
            System.out.println("Erro: O Ano de Nascimento maior que o Ano Atual!");
        } else {
            idade = anoAtual - anoNascimento;
        }

        // display message
        System.out.println("\n" + idade + " anos de idade.");

        // flow selection
        if (idade < 16) {
            System.out.println("A lei o impede de votar!");
        } else {
            System.out.println("A lei obriga a votar!");

        }
        // close resource
        input.close();

    }

}
