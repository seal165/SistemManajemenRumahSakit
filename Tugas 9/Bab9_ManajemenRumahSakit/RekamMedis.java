/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9_ManajemenRumahSakit;

import Bab8_ManajemenRumahSakit.*;

/**
 *
 * @author Eolia Shalbillah
 */
public class RekamMedis {
    private String namaPasien;
    private int umur;
    private String alamat;
    private String diagnosa;
    private String tanggal;

    public RekamMedis(String namaPasien, int umur, String alamat, String diagnosa, String tanggal) {
        this.namaPasien = namaPasien;
        this.umur = umur;
        this.alamat = alamat;
        this.diagnosa = diagnosa;
        this.tanggal = tanggal;
    }

    // Getter dan Setter
    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }
    
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    // Method untuk mencetak rekam medis
    public String cetakRekam() {
        return "Nama Pasien: " + namaPasien + ", Umur: " + umur + ", Alamat: " + alamat + ", Diagnosa: " + diagnosa + ", Tanggal: " + tanggal;
    }

    // Method untuk memperbarui data sekaligus
    public void dataRekam(String namaPasien, int umur, String alamat, String diagnosa, String tanggal) {
        this.namaPasien = namaPasien;
        this.umur = umur;
        this.alamat = alamat;
        this.diagnosa = diagnosa;
        this.tanggal = tanggal;
    }
}