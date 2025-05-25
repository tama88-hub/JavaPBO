/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

import javax.swing.JOptionPane;

/**
 *
 * @author tama88
 */
public class PraktikumDoWhile {
    public static void main(String[] args) {
        int number, jumlah = 0;
        
        System.out.println("Nilai input : ");
        do{
            String input = JOptionPane.showInputDialog("Masukkan Angka : ");
            number = Integer.parseInt(input);
            
            if(number % 5 == 0 && number !=0){
                jumlah -= 2;
            } else {
                jumlah += number;
            }
            
            jumlah += number;
            System.out.println(number+" ");
        }while(number != 0);
        
        System.out.println("\nTotal "+jumlah);
    }
}
