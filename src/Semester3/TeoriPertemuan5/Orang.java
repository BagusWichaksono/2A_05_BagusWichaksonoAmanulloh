package Semester3.TeoriPertemuan5;

public class Orang {
    protected String nama;
    protected String nomorTelepon;

    public Orang(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama\t\t: " + nama + "\nNomor Telepon\t: " + nomorTelepon);
    }
}
