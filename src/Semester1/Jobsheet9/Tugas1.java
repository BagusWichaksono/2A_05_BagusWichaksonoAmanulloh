package Semester1.Jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N untuk pola pertama: ");
        int N1 = sc.nextInt();
        System.out.print("Masukkan nilai N untuk pola kedua: ");
        int N2 = sc.nextInt();

        if (N1 < 3 || N2 < 3) {
            System.out.println("Nilai N harus minimal 3 untuk kedua pola.");
            return;
        }

        int maksimalN = Math.max(N1, N2);

        for (int i = 0; i < maksimalN; i++) {
            if (i < N1) {
                for (int j = 0; j < N1; j++) {
                    if (i == 0 || i == N1 - 1 || j == 0 || j == N1 - 1) {
                        System.out.print(N1 + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 0; j < N1; j++) {
                    System.out.print("  ");
                }
            }
            
            System.out.print("   ");
            
            if (i < N2) {
                for (int j = 0; j < N2; j++) {
                    if (i == 0 || i == N2 - 1 || j == 0 || j == N2 - 1) {
                        System.out.print(N2 + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 0; j < N2; j++) {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
