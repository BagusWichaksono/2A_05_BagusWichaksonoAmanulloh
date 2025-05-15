package Semester2.Pertemuan12;

import java.util.Scanner;

public class MainAntrianMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAntrianMahasiswa antrian = new QueueAntrianMahasiswa();

        int pilihan;
        do {
            System.out.println("\n==== MENU ANTRIAN LAYANAN KEMAHASISWAAN ====");
            System.out.println("1. Daftar Mahasiswa");
            System.out.println("2. Cek Antrian Kosong");
            System.out.println("3. Cek Antrian Penuh");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Panggil Antrian");
            System.out.println("6. Lihat Antrian Terdepan");
            System.out.println("7. Lihat Antrian Terakhir");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    MahasiswaAntrian mhs = new MahasiswaAntrian(nama, nim, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;

                case 3:
                    System.out.println("Antrian tidak penuh.");
                    break;

                case 4:
                    antrian.clearQueue();
                    break;

                case 5:
                    antrian.dequeue();
                    break;

                case 6:
                    antrian.peekDepan();
                    break;

                case 7:
                    antrian.peekBelakang();
                    break;

                case 8:
                    antrian.tampilkanAntrian();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}
