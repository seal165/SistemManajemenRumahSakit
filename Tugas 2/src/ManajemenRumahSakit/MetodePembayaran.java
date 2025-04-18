/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class MetodePembayaran {
    String metode;

    public MetodePembayaran(String metode) {
        this.metode = metode;
    }

    void dataMetode(String metode) {
        this.metode = metode;
    }

    String cetakMetode() {
        return metode;
    }
}
