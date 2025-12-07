package Semester3.Jobsheet11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    
    // Variabel Komponen
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;       // Tombol Perkalian
    private JButton buttonTambah; // Tombol Penjumlahan (Baru)
    private JPanel panel;

    // Konstruktor
    public MyInputForm() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("My Input Form - Modifikasi");
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton() {
        // 1. Tombol Calculate (Perkalian) - Bawaan Jobsheet
        button = new JButton("Calculate (x)");
        
        class AddInterestListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    int a = Integer.valueOf(aField.getText());
                    int b = Integer.valueOf(bField.getText());
                    int c = a * b; // Logika Perkalian
                    cLabel.setText("Hasil: " + c);
                } catch (NumberFormatException e) {
                    cLabel.setText("Input harus angka!");
                }
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);

        // 2. Tombol Tambah (+) - Modifikasi untuk Pertanyaan
        buttonTambah = new JButton("Tambah (+)");
        
        buttonTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    int a = Integer.valueOf(aField.getText());
                    int b = Integer.valueOf(bField.getText());
                    int c = a + b; // Logika Penjumlahan
                    cLabel.setText("Hasil: " + c);
                } catch (NumberFormatException e) {
                    cLabel.setText("Input harus angka!");
                }
            }
        });
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        // Menambahkan kedua tombol ke panel
        panel.add(button);       
        panel.add(buttonTambah); 
        panel.add(cLabel);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}