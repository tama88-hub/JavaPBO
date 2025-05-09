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
public class MenuPilihan {
    public static void main(String[] args) {
        int a = 100, b = 25;
        int hasil;
        System.out.println("Menu Pilihan");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        String input = JOptionPane.showInputDialog("Masukkan Pilihan");
        int pilihan = Integer.parseInt(input);
        
        switch(pilihan){
            case 1:
                hasil = a+b;
                System.out.println("Penjumlahan a :"+a+ "+ b:"+b+" = "+hasil);
                break;
            case 2:
                hasil = a-b;
                System.out.println("Pengurangan a:"+a+ "- b:"+b+" = "+hasil);
                break;
            default:
                System.out.println("Pilihan anda salah");
        }
    }
}
