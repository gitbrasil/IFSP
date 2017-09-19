/**
 * Aula 03 - Ler Dados e Exibir Mensagem com JOptionPane - Soma
 * Sep 18, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import javax.swing.JOptionPane;

public class IFSP_A03_JOp_Soma {

    public static void main(String[] args) {

        // variable declaration
        int n1 = 0, n2 = 0, resultado = 0;
        String txtN1 = "", txtN2 = "";

        // prompt for and read
        txtN1 = JOptionPane.showInputDialog(null, "Digite o 1o num.: ");
        txtN2 = JOptionPane.showInputDialog(null, "Digite o 2o num.: ");

        // convert String to int
        n1 = Integer.parseInt(txtN1); 
        n2 = Integer.parseInt(txtN2);

        // basic calculation
        resultado = n1 + n2;

        // display message
        JOptionPane.showMessageDialog(null, "Soma = " + resultado);
    }

}
