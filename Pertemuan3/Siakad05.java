package Pertemuan3;

import java.util.Scanner;
/**
 * Siakad05
 */
public class Siakad05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        float nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextFloat() * (20 / 100f);
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextFloat() * (15 / 100f);
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextFloat() * (30 / 100f);
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextFloat() * (35 / 100f);
        nilaiAkhir = nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS;
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}