package Semester2.Pertemuan13;

import java.util.Scanner;

public class DataFilmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataFilm filmList = new DataFilm();
        int pilih;

        do {
            System.out.println("=====================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=====================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("=====================================");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film: ");
                    int idAwal = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judulAwal = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double ratingAwal = sc.nextDouble();
                    filmList.addFirst(idAwal, judulAwal, ratingAwal);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("ID Film: ");
                    int idAkhir = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judulAkhir = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double ratingAkhir = sc.nextDouble();
                    filmList.addLast(idAkhir, judulAkhir, ratingAkhir);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.print("Urutan ke- ");
                    int index = sc.nextInt();
                    System.out.println("ID Film: ");
                    int idIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judulIndex = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double ratingIndex = sc.nextDouble();
                    filmList.addAt(index, idIndex, judulIndex, ratingIndex);
                    System.out.println("Data Film ini akan masuk di urutan ke-" + index);
                    break;
                case 4:
                    filmList.removeFirst();
                    break;
                case 5:
                    filmList.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan index data yang ingin dihapus: ");
                    int idxHapus = sc.nextInt();
                    filmList.removeAt(idxHapus);
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    filmList.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int searchID = sc.nextInt();
                    filmList.searchID(searchID);
                    break;
                case 9:
                    filmList.urutanDescending();
                    System.out.println("Data berhasil diurutkan dari rating tertinggi");
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }
            System.out.println();
        } while (pilih != 10);
    }
}