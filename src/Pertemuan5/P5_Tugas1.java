package Pertemuan5;

import java.util.Scanner;
/**
 * P5_Tugas
 */
public class P5_Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas, kualifikasi = "Gagal";
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiAkhir, nilaiUjian;
        String nilaiHuruf = "E";

        System.out.print("Masukkan nama: ") ;
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = ((nilaiKuis * 20/100) + (nilaiTugas * 15/100) + (nilaiUjian * 65/100));

        if(nilaiAkhir <= 39){
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        }else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        }else if (nilaiAkhir > 80){
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        }

        System.out.println(String.format("\nMahasiswa %s dengan NIM %s, kelas %s nomor absen %s", nama, nim, kelas, absen));
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai Kuis: " + nilaiKuis);
        System.out.println("Nilai Ujian: " + nilaiUjian);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}