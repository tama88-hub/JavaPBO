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
public class HitungVolume {
    public static void main(String[] args) {
        double phi = 3.14;
        System.out.println("Menu Pilihan");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Volume Tabung");
        String input = JOptionPane.showInputDialog("Masukkan Pilihan");
        int pilihan = Integer.parseInt(input);
        
        switch(pilihan){
            case 1:
                String input_sisi = JOptionPane.showInputDialog("Masukkan sisi kubus");
                double sisi = Double.parseDouble(input_sisi);
                double volumekubus = sisi * sisi * sisi;
                
                System.out.println("Volume Kubus = "+volumekubus+" cm kubik");
            break;
            case 2:
                String input_jari = JOptionPane.showInputDialog("Masukkan Jari-jari Alas Tabung");
                String input_tinggi = JOptionPane.showInputDialog("Masukkan Tinggi Tabung");
                
                double r = Double.parseDouble(input_jari);
                double t = Double.parseDouble(input_tinggi);
                
                double volumeTabung = phi * r * r * t;
                
                
                System.out.println("Volume Tabung = "+volumeTabung+" cm kubik");
                
            break;
            default:
                System.out.println("Pilihan anda tidak valid");
        }
    }
}
