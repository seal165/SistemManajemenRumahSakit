/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
public class Dokter { // Mendeklarasikan kelas Dokter
    private String nama; // Variabel untuk menyimpan nama dokter
    private String spesialis; // Variabel untuk menyimpan spesialisasi dokter

    // Konstruktor untuk menginisialisasi objek Dokter dengan nama dan spesialisasi
    public Dokter(String nama, String spesialis) {
        this.nama = nama; // Menetapkan nilai parameter nama ke variabel nama
        this.spesialis = spesialis; // Menetapkan nilai parameter spesialis ke variabel spesialis
    }

    // Method getter untuk mendapatkan nama dokter
    public String getNama() { return nama; }
    
    // Method getter untuk mendapatkan spesialisasi dokter
    public String getSpesialis() { return spesialis; }

    // Override method toString untuk mengembalikan representasi string dari objek Dokter
    @Override
    public String toString() {
        return nama + " - " + spesialis; // Menggabungkan nama dan spesialisasi dengan tanda " - "
    }
}