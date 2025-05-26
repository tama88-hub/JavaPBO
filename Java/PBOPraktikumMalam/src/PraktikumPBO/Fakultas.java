/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author tama88
 */
public class Fakultas implements Informatika, Siskom{
    @Override
    public void dekan1() {
        System.out.println("Dekan Informatika: Dr. Budi");
    }
    
    @Override
    public void dosen1() {
        System.out.println("Dosen Informatika: Ibu Sari");
    }
    
    @Override
    public void mhs1() {
        System.out.println("Mahasiswa Informatika: Andi");
    }
    
    @Override
    public void dekan2() {
        System.out.println("Dekan Siskom: Dr. Andri");
    }
    
    @Override
    public void dosen2() {
        System.out.println("Dosen Siskom: Pak Rudi");
    }
    
    @Override
    public void mhs2() {
        System.out.println("Mahasiswa Siskom: Rina");
    }
}
