/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
import javax.swing.JOptionPane;

class Pembayaran {
    String status = "Belum Lunas";
    int totalBiaya = 0;
    MetodePembayaran metode;

    void setMetode(MetodePembayaran m) {
        metode = m;
    }

    MetodePembayaran getMetode() {
        return metode;
    }

    void setStatus(String s) {
        status = s;
    }

    String getStatus() {
        return status;
    }

    void setTotalBiaya(int biaya) {
        totalBiaya = biaya;
    }

    int getTotalBiaya() {
        return totalBiaya;
    }

    boolean konfirmasiBayar(Pasien pasien) {
        int confirm = JOptionPane.showConfirmDialog(null,
                "Nama Pasien: " + pasien.cetakNama() +
                "\nTotal Bayar: Rp " + totalBiaya +
                "\nMetode: " + metode.toString(),
                "Konfirmasi Pembayaran",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            status = "Lunas";
            return true;
        } else {
            return false;
        }
    }
    
    String cetakPembayaran() {
        return "Rp " + totalBiaya;
    }

    String cetakStatus() {
        return status;
    }
}
