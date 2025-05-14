package Semester1.Jobsheet5;

import java.util.Scanner;

public class P5_Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon, harga, totalBelanja, totalSetelahDiskon;
        String namaMakanan;
        int jumlah;

        System.out.print("Masukkan nama makanan: ");
        namaMakanan = sc.nextLine();
        System.out.print("Masukkan harga makanan: ");
        harga = sc.nextDouble();
        System.out.print("Masukkan jumlah makanan: ");
        jumlah = sc.nextInt();
        
        totalBelanja = harga * jumlah;
        
        if (totalBelanja > 500000) {
            diskon = 0.10 * totalBelanja;
            totalSetelahDiskon = totalBelanja - diskon; 
        }else if (totalBelanja > 200000) {
            diskon = 0.05 * totalBelanja;
            totalSetelahDiskon = totalBelanja - diskon;
        }else if (totalBelanja > 100000) {
            diskon = 0.02 * totalBelanja;
            totalSetelahDiskon = totalBelanja - diskon;
        }else {
            totalSetelahDiskon = harga;
            diskon = 0;
            }
        System.out.println("Total belanja anda: " + totalSetelahDiskon);
        System.out.println("Diskon yang anda terima sebesar: " + diskon);
    }
}
