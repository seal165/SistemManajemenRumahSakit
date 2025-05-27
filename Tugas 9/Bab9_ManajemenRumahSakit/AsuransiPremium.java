/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9_ManajemenRumahSakit;

import Bab8_ManajemenRumahSakit.*;

/**
 *
 * @author Eolia Shalbillah
 */
public class AsuransiPremium extends Asuransi {
    private String fasilitasTambahan;

    public AsuransiPremium(String namaAsuransi, double persenTanggungan, String fasilitasTambahan, double jumlah) {
        super(namaAsuransi, persenTanggungan, jumlah);
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public String getFasilitasTambahan() { return fasilitasTambahan; }

    @Override
    public String toString() {
        return super.toString() + " + Fasilitas: " + fasilitasTambahan;
    }
}