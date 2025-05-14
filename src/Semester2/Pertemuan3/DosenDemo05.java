package Semester2.Pertemuan3;

import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

        Dosen05[] arrayOfDosen = new Dosen05[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String gender = sc.nextLine();
            boolean jenisKelamin = gender.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayOfDosen[i] = new Dosen05(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------");
        }

        DataDosen05.dataSemuaDosen(arrayOfDosen);
        DataDosen05.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen05.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen05.infoDosenPalingTua(arrayOfDosen);
        DataDosen05.infoDosenPalingMuda(arrayOfDosen);
    }
}
