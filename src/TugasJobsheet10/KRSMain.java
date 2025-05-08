package TugasJobsheet10;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n===== MENU ANTRIAN KRS =====");
            System.out.println("1. Cek apakah antrian kosong");
            System.out.println("2. Cek apakah antrian penuh");
            System.out.println("3. Tambah mahasiswa ke antrian");
            System.out.println("4. Proses 2 mahasiswa (KRS)");
            System.out.println("5. Tampilkan semua antrian");
            System.out.println("6. Tampilkan 2 antrian terdepan");
            System.out.println("7. Tampilkan mahasiswa terakhir");
            System.out.println("8. Laporan jumlah antrian & KRS");
            System.out.println("9. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrian.IsEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 2:
                    if (antrian.IsFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;
                case 3:
                    System.out.print("NIM   : "); String nim = sc.nextLine();
                    System.out.print("Nama  : "); String nama = sc.nextLine();
                    System.out.print("Prodi : "); String prodi = sc.nextLine();
                    System.out.print("Kelas : "); String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 4:
                    antrian.prosesKRS();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 7:
                    antrian.lihatAkhir();
                    break;
                case 8:
                    antrian.cetakLaporan();
                    break;
                case 9:
                    antrian.clear();
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
