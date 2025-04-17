/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1_ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Pasien {
    String nama, diagnosis;
    int umur;
    Dokter dokter;
    
    void dataNama(String Nama){
        this.nama = Nama;
    }
    
    void dataDiagnosis(String Diagnosis){
        this.diagnosis = Diagnosis;
    }
    
    void dataUmur(int Umur){
        this.umur = Umur;
    }
    
    void dataDokter(Dokter Dokter){
        this.dokter = Dokter;
    }
    
    String cetakNama(){
        return nama;
    }
    
    String cetakDiagnosis(){
        return diagnosis;
    }
    
    int cetakUmur(){
        return umur;
    }
    
    Dokter cetakDokter(){
        return dokter;
    }
}
