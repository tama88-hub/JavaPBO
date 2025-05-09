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
public class Prak4 {
    public static void main(String[] args) {
        int faktorial = 1;
        String input = JOptionPane.showInputDialog("Masukkan Nilai n: ");
        int n = Integer.parseInt(input);
        
//        for(int i=1;i<n;i++){
//            faktorial += faktorial*i;
//        }
        
        for(int i = 1;i<=n;i++){
            faktorial += faktorial*i;
            
            //faktorial *= i;
            
        }
        
        System.out.println("Nilai "+ n+"! = "+faktorial);
    }
}
