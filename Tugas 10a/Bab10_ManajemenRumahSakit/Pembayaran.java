/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab10_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Pembayaran {
    private MetodePembayaran metodePembayaran;
    private String namaPasien;
    private String status = "Belum Lunas";

    public Pembayaran(MetodePembayaran metodePembayaran, String namaPasien) {
        this.metodePembayaran = metodePembayaran;
        this.namaPasien = namaPasien;
    }

    // Getter dan Setter
    public MetodePembayaran getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(MetodePembayaran metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
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
        return String.valueOf(metodePembayaran.getJumlah());
    }

    public String cetakMetode() {
        return metodePembayaran.cetakMetode();
    }

    public String cetakStatus() {
        return status;
    }

    // Konfirmasi pembayaran
    public boolean konfirmasiBayar() {
        return metodePembayaran.konfirmasiBayar(namaPasien);
    }
}