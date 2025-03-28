/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// Subclass Dokter
class Dokter extends Person {
    private String spesialis;
    
    public Dokter(String name, int age, String spesialis) {
        super(name, age);
        this.spesialis = spesialis;
    }
    
    public String getSpesialis() { return spesialis; }
}