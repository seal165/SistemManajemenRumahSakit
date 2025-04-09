/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManajemenRumahSakit;

import javax.swing.JOptionPane;

/**
 *
 * @author Eolia Shalbillah
 */
public class GUI_ManajemenRumahSakit extends javax.swing.JFrame {

    /**
     * Creates new form GUI_ManajemenRumahSakit
     */
    public GUI_ManajemenRumahSakit() {
        initComponents();
        tfTotal.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfUmur = new javax.swing.JTextField();
        tfDiagnosis = new javax.swing.JTextField();
        cbDokter = new javax.swing.JComboBox<>();
        cbJenisObat = new javax.swing.JComboBox<>();
        tfHargaObat = new javax.swing.JTextField();
        cbAsuransi = new javax.swing.JCheckBox();
        tfNamaAsuransi = new javax.swing.JTextField();
        tfPersentaseAsuransi = new javax.swing.JTextField();
        cbMetodeBayar = new javax.swing.JComboBox<>();
        tfTotal = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRekamMedis = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Manajemen Rumah Sakit");

        jLabel2.setText("Nama Pasien");

        jLabel3.setText("Umur");

        jLabel4.setText("Diagnosis");

        jLabel5.setText("Dokter");

        jLabel6.setText("Jenis Obat");

        jLabel7.setText("Harga Obat");

        jLabel8.setText("Gunakan Asuransi");

        jLabel9.setText("Nama Asuransi");

        jLabel10.setText("% Tanggungan");

        jLabel11.setText("Metode Pembayaran");

        jLabel12.setText("Total Biaya");

        cbDokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Budi - Jantung", "Dr. Ani - Mata", "Dr. Dika - Anak" }));

        cbJenisObat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Umum", "Resep" }));

        cbAsuransi.setText("Ada");
        cbAsuransi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsuransiActionPerformed(evt);
            }
        });

        cbMetodeBayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transfer Bank", "Tunai", "Kartu Kredit" }));

        btnHitung.setText("Hitung Total");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan dan Tampilkan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        taRekamMedis.setColumns(20);
        taRekamMedis.setRows(5);
        jScrollPane1.setViewportView(taRekamMedis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel8))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfDiagnosis)
                                        .addComponent(tfHargaObat)
                                        .addComponent(tfNamaAsuransi)
                                        .addComponent(tfTotal)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbAsuransi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbJenisObat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(56, 56, 56)
                                            .addComponent(tfPersentaseAsuransi, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnHitung)
                                            .addGap(41, 41, 41)
                                            .addComponent(btnSimpan))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))
                                            .addGap(68, 68, 68)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfNama)
                                                .addComponent(cbDokter, 0, 211, Short.MAX_VALUE)
                                                .addComponent(tfUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(26, 26, 26)
                                .addComponent(cbMetodeBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbJenisObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfHargaObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbAsuransi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfNamaAsuransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfPersentaseAsuransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbMetodeBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(btnSimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        // Hitung total biaya obat
        try {
            double hargaObat = Double.parseDouble(tfHargaObat.getText());
            double total = hargaObat;
            
            // Jika menggunakan asuransi, hitung diskon dari persentase
            if (cbAsuransi.isSelected()) {
                double persentase = Double.parseDouble(tfPersentaseAsuransi.getText());
                total = hargaObat - (hargaObat * persentase / 100.0);
            }
            tfTotal.setText("Rp " + total);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input harga atau persentase tidak valid!");
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        // Ambil data input dan tampilkan ke area rekam medis
        String nama = tfNama.getText();
        String umur = tfUmur.getText();
        String diagnosis = tfDiagnosis.getText();
        String dokter = (String) cbDokter.getSelectedItem();
        String jenisObat = (String) cbJenisObat.getSelectedItem();
        String hargaObat = tfHargaObat.getText();
        String metodeBayar = (String) cbMetodeBayar.getSelectedItem();
        String total = tfTotal.getText();
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nama Pasien : ").append(nama).append("\n")
          .append("Umur       : ").append(umur).append("\n")
          .append("Diagnosis  : ").append(diagnosis).append("\n")
          .append("Dokter     : ").append(dokter).append("\n")
          .append("Jenis Obat : ").append(jenisObat).append(" - Rp ").append(hargaObat).append("\n");
        
        if (cbAsuransi.isSelected()) {
            sb.append("Asuransi   : ").append(tfNamaAsuransi.getText())
              .append(" (Tanggungan ").append(tfPersentaseAsuransi.getText()).append("%)\n");
        } else {
            sb.append("Asuransi   : Tidak\n");
        }
        
        sb.append("Metode Bayar: ").append(metodeBayar).append("\n")
          .append("Total Biaya: ").append(total).append("\n")
          .append("-------------------------------\n");
        
        taRekamMedis.append(sb.toString());
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void cbAsuransiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsuransiActionPerformed
        // TODO add your handling code here:
        // Aktif/non-aktifkan field asuransi sesuai dengan status checkbox
        boolean aktif = cbAsuransi.isSelected();
        tfNamaAsuransi.setEnabled(aktif);
        tfPersentaseAsuransi.setEnabled(aktif);
    }//GEN-LAST:event_cbAsuransiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_ManajemenRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ManajemenRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ManajemenRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ManajemenRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ManajemenRumahSakit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JCheckBox cbAsuransi;
    private javax.swing.JComboBox<String> cbDokter;
    private javax.swing.JComboBox<String> cbJenisObat;
    private javax.swing.JComboBox<String> cbMetodeBayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taRekamMedis;
    private javax.swing.JTextField tfDiagnosis;
    private javax.swing.JTextField tfHargaObat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNamaAsuransi;
    private javax.swing.JTextField tfPersentaseAsuransi;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextField tfUmur;
    // End of variables declaration//GEN-END:variables
}
