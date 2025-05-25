/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author tama88
 */
public class Gaji extends Pegawai implements Pajak{
    double gaji;
    
    public Gaji(String nama, double gaji){
        super(nama);
        this.gaji = gaji;
    }
    
    @Override
    void Detail(){
        System.out.println("Nama Pegawai : " + this.nama);
        this.gaji = gaji - hitungPajak();
        System.out.println("Gajinya :  "+this.gaji);
    }
    
    @Override
    public double hitungPajak(){
        return (this.gaji * (persen/100));
    }
}
