package Semester1.Jobsheet4;

import java.util.Scanner;

public class Quiz105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jam masuk parkir: ");
        int jamMasuk = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan menit masuk parkir: ");
        int menitMasuk = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Masukkan jam keluar parkir: ");
        int jamKeluar = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan menit keluar parkir: ");
        int menitKeluar = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Masukkan tarif parkir per jam: ");
        int tarifPerJam = sc.nextInt();
        sc.nextLine();

        int totalMenitMasuk = jamMasuk * 60 + menitMasuk;
        int totalMenitKeluar = jamKeluar * 60 + menitKeluar;
        int totalMenitParkir = totalMenitKeluar - totalMenitMasuk;

        int jamParkir = totalMenitParkir / 60;
        int menitParkir = totalMenitParkir % 60;

        int biayaParkir = ((totalMenitParkir + 59) / 60) * tarifPerJam;

        System.out.println("Total waktu parkir: " + jamParkir + "jam" + menitParkir + "menit");
        System.out.println("Biaya parkir yang harus dibayar: Rp " + biayaParkir);

    }
}
