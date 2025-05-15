package Semester2.Pertemuan12;

public class MahasiswaAntrian {
    String nama;
    String nim;
    String kelas;

    public MahasiswaAntrian(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    void tampilData() {
        System.out.printf("%-15s %-15s %-10s\n", nama, nim, kelas);
    }
}
