/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RumahSakit;

import javax.swing.JTextArea;

/**
 *
 * @author Eolia Shalbillah
 */
public class GUI_RumahSakit extends javax.swing.JFrame {
    
    /**
     * Creates new form GUI_RumahSakit
     */
    public GUI_RumahSakit() {
        initComponents();
        memoRekamMedis = new JTextArea();
        RekamMedis memoRekamMedis = new RekamMedis();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbMetodePembayaran = new javax.swing.JComboBox<>();
        txtAge = new javax.swing.JTextField();
        cbDokter = new javax.swing.JComboBox<>();
        txtDiagnosa = new javax.swing.JTextField();
        rbAsuransiAda = new javax.swing.JRadioButton();
        rbAsuransiTidakAda = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        memoRekamMedis = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel1.setText("Sistem Manajemen Rumah Sakit");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel2.setText("Nama Pasien");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel3.setText("Umur Pasien");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel4.setText("Pilih Dokter");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel5.setText("Diagnosis");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel6.setText("Metode Pembayaran");

        txtName.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtName.setInheritsPopupMenu(true);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel7.setText("Asuransi");

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel8.setText("Rekam Medis Pasien");

        cbMetodePembayaran.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        cbMetodePembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transfer", "Tunai", "Kartu Kredit" }));

        txtAge.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N

        cbDokter.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        cbDokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Jono - Jantung", "Dr. Milo - Mata", "Dr. Danfe - THT" }));

        txtDiagnosa.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N

        buttonGroup1.add(rbAsuransiAda);
        rbAsuransiAda.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        rbAsuransiAda.setText("Ada");
        rbAsuransiAda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAsuransiAdaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAsuransiTidakAda);
        rbAsuransiTidakAda.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        rbAsuransiTidakAda.setText("Tidak Ada");

        btnSave.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        memoRekamMedis.setColumns(20);
        memoRekamMedis.setFont(new java.awt.Font("Bookman Old Style", 0, 8)); // NOI18N
        memoRekamMedis.setRows(5);
        jScrollPane2.setViewportView(memoRekamMedis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbMetodePembayaran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtAge)
                                    .addComponent(cbDokter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiagnosa)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbAsuransiAda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addComponent(rbAsuransiTidakAda)
                                        .addGap(14, 14, 14))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbMetodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbAsuransiAda)
                    .addComponent(rbAsuransiTidakAda))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtName(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName

    private void rbAsuransiAdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAsuransiAdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAsuransiAdaActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (memoRekamMedis == null) {
            System.out.println("Error: memoRekamMedis belum diinisialisasi.");
            return;
        } else {
            System.out.println("memoRekamMedis siap digunakan.");
        }

        // Mengosongkan memo rekam medis
        System.out.println("Komponen memoRekamMedis: " + memoRekamMedis);
        memoRekamMedis.setText("");

        // Mengambil data pasien
        String nama = txtName.getText();
        int usia = Integer.parseInt(txtAge.getText());
        String diagnosis = txtDiagnosa.getText();
        String dokter = (String) cbDokter.getSelectedItem();
        String metodeBayar = (String) cbMetodePembayaran.getSelectedItem();
        String asuransiNama = rbAsuransiAda.isSelected() ? "Ada" : "Tidak Ada";

        // Tentukan obat berdasarkan dokter
        String namaObat;
        switch (dokter) {
            case "Dr. Jono - Jantung":
                namaObat = "Aspirin";
                break;
            case "Dr. Milo - Mata":
                namaObat = "Tetes Mata X";
                break;
            case "Dr. Danfe - THT":
                namaObat = "Antibiotik Tenggorokan";
                break;
            default:
                namaObat = "Vitamin";
        }

        // Menentukan biaya dasar
        double biayaDasar = 500000;
        double biayaAkhir;

        // Logika if-else untuk cover biaya asuransi
        if (asuransiNama.equals("Ada")) {
            double coverPersen = 80; // Asuransi menanggung 80%
            biayaAkhir = biayaDasar * (1 - coverPersen / 100);
        } else {
            biayaAkhir = biayaDasar; // Tanpa asuransi, bayar penuh
        }

        // Buat objek Asuransi
        Asuransi asuransi = new Asuransi(asuransiNama, asuransiNama.equals("Ada") ? 80 : 0);

        // Buat objek Pasien
        Pasien pasien = new Pasien(nama, usia, "ID-123", diagnosis, new MetodePembayaran(metodeBayar), asuransi);

        // Menampilkan rekam medis di memo
        memoRekamMedis.append("Rekam Medis Pasien\n");
        memoRekamMedis.append("--------------------------------------\n");
        memoRekamMedis.append("Nama                 : " + pasien.getName() + "\n");
        memoRekamMedis.append("Usia                 : " + pasien.getAge() + "\n");
        memoRekamMedis.append("Diagnosis            : " + pasien.getDiagnosis() + "\n");
        memoRekamMedis.append("Dokter               : " + dokter + "\n");
        memoRekamMedis.append("Obat yang diberikan  : " + namaObat + "\n");
        memoRekamMedis.append("Metode Bayar         : " + metodeBayar + "\n");
        memoRekamMedis.append("Asuransi             : " + asuransiNama + "\n");
        memoRekamMedis.append("Biaya                : Rp " + biayaAkhir + "\n");
        memoRekamMedis.append("--------------------------------------\n");

        // Cek apakah data benar-benar masuk ke memoRekamMedis
        System.out.println(memoRekamMedis.getText());

        // Paksa tampilan GUI untuk refresh
        memoRekamMedis.setCaretPosition(memoRekamMedis.getDocument().getLength());
        memoRekamMedis.revalidate();
        memoRekamMedis.repaint();
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_RumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_RumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_RumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_RumahSakit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbDokter;
    private javax.swing.JComboBox<String> cbMetodePembayaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea memoRekamMedis;
    private javax.swing.JRadioButton rbAsuransiAda;
    private javax.swing.JRadioButton rbAsuransiTidakAda;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDiagnosa;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
