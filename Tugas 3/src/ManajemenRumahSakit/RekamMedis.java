/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
import java.util.ArrayList; // Mengimpor kelas ArrayList untuk menyimpan daftar pasien
import java.util.List; // Mengimpor kelas List sebagai tipe data daftar pasien
import java.util.Scanner; // Mengimpor kelas Scanner untuk input pengguna

public class RekamMedis { // Mendeklarasikan kelas RekamMedis
    private List<Pasien> daftarPasien; // List untuk menyimpan daftar pasien
    private List<String> statusPembayaran; // List untuk menyimpan status pembayaran pasien

    public RekamMedis() { // Konstruktor untuk menginisialisasi daftar pasien dan status pembayaran
        this.daftarPasien = new ArrayList<>(); // Membuat ArrayList untuk daftar pasien
        this.statusPembayaran = new ArrayList<>(); // Membuat ArrayList untuk status pembayaran
    }

    public void tambahPasien(Pasien pasien) { // Method untuk menambahkan pasien ke daftar
        daftarPasien.add(pasien); // Menambahkan pasien ke daftar pasien
        statusPembayaran.add("❌ Belum Bayar"); // Menetapkan status pembayaran awal sebagai "Belum Bayar"
    }

    public List<Pasien> getDaftarPasien() { return daftarPasien; } // Method getter untuk mendapatkan daftar pasien
    public List<String> getStatusPembayaran() { return statusPembayaran; } // Method getter untuk mendapatkan status pembayaran

    public void ubahStatusPembayaran(int index) { // Method untuk mengubah status pembayaran pasien
        statusPembayaran.set(index, "✅ Lunas"); // Mengubah status pembayaran menjadi "Lunas"
    }

    public void tampilkanRekamMedis() { // Method untuk menampilkan daftar rekam medis pasien
        System.out.println("\n=== REKAM MEDIS ===");
        if (daftarPasien.isEmpty()) { // Jika daftar pasien kosong
            System.out.println("Belum ada data pasien."); // Menampilkan pesan tidak ada data
            return;
        }
        for (int i = 0; i < daftarPasien.size(); i++) { // Looping untuk menampilkan semua pasien
            Pasien p = daftarPasien.get(i);
            System.out.println((i + 1) + ". " + p.getNama() + " | " + p.getUmur() + " | " + p.getDokter().getNama() + " | " + p.getDiagnosis() + " | " + statusPembayaran.get(i));
        }
    }

    public void prosesPembayaran(Scanner input) { // Method untuk memproses pembayaran pasien
        System.out.println("\n=== PEMBAYARAN ===");
        if (daftarPasien.isEmpty()) { // Jika tidak ada pasien yang terdaftar
            System.out.println("Belum ada data pasien."); // Menampilkan pesan tidak ada data
            return;
        }
        for (int i = 0; i < daftarPasien.size(); i++) { // Menampilkan daftar pasien untuk dipilih
            System.out.println((i + 1) + ". " + daftarPasien.get(i).getNama());
        }
        System.out.print("Pasien: ");
        int pasienIndex = input.nextInt() - 1; // Membaca pilihan pasien dari pengguna
        input.nextLine();

        System.out.println("Pilih Metode Pembayaran:");
        MetodePembayaran[] metode = MetodePembayaran.values();
        for (int i = 0; i < metode.length; i++) {
            System.out.println((i + 1) + ". " + metode[i]);
        }

        // Validasi input agar tidak keluar dari indeks yang tersedia
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
                input.next(); // Membersihkan input yang salah
            }
        }
        input.nextLine(); // Membersihkan buffer newline
    }
}