import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        System.out.println("=================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] >= 40) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        System.out.println("=================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================");
        System.out.printf("%-40s %-15s %-10s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobotKaliSKS = 0;
        int totalSKS = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-15.2f %-10s %-10.2f%n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobotKaliSKS += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobotKaliSKS / totalSKS;
        System.out.println("=================================");
        System.out.printf("IP : %.2f%n", ipSemester);
        System.out.println("=================================");

    }
}