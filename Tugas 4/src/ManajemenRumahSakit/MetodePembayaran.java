/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// Deklarasi enum bernama MetodePembayaran
public enum MetodePembayaran {
    // Nilai enum dengan nama dan label tampilan
    TRANSFER_BANK("Transfer Bank"),
    TUNAI("Tunai"),
    KARTU_KREDIT("Kartu Kredit");

    // Atribut untuk menyimpan nama tampilan
    private final String displayName;

    // Konstruktor enum untuk inisialisasi label tampilan
    MetodePembayaran(String displayName) {
        this.displayName = displayName;
    }

    // Method getter untuk mengambil label tampilan
    public String getDisplayName() {
        return displayName;
    }

    // Override method toString untuk menampilkan nama tampilan
    @Override
    public String toString() {
        return displayName;
    }
}