/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// Import class JOptionPane dari Swing untuk menampilkan dialog
import javax.swing.JOptionPane;

public class Pembayaran {
    private double jumlah;
    private String metode;
    private String namaPasien;
    private String status = "Belum Lunas";

    public Pembayaran(double jumlah, String metode, String namaPasien) {
        this.jumlah = jumlah;
        this.metode = metode;
        this.namaPasien = namaPasien;
    }

    // Getter dan Setter
    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Metode untuk mencetak data
    public String cetakPembayaran() {
        return String.valueOf(jumlah);
    }

    public String cetakMetode() {
        return metode;
    }

    public String cetakStatus() {
        return status;
    }

    // Konfirmasi pembayaran
    public boolean konfirmasiBayar(Pasien pasien) {
        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(null,
                "Konfirmasi pembayaran untuk " + pasien.getNama() + "?", "Konfirmasi",
                javax.swing.JOptionPane.YES_NO_OPTION);
        return konfirmasi == javax.swing.JOptionPane.YES_OPTION;
    }
}