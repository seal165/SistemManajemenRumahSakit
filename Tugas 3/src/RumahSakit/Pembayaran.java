/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// Class Pembayaran
class Pembayaran {
    private Pasien pasien;
    
    public Pembayaran(Pasien pasien) {
        this.pasien = pasien;
    }
    
    public double getTotalBiaya() {
        return pasien.getBiaya();
    }
}