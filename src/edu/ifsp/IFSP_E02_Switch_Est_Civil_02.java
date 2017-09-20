/**
 * Tarefa 02 - switch...case com String
 * set 19, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import java.util.Scanner;

public class IFSP_E02_Switch_Est_Civil_02 {

    public static void main(String[] args) {

        // variables
        String estadoCivil = "";

        // obtain input
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu Estado Civil?");
        System.out.println("S : Solteira(o)");
        System.out.println("C : Casado(a)");
        System.out.println("D : Divorciado(a)");
        System.out.println("V : Viuvo(a)");

        // prompt for and read
        estadoCivil = input.nextLine().toString().toUpperCase();
        

        switch (estadoCivil) {
            case "S":
                System.out.println("Solteira(o)");
                break;
            case "C":
                System.out.println("Casado(a)");
                break;
            case "D":
                System.out.println("Divorciado(a)");
                break;
            case "V":
                System.out.println("Viuvo(a)");
                break;
            default:
                System.out.println("Escolha errada!");
        }
        // close resource
        input.close();
    }
}
