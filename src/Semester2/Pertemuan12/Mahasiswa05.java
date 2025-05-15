package Semester2.Pertemuan12;

public class Mahasiswa05 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa05() {

    }

    public Mahasiswa05(String name, String nm, String kls, double ip) {
        this.nama = name;
        this.nim = nm;
        this.kelas = kls;
        this.ipk = ip;
    }

    void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.1f\n", nama, nim, kelas, ipk);
    }
}
