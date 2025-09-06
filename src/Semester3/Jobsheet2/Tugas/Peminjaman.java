package Semester3.Jobsheet2.Tugas;

public class Peminjaman {
    private String id;
    private String namaMember;
    private String namaGame;
    private double harga;
    private int lamaSewa;

    public void setData(String id, String namaMember, String namaGame, double harga, int lamaSewa) {
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.harga = harga;
        this.lamaSewa = lamaSewa;
    }

    public double hitungTotalBayar() {
        return lamaSewa * harga;
    }

    public void tampilkanData() {
        System.out.println("===== Struk Peminjaman Game =====");
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Member  : " + namaMember);
        System.out.println("Nama Game    : " + namaGame);
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Harga Sewa   : Rp" + harga + "/hari");
        System.out.println("---------------------------------");
        System.out.println("Total Bayar  : Rp" + hitungTotalBayar());
        System.out.println("=================================");
    }
}