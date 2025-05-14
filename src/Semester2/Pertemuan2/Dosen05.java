package Semester2.Pertemuan2;

public class Dosen05 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen05() {
        this.statusAktif = false;
        this.tahunBergabung = 0;
    }

    public Dosen05(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Masa Kerja      : " + hitungMasaKerja(2025) + " tahun");
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }

    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    void ubahKeahlian(String bidangKeahlianBaru) {
        bidangKeahlian = bidangKeahlianBaru;
    }
}
