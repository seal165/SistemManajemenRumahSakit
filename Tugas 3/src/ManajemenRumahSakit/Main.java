/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
import java.util.ArrayList; // Mengimpor kelas ArrayList untuk menyimpan daftar dokter dan pasien
import java.util.List; // Mengimpor kelas List sebagai antarmuka daftar
import java.util.Scanner; // Mengimpor kelas Scanner untuk menerima input dari pengguna

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input pengguna
        RekamMedis rekamMedis = new RekamMedis(); // Membuat objek RekamMedis untuk menyimpan data pasien

        // Daftar dokter
        List<Dokter> daftarDokter = new ArrayList<>(); // Membuat daftar dokter dengan ArrayList
        daftarDokter.add(new Dokter("Dr. Budi", "Jantung")); // Menambahkan dokter spesialis jantung
        daftarDokter.add(new Dokter("Dr. Ani", "Mata")); // Menambahkan dokter spesialis mata
        daftarDokter.add(new Dokter("Dr. Dika", "Anak")); // Menambahkan dokter spesialis anak

        while (true) { // Perulangan tak terbatas untuk menampilkan menu
            System.out.println("\n=== SISTEM REKAM MEDIS ===");
            System.out.println("1. Input Data Pasien");
            System.out.println("2. Lihat Rekam Medis");
            System.out.println("3. Pembayaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt(); // Membaca pilihan menu dari pengguna
            input.nextLine(); // Membersihkan buffer input

            switch (pilihan) {
                case 1:
                    // Input Data Pasien
                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine(); // Membaca nama pasien
                    System.out.print("Umur: ");
                    int umur = input.nextInt(); // Membaca umur pasien
                    input.nextLine(); // Membersihkan buffer input

                    // Pilih Dokter
                    System.out.println("Pilih Dokter:");
                    for (int i = 0; i < daftarDokter.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarDokter.get(i)); // Menampilkan daftar dokter
                    }
                    System.out.print("Dokter: ");
                    int dokterIndex = input.nextInt() - 1; // Membaca pilihan dokter dari pengguna
                    input.nextLine(); // Membersihkan buffer input
                    Dokter dokter = daftarDokter.get(dokterIndex); // Mendapatkan objek dokter berdasarkan pilihan

                    System.out.print("Diagnosis: ");
                    String diagnosis = input.nextLine(); // Membaca diagnosis pasien

                    // Simpan ke rekam medis
                    Pasien pasien = new Pasien(nama, umur, dokter, diagnosis); // Membuat objek pasien
                    rekamMedis.tambahPasien(pasien); // Menambahkan pasien ke dalam rekam medis
                    System.out.println("✅ Data pasien berhasil disimpan!");
                    break;

                case 2:
                    // Lihat Rekam Medis
                    System.out.println("\n=== REKAM MEDIS ===");
                    List<Pasien> pasienList = rekamMedis.getDaftarPasien(); // Mendapatkan daftar pasien
                    List<String> statusList = rekamMedis.getStatusPembayaran(); // Mendapatkan status pembayaran pasien

                    if (pasienList.isEmpty()) { // Mengecek apakah ada data pasien
                        System.out.println("Belum ada data pasien.");
                    } else {
                        for (int i = 0; i < pasienList.size(); i++) {
                            Pasien p = pasienList.get(i); // Mengambil objek pasien
                            System.out.println((i + 1) + ". " + p.getNama() + " | " +
                                    p.getUmur() + " | " + p.getDokter().getNama() + " | " +
                                    p.getDiagnosis() + " | " + statusList.get(i)); // Menampilkan data pasien
                        }
                    }
                    break;

                case 3:
                    // Proses Pembayaran
                    System.out.println("\n=== PEMBAYARAN ===");
                    System.out.println("Pilih pasien untuk membayar:");
                    for (int i = 0; i < rekamMedis.getDaftarPasien().size(); i++) {
                        System.out.println((i + 1) + ". " + rekamMedis.getDaftarPasien().get(i).getNama()); // Menampilkan daftar pasien
                    }
                    System.out.print("Pasien: ");
                    int pasienIndex = input.nextInt() - 1; // Membaca pilihan pasien untuk pembayaran
                    input.nextLine(); // Membersihkan buffer input

                    // Pilih metode pembayaran
                    System.out.println("Pilih Metode Pembayaran:");
                    MetodePembayaran[] metode = MetodePembayaran.values(); // Mendapatkan daftar metode pembayaran
                    for (int i = 0; i < metode.length; i++) {
                        System.out.println((i + 1) + ". " + metode[i]); // Menampilkan metode pembayaran
                    }
                    System.out.print("Metode: ");
                    int metodeIndex = input.nextInt() - 1; // Membaca pilihan metode pembayaran
                    input.nextLine(); // Membersihkan buffer input

                    MetodePembayaran metodeBayar = metode[metodeIndex]; // Mendapatkan metode pembayaran yang dipilih
                    Pasien pasienBayar = rekamMedis.getDaftarPasien().get(pasienIndex); // Mendapatkan pasien yang akan membayar

                    // Konfirmasi Pembayaran
                    System.out.println("\nKonfirmasi Pembayaran");
                    System.out.println("Nama: " + pasienBayar.getNama()); // Menampilkan nama pasien
                    System.out.println("Total: Rp 500.000"); // Menampilkan total pembayaran
                    System.out.println("Metode: " + metodeBayar); // Menampilkan metode pembayaran
                    System.out.print("Lanjutkan pembayaran? (y/n): ");
                    String konfirmasi = input.nextLine(); // Membaca konfirmasi dari pengguna

                    if (konfirmasi.equalsIgnoreCase("y")) { // Mengecek apakah pengguna menyetujui pembayaran
                        rekamMedis.ubahStatusPembayaran(pasienIndex); // Mengubah status pembayaran pasien
                        System.out.println("✅ Pembayaran berhasil!");
                    } else {
                        System.out.println("❌ Pembayaran dibatalkan.");
                    }
                    break;

                case 4:
                    // Keluar
                    System.out.println("Terima kasih!"); // Pesan keluar
                    input.close(); // Menutup scanner
                    System.exit(0); // Menghentikan program
                    break;

                default:
                    System.out.println("Pilihan tidak valid!"); // Menampilkan pesan jika input tidak sesuai
            }
        }
    }
}