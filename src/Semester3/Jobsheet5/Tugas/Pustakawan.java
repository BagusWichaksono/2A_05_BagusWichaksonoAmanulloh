package Semester3.Jobsheet5.Tugas;

public class Pustakawan {
    private String idPegawai;
    private String nama;

    public Pustakawan(String idPegawai, String nama) {
        this.idPegawai = idPegawai;
        this.nama = nama;
    }

    public String info() {
        return "ID Pegawai: " + idPegawai + "\nNama: " + nama;
    }
}