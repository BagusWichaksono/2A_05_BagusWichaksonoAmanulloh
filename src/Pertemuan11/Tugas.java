package Pertemuan11;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] hasilSurvey = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("Masukkan nilai survei (1-5) untuk setiap pertanyaan:");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai untuk pertanyaan " + (j + 1) + ": ");
                hasilSurvey[i][j] = sc.nextInt();
            }
        }
        
        double totalKeseluruhan = 0;

        System.out.println("\nRata-rata nilai untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalPerResponden += hasilSurvey[i][j];
            }
            System.out.println("Responden ke-" + (i + 1) + ": " + (totalPerResponden / jumlahPertanyaan));
        }

        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPerPertanyaan += hasilSurvey[i][j];
            }
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + (totalPerPertanyaan / jumlahResponden));
        }

        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata keseluruhan: " + rataRataKeseluruhan);
    }
}
