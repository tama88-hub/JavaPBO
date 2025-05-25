/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author tama88
 */
public class TestGaji {
    public TestGaji(){
        Gaji gaji =  new Gaji("Tama", 2700000);
        gaji.Detail();
    }
    
    public static void main(String[] args) {
        TestGaji testGaji = new TestGaji();
    }
}
