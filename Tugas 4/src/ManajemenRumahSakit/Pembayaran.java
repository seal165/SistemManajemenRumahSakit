/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// Import class JOptionPane dari Swing untuk menampilkan dialog
import javax.swing.JOptionPane;

// Deklarasi class Pembayaran
public class Pembayaran {
    // Atribut untuk menyimpan data pasien dan metode pembayaran
    private Pasien pasien;
    private MetodePembayaran metode;

    // Konstruktor untuk inisialisasi atribut
    public Pembayaran(Pasien pasien, MetodePembayaran metode) {
        this.pasien = pasien;
        this.metode = metode;
    }

    // Method untuk konfirmasi pembayaran dengan dialog konfirmasi
    public boolean konfirmasiBayar() {
        int confirm = JOptionPane.showConfirmDialog(null,
                "Nama Pasien: " + pasien.getNama() +
                "\nTotal Bayar: Rp 500.000\nMetode: " + metode,
                "Konfirmasi Pembayaran",
                JOptionPane.YES_NO_OPTION);

        return confirm == JOptionPane.YES_OPTION;
    }

    // Getter untuk mendapatkan data pasien
    public Pasien getPasien() {
        return pasien;
    }

    // Setter untuk mengubah data pasien
    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    // Getter untuk mendapatkan metode pembayaran
    public MetodePembayaran getMetode() {
        return metode;
    }

    // Setter untuk mengubah metode pembayaran
    public void setMetode(MetodePembayaran metode) {
        this.metode = metode;
    }
}