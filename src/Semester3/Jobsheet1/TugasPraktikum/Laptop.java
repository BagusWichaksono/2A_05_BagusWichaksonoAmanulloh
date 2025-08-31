package Semester3.Jobsheet1.TugasPraktikum;

public class Laptop {
    private String merek, tipe;
    private int ram;

    public Laptop(String merek, String tipe, int ram) {
        this.merek = merek;
        this.tipe = tipe;
        this.ram = ram;
    }

    public void nyalakan() {
        System.out.println(merek + " " + tipe + " telah dinyalakan");
    }

    public void matikan() {
        System.out.println(merek + " " + tipe + " telah dimatikan");
    }

    public void cetakInfo() {
        System.out.println("=== Informasi Laptop ===");
        System.out.println("Merek: " + merek);
        System.out.println("Tipe: " + tipe);
        System.out.println("RAM: " + ram + " GB");
    }
}
