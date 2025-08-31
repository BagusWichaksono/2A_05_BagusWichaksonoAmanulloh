package Semester3.Jobsheet1.TugasPraktikum;

public class Kompor {
    private String merek;
    private int jumlahTungku;

    public Kompor(String merek, int jumlahTungku) {
        this.merek = merek;
        this.jumlahTungku = jumlahTungku;        
    }

     public void nyalakan() {
        System.out.println("Kompor " + merek + " telah dinyalakan");
    }

    public void matikan() {
        System.out.println("Kompor " + merek + " telah dimatikan");
    }

    public void cetakInfo() {
        System.out.println("=== Informasi Kompor ===");
        System.out.println("Merek: " + merek);
        System.out.println("Jumlah Tungku: " + jumlahTungku);
    }
}
