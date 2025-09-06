package Semester3.Jobsheet2.Tugas;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran();

        L1.r = 7;

        System.out.println("===== Kalkulator Lingkaran =====");
        System.out.println("Jari-jari (r)       : " + L1.r);
        System.out.println("Nilai phi (π)       : " + L1.phi);
        System.out.println("--------------------------------");
        System.out.println("Luas Lingkaran      : " + L1.hitungLuas());
        System.out.println("Keliling Lingkaran  : " + L1.hitungKeliling());
        System.out.println("================================");
    }
}