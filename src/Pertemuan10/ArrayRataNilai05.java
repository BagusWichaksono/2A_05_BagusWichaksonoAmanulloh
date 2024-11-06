package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int [jumlahMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rataLulus;
        if (jumlahLulus > 0) {
            rataLulus = totalLulus / jumlahLulus;
        } else {
            rataLulus = 0;
        }

        double rataTidakLulus;
        if (jumlahTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
        } else {
            rataTidakLulus = 0;
        }

        System.out.println("Rata-rata nilai lulus = "+ rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+ rataTidakLulus);
    }
}
