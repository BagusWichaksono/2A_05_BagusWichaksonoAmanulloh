package Semester2.Pertemuan1;

import java.util.Scanner;

public class Tugas3 {
    static String[] mataKuliah;
    static int[] sks;
    static int[] semester;
    static String[] hari;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        mataKuliah = new String[jumlah];
        sks = new int[jumlah];
        semester = new int[jumlah];
        hari = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            mataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hari[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Semua Jadwal Kuliah");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal();
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah: ");
                    cariJadwalBerdasarkanHari(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    cariJadwalBerdasarkanSemester(sc.nextInt());
                    sc.nextLine();
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    cariMataKuliah(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static void tampilkanSemuaJadwal() {
        System.out.println("\n=== JADWAL KULIAH ===");
        if (mataKuliah.length == 0) {
            System.out.println("Belum ada data mata kuliah.");
            return;
        }
        System.out.printf("%-20s %-5s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-20s %-5d %-10d %-10s\n", mataKuliah[i], sks[i], semester[i], hari[i]);
        }
    }

    public static void cariJadwalBerdasarkanHari(String cariHari) {
        System.out.println("\nJadwal Kuliah di Hari " + cariHari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < hari.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.printf("%-20s %-5d %-10d\n", mataKuliah[i], sks[i], semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void cariJadwalBerdasarkanSemester(int cariSemester) {
        System.out.println("\nJadwal Kuliah untuk Semester " + cariSemester + ":");
        boolean ditemukan = false;
        for (int i = 0; i < semester.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.printf("%-20s %-5d %-10s\n", mataKuliah[i], sks[i], hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal untuk semester tersebut.");
        }
    }

    public static void cariMataKuliah(String namaMK) {
        System.out.println("\nHasil Pencarian Mata Kuliah:");
        boolean ditemukan = false;
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i].equalsIgnoreCase(namaMK)) {
                System.out.printf("%-20s %-5d %-10d %-10s\n", mataKuliah[i], sks[i], semester[i], hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
