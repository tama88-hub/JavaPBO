/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Hipertensi {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Tekanan darah anda (mmHg): ");
        int tekanan_darah = Integer.parseInt(input);

        if (tekanan_darah > 140) {
            System.out.println("Anda mengalami Hipertensi");
        }
    }
}
