/**
 * Aula 03 - Mensagem com JOptionPane
 * Sep 18, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package edu.ifsp;

import javax.swing.JOptionPane;

public class IFSP_A03_JOp {

    public static void main(String[] args) {

        // display message
        JOptionPane.showMessageDialog(null, "Hello Java! \nDigitado diretamente no comando!");

        // variable declaration
        String ola = "Hello, Amigos!\nEsta mensagem foi \nrecebdida de uma String";

        // display message
        JOptionPane.showMessageDialog(null, ola);

    }

}
