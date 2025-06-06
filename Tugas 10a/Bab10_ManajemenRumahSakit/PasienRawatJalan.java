/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab10_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class PasienRawatJalan extends Pasien {
    private String jadwalKontrol;

    public PasienRawatJalan(String nama, int umur, String alamat, String jadwalKontrol) {
        super(nama, umur, alamat);
        this.jadwalKontrol = jadwalKontrol;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "\nJenis   : Rawat Jalan\nJadwal Kontrol  : " + jadwalKontrol;
    }
}