package Semester3.Jobsheet3.Tugas;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (this.jumlahPinjaman + jumlah > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += jumlah;
        }
    }
    
    public void angsur(int jumlah) {
        if (jumlah < (0.1 * this.jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            return;
        }

        if (jumlah > this.jumlahPinjaman) {
             System.out.println("Maaf, angsuran melebihi jumlah pinjaman.");
        } else {
             this.jumlahPinjaman -= jumlah;
        }
    }
}