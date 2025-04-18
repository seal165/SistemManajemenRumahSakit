/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class RekamMedis {
    private String namaPasien;
    private String diagnosa;
    private String tanggal;

    public RekamMedis(String namaPasien, String diagnosa, String tanggal) {
        this.namaPasien = namaPasien;
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
        return "Pasien: " + namaPasien + ", Diagnosa: " + diagnosa + ", Tanggal: " + tanggal;
    }

    // Method untuk memperbarui data sekaligus
    public void dataRekam(String namaPasien, String diagnosa, String tanggal) {
        this.namaPasien = namaPasien;
        this.diagnosa = diagnosa;
        this.tanggal = tanggal;
    }
}