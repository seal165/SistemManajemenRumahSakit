/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Pasien> daftarPasien = new ArrayList<>();
        List<RekamMedis> daftarRekam = new ArrayList<>();
        List<Obat> daftarObat = new ArrayList<>();
        List<Asuransi> daftarAsuransi = new ArrayList<>();
        List<String> statusPembayaran = new ArrayList<>();

        List<Dokter> daftarDokter = new ArrayList<>();
        daftarDokter.add(new Dokter("Budi - Jantung"));
        daftarDokter.add(new Dokter("Ani - Mata"));
        daftarDokter.add(new Dokter("Dika - Anak"));

        List<MetodePembayaran> daftarMetode = new ArrayList<>();
        // Menambahkan metode pembayaran "Transfer" menggunakan anonymous class
        daftarMetode.add(new MetodePembayaran(0, "Transfer") {
        @Override
        public String cetakMetode() {
            return "Transfer";
        }

        @Override
        public String cetakStatus() {
            return "Status: Belum Lunas";
        }

        @Override
        public boolean konfirmasiBayar(String namaPasien) {
            return true;  // Misalnya otomatis "konfirmasi" untuk Transfer
        }
    });

    daftarMetode.add(new MetodePembayaran(0, "Tunai") {
        @Override
        public String cetakMetode() {
            return "Tunai";
        }

        @Override
        public String cetakStatus() {
            return "Status: Belum Lunas";
        }

        @Override
        public boolean konfirmasiBayar(String namaPasien) {
            return true;  // Misalnya otomatis "konfirmasi" untuk Tunai
        }
    });

    daftarMetode.add(new MetodePembayaran(0, "Kartu Kredit") {
        @Override
        public String cetakMetode() {
            return "Kartu Kredit";
        }

        @Override
        public String cetakStatus() {
            return "Status: Belum Lunas";
        }

        @Override
        public boolean konfirmasiBayar(String namaPasien) {
            return true;  // Misalnya otomatis "konfirmasi" untuk Kartu Kredit
        }
    });


        while (true) {
            System.out.println("\n=== SISTEM RUMAH SAKIT ===");
            System.out.println("1. Input Data Pasien");
            System.out.println("2. Lihat Rekam Medis");
            System.out.println("3. Pembayaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("Umur: ");
                    int umur = input.nextInt(); input.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = input.nextLine();

                    System.out.println("Pilih Dokter:");
                    for (int i = 0; i < daftarDokter.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarDokter.get(i));
                    }
                    System.out.print("Dokter: ");
                    int indexDokter = input.nextInt() - 1; input.nextLine();
                    Dokter dokter = daftarDokter.get(indexDokter);

                    System.out.print("Diagnosis: ");
                    String diagnosis = input.nextLine();

                    System.out.println("Pilih Jenis Obat:");
                    System.out.println("1. Obat Umum");
                    System.out.println("2. Obat Resep");
                    System.out.print("Pilih Jenis Obat (1/2): ");
                    int jenisObatPilihan = input.nextInt();
                    input.nextLine();  // Input jenis obat

                    String jenisObat = (jenisObatPilihan == 1) ? "Obat Umum" : "Obat Resep"; // Tentukan jenis obat
                    System.out.print("Harga " + jenisObat + ": ");
                    double hargaObat = input.nextDouble();
                    input.nextLine(); // Input harga obat

                    // Simpan jenis obat dan harga obat
                    Obat obat = new Obat(jenisObat, hargaObat); // Buat objek Obat dengan jenis obat yang dipilih

                    Asuransi asuransi = null;
                    System.out.print("Apakah pasien memiliki asuransi? (y/n): ");
                    String adaAsuransi = input.nextLine();
                    if (adaAsuransi.equalsIgnoreCase("y")) {
                        System.out.print("Nama Asuransi: ");
                        String namaAsuransi = input.nextLine();
                        System.out.print("Persentase Tanggungan (1-100): ");
                        double persen = input.nextDouble();
                        input.nextLine();
                        asuransi = new Asuransi(namaAsuransi, persen / 100.0, hargaObat);  // Jumlah diambil dari harga obat
                    }

                    daftarPasien.add(new Pasien(nama, umur, alamat));
                    daftarRekam.add(new RekamMedis(nama, umur, alamat, diagnosis, "18-04-2025"));
                    daftarObat.add(obat);
                    daftarAsuransi.add(asuransi);
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
                            RekamMedis r = daftarRekam.get(i);
                            System.out.println((i + 1) + ". " + r.cetakRekam() +
                                    " | Status: " + statusPembayaran.get(i));
                        }
                    }
                    break;

                case 3:
                    if (daftarPasien.isEmpty()) {
                        System.out.println("Belum ada pasien.");
                        break;
                    }

                    System.out.println("\n=== PEMBAYARAN ===");
                    System.out.println("Pilih pasien:");
                    for (int i = 0; i < daftarPasien.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarPasien.get(i).getNama());
                    }
                    System.out.print("Pasien: ");
                    int indexPasien = input.nextInt() - 1; input.nextLine();

                    Obat obatPasien = daftarObat.get(indexPasien);
                    Asuransi asuransiPasien = daftarAsuransi.get(indexPasien);

                    double harga = obatPasien.getHarga();
                    double diskon = 0;
                    if (asuransiPasien != null) {
                        diskon = harga * asuransiPasien.getPersenTanggungan();
                    }

                    double total = harga - diskon;
                    System.out.println("Harga obat: Rp" + harga);
                    System.out.println("Tanggungan asuransi: Rp" + diskon);
                    System.out.println("Total pembayaran: Rp" + total);

                    System.out.println("Pilih metode pembayaran:");
                    for (int i = 0; i < daftarMetode.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarMetode.get(i));
                    }
                    System.out.print("Metode: ");
                    int metode = input.nextInt(); input.nextLine();

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