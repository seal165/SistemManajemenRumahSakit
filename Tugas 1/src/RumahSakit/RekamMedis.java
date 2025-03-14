/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
import java.util.ArrayList;
import java.util.List;

public class RekamMedis {
    private List<Pasien> daftarPasien = new ArrayList<>();
    private List<String> statusPembayaran = new ArrayList<>();

    // Menambahkan pasien ke daftar
    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
        statusPembayaran.add("❌ Belum Bayar");
    }

    public List<Pasien> getDaftarPasien() { return daftarPasien; }
    public List<String> getStatusPembayaran() { return statusPembayaran; }

    // Mengubah status pembayaran pasien menjadi "Lunas"
    public void ubahStatusPembayaran(int index) {
        statusPembayaran.set(index, "✅ Lunas");
    }
}