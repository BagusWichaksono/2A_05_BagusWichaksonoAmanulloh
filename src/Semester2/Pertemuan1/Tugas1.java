package Semester2.Pertemuan1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'K', 'L', 'N'};

        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'K', 'U', 'D', 'U', 'S'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = sc.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == Character.toUpperCase(inputKode)) {
                System.out.print("Nama Kota: ");
                for (char c : KOTA[i]) {
                    if (c != '\0') {
                        System.out.print(c);
                    }
                }
                System.out.println();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
