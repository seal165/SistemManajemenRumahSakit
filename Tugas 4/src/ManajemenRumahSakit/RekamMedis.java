/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// Import ArrayList dan Scanner
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Deklarasi class RekamMedis
public class RekamMedis {
    // Atribut: daftar pasien dan status pembayaran
    private List<Pasien> daftarPasien;
    private List<String> statusPembayaran;

    // Konstruktor untuk inisialisasi list
    public RekamMedis() {
        this.daftarPasien = new ArrayList<>();
        this.statusPembayaran = new ArrayList<>();
    }

    // Menambahkan pasien baru dan status pembayaran default "Belum Bayar"
    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
        statusPembayaran.add("❌ Belum Bayar");
    }

    // Getter untuk mengambil semua pasien
    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    // Mengambil status pembayaran berdasarkan index
    public String getStatusPembayaran(int index) {
        return statusPembayaran.get(index);
    }

    // Mengubah status pembayaran pasien menjadi "Lunas"
    public void ubahStatusPembayaran(int index) {
        statusPembayaran.set(index, "✅ Lunas");
    }

    // Menampilkan seluruh data rekam medis ke console
    public void tampilkanRekamMedis() {
        System.out.println("\n=== REKAM MEDIS ===");
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
            return;
        }
        for (int i = 0; i < daftarPasien.size(); i++) {
            Pasien p = daftarPasien.get(i);
            System.out.println((i + 1) + ". " + p.getNama() + " | " + p.getUmur() + " | " + p.getDokter().getNama() + " | " + p.getDiagnosis() + " | " + statusPembayaran.get(i));
        }
    }

    // Proses pemilihan pasien dan metode pembayaran dari input pengguna
    public void prosesPembayaran(Scanner input) {
        System.out.println("\n=== PEMBAYARAN ===");
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
            return;
        }

        for (int i = 0; i < daftarPasien.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPasien.get(i).getNama());
        }

        System.out.print("Pasien: ");
        int pasienIndex = input.nextInt() - 1;
        input.nextLine();

        System.out.println("Pilih Metode Pembayaran:");
        MetodePembayaran[] metode = MetodePembayaran.values();
        for (int i = 0; i < metode.length; i++) {
            System.out.println((i + 1) + ". " + metode[i]);
        }

        int metodeIndex = -1;
        while (metodeIndex < 0 || metodeIndex >= metode.length) {
            System.out.print("Metode: ");
            if (input.hasNextInt()) {
                metodeIndex = input.nextInt() - 1;
                if (metodeIndex < 0 || metodeIndex >= metode.length) {
                    System.out.println("❌ Pilihan tidak valid! Coba lagi.");
                }
            } else {
                System.out.println("❌ Masukkan angka yang benar!");
                input.next();
            }
        }
        input.nextLine();
    }

    // Method ini belum diimplementasi, akan melempar error saat dipanggil
    List<String> getStatusPembayaran() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}