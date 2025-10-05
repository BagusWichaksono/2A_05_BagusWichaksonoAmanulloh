package Semester3.Jobsheet6.KendaraanOOP;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Subaru", 2023, 5);
        mobil.info();
        mobil.jalankan();
        System.out.println("-----------------------------------");

        Motor motor = new Motor("Honda", 2024, 160);
        motor.info();
        motor.jalankan();
        System.out.println("-----------------------------------");
        
        Truk truk = new Truk("Scania", 2025, 32);
        truk.info();
        truk.jalankan();
    }
}
