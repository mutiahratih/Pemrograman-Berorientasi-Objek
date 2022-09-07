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
public class PersegiPanjang {
    // atribut
    int panjang;
    int lebar;
    
    // methods
    void hitungLuas() {
        int luas = this.panjang * this.lebar;
        System.out.println("Luas = " + luas + " Satuan luas");
    }
    
    void hitungKeliling() {
        int keliling = 2 * (this.panjang + this.lebar);
        System.out.println("Keliling = " + keliling + " Satuan panjang");
    }
}
