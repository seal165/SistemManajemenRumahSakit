/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Pembayaran {
    public static boolean konfirmasiBayar(Pasien pasien, MetodePembayaran metode) {
        // Menampilkan popup konfirmasi pembayaran
        int confirm = JOptionPane.showConfirmDialog(null, 
                "Nama Pasien: " + pasien.getNama() + 
                "\nTotal Bayar: Rp 500.000\nMetode: " + metode,
                "Konfirmasi Pembayaran", 
                JOptionPane.YES_NO_OPTION);

        return confirm == JOptionPane.YES_OPTION; // TRUE jika user pilih "YA"
    }
}