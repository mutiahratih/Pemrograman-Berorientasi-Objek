/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author HP
 */
public class Lingkaran {
    // atribut
    int jejari;
    
    // methods
    void hitungLuas() {
        double luas = 22/7 * this.jejari * this.jejari;
        System.out.println("Luas = " + luas + " Satuan luas");
    }
    
    void hitungKeliling() {
        double keliling = 2 * 22/7 * this.jejari;
        System.out.println("Keliling = " + keliling + " Satuan panjang");
    }
}
