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
        int inputTanggalBerangkat05 = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan bulan berangkat: ");
        int inputBulanBerangkat05 = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan tahun berangkat: ");
        int inputTahunBerangkat05 = sc.nextInt();
        sc.nextLine();
        System.out.println("Tanggal berangkat " + inputTanggalBerangkat05 + "-" + inputBulanBerangkat05 + "-" + inputTahunBerangkat05);

        System.out.println();
        System.out.print("Masukkan tanggal pulang: ");
        int inputTanggalPulang05 = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan bulan pulang: ");
        int inputBulanPulang05 = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan tahun pulang: ");
        int inputTahunPulang05 = sc.nextInt();
        sc.nextLine();
        System.out.println("Tanggal kepulangan " + inputTanggalPulang05 + "-" + inputBulanPulang05 + "-" + inputTahunPulang05);
        int totalLama = (30 - inputTanggalBerangkat05 + inputTanggalPulang05) + ((12 - inputBulanBerangkat05 + inputBulanPulang05) * 30) + ((inputTahunPulang05 - inputTahunBerangkat05) * 360);

        int tanggal05 = ((totalLama % 360) % 30);
        int bulan05 = ((totalLama % 360) / 30) - 1;
        int tahun05 = totalLama / 360 - 1;

        System.out.println("Lama Student Exchange Anda adalah : " + tahun05 + " tahun " + bulan05 + " bulan " + tanggal05 + " hari ");
    }
}
