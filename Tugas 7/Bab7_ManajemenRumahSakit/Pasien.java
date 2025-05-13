/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Pasien {
    private String nama;
    private int umur;
    private String alamat;

    // Konstruktor untuk menginisialisasi objek Pasien dengan nama, umur, dokter, dan diagnosis
    public Pasien(String nama, int umur, String alamat) {
        this.nama = nama; // Menetapkan nilai parameter nama ke variabel nama
        this.umur = umur; // Menetapkan nilai parameter umur ke variabel umur
        this.alamat = alamat; // Menetapkan nilai parameter alamat ke variabel alamat
    }

    // Method getter untuk mendapatkan nama pasien
    public String getNama() { 
        return nama;
    }
    
    // Method getter untuk mendapatkan umur pasien
    public int getUmur() {
        return umur;
    }
    
    // Method getter untuk mendapatkan diagnosis pasien
    public String getAlamat() {
        return alamat;
    }
    
    public String tampilkanInfo() {
         return "Pasien : " + nama + "\nUmur   : " + umur + "\nAlamat : " + alamat;
    }
}