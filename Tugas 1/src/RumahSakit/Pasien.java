/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Pasien {
    private String nama;
    private int umur;
    private Dokter dokter;
    private String diagnosis;

    // Constructor untuk inisialisasi data pasien
    public Pasien(String nama, int umur, Dokter dokter, String diagnosis) {
        this.nama = nama;
        this.umur = umur;
        this.dokter = dokter;
        this.diagnosis = diagnosis;
    }

    // Getter untuk mengambil nilai atribut
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public Dokter getDokter() { return dokter; }
    public String getDiagnosis() { return diagnosis; }
}