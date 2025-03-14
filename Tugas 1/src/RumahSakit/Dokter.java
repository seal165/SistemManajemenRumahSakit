/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Dokter {
    private String nama;
    private String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getNama() { return nama; }
    public String getSpesialis() { return spesialis; }

    // Override toString() supaya dropdown dokter lebih rapi
    @Override
    public String toString() {
        return nama + " - " + spesialis;
    }
}