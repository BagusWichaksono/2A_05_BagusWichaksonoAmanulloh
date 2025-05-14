package Semester2.Pertemuan1;

import java.util.Scanner;

public class Tugas2 {
    public static void tampilkanMenu() {
        System.out.println("Pilih Perhitungan:");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        tampilkanMenu();
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = sc.nextInt();

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}