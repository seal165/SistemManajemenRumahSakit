/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// Class Rekam Medis
class RekamMedis {
    private Pasien pasien;
    private Dokter dokter;
    private String catatan;
    
    public RekamMedis(Pasien pasien, Dokter dokter, String catatan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.catatan = catatan;
    }

    public RekamMedis() {
        this.pasien = null;
        this.dokter = null;
        this.catatan = "";
    }
    
    public String getCatatan() { return catatan; }
}