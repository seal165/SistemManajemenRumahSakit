/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public enum MetodePembayaran {
    TRANSFER_BANK, TUNAI, KARTU_KREDIT;

    // Override toString() supaya dropdown metode bayar lebih rapi
    @Override
    public String toString() {
        switch (this) {
            case TRANSFER_BANK: return "Transfer Bank";
            case TUNAI: return "Tunai";
            case KARTU_KREDIT: return "Kartu Kredit";
            default: return "Unknown";
        }
    }
}