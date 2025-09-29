package Semester3.Jobsheet5.Tugas;

public class Anggota {
    private String idAnggota;
    private String nama;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }
    
    public String info() {
        return "ID Anggota: " + idAnggota + "\nNama: " + nama;
    }
}