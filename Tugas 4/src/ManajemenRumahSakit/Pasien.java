/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Pasien { // Mendeklarasikan kelas Pasien
    private String nama; // Variabel untuk menyimpan nama pasien
    private int umur; // Variabel untuk menyimpan umur pasien
    private Dokter dokter; // Variabel untuk menyimpan dokter yang menangani pasien
    private String diagnosis; // Variabel untuk menyimpan diagnosis pasien

    // Konstruktor untuk menginisialisasi objek Pasien dengan nama, umur, dokter, dan diagnosis
    public Pasien(String nama, int umur, Dokter dokter, String diagnosis) {
        this.nama = nama; // Menetapkan nilai parameter nama ke variabel nama
        this.umur = umur; // Menetapkan nilai parameter umur ke variabel umur
        this.dokter = dokter; // Menetapkan nilai parameter dokter ke variabel dokter
        this.diagnosis = diagnosis; // Menetapkan nilai parameter diagnosis ke variabel diagnosis
    }

    // Method getter untuk mendapatkan nama pasien
    public String getNama() { return nama; }
    
    // Method getter untuk mendapatkan umur pasien
    public int getUmur() { return umur; }
    
    // Method getter untuk mendapatkan dokter pasien
    public Dokter getDokter() { return dokter; }
    
    // Method getter untuk mendapatkan diagnosis pasien
    public String getDiagnosis() { return diagnosis; }
}