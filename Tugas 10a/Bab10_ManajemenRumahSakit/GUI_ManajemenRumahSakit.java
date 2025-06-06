/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bab10_ManajemenRumahSakit;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

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
        txtNamaAsuransi.setEnabled(false);
        txtPersentaseAsuransi.setEnabled(false);
        tampil();
    }
    
    String nama1, umur1, alamat1, diagnosis1, dokter1, jenis_obat1, dosis_obat1, harga_obat1, metode_bayar1, asuransi1, nama_asuransi1, persentase_asuransi1, total_biaya1;

    public void itemPilih() {
        int baris = tbRM.getSelectedRow(); // ambil baris yang diklik

        if (baris >= 0) {
            nama1 = tbRM.getValueAt(baris, 0).toString();
            umur1 = tbRM.getValueAt(baris, 1).toString();
            alamat1 = tbRM.getValueAt(baris, 2).toString();
            diagnosis1 = tbRM.getValueAt(baris, 3).toString();
            dokter1 = tbRM.getValueAt(baris, 4).toString();
            jenis_obat1 = tbRM.getValueAt(baris, 5).toString();
            dosis_obat1 = tbRM.getValueAt(baris, 6).toString();
            harga_obat1 = tbRM.getValueAt(baris, 7).toString();
            metode_bayar1 = tbRM.getValueAt(baris, 8).toString();
            asuransi1 = tbRM.getValueAt(baris, 9).toString();
            nama_asuransi1 = tbRM.getValueAt(baris, 10).toString();
            persentase_asuransi1 = tbRM.getValueAt(baris, 11).toString();
            total_biaya1 = tbRM.getValueAt(baris, 12).toString();
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris data terlebih dahulu!");
        }
    }
    
    public void resetForm() {
        txtNama.setText("");
        txtUmur.setText("");
        txtAlamat.setText("");
        txtDiagnosis.setText("");
        cbDokter.setSelectedIndex(0);
        cbJenisObat.setSelectedIndex(0);
        txtDosisObat.setText("");
        txtHargaObat.setText("");
        cbMetodeBayar.setSelectedIndex(0);
        cbAsuransi.setSelected(false);
        txtNamaAsuransi.setText("");
        txtPersentaseAsuransi.setText("");
        txtTotal.setText("");
    }
    
    public Connection conn;
    
    public void koneksi() throws SQLException {
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/manajemenrs?serverTimezone=UTC",
        "root",
        "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_ManajemenRumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(GUI_ManajemenRumahSakit.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(GUI_ManajemenRumahSakit.class.getName()).log(Level.SEVERE, null, es);
        }
    }
    
    public void tampil() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("Nama");
        tabelhead.addColumn("Umur");
        tabelhead.addColumn("Alamat");
        tabelhead.addColumn("Diagnosis");
        tabelhead.addColumn("Dokter");
        tabelhead.addColumn("Jenis Obat");
        tabelhead.addColumn("Dosi");
        tabelhead.addColumn("Harga");
        tabelhead.addColumn("Asuransi");
        tabelhead.addColumn("Metode");
        tabelhead.addColumn("Total Biaya");
        try {
            koneksi();
            String sql = "SELECT * FROM rekam_medis";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                tabelhead.addRow(new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7),});
            }
            tbRM.setModel(tabelhead);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
        }
    }
    
    public void refresh() {
        new GUI_ManajemenRumahSakit().setVisible(true);
        this.setVisible(false);
    }
    
    public void hitungBiaya() {
        try {
            String hargaObatText = txtHargaObat.getText();
            if (hargaObatText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harga obat tidak boleh kosong!");
                return;
            }

            double hargaObat = Double.parseDouble(hargaObatText);
            double total = hargaObat;

            if (cbAsuransi.isSelected()) {
                String namaAsuransi = txtNamaAsuransi.getText();
                String persenText = txtPersentaseAsuransi.getText();

                if (namaAsuransi.isEmpty() || persenText.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Nama asuransi dan persentase tidak boleh kosong!");
                    return;
                }

                double persen = Double.parseDouble(persenText);
                BPJS asuransi = new Asuransi(namaAsuransi, persen / 100.0, hargaObat);
                double tanggungan = asuransi.hitungTanggungan(hargaObat);
                total = hargaObat - tanggungan;
            }

            txtTotal.setText("Rp " + String.format("%.2f", total));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input harga atau persentase tidak valid!");
        }
    }
    
    public void insert() {
        String nama = txtNama.getText();
        int umur = Integer.parseInt(txtUmur.getText());
        String alamat = txtAlamat.getText();
        String diagnosis = txtDiagnosis.getText();
        String dokter = cbDokter.getSelectedItem().toString();
        String jenisObat = cbJenisObat.getSelectedItem().toString();
        String dosisObat = txtDosisObat.getText();
        double hargaObat = Double.parseDouble(txtHargaObat.getText());
        String metodeBayar = cbMetodeBayar.getSelectedItem().toString();
        boolean asuransi = cbAsuransi.isSelected();
        String namaAsuransi = txtNamaAsuransi.getText();
        String hargaText = txtHargaObat.getText().trim();
        if (hargaText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harga obat belum diisi.", "Input Kosong", JOptionPane.WARNING_MESSAGE);
            return;
        }
        double harga = Double.parseDouble(hargaText);
        double totalBiaya = Double.parseDouble(txtTotal.getText());
        double persentaseAsuransi = Double.parseDouble(txtPersentaseAsuransi.getText());

        try {
            koneksi(); // method untuk membuka koneksi
            Statement statement = conn.createStatement();
            String sql = "INSERT INTO rekam_medis (nama, umur, alamat, diagnosis, dokter, jenis_obat, dosis_obat, harga_obat, metode_bayar, asuransi, nama_asuransi, persentase_asuransi, total_biaya) "
                    + "VALUES('" + nama + "'," + umur + ",'" + alamat + "','" + diagnosis + "','" + dokter + "','" + jenisObat + "','" + dosisObat + "'," + hargaObat + ",'" + metodeBayar + "'," + asuransi + ",'" + namaAsuransi + "'," + persentaseAsuransi + "," + totalBiaya + ")";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Data rekam medis berhasil disimpan!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan rekam medis: " + e.getMessage());
        }
    }
    
    public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data rekam medis?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (ok == JOptionPane.YES_OPTION) {
            try {
                koneksi(); // pastikan koneksi dipanggil dulu
                String sql = "DELETE FROM rekam_medis WHERE nama = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, txtNama.getText());
                int hasil = stmt.executeUpdate();

                if (hasil > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
                    resetForm(); // ganti batal() jadi resetForm()
                } else {
                    JOptionPane.showMessageDialog(null, "Data tidak ditemukan atau gagal dihapus.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
            }
            refresh(); // misal ini method update tabel atau form
        }
    }
    
    public void cari() {
        try {
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM rekam_medis WHERE nama LIKE '%" + txtNama.getText() + "%'";
            ResultSet rs = statement.executeQuery(sql);

            if (rs.next()) {
                txtNama.setText(rs.getString("nama"));
                txtUmur.setText(rs.getString("umur"));
                txtAlamat.setText(rs.getString("alamat"));
                txtDiagnosis.setText(rs.getString("diagnosis"));
                cbDokter.setSelectedItem(rs.getString("dokter"));
                cbJenisObat.setSelectedItem(rs.getString("jenis_obat"));
                txtDosisObat.setText(rs.getString("dosis_obat"));
                txtHargaObat.setText(rs.getString("harga_obat"));
                cbMetodeBayar.setSelectedItem(rs.getString("metode_bayar"));

                boolean isAsuransi = rs.getBoolean("asuransi");
                cbAsuransi.setSelected(isAsuransi);
                txtNamaAsuransi.setText(rs.getString("nama_asuransi"));
                txtPersentaseAsuransi.setText(rs.getString("persentase_asuransi"));
                txtTotal.setText(rs.getString("total_biaya"));
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mencari data: " + ex.getMessage());
        }
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
        txtNama = new javax.swing.JTextField();
        txtUmur = new javax.swing.JTextField();
        txtDiagnosis = new javax.swing.JTextField();
        cbDokter = new javax.swing.JComboBox<>();
        cbJenisObat = new javax.swing.JComboBox<>();
        txtHargaObat = new javax.swing.JTextField();
        cbAsuransi = new javax.swing.JCheckBox();
        txtNamaAsuransi = new javax.swing.JTextField();
        txtPersentaseAsuransi = new javax.swing.JTextField();
        cbMetodeBayar = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRM = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDosisObat = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

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

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        tbRM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Umur", "Alamat", "Diagnosis", "Dokter", "Jenis Obat", "Dosis", "Harga", "Asuransi", "Metode", "Total Biaya"
            }
        ));
        tbRM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbRM);

        jLabel13.setText("Alamat");

        jLabel14.setText("Dosis Obat");

        btnSearch.setText("Search 🔍");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(84, 84, 84)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbJenisObat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDosisObat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel13))
                                    .addGap(68, 68, 68)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNamaAsuransi, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(cbAsuransi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHargaObat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(56, 56, 56)
                                        .addComponent(txtPersentaseAsuransi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(26, 26, 26)
                                        .addComponent(cbMetodeBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHitung)
                                .addGap(18, 18, 18)
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal)
                                .addGap(18, 18, 18)
                                .addComponent(btnKeluar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbJenisObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtDosisObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHargaObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbAsuransi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNamaAsuransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPersentaseAsuransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbMetodeBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal)
                    .addComponent(btnKeluar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        hitungBiaya();
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void cbAsuransiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsuransiActionPerformed
        // TODO add your handling code here:
        boolean aktif = cbAsuransi.isSelected();
        txtNamaAsuransi.setEnabled(aktif);
        txtPersentaseAsuransi.setEnabled(aktif);
    }//GEN-LAST:event_cbAsuransiActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //  masukkan method cari()
        cari();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tbRMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRMMouseClicked
        // TODO add your handling code here:
        int tabel = tbRM.getSelectedRow();
        nama1 = tbRM.getValueAt(tabel, 0).toString();
        umur1 = tbRM.getValueAt(tabel, 1).toString();
        alamat1 = tbRM.getValueAt(tabel, 2).toString();
        diagnosis1 = tbRM.getValueAt(tabel, 3).toString();
        dokter1 = tbRM.getValueAt(tabel, 4).toString();
        jenis_obat1 = tbRM.getValueAt(tabel, 5).toString();
        dosis_obat1 = tbRM.getValueAt(tabel, 6).toString();
        harga_obat1 = tbRM.getValueAt(tabel, 7).toString();
        metode_bayar1 = tbRM.getValueAt(tabel, 8).toString();
        asuransi1 = tbRM.getValueAt(tabel, 9).toString();
        nama_asuransi1 = tbRM.getValueAt(tabel, 10).toString();
        persentase_asuransi1 = tbRM.getValueAt(tabel, 11).toString();
        total_biaya1 = tbRM.getValueAt(tabel, 12).toString();
        itemPilih();

    }//GEN-LAST:event_tbRMMouseClicked

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ManajemenRumahSakit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JCheckBox cbAsuransi;
    private javax.swing.JComboBox<String> cbDokter;
    private javax.swing.JComboBox<String> cbJenisObat;
    private javax.swing.JComboBox<String> cbMetodeBayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbRM;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtDosisObat;
    private javax.swing.JTextField txtHargaObat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNamaAsuransi;
    private javax.swing.JTextField txtPersentaseAsuransi;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUmur;
    // End of variables declaration//GEN-END:variables
}
