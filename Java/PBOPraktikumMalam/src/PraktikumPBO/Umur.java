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
public class Umur {
    public static void main(String[] args) {
        String kategori;
        String input = JOptionPane.showInputDialog("Masukkan Umur: ");
        int umur = Integer.parseInt(input);
        
        if(umur<5){
            kategori = "balita";
        }else if(umur<12){
            kategori = "anak";
        }else if(umur<18){
            kategori = "remaja";
        }else if(umur<40){
            kategori = "dewasa";
        }else if(umur<60){
            kategori = "paruhbaya";
        }else{
            kategori = "lanjut usia";
        }
        
        System.out.println(kategori);
    }
}
