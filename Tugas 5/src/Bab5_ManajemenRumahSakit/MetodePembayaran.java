/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class MetodePembayaran {
    private String metode; // Enkapsulasi: ubah jadi private

    // Konstruktor
    public MetodePembayaran(String metode) {
        this.metode = metode;
    }

    // Setter
    public void setMetode(String metode) {
        this.metode = metode;
    }

    // Getter
    public String getMetode() {
        return metode;
    }

    // Override toString
    @Override
    public String toString() {
        return "Metode Pembayaran: " + metode;
    }
}