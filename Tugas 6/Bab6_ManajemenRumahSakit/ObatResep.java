/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6_ManajemenRumahSakit;

import Bab5_ManajemenRumahSakit.*;

/**
 *
 * @author Eolia Shalbillah
 */
public class ObatResep extends Obat {
    private String dosis;

    public ObatResep(String namaObat, double harga, String dosis) {
        super(namaObat, harga);
        this.dosis = dosis;
    }

    public String getDosis() { return dosis; }

    // Overloading toString dengan parameter untuk menampilkan dosis
    public String toString(boolean includeHarga, boolean includeDosis) {
        String result = toString(includeHarga);
        if (includeDosis) {
            result += " - Dosis: " + dosis;
        }
        return result;
    }
}