/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1.ClassObject;

/**
 *
 * @author Eolia Shalbillah
 */
public class Main {
    
    public static void main(String[] args) {
      // membuat objek
      Kendaraan mobil = new Kendaraan();
      mobil.nama = "Mobil";
      mobil.warna = "Merah";
      System.out.println("Nama Kendaraan  : " + mobil.nama);
      System.out.println("Warna Kendaraan : " + mobil.warna);
      System.out.println("Jumlah Roda     : " + mobil.jmlRoda(4)+ "\n");
      System.out.println("Cara kendaraan bergerak : ");
      System.out.print("Saat maju : "); mobil.kendaraanMaju();
      System.out.print("Saat mundur : "); mobil.kendaraanMundur();
      System.out.print("Saat berhenti : " +mobil.nama); mobil.kendaraanBerhenti();
    }
}
