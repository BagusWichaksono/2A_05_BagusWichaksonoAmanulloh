package Pertemuan13;

import java.util.Scanner;

public class Kubus05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sisi, volumeKubus, luasPermukaanKubus;

        System.out.print("Masukkan sisi: ");
        sisi = sc.nextInt();

        volumeKubus = hitungVolume(sisi);
        System.out.println("Volume kubus adalah " + volumeKubus);
        luasPermukaanKubus = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah " + luasPermukaanKubus);
    }

    static int hitungVolume (int sisi) {
        int volume = sisi*sisi*sisi;
        return volume;
    }

    static int hitungLuasPermukaan (int sisi) {
        int luasPermukaan = sisi*sisi*6;
        return luasPermukaan;
    }
}
