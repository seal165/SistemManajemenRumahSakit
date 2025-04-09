/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// ObatResep adalah turunan dari Obat
public class ObatResep extends Obat {
    private String dosis;

    public ObatResep(String namaObat, double harga, String dosis) {
        super(namaObat, harga);
        this.dosis = dosis;
    }

    public String getDosis() { return dosis; }

    @Override
    public String toString() {
        return super.toString() + " - Dosis: " + dosis;
    }
}