package Semester1.Jobsheet6;

import java.util.Scanner;

public class Pemilihan2Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String merek, kategori;
        int ukuran;
        int harga = 0;

        System.out.print("Masukkan merek sepatu (Converse/Skecher/Nike): ");
        merek = scanner.nextLine();

        if (merek.equalsIgnoreCase("Converse")) {
            System.out.print("Masukkan kategori (Slip On/High Top): ");
            kategori = scanner.nextLine();

            if (kategori.equalsIgnoreCase("Slip On")) {
                System.out.print("Masukkan ukuran (36-40): ");
                ukuran = scanner.nextInt();

                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800000;
                }
            } else if (kategori.equalsIgnoreCase("High Top")) {
                System.out.print("Masukkan ukuran (40-44): ");
                ukuran = scanner.nextInt();

                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                }
            }
        } else if (merek.equalsIgnoreCase("Sketcher")) {
            System.out.print("Masukkan kategori (Woman/Man): ");
            kategori = scanner.nextLine();

            if (kategori.equalsIgnoreCase("Woman")) {
                System.out.print("Masukkan ukuran (36-41): ");
                ukuran = scanner.nextInt();

                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                System.out.print("Masukkan ukuran (41-44): ");
                ukuran = scanner.nextInt();

                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                }
            }
        } else if (merek.equalsIgnoreCase("Nike")) {
            System.out.print("Masukkan kategori (Kids/Adult): ");
            kategori = scanner.nextLine();

            if (kategori.equalsIgnoreCase("Kids")) {
                System.out.print("Masukkan ukuran (36-40): ");
                ukuran = scanner.nextInt();

                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                System.out.print("Masukkan ukuran (40-44): ");
                ukuran = scanner.nextInt();

                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                }
            }
        }

        if (harga > 0) {
            System.out.println("Harga sepatu: " + harga);
        } else {
            System.out.println("Merek, kategori, atau ukuran tidak valid.");
        }
    }
}