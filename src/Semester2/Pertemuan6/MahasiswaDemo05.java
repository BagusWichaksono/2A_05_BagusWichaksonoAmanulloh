package Semester2.Pertemuan6;

import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();
        
        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05(jumlahMahasiswa);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.println("---------------------------");

            Mahasiswa05 m = new Mahasiswa05(nama, nim, ipk, kelas);
            list.tambah(m);
        }

        System.out.println("\nData Mahasiswa sebelum sorting:");
        list.tampil();
        System.out.println("--------------------------------------------------------");
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}