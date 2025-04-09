/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Obat {
    protected String namaObat;
    protected double harga;

    public Obat(String namaObat, double harga) {
        this.namaObat = namaObat;
        this.harga = harga;
    }

    public String getNamaObat() { return namaObat; }
    public double getHarga() { return harga; }

    @Override
    public String toString() {
        return namaObat + " (Rp " + harga + ")";
    }
}