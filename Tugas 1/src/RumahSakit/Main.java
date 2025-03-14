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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RekamMedis rekamMedis = new RekamMedis();

        // Daftar dokter
        List<Dokter> daftarDokter = new ArrayList<>();
        daftarDokter.add(new Dokter("Dr. Budi", "Jantung"));
        daftarDokter.add(new Dokter("Dr. Ani", "Mata"));
        daftarDokter.add(new Dokter("Dr. Dika", "Anak"));

        while (true) {
            System.out.println("\n=== SISTEM REKAM MEDIS ===");
            System.out.println("1. Input Data Pasien");
            System.out.println("2. Lihat Rekam Medis");
            System.out.println("3. Pembayaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    // Input Data Pasien
                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("Umur: ");
                    int umur = input.nextInt();
                    input.nextLine(); // Clear buffer

                    // Pilih Dokter
                    System.out.println("Pilih Dokter:");
                    for (int i = 0; i < daftarDokter.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarDokter.get(i));
                    }
                    System.out.print("Dokter: ");
                    int dokterIndex = input.nextInt() - 1;
                    input.nextLine(); // Clear buffer
                    Dokter dokter = daftarDokter.get(dokterIndex);

                    System.out.print("Diagnosis: ");
                    String diagnosis = input.nextLine();

                    // Simpan ke rekam medis
                    Pasien pasien = new Pasien(nama, umur, dokter, diagnosis);
                    rekamMedis.tambahPasien(pasien);
                    System.out.println("✅ Data pasien berhasil disimpan!");
                    break;

                case 2:
                    // Lihat Rekam Medis
                    System.out.println("\n=== REKAM MEDIS ===");
                    List<Pasien> pasienList = rekamMedis.getDaftarPasien();
                    List<String> statusList = rekamMedis.getStatusPembayaran();

                    if (pasienList.isEmpty()) {
                        System.out.println("Belum ada data pasien.");
                    } else {
                        for (int i = 0; i < pasienList.size(); i++) {
                            Pasien p = pasienList.get(i);
                            System.out.println((i + 1) + ". " + p.getNama() + " | " +
                                    p.getUmur() + " | " + p.getDokter().getNama() + " | " +
                                    p.getDiagnosis() + " | " + statusList.get(i));
                        }
                    }
                    break;

                case 3:
                    // Proses Pembayaran
                    System.out.println("\n=== PEMBAYARAN ===");
                    System.out.println("Pilih pasien untuk membayar:");
                    for (int i = 0; i < rekamMedis.getDaftarPasien().size(); i++) {
                        System.out.println((i + 1) + ". " + rekamMedis.getDaftarPasien().get(i).getNama());
                    }
                    System.out.print("Pasien: ");
                    int pasienIndex = input.nextInt() - 1;
                    input.nextLine(); // Clear buffer

                    // Pilih metode pembayaran
                    System.out.println("Pilih Metode Pembayaran:");
                    MetodePembayaran[] metode = MetodePembayaran.values();
                    for (int i = 0; i < metode.length; i++) {
                        System.out.println((i + 1) + ". " + metode[i]);
                    }
                    System.out.print("Metode: ");
                    int metodeIndex = input.nextInt() - 1;
                    input.nextLine(); // Clear buffer

                    MetodePembayaran metodeBayar = metode[metodeIndex];
                    Pasien pasienBayar = rekamMedis.getDaftarPasien().get(pasienIndex);

                    // Konfirmasi Pembayaran
                    System.out.println("\nKonfirmasi Pembayaran");
                    System.out.println("Nama: " + pasienBayar.getNama());
                    System.out.println("Total: Rp 500.000");
                    System.out.println("Metode: " + metodeBayar);
                    System.out.print("Lanjutkan pembayaran? (y/n): ");
                    String konfirmasi = input.nextLine();

                    if (konfirmasi.equalsIgnoreCase("y")) {
                        rekamMedis.ubahStatusPembayaran(pasienIndex);
                        System.out.println("✅ Pembayaran berhasil!");
                    } else {
                        System.out.println("❌ Pembayaran dibatalkan.");
                    }
                    break;

                case 4:
                    // Keluar
                    System.out.println("Terima kasih!");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}