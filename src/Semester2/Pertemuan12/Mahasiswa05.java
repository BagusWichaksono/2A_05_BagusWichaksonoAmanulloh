package Semester2.Pertemuan12;

public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa05() {

    }

    public Mahasiswa05(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.1f\n", nim, nama, kelas, ipk);
    }
}
