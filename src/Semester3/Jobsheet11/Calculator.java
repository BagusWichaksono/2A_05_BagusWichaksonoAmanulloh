package Semester3.Jobsheet11;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame implements ActionListener {
    
    // Komponen
    private JTextField displayField;
    
    // Variabel Logika
    private String firstOperand = "";
    private String secondOperand = "";
    private String operator = "";
    private boolean isResultDisplayed = false; // Penanda agar input baru mereset layar setelah hasil

    public Calculator() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Kalkulator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // 1. Layar Tampilan (Display) di Bagian Atas
        displayField = new JTextField();
        displayField.setEditable(false); // Agar user tidak bisa mengetik manual keyboard
        displayField.setHorizontalAlignment(JTextField.RIGHT); // Teks rata kanan
        displayField.setFont(displayField.getFont().deriveFont(24f)); // Memperbesar font
        add(displayField, BorderLayout.NORTH);

        // 2. Panel Tombol dengan GridBagLayout
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5); // Jarak antar tombol
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        // Susunan Tombol
        String[][] buttonLayout = {
            {"7", "8", "9", "/"},
            {"4", "5", "6", "*"},
            {"1", "2", "3", "-"},
            {"C", "0", ".", "+"}
        };

        // Loop untuk membuat tombol angka dan operator standar
        for (int y = 0; y < buttonLayout.length; y++) {
            for (int x = 0; x < buttonLayout[y].length; x++) {
                String text = buttonLayout[y][x];
                JButton button = new JButton(text);
                button.addActionListener(this);
                
                gbc.gridx = x;
                gbc.gridy = y;
                gbc.gridwidth = 1;
                buttonPanel.add(button, gbc);
            }
        }
        
        // Tombol Sama Dengan (=) dibuat memanjang di paling bawah
        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 4; // Lebar 4 kolom
        buttonPanel.add(equalsButton, gbc);
        
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            // Logika Tombol "C" (Clear)
            if ("C".equals(command)) {
                firstOperand = "";
                secondOperand = "";
                operator = "";
                displayField.setText("");
            } 
            // Logika Tombol "=" (Hitung)
            else if ("=".equals(command)) {
                if (operator.isEmpty() || firstOperand.isEmpty()) return;

                double num1 = Double.parseDouble(firstOperand);
                // Jika user langsung tekan =, gunakan num1 lagi atau 0
                double num2 = secondOperand.isEmpty() ? num1 : Double.parseDouble(secondOperand);
                double result = 0;

                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": 
                        if (num2 == 0) {
                            displayField.setText("Error");
                            return;
                        }
                        result = num1 / num2; 
                        break;
                }
                
                // Tampilkan hasil (hapus .0 jika bilangan bulat)
                if (result % 1 == 0) {
                    displayField.setText(String.valueOf((int)result));
                } else {
                    displayField.setText(String.valueOf(result));
                }
                
                // Simpan hasil sebagai operand pertama untuk perhitungan selanjutnya
                firstOperand = String.valueOf(result);
                secondOperand = "";
                operator = "";
                isResultDisplayed = true;

            } 
            // Logika Operator (+, -, *, /)
            else if ("+".equals(command) || "-".equals(command) || "*".equals(command) || "/".equals(command)) {
                if (!firstOperand.isEmpty()) {
                    operator = command;
                    displayField.setText(firstOperand + " " + operator);
                    isResultDisplayed = false;
                }
            } 
            // Logika Angka dan Titik (.)
            else {
                // Jika baru selesai hitung dan tekan angka, reset display
                if (isResultDisplayed) {
                    firstOperand = "";
                    displayField.setText("");
                    isResultDisplayed = false;
                }

                if (operator.isEmpty()) {
                    firstOperand += command;
                    displayField.setText(firstOperand);
                } else {
                    secondOperand += command;
                    displayField.setText(firstOperand + " " + operator + " " + secondOperand);
                }
            }
        } catch (Exception ex) {
            displayField.setText("Error");
            firstOperand = "";
            secondOperand = "";
            operator = "";
        }
    }

    public static void main(String[] args) {
        // Menjalankan aplikasi
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}