package Semester3.Jobsheet5.Tugas;

public class TransaksiPeminjaman {
    private int idTransaksi;
    private Pustakawan pustakawan;
    private Anggota anggota;
    private Buku buku;

    public TransaksiPeminjaman(int idTransaksi, Pustakawan pustakawan, Anggota anggota, Buku buku) {
        this.idTransaksi = idTransaksi;
        this.pustakawan = pustakawan;
        this.anggota = anggota;
        this.buku = buku;
    }
    
    public String info() {
        String info = "===============================\n";
        info += "      DETAIL PEMINJAMAN\n";
        info += "===============================\n";
        info += "ID Transaksi: " + idTransaksi + "\n\n";
        info += "--- Pustakawan Penanggung Jawab ---\n" + pustakawan.info() + "\n\n";
        info += "--- Peminjam ---\n" + anggota.info() + "\n\n";
        info += "--- Buku yang Dipinjam ---\n" + buku.info() + "\n";
        info += "===============================\n";
        return info;
    }
}