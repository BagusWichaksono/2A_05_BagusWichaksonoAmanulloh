package Semester3.Jobsheet11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame {

    // Deklarasi Komponen
    private JLabel labelNama, labelNim, labelJK, labelMK, labelJurusan, labelSemester;
    
    // --- BAGIAN C (1): Deklarasi Variabel Alamat ---
    private JLabel labelAlamat;
    private JTextArea txtAlamat;
    private JScrollPane scrollAlamat; 
    // -----------------------------------------------

    private JTextField txtname, txtnim;
    private JRadioButton rdjeniskelamin1, rdjeniskelamin2;
    private ButtonGroup bgJenisKelamin;
    private JCheckBox cbMK1, cbMK2;
    private JList<String> listjurusan;
    private JComboBox<String> comboxsemester;
    private JButton cmdclear, cmdtampil;
    private JTextArea hasil;
    private JScrollPane scrollPaneList, scrollPaneHasil;

    public Swing() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Data Mahasiswa");
        setSize(800, 600); // Ukuran diperbesar sedikit biar muat
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // 1. Label & TextField Nama
        labelNama = new JLabel("Nama");
        labelNama.setBounds(20, 20, 100, 25);
        add(labelNama);

        txtname = new JTextField();
        txtname.setBounds(120, 20, 200, 25);
        add(txtname);

        // 2. Label & TextField NIM
        labelNim = new JLabel("NIM");
        labelNim.setBounds(20, 50, 100, 25);
        add(labelNim);

        txtnim = new JTextField();
        txtnim.setBounds(120, 50, 200, 25);
        add(txtnim);

        // 3. Jenis Kelamin
        labelJK = new JLabel("Jenis Kelamin");
        labelJK.setBounds(20, 80, 100, 25);
        add(labelJK);

        rdjeniskelamin1 = new JRadioButton("Laki-laki");
        rdjeniskelamin1.setBounds(120, 80, 80, 25);
        rdjeniskelamin2 = new JRadioButton("Perempuan");
        rdjeniskelamin2.setBounds(210, 80, 100, 25);

        bgJenisKelamin = new ButtonGroup();
        bgJenisKelamin.add(rdjeniskelamin1);
        bgJenisKelamin.add(rdjeniskelamin2);
        add(rdjeniskelamin1);
        add(rdjeniskelamin2);

        // 4. Mata Kuliah
        labelMK = new JLabel("Mata Kuliah");
        labelMK.setBounds(20, 110, 100, 25);
        add(labelMK);

        cbMK1 = new JCheckBox("Sistem Terdistribusi");
        cbMK1.setBounds(120, 110, 150, 25);
        cbMK2 = new JCheckBox("PBO");
        cbMK2.setBounds(270, 110, 100, 25);
        add(cbMK1);
        add(cbMK2);

        // 5. Jurusan
        labelJurusan = new JLabel("Jurusan");
        labelJurusan.setBounds(20, 140, 100, 25);
        add(labelJurusan);

        String[] jurusanData = {"DIV Teknik Informatika", "DIII Manajemen Informatika", "DIV Telekomunikasi", "DIII Teknik Elektronika", "DIV Teknik Mesin"};
        listjurusan = new JList<>(jurusanData);
        scrollPaneList = new JScrollPane(listjurusan);
        scrollPaneList.setBounds(120, 140, 250, 60);
        add(scrollPaneList);

        // 6. Semester
        labelSemester = new JLabel("Semester");
        labelSemester.setBounds(20, 210, 100, 25);
        add(labelSemester);

        String[] semesterData = {"Semester 1", "Semester 2", "Semester 3", "Semester 4"};
        comboxsemester = new JComboBox<>(semesterData);
        comboxsemester.setBounds(120, 210, 250, 25);
        add(comboxsemester);

        // --- BAGIAN C (2): Menambahkan Komponen Alamat ke Layout ---
        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(20, 250, 100, 25); // Posisi di bawah semester
        add(labelAlamat);

        txtAlamat = new JTextArea();
        txtAlamat.setLineWrap(true);
        scrollAlamat = new JScrollPane(txtAlamat);
        scrollAlamat.setBounds(120, 250, 250, 60); // Kotak alamat agak besar
        add(scrollAlamat);
        // -----------------------------------------------------------

        // 7. Area Hasil (TextArea Kanan)
        hasil = new JTextArea();
        scrollPaneHasil = new JScrollPane(hasil);
        scrollPaneHasil.setBounds(400, 20, 350, 350); // Tinggi disesuaikan
        add(scrollPaneHasil);

        // 8. Tombol Clear & Tampil (Posisi diturunkan karena ada Alamat)
        cmdclear = new JButton("Clear");
        cmdclear.setBounds(120, 330, 100, 25); // Posisi Y turun
        add(cmdclear);

        cmdtampil = new JButton("Tampil");
        cmdtampil.setBounds(230, 330, 100, 25); // Posisi Y turun
        add(cmdtampil);

        // --- Event Handling ---
        
        // Logika Tombol Tampil
        cmdtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // --- BAGIAN C (3): Validasi Alamat Kosong ---
                String alamat = txtAlamat.getText();
                if (alamat.trim().isEmpty()) {
                    // Menampilkan pesan peringatan jika kosong
                    JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return; // Menghentikan proses (tidak lanjut menampilkan data)
                }
                // -------------------------------------------

                String nama = txtname.getText();
                String nim = txtnim.getText();
                
                String jeniskelamin = "";
                if (rdjeniskelamin1.isSelected()) jeniskelamin = "Laki-laki";
                if (rdjeniskelamin2.isSelected()) jeniskelamin = "Perempuan";

                String matakuliah = "";
                if (cbMK1.isSelected()) matakuliah += "Sistem Terdistribusi ";
                if (cbMK2.isSelected()) matakuliah += "PBO ";

                String jurusan = "";
                if (listjurusan.getSelectedValue() != null) {
                    jurusan = listjurusan.getSelectedValue().toString();
                }

                String semester = comboxsemester.getSelectedItem().toString();

                String info = "Nama : " + nama + "\n" +
                              "NIM : " + nim + "\n" +
                              "Jenis Kelamin : " + jeniskelamin + "\n" +
                              "Jurusan : " + jurusan + "\n" +
                              "Semester : " + semester + "\n" +
                              "Alamat : " + alamat + "\n" +  // Menampilkan Alamat
                              "Mata Kuliah : " + matakuliah + "\n";
                
                hasil.setText(info);
                JOptionPane.showMessageDialog(null, info);
            }
        });

        // Logika Tombol Clear
        cmdclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtname.setText("");
                txtnim.setText("");
                bgJenisKelamin.clearSelection();
                cbMK1.setSelected(false);
                cbMK2.setSelected(false);
                listjurusan.clearSelection();
                comboxsemester.setSelectedIndex(0);
                txtAlamat.setText(""); // Reset Alamat
                hasil.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Swing().setVisible(true);
        });
    }
}