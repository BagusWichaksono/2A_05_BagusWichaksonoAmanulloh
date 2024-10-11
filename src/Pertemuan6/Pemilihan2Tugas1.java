package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Tugas1 {
    public static void main(String[] args) {
        int bil1, bil2, bil3, max;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = scanner.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = scanner.nextInt();

        max = bil1;

        if (bil1 < bil2) {
            max = bil2;
        }

        if (bil3 > max) {
            max = bil3;
        }

        System.out.println("Bilangan terbesar adalah: " + max);
    }
}
