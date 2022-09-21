/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author HP
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   ////////// PROJECT 1 //////////
        // membuat objek lingkaran
        Lingkaran L = new Lingkaran();
        
        // membuat objek persegi
        Persegi P = new Persegi();
        
        // menghitung luas total
        double luasTotal = (2*(L.hitungLuas(42)) + P.hitungLuas(42));
        System.out.println("Luas Total Bangun1 : " + luasTotal);
        
        
    ////////// PROJECT 2 //////////
        // membuat objek lingkaran kecil
        Lingkaran K = new Lingkaran();
        
        // membuat objek lingkaran besar
        Lingkaran B = new Lingkaran();
        
        // menghitung luas total
        double luasTotal2 = ((B.hitungLuas(28)/2) - K.hitungLuas(14));
        System.out.println("Luas Total Bangun2 : " + luasTotal2);
    }
    
}
