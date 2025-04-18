/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Pembayaran {
    double jumlah;
    String metode;
    String namaPasien;
    String status = "Belum Lunas";

    public Pembayaran(double jumlah, String metode, String namaPasien) {
        this.jumlah = jumlah;
        this.metode = metode;
        this.namaPasien = namaPasien;
    }

    void dataPembayaran(double jumlah, String metode, String namaPasien) {
        this.jumlah = jumlah;
        this.metode = metode;
        this.namaPasien = namaPasien;
    }

    String cetakPembayaran() {
        return String.valueOf(jumlah);
    }

    String cetakMetode() {
        return metode;
    }

    String cetakStatus() {
        return status;
    }

    void setStatus(String status) {
        this.status = status;
    }

    boolean konfirmasiBayar(Pasien pasien) {
        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(null,
                "Konfirmasi pembayaran untuk " + pasien.nama + "?", "Konfirmasi",
                javax.swing.JOptionPane.YES_NO_OPTION);
        return konfirmasi == javax.swing.JOptionPane.YES_OPTION;
    }
}
