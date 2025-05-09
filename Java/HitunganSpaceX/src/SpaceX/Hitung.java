/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpaceX;

/**
 *
 * @author admin
 */
public class Hitung {
    public static void main(String[] args) {
        double a = 9.461;
        //long b = 1000000000000L;
        double tc = a * Math.pow(10, 12);
        double ta = 26500;
        
        double outspaceFromEarth = ta * tc;
        System.out.println(outspaceFromEarth);
        
        //waktu = jarak / kecepatan
        double kecepatan = 40320;
        
        double waktu = kecepatan / outspaceFromEarth;
        System.out.println(waktu);
    }
}
