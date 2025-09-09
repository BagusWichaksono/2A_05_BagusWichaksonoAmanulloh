package Semester3.TeoriPertemuan3;

public class PinjamanOnline {
    private String namaPeminjam;
    private double sisaTagihan;
    private double cicilanPerBulan;
    private String status;

    public PinjamanOnline(String namaPeminjam, double jumlahPinjaman, double bunga, int tenorBulan) {
        this.namaPeminjam = namaPeminjam;
        this.status = "Aktif";
        
        double totalTagihan = jumlahPinjaman + (jumlahPinjaman * bunga * tenorBulan);
        this.sisaTagihan = totalTagihan;
        this.cicilanPerBulan = totalTagihan / tenorBulan;

        System.out.println("Pinjaman untuk " + namaPeminjam + " sebesar Rp " + jumlahPinjaman + " disetujui.");
    }

    public void bayarCicilan() {
        System.out.println("\n-> Membayar cicilan...");
        
        if (status.equals("Lunas")) {
            System.out.println("Tagihan sudah lunas.");
            return;
        }

        this.sisaTagihan -= this.cicilanPerBulan;

        if (this.sisaTagihan < 1) {
            this.sisaTagihan = 0;
            this.status = "Lunas";
        }
    }

    public void cekStatus() {
        System.out.println("\n-- Status Pinjaman --");
        System.out.println("Peminjam: " + this.namaPeminjam);
        System.out.println("Sisa Tagihan: Rp " + this.sisaTagihan);
        System.out.println("Status: " + this.status);
    }
}