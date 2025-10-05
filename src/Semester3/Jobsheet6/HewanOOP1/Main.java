package Semester3.Jobsheet6.HewanOOP1;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        kucing.bersuara();
        kucing.mengeong();
        
        Anjing anjing = new Anjing("Moli");
        anjing.bersuara();
        anjing.menggonggong();
    }
}