package Praktikum05;

import java.util.Scanner;

public class DosenMain05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen05 data = new DataDosen05();
        int pilihan;

        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting Usia ASC (Bubble Sort)");
            System.out.println("4. Pencarian Nama (Sequential Search)");
            System.out.println("5. Pencarian Usia (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan jumlah dosen yang ingin ditambahkan: ");
                    int jumlah = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\n=== Tambah Data Dosen ke-" + (i + 1) + " ===");
                        System.out.print("Kode          : ");
                        String kode = input.nextLine();
                        System.out.print("Nama          : ");
                        String nama = input.nextLine();
                        System.out.print("Jenis Kelamin (Pria/Wanita): ");
                        String jk = input.nextLine();
                        boolean jenisKelamin = jk.equalsIgnoreCase("Pria");

                        System.out.print("Usia          : ");
                        int usia = input.nextInt();
                        input.nextLine();

                        Dosen05 dosenBaru = new Dosen05(kode, nama, jenisKelamin, usia);
                        data.tambah(dosenBaru);
                    }
                    break;

                case 2:
                    System.out.println("\n=== Data Dosen ===");
                    data.tampil();
                    break;

                case 3:
                    System.out.println("\n=== Data Dosen Setelah Sorting Usia ASC (Bubble Sort) ===");
                    data.SortingASC();
                    data.tampil();
                    break;

                case 4:
                    System.out.print("\nMasukkan Nama Dosen yang Dicari: ");
                    String cariNama = input.nextLine();
                    data.PencarianDataSequential05(cariNama);
                    break;

                case 5:
                    System.out.print("\nMasukkan Usia Dosen yang Dicari: ");
                    int cariUsia = input.nextInt();
                    input.nextLine();

                    data.PencarianDataBinary05(cariUsia);
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        } while (pilihan != 0);
    }
}
