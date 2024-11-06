package Pertemuan10;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        
        int[] nilai = new int[jumlahMahasiswa];
        int total = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai untuk mahasiswa " + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / jumlahMahasiswa;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int n : nilai) {
            if (n > nilaiTertinggi) nilaiTertinggi = n;
            if (n < nilaiTerendah) nilaiTerendah = n;
        }

        System.out.println("\nSemua nilai: ");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
