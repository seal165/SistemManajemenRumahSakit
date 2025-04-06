/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public enum MetodePembayaran { // Mendeklarasikan enum untuk metode pembayaran
    TRANSFER_BANK, // Metode pembayaran melalui transfer bank
    TUNAI, // Metode pembayaran secara tunai
    KARTU_KREDIT; // Metode pembayaran menggunakan kartu kredit

    @Override
    public String toString() { // Override method toString untuk mengembalikan nama metode pembayaran yang lebih mudah dibaca
        switch (this) { // Mengecek nilai enum saat ini
            case TRANSFER_BANK: return "Transfer Bank"; // Mengembalikan string "Transfer Bank" jika enum adalah TRANSFER_BANK
            case TUNAI: return "Tunai"; // Mengembalikan string "Tunai" jika enum adalah TUNAI
            case KARTU_KREDIT: return "Kartu Kredit"; // Mengembalikan string "Kartu Kredit" jika enum adalah KARTU_KREDIT
            default: return "Unknown"; // Mengembalikan "Unknown" jika tidak ada yang sesuai (seharusnya tidak terjadi)
        }
    }
}