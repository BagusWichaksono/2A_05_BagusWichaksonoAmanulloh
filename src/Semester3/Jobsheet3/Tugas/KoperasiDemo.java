package Semester3.Jobsheet3.Tugas;

import java.util.Scanner;

public class KoperasiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("========================================");

        int pilihan;
        do {
            System.out.println("\nJumlah pinjaman saat ini: Rp" + donny.getJumlahPinjaman());
            System.out.println("\n--- MENU KOPERASI ---");
            System.out.println("1. Pinjam Uang");
            System.out.println("2. Bayar Angsuran");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nominal pinjaman: ");
                    int pinjam = scanner.nextInt();
                    donny.pinjam(pinjam);
                    break;
                case 2:
                    System.out.print("Masukkan nominal angsuran: ");
                    int angsur = scanner.nextInt();
                    donny.angsur(angsur);
                    break;
                case 3:
                    System.out.println("\nTerima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 3);
    }
}