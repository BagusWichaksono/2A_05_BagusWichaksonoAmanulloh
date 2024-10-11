package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String member;
        int pilihan_menu, harga;
        double diskon, total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan Angka Dari Menu Yang Dipilih = ");
        pilihan_menu = input05.nextInt();
        input05.nextLine();
        System.out.print("Apakah Punya Member (y/n) = ");
        member = input05.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total Bayar Setelah Diskon = " + total_bayar);
        }

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar");
                return;
            }
            System.out.println("Total Bayar = " + harga);

        } else {
            System.out.println("Member Tidak Valid");
        }
        System.out.println("-----------------------------------------");
    }
}