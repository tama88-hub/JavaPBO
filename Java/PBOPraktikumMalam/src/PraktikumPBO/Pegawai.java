/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author tama88
 */
public abstract class Pegawai {
    String nama;
    
    public Pegawai (){
        
    }
    
    public Pegawai (String nama){
        this.nama = nama;
    }
    
    abstract void Detail();
}
