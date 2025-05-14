package Semester1.Jobsheet5;

import java.util.Scanner;

public class PemilihanBilangan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        System.out.print(angka % 2 == 0 ? "Angka " + angka + " termasuk bilangan genap" : "Angka " + angka + " termasuk bilangan ganjil");
    }
}
