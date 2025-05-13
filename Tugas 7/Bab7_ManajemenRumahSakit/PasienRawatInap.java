/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class PasienRawatInap extends Pasien {
    private int lamaInap;

    public PasienRawatInap(String nama, int umur, String alamat, int lamaInap) {
        super(nama, umur, alamat);
        this.lamaInap = lamaInap;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "\nJenis   : Rawat Inap\nLama Inap  : " + lamaInap + " hari";
    }
}