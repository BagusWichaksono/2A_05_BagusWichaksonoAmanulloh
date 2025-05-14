package Semester2.Pertemuan10;

import java.util.Scanner;

public class SuratMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat05 dataSurat = new StackSurat05(10);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat05 surat = new Surat05(id, nama, kelas, jenis, durasi);
                    dataSurat.push(surat);
                    break;

                case 2:
                    Surat05 diproses = dataSurat.pop();
                    if (diproses != null) {
                        System.out.println("Memverifikasi surat dari " + diproses.namaMahasiswa);
                        System.out.println("Jenis: " + diproses.jenisIzin + ", Durasi: " + diproses.durasi + " hari");
                    }
                    break;

                case 3:
                    Surat05 terakhir = dataSurat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir: " + terakhir.idSurat + " - " + terakhir.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Cari nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    dataSurat.cariSurat(cariNama);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan >= 1 && pilihan <= 4);
    }
}
