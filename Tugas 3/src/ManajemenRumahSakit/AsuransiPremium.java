/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenRumahSakit;

/**
 *
 * @author Eolia Shalbillah
 */
// AsuransiPremium turunan dari Asuransi
public class AsuransiPremium extends Asuransi {
    private String fasilitasTambahan;

    public AsuransiPremium(String namaAsuransi, double persenTanggungan, String fasilitasTambahan) {
        super(namaAsuransi, persenTanggungan);
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public String getFasilitasTambahan() { return fasilitasTambahan; }

    @Override
    public String toString() {
        return super.toString() + " + Fasilitas: " + fasilitasTambahan;
    }
}