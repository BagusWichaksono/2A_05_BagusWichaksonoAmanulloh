package Semester3.Jobsheet6.HewanOOP3;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2);
        kucing.berjalan();
        kucing.menyusui();

        System.out.println();

        Anjing anjing = new Anjing("Moli", 3);
        anjing.menggonggong();
        anjing.menyusui();
    }
}