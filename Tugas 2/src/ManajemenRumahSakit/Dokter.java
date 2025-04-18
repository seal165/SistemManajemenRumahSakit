/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Dokter {
    String dokter;

    public Dokter(String dokter) {
        this.dokter = dokter;
    }

    void dataDokter(String Dokter){
        this.dokter = Dokter;
    }

    String cetakDokter(){
        return dokter;
    }
}
