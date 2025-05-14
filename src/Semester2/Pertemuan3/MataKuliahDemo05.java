package Semester2.Pertemuan3;

import java.util.Scanner;

public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());

        MataKuliah05[] arrayOfMataKuliah = new MataKuliah05[jumlahMatkul];
    
        for(int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah05("", "", 0, 0);
            arrayOfMataKuliah[i].tambahData();   
        }

        System.out.println();
        for(int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}
