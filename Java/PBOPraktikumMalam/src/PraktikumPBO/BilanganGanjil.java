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
public class BilanganGanjil {
    public static void main(String[] args) {
        
        String input_angka = JOptionPane.showInputDialog("Masukkan Angka 1 Sampai 50");
        int angka = Integer.parseInt(input_angka);
        
        if (angka >= 1 && angka <= 50 ){ //Mendefinisikan Range Inputan 1 sampai 50
            if (angka % 2 != 0 && angka % 3 == 0){ //Melakukan Pengecekan Untuk Bilangan Ganjil Dan Kelipatan 3
                System.out.println(angka + " Adalah bilangan ganjil kelipatan 3");
            }else if (angka %2 == 0){ // pengecekan jika inputan user adalah bilangan genap
                System.out.println(angka + " Adalah bilangan Genap");
            }else {
                System.out.println(angka + " Bukan bilangan Ganjil Kelipatan 3");
            }
        }else{
            System.out.println("Inputan Anda Salah");
        }
    }
}
