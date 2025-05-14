package Semester2.Pertemuan1;

import java.util.Scanner;

public class Fungsi05 {
    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

    static String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    public static void hitungPendapatan() {
        System.out.println("Pendapatan jika semua bunga habis terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga.length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println(cabang[i] + " : Rp " + totalPendapatan);
        }
    }

    public static void totalStockBunga() {
        System.out.println("Total stock bunga di seluruh cabang:");
        for (int j = 0; j < bunga.length; j++) {
            int total = 0;
            for (int i = 0; i < bunga.length; i++) {
                total += stockBunga[i][j];
            }
            System.out.println(bunga[j] + " : " + total);
        }
    }

    public static void updateStockBunga() {
        int[] bungaMati = {-1, -2, -0, -5};
        System.out.println("Stock setelah bunga yang mati:");

        for (int i = 0; i < stockBunga.length; i++) {
            System.out.print(cabang[i] + ": " );
            for (int j = 0; j < stockBunga.length; j++) {
                stockBunga[i][j] += bungaMati[j];
                if (stockBunga[i][j] < 0) stockBunga[i][j] = 0; {
                    System.out.print(stockBunga[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        hitungPendapatan();
        totalStockBunga();
        updateStockBunga();
    }
}
