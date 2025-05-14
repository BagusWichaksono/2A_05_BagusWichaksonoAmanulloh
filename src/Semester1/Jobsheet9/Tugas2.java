package Semester1.Jobsheet9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.print("Masukkan nama Politeknik ke-" + i + ": ");
            String namaPoliteknik = sc.nextLine();

            for (int j = 1; j <= 4; j++) {
                String cabor;
                if (j == 1) {
                    cabor = "Badminton";
                } else if (j == 2) {
                    cabor = "Tenis Meja";
                } else if (j == 3) {
                    cabor = "Basket";
                } else {
                    cabor = "Bola Voli";
                }
                
                System.out.println("Masukkan nama-nama atlet untuk cabang olahraga " + cabor + " di " + namaPoliteknik + ": ");
                
                for (int k = 1; k <= 5; k++) {
                    System.out.print("Atlet ke-" + k + " (" + cabor + "): ");
                    String namaAtlet = sc.nextLine();
                    System.out.println("Data Atlet\n" + namaPoliteknik + " - " + cabor + " - Atlet " + k + ": " + namaAtlet);
                }
            }
        }
    }
}
