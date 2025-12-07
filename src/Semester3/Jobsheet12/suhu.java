package Semester3.Jobsheet12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class suhu extends JFrame {

    private JTextField inputField;
    private JLabel hasilLabel;
    private JComboBox<String> comboDari;
    private JComboBox<String> comboKe;

    public suhu() {
        // Setup Frame Utama
        setTitle("Aplikasi Konversi Suhu Modern");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Tampil di tengah layar
        
        // Menggunakan GridBagLayout untuk posisi yang presisi
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Ubah warna background frame
        getContentPane().setBackground(new Color(240, 248, 255)); // Alice Blue

        // --- Komponen 1: Judul ---
        JLabel titleLabel = new JLabel("KONVERTER SUHU");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(25, 25, 112)); // Midnight Blue
        
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.gridwidth = 2; // Span 2 kolom
        gbc.insets = new Insets(10, 10, 20, 10); // Margin
        add(titleLabel, gbc);

        // --- Komponen 2: Input ---
        gbc.gridwidth = 1; // Reset span
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10);
        
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Masukkan Nilai Suhu:"), gbc);

        inputField = new JTextField(15);
        gbc.gridx = 1; gbc.gridy = 1;
        add(inputField, gbc);

        // --- Komponen 3: Pilihan 'Dari' ---
        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Dari Satuan:"), gbc);

        String[] satuan = {"Celcius", "Fahrenheit", "Kelvin"};
        comboDari = new JComboBox<>(satuan);
        gbc.gridx = 1; gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(comboDari, gbc);

        // --- Komponen 4: Pilihan 'Ke' ---
        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("Ke Satuan:"), gbc);

        comboKe = new JComboBox<>(satuan);
        comboKe.setSelectedIndex(1); // Default ke Fahrenheit
        gbc.gridx = 1; gbc.gridy = 3;
        add(comboKe, gbc);

        // --- Panel Tombol ---
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false); // Transparan agar warna background terlihat
        
        JButton btnHitung = new JButton("Hitung");
        btnHitung.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        btnHitung.setForeground(Color.WHITE);
        
        JButton btnReset = new JButton("Reset");
        btnReset.setBackground(new Color(220, 20, 60)); // Crimson
        btnReset.setForeground(Color.WHITE);

        buttonPanel.add(btnHitung);
        buttonPanel.add(btnReset);

        gbc.gridx = 0; gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 10, 10, 10);
        add(buttonPanel, gbc);

        // --- Komponen 5: Hasil ---
        hasilLabel = new JLabel("Hasil: 0.0");
        hasilLabel.setFont(new Font("Arial", Font.BOLD, 24));
        hasilLabel.setForeground(new Color(0, 100, 0)); // Dark Green
        
        gbc.gridx = 0; gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(hasilLabel, gbc);

        // --- Event Handling ---
        btnHitung.addActionListener(e -> hitungKonversi());
        
        btnReset.addActionListener(e -> {
            inputField.setText("");
            hasilLabel.setText("Hasil: 0.0");
            inputField.requestFocus();
        });
    }

    private void hitungKonversi() {
        try {
            if (inputField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Silakan masukkan angka suhu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double input = Double.parseDouble(inputField.getText());
            String dari = (String) comboDari.getSelectedItem();
            String ke = (String) comboKe.getSelectedItem();
            double hasil = 0;

            // Logika Konversi Universal
            // 1. Ubah semua ke Celcius dulu (sebagai perantara)
            double celcius = 0;
            switch (dari) {
                case "Celcius": celcius = input; break;
                case "Fahrenheit": celcius = (input - 32) * 5/9; break;
                case "Kelvin": celcius = input - 273.15; break;
            }

            // 2. Ubah dari Celcius ke satuan target
            switch (ke) {
                case "Celcius": hasil = celcius; break;
                case "Fahrenheit": hasil = (celcius * 9/5) + 32; break;
                case "Kelvin": hasil = celcius + 273.15; break;
            }

            // Tampilkan hasil
            hasilLabel.setText("Hasil: " + String.format("%.2f", hasil));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input harus berupa angka valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new suhu().setVisible(true);
        });
    }
}