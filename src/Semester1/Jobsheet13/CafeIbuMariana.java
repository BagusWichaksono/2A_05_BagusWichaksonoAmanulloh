package Semester1.Jobsheet13;

import java.util.Scanner;

public class CafeIbuMariana {

    public static String inputPenjualan(int jumlahMenu[], int hari, String namaMenu[], int penjualan[][], int penjualanTertinggi[], String menuPenjualanTertinggi, double rataPenjualan[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < namaMenu.length; i++) {
            for (int j = 0; j < hari; j++) {
                System.out.print("Masukkan penjualan " + namaMenu[i] + " hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
                jumlahMenu[i] += penjualan[i][j];
            }
            if (penjualanTertinggi[0] < jumlahMenu[i]) {
                penjualanTertinggi[0] = jumlahMenu[i];
                menuPenjualanTertinggi = namaMenu[i];
            }
            rataPenjualan[i] = (double) jumlahMenu[i] / hari;
        }
        return menuPenjualanTertinggi;
    }

    public static void tampilanPenjualan(int jumlahMenu[], int hari, String namaMenu[], int penjualan[][], int penjualanTertinggi[], String menuPenjualanTertinggi, double rataPenjualan[]) {
        menuPenjualanTertinggi = inputPenjualan(jumlahMenu, hari, namaMenu, penjualan, penjualanTertinggi, menuPenjualanTertinggi, rataPenjualan);
        for (int i = 0; i < hari; i++) {
            System.out.println("Penjualan hari ke-" + (i + 1) + ": ");
            for (int j = 0; j < namaMenu.length; j++) {
                System.out.println("Penjualan menu " + namaMenu[j] + ": " + penjualan[j][i]);
            }
        }
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("Rata-rata penjualan menu " + namaMenu[i] + ": " + rataPenjualan[i]);
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menuPenjualanTertinggi + "\nTerjual dengan jumlah: " + penjualanTertinggi[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenuInput = sc.nextInt();
        sc.nextLine();

        String[] namaMenu = new String[jumlahMenuInput];
        for (int i = 0; i < jumlahMenuInput; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        System.out.print("Masukkan jumlah hari: ");
        int hari = sc.nextInt();

        int[] penjualanTertinggi = {0};
        int[][] penjualan = new int[namaMenu.length][hari];
        int[] jumlahMenu = new int[namaMenu.length];
        double[] rataPenjualan = new double[namaMenu.length];
        String menuPenjualanTertinggi = null;

        tampilanPenjualan(jumlahMenu, hari, namaMenu, penjualan, penjualanTertinggi, menuPenjualanTertinggi, rataPenjualan);
    }
}
