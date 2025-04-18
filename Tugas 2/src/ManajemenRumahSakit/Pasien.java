/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Pasien {
    String nama;
    int umur;
    String alamat;

    public Pasien(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    void dataPasien(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    String cetakPasien() {
        return "Nama: " + nama + ", Umur: " + umur + ", Alamat: " + alamat;
    }

    String cetakNama() {
        return nama;
    }

    String cetakUmur() {
        return umur + " tahun";
    }
    
    String cetakAlamat() {
        return alamat;
    }
}
