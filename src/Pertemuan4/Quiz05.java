package Pertemuan4;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        System.out.println("Nama\t: Bagus Wichaksono Amanulloh");
        System.out.println("NIM\t: 244107020238");
        System.out.println("Absen\t: 05");
        System.out.println("=============== QUIZ 1 TI - 1G ===========");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tanggal berangkat: ");
        int inputTanggalBerangkat = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan bulan berangkat: ");
        int inputBulanBerangkat = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan tahun berangkat: ");
        int inputTahunBerangkat = sc.nextInt();
        sc.nextLine();
        System.out.println("Tanggal berangkat " + inputTanggalBerangkat + "-" + inputBulanBerangkat + "-" + inputTahunBerangkat);
        System.out.println();
        System.out.print("Masukkan tanggal pulang: ");
        int inputTanggalPulang = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan bulan pulang: ");
        int inputBulanPulang = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan tahun pulang: ");
        int inputTahunPulang = sc.nextInt();
        sc.nextLine();
        System.out.println("Tanggal kepulangan " + inputTanggalPulang + "-" + inputBulanPulang + "-" + inputTahunPulang);
        int totalLama = (30 - inputTanggalBerangkat + inputTanggalPulang) + ((12 - inputBulanBerangkat + inputBulanPulang) * 30) + ((inputTahunPulang - inputTahunBerangkat) * 360);

        int tanggal = ((totalLama % 360) % 30);
        int bulan = ((totalLama % 360) / 30) - 1;
        int tahun = totalLama / 360 - 1;

        System.out.println("Lama Student Exchange Anda adalah : " + tahun + " tahun " + bulan + " bulan " + tanggal + " hari ");
    }
}
