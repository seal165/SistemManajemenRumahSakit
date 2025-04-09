/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane; // Mengimpor JOptionPane untuk menampilkan dialog konfirmasi pembayaran

public class Pembayaran { // Mendeklarasikan kelas Pembayaran
    
    // Method untuk menampilkan dialog konfirmasi pembayaran dan mengembalikan hasilnya
    public static boolean konfirmasiBayar(Pasien pasien, MetodePembayaran metode) {
        int confirm = JOptionPane.showConfirmDialog(null, // Menampilkan dialog konfirmasi
                "Nama Pasien: " + pasien.getNama() + // Menampilkan nama pasien di dialog
                "\nTotal Bayar: Rp 500.000\nMetode: " + metode, // Menampilkan total pembayaran dan metode
                "Konfirmasi Pembayaran", // Judul dialog konfirmasi
                JOptionPane.YES_NO_OPTION); // Menyediakan opsi "Yes" dan "No"
        
        return confirm == JOptionPane.YES_OPTION; // Mengembalikan true jika pengguna memilih "Yes", sebaliknya false
    }
}