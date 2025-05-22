package Semester2.Pertemuan13;

import java.util.Scanner;

public class AntrianVaksinMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianVaksin antrian = new AntrianVaksin();
        int pilihan;

        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println();
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Pengantri Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Antrian: ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nama Penerima: ");
                    String nama = sc.nextLine();
                    antrian.tambahAntrian(no, nama);
                    break;
                case 2:
                    antrian.hapusAntrian();
                    break;
                case 3:
                    antrian.tampilkanAntrian();
                    System.out.println("Sisa Antrian: " + antrian.jumlahAntrian());
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan vaksin.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }
}
