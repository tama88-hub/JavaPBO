/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

import javax.swing.JOptionPane;
/**
 *
 * @author tama
 */
public class Kelulusan {
    public static void main(String[] args) {
        String hasil;
        String input = JOptionPane.showInputDialog("Masukkan Nilai : ");
        double nilai = Double.parseDouble(input);
        
        if(nilai>70){
            hasil = "Lulus";
        }else{
            hasil = "Tidak Lulus";
        }
        
        System.out.println(hasil);
    }
}
