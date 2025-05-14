package Semester1.Jobsheet13;

import java.util.Scanner;

public class Kafe05 {

    public static int HitungTotalHarga05(int pilhanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilhanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal / 2;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        }

        return hargaTotal;
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode Promo berlaku: Diskon 50% untuk setiap pembelian!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode Promo berlaku: Diskon 30% untuk setiap pembelian!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHargaKeseluruhan = 0;

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah Anda member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        Menu(namaPelanggan, isMember, kodePromo);

        boolean lanjutPesan = true;
        while (lanjutPesan) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilhanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = HitungTotalHarga05(pilhanMenu, banyakItem, kodePromo);
            totalHargaKeseluruhan += totalHarga;

            System.out.println("Total harga untuk pesanan ini: Rp " + totalHarga);

            System.out.print("Apakah Anda ingin memesan lagi? (true/false): ");
            lanjutPesan = sc.nextBoolean();
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalHargaKeseluruhan);
        System.out.println("Terima kasih telah memesan di Kafe05!");
    }
}
