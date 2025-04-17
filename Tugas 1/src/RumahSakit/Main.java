/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1_ManajemenRumahSakit;

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
        Dokter d1 = new Dokter(); d1.dataDokter("Dr. Budi - Jantung");
        Dokter d2 = new Dokter(); d2.dataDokter("Dr. Ani - Mata");
        Dokter d3 = new Dokter(); d3.dataDokter("Dr. Dika - Anak");
        daftarDokter.add(d1);
        daftarDokter.add(d2);
        daftarDokter.add(d3);
        
        // Daftar Metode Pembayaran
        List<MetodePembayaran> daftarMetodePembayaran = new ArrayList<>();
        MetodePembayaran mp1 = new MetodePembayaran(); mp1.dataMetodePembayaran("Transfer");
        MetodePembayaran mp2 = new MetodePembayaran(); mp2.dataMetodePembayaran("Tunai");
        MetodePembayaran mp3 = new MetodePembayaran(); mp3.dataMetodePembayaran("Kartu Kredit");
        daftarMetodePembayaran.add(mp1);
        daftarMetodePembayaran.add(mp2);
        daftarMetodePembayaran.add(mp3);

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
                    Pasien pasien = new Pasien();
                    System.out.print("Nama Pasien: ");
                    pasien.dataNama(input.nextLine());
                    System.out.print("Umur: ");
                    pasien.dataUmur(input.nextInt());
                    input.nextLine(); // Clear buffer

                    // Pilih Dokter
                    System.out.println("Pilih Dokter:");
                    for (int i = 0; i < daftarDokter.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarDokter.get(i).cetakDokter());
                    }
                    System.out.print("Dokter: ");
                    int dokterIndex = input.nextInt() - 1;
                    input.nextLine(); // Clear buffer
                    pasien.dataDokter(daftarDokter.get(dokterIndex));

                    System.out.print("Diagnosis: ");
                    pasien.dataDiagnosis(input.nextLine());

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
                            System.out.println((i + 1) + ". " + p.cetakNama() + " | " +
                                    p.cetakUmur() + " | " + p.cetakDokter().cetakDokter() + " | " +
                                    p.cetakDiagnosis() + " | " + statusList.get(i));
                        }
                    }
                    break;

                case 3:
                    // Proses Pembayaran
                    System.out.println("\n=== PEMBAYARAN ===");
                    List<Pasien> daftar = rekamMedis.getDaftarPasien();
                    if (daftar.isEmpty()) {
                        System.out.println("Belum ada pasien.");
                        break;
                    }

                    System.out.println("Pilih pasien untuk membayar:");
                    for (int i = 0; i < daftar.size(); i++) {
                        System.out.println((i + 1) + ". " + daftar.get(i).cetakNama());
                    }
                    System.out.print("Pasien: ");
                    int pasienIndex = input.nextInt() - 1;
                    input.nextLine(); // Clear buffer

                    // Pilih metode pembayaran
                    System.out.println("Pilih Metode Pembayaran:");
                    for (int i = 0; i < daftarMetodePembayaran.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarMetodePembayaran.get(i).cetakMetodePembayaran());
                    }
                    System.out.print("Metode: ");
                    int metodeIndex = input.nextInt() - 1;
                    input.nextLine(); // Clear buffer

                    MetodePembayaran metodeTerpilih = daftarMetodePembayaran.get(metodeIndex);
                    Pasien pasienBayar = daftar.get(pasienIndex);

                    // Konfirmasi Pembayaran
                    System.out.println("\nKonfirmasi Pembayaran");
                    System.out.println("Nama: " + pasienBayar.cetakNama());
                    System.out.println("Total: Rp 500.000");
                    System.out.println("Metode: " + metodeTerpilih.cetakMetodePembayaran());
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
