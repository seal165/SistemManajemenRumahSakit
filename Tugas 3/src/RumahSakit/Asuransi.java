/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// Class Asuransi
class Asuransi {
    private String namaAsuransi;
    private double coverPersen;
    
    public Asuransi(String namaAsuransi, int par) {
        this.namaAsuransi = namaAsuransi;
        if (namaAsuransi.equals("BPJS")) {
            this.coverPersen = 100;
        } else if (namaAsuransi.equals("Prudential")) {
            this.coverPersen = 80;
        } else {
            this.coverPersen = 0;
        }
    }
    
    public String getNamaAsuransi() { return namaAsuransi; }
    public double getCoverPersen() { return coverPersen; }
}