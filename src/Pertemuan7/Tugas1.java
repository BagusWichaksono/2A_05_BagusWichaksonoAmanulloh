package Pertemuan7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int tiket;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk mengakhiri): ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah yang benar!");
                continue;
            }

            if (tiket == 0) {
                break;
            }

            double hargaSementara = tiket * hargaTiket;

            if (tiket > 10) {
                hargaSementara -= hargaSementara * 0.15;
            } else if (tiket > 4) {
                hargaSementara -= hargaSementara * 0.10;
            }

            totalTiketTerjual += tiket;
            totalPenjualan += hargaSementara;

            System.out.println("Tiket yang dibeli: " + tiket);
            System.out.println("Total harga untuk pembelian ini: Rp " + hargaSementara);
            System.out.println("-------------------------------");

        } while (true);

        System.out.println("\nTotal tiket terjual dalam sehari: " + totalTiketTerjual);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);
    }
}