/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// Subclass Pasien
class Pasien extends Person {
    private String idPasien;
    private String name;
    private int age;
    private String diagnosis;
    private MetodePembayaran metodePembayaran;
    private Asuransi asuransi;
    private Obat obat;
    private double biaya;
    
    public Pasien(String name, int age, String idPasien, String diagnosis, MetodePembayaran metodePembayaran, Asuransi asuransi) {
        super(name, age); // Panggil constructor superclass (Person) dengan nilai yang benar
        this.idPasien = idPasien;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.metodePembayaran = metodePembayaran;
        this.asuransi = asuransi;
        this.biaya = hitungBiaya(); // Hitung biaya langsung saat pasien dibuat
    }
    
    public double getBiaya() {
        return biaya;
    }
    
    private double hitungBiaya() {
        double biayaDasar = 500000;
        double biayaFinal = biayaDasar;

        if (asuransi != null && asuransi.getNamaAsuransi().equals("Ada")) {
            double coverPersen = asuransi.getCoverPersen();
            biayaFinal = biayaDasar * (1 - coverPersen / 100);
        }

        return biayaFinal;
    }
    
    public void dataAsuransi(Asuransi asuransi) {
        this.asuransi = asuransi;
        this.biaya = hitungBiaya(); // Perbarui biaya setelah mengganti asuransi
    }

    void dataAsuransi(String asuransi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getName() {
        return name;
    }
}