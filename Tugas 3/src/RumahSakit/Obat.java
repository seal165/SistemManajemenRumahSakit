/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
class Obat {
    private String namaObat;

    public Obat(String diagnosis, String dokter) {
        if (dokter.equals("Dr. Jono - Jantung")) {
            this.namaObat = "Aspirin";
        } else if (dokter.equals("Dr. Milo - Mata")) {
            this.namaObat = "Tetes Mata X";
        } else if (dokter.equals("Dr. Danfe - THT")) {
            this.namaObat = "Antibiotik Tenggorokan";
        } else {
            // Default: Tentukan obat berdasarkan diagnosis
            if (diagnosis.toLowerCase().contains("flu")) {
                this.namaObat = "Paracetamol";
            } else {
                this.namaObat = "Vitamin";
            }
        }
    }

    public String getNamaObat() {
        return namaObat;
    }
}