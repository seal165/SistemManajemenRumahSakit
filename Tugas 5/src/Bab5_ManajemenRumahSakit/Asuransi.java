/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Asuransi {
    protected String namaAsuransi;
    protected double persenTanggungan; // contoh: 0.8 artinya 80% ditanggung

    public Asuransi(String namaAsuransi, double persenTanggungan) {
        this.namaAsuransi = namaAsuransi;
        this.persenTanggungan = persenTanggungan;
    }

    public String getNamaAsuransi() { return namaAsuransi; }
    public double getPersenTanggungan() { return persenTanggungan; }

    @Override
    public String toString() {
        return namaAsuransi + " (" + (int)(persenTanggungan * 100) + "% ditanggung)";
    }
}