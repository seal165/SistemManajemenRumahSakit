/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Dokter { // Mendeklarasikan kelas Dokter
    private String dokter; // Variabel untuk menyimpan nama dokter

    // Konstruktor untuk menginisialisasi objek Dokter dengan nama dan spesialisasi
    public Dokter(String dokter) {
        this.dokter = dokter; // Menetapkan nilai parameter dokter ke variabel dokter
    }

    // Method getter untuk mendapatkan nama dokter
    public String getDokter() { return dokter; }

    // Override method toString untuk mengembalikan representasi string dari objek Dokter
    @Override
    public String toString() {
        return "Dokter" + dokter;
    }
}