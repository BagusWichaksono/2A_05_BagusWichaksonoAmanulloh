package Semester3.Jobsheet4Quiz;

import java.util.Date;

public class Pembayaran {
    private int idTransaksi;
    private double nominalBayar;
    private Date tanggal;
    private String status;
    private Peserta peserta;
    private Kursus kursus;

    public Pembayaran(int id, double jumlah, Peserta peserta, Kursus kursus) {
        this.idTransaksi = id;
        this.nominalBayar = jumlah;
        this.peserta = peserta;
        this.kursus = kursus;
        this.tanggal = new Date();
        this.status = "Pending";
    }

    public int getIdTransaksi() { return idTransaksi; }
    public void setIdTransaksi(int id) { this.idTransaksi = id; }
    public double getNominalBayar() { return nominalBayar; }
    public void setNominalBayar(double jumlah) { this.nominalBayar = jumlah; }
    public Date getTanggal() { return tanggal; }
    public void setTanggal(Date tanggal) { this.tanggal = tanggal; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public boolean konfirmasiPembayaran() {
        if (nominalBayar > 0) {
            status = "Sukses";
            System.out.println("Pembayaran berhasil oleh " + peserta.getNamaLengkap() + " di Kursus " + kursus.getJudul());
            return true;
        }
        status = "Gagal";
        return false;
    }

    public String getStatusPembayaran() {
        return status;
    }
}