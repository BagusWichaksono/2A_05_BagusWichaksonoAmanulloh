package Semester1.Jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String member;
        int pilihan_menu, jenisPembayaran, potongan = 0;
        double diskon, harga, total_bayar = 0, total_harga = 0;

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
            System.out.println("Pilih metode pembayaran:");
            System.out.println("1. QRIS");
            System.out.println("2. Tunai");
            System.out.print("Masukkan pilihan metode pembayaran (QRIS/Tunai): ");
            jenisPembayaran = input05.nextInt();
        
            if (jenisPembayaran == 1) {
                potongan = 1000;
            total_harga = total_bayar - 1000;
            System.out.println("Harga sebelum potongan QRIS = " + total_bayar);
            System.out.println("Potongan = " + potongan);
            System.out.println("Harga setelah potongan QRIS = " + total_harga);
            System.out.println("-----------------------------------------");
            }else{
                total_harga = total_bayar;
                System.out.println("Total Bayar = " + total_harga);
            }}

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
            
            System.out.println("Pilih metode pembayaran:");
            System.out.println("1. QRIS");
            System.out.println("2. Tunai");
            System.out.print("Masukkan pilihan metode pembayaran (QRIS/Tunai): ");
            jenisPembayaran = input05.nextInt();
            
            if (jenisPembayaran == 1) {
                potongan = 1000;
            total_harga = harga - 1000;
            System.out.println("Harga sebelum potongan QRIS = " + harga);
            System.out.println("Potongan = " + potongan);
            System.out.println("Harga setelah potongan QRIS = " + total_harga);
            System.out.println("-----------------------------------------");
        }else {
            total_harga = harga;
            System.out.println("Total Bayar = " + total_harga);
        }
    }
    
    }
    }
