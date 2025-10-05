package Semester3.Jobsheet6.HewanOOP4;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Oren");
        kucing.info();
        kucing.berjalan();

        System.out.println();

        Anjing anjing = new Anjing("Moli", 3, "Coklat");
        anjing.info();
        anjing.berjalan();
    }
}
