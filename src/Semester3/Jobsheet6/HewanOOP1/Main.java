package Semester3.Jobsheet6.HewanOOP1;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        System.out.println("Aksi Kucing:");
        kucing.bersuara();
        kucing.mengeong();
        
        System.out.println();

        Anjing anjing = new Anjing("Moli");
        System.out.println("Aksi Anjing:");
        anjing.bersuara();
        anjing.menggonggong();
    }
}