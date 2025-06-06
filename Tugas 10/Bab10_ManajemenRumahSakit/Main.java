/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab10_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Pasien> daftarPasien = new ArrayList<>();
        List<RekamMedis> daftarRekam = new ArrayList<>();
        List<Obat> daftarObat = new ArrayList<>();
        List<Asuransi> daftarAsuransi = new ArrayList<>();
        List<String> statusPembayaran = new ArrayList<>();

        List<Dokter> daftarDokter = Arrays.asList(
                new Dokter("Budi - Jantung"),
                new Dokter("Ani - Mata"),
                new Dokter("Dika - Anak")
        );

        List<MetodePembayaran> daftarMetode = Arrays.asList(
            new MetodePembayaran(0, "Transfer") {
                public String cetakMetode() { return "Transfer"; }
                public String cetakStatus() { return "Status: Belum Lunas"; }
                public boolean konfirmasiBayar(String namaPasien) { return true; }
            },
            new MetodePembayaran(0, "Tunai") {
                public String cetakMetode() { return "Tunai"; }
                public String cetakStatus() { return "Status: Belum Lunas"; }
                public boolean konfirmasiBayar(String namaPasien) { return true; }
            },
            new MetodePembayaran(0, "Kartu Kredit") {
                public String cetakMetode() { return "Kartu Kredit"; }
                public String cetakStatus() { return "Status: Belum Lunas"; }
                public boolean konfirmasiBayar(String namaPasien) { return true; }
            }
        );

        while (true) {
            System.out.println("\n=== SISTEM RUMAH SAKIT ===");
            System.out.println("1. Input Data Pasien");
            System.out.println("2. Lihat Rekam Medis");
            System.out.println("3. Pembayaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan;
            try {
                pilihan = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("❌ Pilihan harus angka.");
                input.nextLine(); continue;
            }

            switch (pilihan) {
                case 1:
                    try {
                        System.out.print("Nama Pasien: ");
                        String nama = input.nextLine();
                        System.out.print("Umur: ");
                        int umur = input.nextInt(); input.nextLine();
                        System.out.print("Alamat: ");
                        String alamat = input.nextLine();

                        System.out.println("Pilih jenis pasien:");
                        System.out.println("1. Rawat Inap");
                        System.out.println("2. Rawat Jalan");
                        System.out.print("Pilihan: ");
                        int jenisPasien = input.nextInt(); input.nextLine();

                        Pasien pasien;
                        if (jenisPasien == 1) {
                            System.out.print("Lama inap (hari): ");
                            int hari = input.nextInt(); input.nextLine();
                            pasien = new PasienRawatInap(nama, umur, alamat, hari);
                        } else {
                            System.out.print("Jadwal kontrol: ");
                            String jadwal = input.nextLine();
                            pasien = new PasienRawatJalan(nama, umur, alamat, jadwal);
                        }

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
                        int jenisObatPilihan = input.nextInt(); input.nextLine();

                        String jenisObat = (jenisObatPilihan == 1) ? "Obat Umum" : "Obat Resep";
                        System.out.print("Harga " + jenisObat + ": ");
                        double hargaObat = input.nextDouble(); input.nextLine();

                        Obat obat = new Obat(jenisObat, hargaObat);

                        Asuransi asuransi = null;
                        System.out.print("Apakah pasien memiliki asuransi? (y/n): ");
                        String adaAsuransi = input.nextLine();
                        if (adaAsuransi.equalsIgnoreCase("y")) {
                            System.out.print("Nama Asuransi: ");
                            String namaAsuransi = input.nextLine();
                            System.out.print("Persentase Tanggungan (1-100): ");
                            double persen = input.nextDouble(); input.nextLine();
                            asuransi = new Asuransi(namaAsuransi, persen / 100.0, hargaObat);
                        }

                        daftarPasien.add(pasien);
                        daftarRekam.add(new RekamMedis(nama, umur, alamat, diagnosis, "22-05-2025"));
                        daftarObat.add(obat);
                        daftarAsuransi.add(asuransi);
                        statusPembayaran.add("Belum bayar");

                        System.out.println("✅ Data pasien berhasil disimpan!");
                    } catch (Exception e) {
                        System.out.println("❌ Terjadi kesalahan input. Ulangi!");
                        input.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR PASIEN ===");
                    if (daftarPasien.isEmpty()) {
                        System.out.println("Belum ada data pasien.");
                    } else {
                        for (int i = 0; i < daftarPasien.size(); i++) {
                            Pasien p = daftarPasien.get(i);
                            RekamMedis r = daftarRekam.get(i);
                            System.out.println((i + 1) + ". " + p.getNama() + " | " + p.getClass().getSimpleName());
                            System.out.println("   " + r.cetakRekam() + " | Status: " + statusPembayaran.get(i));
                        }
                    }
                    break;

                case 3:
                    if (daftarPasien.isEmpty()) {
                        System.out.println("Belum ada pasien.");
                        break;
                    }

                    try {
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
                        double diskon = (asuransiPasien != null) ? harga * asuransiPasien.getPersenTanggungan() : 0;
                        double total = harga - diskon;

                        System.out.println("Harga obat: Rp" + harga);
                        System.out.println("Tanggungan asuransi: Rp" + diskon);
                        System.out.println("Total pembayaran: Rp" + total);

                        System.out.println("Pilih metode pembayaran:");
                        for (int i = 0; i < daftarMetode.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarMetode.get(i).cetakMetode());
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
                    } catch (Exception e) {
                        System.out.println("❌ Input salah saat proses pembayaran.");
                        input.nextLine();
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