/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2_ManajemenRumahSakit;

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

        // Daftar pasien dan status pembayaran
        List<Pasien> daftarPasien = new ArrayList<>();
        List<String> statusPembayaran = new ArrayList<>();

        // Daftar dokter
        List<Dokter> daftarDokter = new ArrayList<>();
        daftarDokter.add(new Dokter("Dr. Budi - Jantung"));
        daftarDokter.add(new Dokter("Dr. Ani - Mata"));
        daftarDokter.add(new Dokter("Dr. Dika - Anak"));

        // Daftar Metode Pembayaran
        List<MetodePembayaran> daftarMetode = new ArrayList<>();
        daftarMetode.add(new MetodePembayaran("Transfer"));
        daftarMetode.add(new MetodePembayaran("Tunai"));
        daftarMetode.add(new MetodePembayaran("Kartu Kredit"));

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
                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("Umur: ");
                    int umur = input.nextInt();
                    input.nextLine(); // clear buffer
                    System.out.print("Alamat: ");
                    String alamat = input.nextLine();

                    // Pilih dokter
                    System.out.println("Pilih Dokter:");
                    for (int i = 0; i < daftarDokter.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarDokter.get(i).cetakDokter());
                    }
                    System.out.print("Dokter: ");
                    int indexDokter = input.nextInt() - 1;
                    input.nextLine(); // clear buffer
                    String dokter = daftarDokter.get(indexDokter).cetakDokter();

                    System.out.print("Diagnosis: ");
                    String diagnosis = input.nextLine();

                    // Simpan ke rekam medis (sebagai string untuk versi ini)
                    RekamMedis rekam = new RekamMedis(nama, diagnosis, "17-04-2025");
                    daftarPasien.add(new Pasien(nama, umur, alamat));
                    statusPembayaran.add("Belum bayar");

                    System.out.println("✅ Data pasien berhasil disimpan!");
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR PASIEN ===");
                    if (daftarPasien.isEmpty()) {
                        System.out.println("Belum ada data pasien.");
                    } else {
                        for (int i = 0; i < daftarPasien.size(); i++) {
                            Pasien p = daftarPasien.get(i);
                            System.out.println((i + 1) + ". " + p.cetakPasien() + " | Status: " + statusPembayaran.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== PEMBAYARAN ===");
                    if (daftarPasien.isEmpty()) {
                        System.out.println("Belum ada pasien.");
                        break;
                    }

                    System.out.println("Pilih pasien:");
                    for (int i = 0; i < daftarPasien.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarPasien.get(i).cetakPasien());
                    }
                    System.out.print("Pasien: ");
                    int indexPasien = input.nextInt() - 1;
                    input.nextLine();

                    System.out.println("Pilih metode pembayaran:");
                    for (int i = 0; i < daftarMetode.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarMetode.get(i).cetakMetode());
                    }
                    System.out.print("Metode: ");
                    int indexMetode = input.nextInt() - 1;
                    input.nextLine();

                    System.out.println("Total pembayaran: Rp500.000");
                    System.out.print("Konfirmasi pembayaran? (y/n): ");
                    String confirm = input.nextLine();

                    if (confirm.equalsIgnoreCase("y")) {
                        statusPembayaran.set(indexPasien, "Sudah bayar");
                        System.out.println("✅ Pembayaran berhasil!");
                    } else {
                        System.out.println("❌ Pembayaran dibatalkan.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
