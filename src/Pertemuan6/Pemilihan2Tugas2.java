package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Tugas2 {
    public static void main(String[] args) {
        String jenisBuku;
        int jumlahBuku;
        double hargaBuku;
        double diskon = 0;
        double totalHarga;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = scanner.nextInt();
        System.out.print("Masukkan harga per buku: ");
        hargaBuku = scanner.nextDouble();

        if (jenisBuku.equals("kamus")) {
            diskon = hargaBuku * 0.10;
            if (jumlahBuku > 2) {
                diskon += hargaBuku * 0.02;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = hargaBuku * 0.07;
            if (jumlahBuku > 3) {
                diskon += hargaBuku * 0.02;
            } else {
                diskon += hargaBuku * 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = hargaBuku * 0.05;
            }
        }
        totalHarga = (hargaBuku * jumlahBuku) - (diskon * jumlahBuku);
        System.out.println("Total diskon: Rp " + diskon * jumlahBuku);
        System.out.println("Total harga setelah diskon: Rp " + totalHarga);
    }
}
