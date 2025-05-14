package Semester2.Pertemuan1;

import java.util.Scanner;

public class Pemilihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextFloat();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextFloat();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextFloat();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextFloat();

        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
            System.out.println("==============================");

        } else {
            nilaiAkhir = (nilaiTugas * 0.20f) + (nilaiKuis * 0.20f) + (nilaiUTS * 0.30f) + (nilaiUAS * 0.30f);

            String nilaiHuruf;
            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("==============================");
            System.out.printf("Nilai Akhir : %.1f\n", nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");

            if (!nilaiHuruf.equals("D") && !nilaiHuruf.equals("E")) {
                System.out.println("SELAMAT ANDA LULUS");
            }
            System.out.println("==============================");
        }
    }
}
