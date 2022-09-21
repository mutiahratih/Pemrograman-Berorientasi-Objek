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
public class Lingkaran {
    // method menghitung luas lingkaran
    double hitungLuas(double diameter) {
        double jejari = diameter/2;
        double luasL = 3.14 * jejari * jejari;
        return luasL;
    }
}
