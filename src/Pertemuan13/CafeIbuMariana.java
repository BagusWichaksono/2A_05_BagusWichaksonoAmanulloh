package Pertemuan13;

import java.util.Scanner;

public class CafeIbuMariana {
   
    public static String inputPenjualan(int jumlahMenu[], int hari, String namaMenu[], int penjualan[][], int penjualanTertinggi[], String menuPenjualanTertinggi, double rataPenjualan[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < namaMenu.length; i++){
            for (int j = 0; j < hari; j++) {
                System.out.print("Masukkan penjualan " + namaMenu[i] + " hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
                jumlahMenu[i] += penjualan[i][j];
            }
        if(penjualanTertinggi[0] < jumlahMenu[i]){
            penjualanTertinggi[0] = jumlahMenu[i];
            menuPenjualanTertinggi = namaMenu[i];
        }
        rataPenjualan[i] =(jumlahMenu[i])/7; 
        }
        return menuPenjualanTertinggi;
    }
    
    public static void tampilanPenjualan(int jumlahMenu[], int hari, String namaMenu[], int penjualan[][], int penjualanTertinggi[], String menuPenjualanTertinggi, double rataPenjualan[]){
        menuPenjualanTertinggi = inputPenjualan(jumlahMenu, hari, namaMenu, penjualan, penjualanTertinggi, menuPenjualanTertinggi, rataPenjualan);
        for(int i = 0; i < hari; i++){
            System.out.println("Penjualan hari ke-" + (i+1) + ": ");
            for (int j = 0; j < namaMenu.length; j++) {
                System.out.println("Penjualan menu " + namaMenu[j] + ": " + penjualan[j][i]);
            }
        }
        for(int i = 0; i < namaMenu.length; i++){
            System.out.println("Rata-rata penjualan menu " + namaMenu[i] + ": " + rataPenjualan[i]);
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menuPenjualanTertinggi + "\nTerjual dengan jumlah: " +  penjualanTertinggi[0]);
    }
    
    public static void main(String[] args) {
        int penjualanTertinggi[] = {0}, penjualan[][], hari = 7, jumlahMenu[];
        double rataPenjualan[];
        String menuPenjualanTertinggi = null;

        String namaMenu[] = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        penjualan = new int[namaMenu.length][hari];
        jumlahMenu = new int [namaMenu.length];
        rataPenjualan = new double[namaMenu.length];

        tampilanPenjualan(jumlahMenu, hari, namaMenu, penjualan, penjualanTertinggi, menuPenjualanTertinggi, rataPenjualan);
    }
}