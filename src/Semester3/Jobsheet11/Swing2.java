package Semester3.Jobsheet11;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing2 extends JFrame {

    private JTabbedPane jTabbedPane1;
    private JPanel jPanel1, jPanel2, jPanel3;
    private JTable jTableH1, jTable1; // Tabel untuk Halaman 1 & 2
    private JScrollPane jScrollPaneH1, jScrollPane1, jScrollPaneTree;
    private JTree jTree1;
    private JLabel labelTurunan;
    private JTextField txtturunan;
    private JButton cmdtambah;

    private DefaultTreeModel dt;
    private DefaultMutableTreeNode root;

    public Swing2() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Percobaan 5 - JTabPane, JTree, JTable");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Membuat TabbedPane (Wadah Tab)
        jTabbedPane1 = new JTabbedPane();

        // --- TAB 1: Data Prodi (Modifikasi Pertanyaan b) ---
        jPanel1 = new JPanel();
        jPanel1.setLayout(new BorderLayout());

        String[] columnNamesH1 = {"No", "Prodi", "Jenjang"};
        Object[][] dataH1 = {
            {"1", "D4 Teknik Informatika", "D4"},
            {"2", "D3 Manajemen Informatika", "D3"},
            {"3", "D4 Teknik Telekomunikasi", "D4"}
        };

        jTableH1 = new JTable(dataH1, columnNamesH1);
        jScrollPaneH1 = new JScrollPane(jTableH1);
        jPanel1.add(jScrollPaneH1, BorderLayout.CENTER);
        
        jTabbedPane1.addTab("Halaman 1", jPanel1); // Tambah ke Tab

        // --- TAB 2: Data Status (Modifikasi Pertanyaan b) ---
        jPanel2 = new JPanel();
        jPanel2.setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Nama", "Status"};
        Object[][] data = {
            {"01", "Root", "A"},
            {"02", "Bapak", "B"},
            {"03", "Anak 1", "C"}
        };

        jTable1 = new JTable(data, columnNames);
        jScrollPane1 = new JScrollPane(jTable1);
        jPanel2.add(jScrollPane1, BorderLayout.CENTER);

        jTabbedPane1.addTab("Halaman 2", jPanel2); // Tambah ke Tab

        // --- TAB 3: JTree Dinamis ---
        jPanel3 = new JPanel();
        jPanel3.setLayout(new BorderLayout());

        // Setup Tree
        root = new DefaultMutableTreeNode("root");
        dt = new DefaultTreeModel(root);
        jTree1 = new JTree(dt);
        jScrollPaneTree = new JScrollPane(jTree1);
        jPanel3.add(jScrollPaneTree, BorderLayout.CENTER);

        // Setup Input Panel di Bawah
        JPanel inputPanel = new JPanel();
        labelTurunan = new JLabel("Masukan Pewaris/Turunan:");
        inputPanel.add(labelTurunan);

        txtturunan = new JTextField(15);
        inputPanel.add(txtturunan);

        cmdtambah = new JButton("Tambah");
        inputPanel.add(cmdtambah);

        jPanel3.add(inputPanel, BorderLayout.SOUTH);

        jTabbedPane1.addTab("Halaman 3", jPanel3); // Tambah ke Tab

        // Tambahkan TabbedPane ke Frame utama
        add(jTabbedPane1);

        // --- Event Handling Tombol Tambah (Tab 3) ---
        cmdtambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String input = txtturunan.getText();
                if(!input.isEmpty()){
                    DefaultMutableTreeNode admin = new DefaultMutableTreeNode(input);
                    // Ambil node yang sedang dipilih user
                    DefaultMutableTreeNode set = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
                    
                    // Jika tidak ada yang dipilih, masukkan ke root
                    if (set == null) {
                        set = root;
                    }

                    // Masukkan node baru ke dalam model tree
                    dt.insertNodeInto(admin, set, set.getChildCount());
                    txtturunan.setText(""); // Reset input
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Swing2().setVisible(true);
        });
    }
}