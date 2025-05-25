/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author tama88
 */
public class Prak4Star {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) {
            // Cetak bintang sebanyak nilai i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
