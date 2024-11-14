package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihanMenu;
        int baris, kolom;
        String nama;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihanMenu = sc.nextInt();
            sc.nextLine();

            if (pilihanMenu == 1) {
                System.out.print("Masukkan nama penonton: ");
                nama = sc.nextLine();

                System.out.print("Masukkan nomor baris (1-4): ");
                baris = sc.nextInt();
                System.out.print("Masukkan nomor kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Nomor baris atau kolom tidak valid! Coba lagi.");
                    continue;
                }

                if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi ini sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
                    continue;
                }

                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton berhasil disimpan!");

            } else if (pilihanMenu == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (pilihanMenu == 3) {
                System.out.println("Terima kasih!");
                break;

            } else {
                System.out.println("Pilihan menu tidak valid. Silakan coba lagi.");
            }
        }
    }
}
