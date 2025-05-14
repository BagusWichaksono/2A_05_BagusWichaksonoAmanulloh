package Semester2.Pertemuan7;

import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            list.tambah(new Mahasiswa05(nim, nama, kelas, ipk));
        }

        list.tampil();

        System.out.println("----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Search");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        cari = sc.nextDouble();

        System.out.println("Menggunakan Binary Search");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs -1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
