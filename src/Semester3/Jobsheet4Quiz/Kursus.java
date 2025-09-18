package Semester3.Jobsheet4Quiz;

import java.util.ArrayList;
import java.util.List;

public class Kursus {
    private int idKursus;
    private String judul;
    private String deskripsi;
    private double biayaKursus;
    private List<Konten> daftarKonten = new ArrayList<>();
    private List<Peserta> daftarPeserta = new ArrayList<>();

    public Kursus(int idKursus, String judul, String deskripsi, double harga) {
        this.idKursus = idKursus;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.biayaKursus = harga;
    }

    public int getIdKursus() { return idKursus; }
    public void setIdKursus(int idKursus) { this.idKursus = idKursus; }
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }
    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }
    public double getBiayaKursus() { return biayaKursus; }
    public void setBiayaKursus(double harga) { this.biayaKursus = harga; }

    public void tambahkanKontenBaru(Konten konten) {
        daftarKonten.add(konten);
    }

    public void daftarkanPesertaBaru(Peserta peserta) {
        daftarPeserta.add(peserta);
    }

    public void tampilkanInfoLengkap() {
        System.out.println("Kursus: " + judul);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Harga: Rp " + biayaKursus);
        System.out.println("Jumlah Peserta: " + daftarPeserta.size());
        System.out.println("Jumlah Konten: " + daftarKonten.size());
    }
}