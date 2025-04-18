/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class RekamMedis {
    String namaPasien;
    String diagnosa;
    String tanggal;

    public RekamMedis(String namaPasien, String diagnosa, String tanggal) {
        this.namaPasien = namaPasien;
        this.diagnosa = diagnosa;
        this.tanggal = tanggal;
    }

    void dataRekam(String namaPasien, String diagnosa, String tanggal) {
        this.namaPasien = namaPasien;
        this.diagnosa = diagnosa;
        this.tanggal = tanggal;
    }

    String cetakRekam() {
        return "Pasien: " + namaPasien + ", Diagnosa: " + diagnosa + ", Tanggal: " + tanggal;
    }
}
