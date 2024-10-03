package Pertemuan5;

import java.util.Scanner;
public class P5_Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukka jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        
        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        
        double nominalBayar;
        if (keanggotaan == true) {
            nominalBayar = totalHarga - (diskon * totalHarga);
        }else{
            nominalBayar = totalHarga;
        }
        byte totalByte = (byte) totalHarga;
        int nominalInt = (int) nominalBayar;
        
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal Bayar Rp " + nominalBayar);
    }
}