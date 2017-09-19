/**
 * Aula 03 - Ler Dados e Exibir Mensagem com JOptionPane
 * Sep 18, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import javax.swing.JOptionPane;

public class IFSP_A03_JOp_Input {

    public static void main(String[] args) {

        // variable declaration
        String ola = "Hello ";

        // obtain input 
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");

        // display message
        JOptionPane.showMessageDialog(null, ola + nome + "!");

    }

}
