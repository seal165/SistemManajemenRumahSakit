/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab10_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public abstract class MetodePembayaran {
    protected double jumlah;
    protected String namaMetode;  // Atribut nama metode pembayaran

    public MetodePembayaran(double jumlah, String namaMetode) {
        this.jumlah = jumlah;
        this.namaMetode = namaMetode;  // Inisialisasi nama metode
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    // Override toString() untuk mengembalikan nama metode pembayaran
    @Override
    public String toString() {
        return namaMetode;  // Tampilkan nama metode pembayaran
    }

    // Method abstract
    public abstract String cetakMetode();
    public abstract String cetakStatus();
    public abstract boolean konfirmasiBayar(String namaPasien);
}