/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Asuransi extends MetodePembayaran {
    protected String namaAsuransi;
    protected double persenTanggungan;

    public Asuransi(String namaAsuransi, double persenTanggungan, double jumlah) {
        super(jumlah, "Asuransi");
        this.namaAsuransi = namaAsuransi;
        this.persenTanggungan = persenTanggungan;
    }

    public String getNamaAsuransi() { return namaAsuransi; }
    public double getPersenTanggungan() { return persenTanggungan; }

    @Override
    public String cetakMetode() {
        return "Asuransi: " + namaAsuransi;
    }

    @Override
    public String cetakStatus() {
        return "Belum Lunas";
    }

    @Override
    public boolean konfirmasiBayar(String namaPasien) {
        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(null,
            "Konfirmasi pembayaran via asuransi untuk " + namaPasien + "?",
            "Konfirmasi", javax.swing.JOptionPane.YES_NO_OPTION);
        return konfirmasi == javax.swing.JOptionPane.YES_OPTION;
    }

    @Override
    public String toString() {
        return namaAsuransi + " (" + (int)(persenTanggungan * 100) + "% ditanggung)";
    }
}