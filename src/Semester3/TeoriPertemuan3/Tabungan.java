package Semester3.TeoriPertemuan3;

public class Tabungan {
    private String norek;
    private String namaPemilik;
    private double saldo;

    public Tabungan(String norek, String namaPemilik, double saldo) {
        this.norek = norek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    private double hitungBunga(double bunga) {
        return this.saldo * bunga;
    }

    private double biayaTransfer(double jumlah) {
        return 0.005 * jumlah;
    }

    public void cekSaldo() {
        System.out.println("\n:: INFO REKENING ::");
        System.out.println("Nasabah: " + this.namaPemilik);
        System.out.println("Saldo Tersedia: Rp " + this.saldo);
    }

    public void simpanUang(double jumlah) {
        System.out.println("\n-> Setor Tunai");
        this.saldo += jumlah;
        System.out.println("Jumlah Setor: Rp " + jumlah);
        System.out.println("Saldo Terbaru: Rp " + this.saldo);
    }

    public void ambilUang(double jumlah) {
        System.out.println("\n-> Tarik Tunai");
        if (jumlah > this.saldo) {
            System.out.println("Gagal! Saldo tidak mencukupi.");
            System.out.println("Saldo saat ini: Rp " + this.saldo);
        } else {
            this.saldo -= jumlah;
            System.out.println("Jumlah Penarikan: Rp " + jumlah);
            System.out.println("Saldo Terbaru: Rp " + this.saldo);
        }
    }

    public void penyesuaianSaldo() {
        System.out.println("\n-> Penambahan Bunga");
        double bunga = 0.01;
        double jumlahBunga = hitungBunga(bunga);
        System.out.println("Saldo Awal: Rp " + this.saldo);
        this.saldo += jumlahBunga;
        System.out.println("Bunga didapat (1%): Rp " + jumlahBunga);
        System.out.println("Saldo setelah bunga: Rp " + this.saldo);
    }

    public void kirimUang(double jumlah) {
        System.out.println("\n-> Proses Transfer");
        double biaya = biayaTransfer(jumlah);
        double totalDebet = jumlah + biaya;

        System.out.println("Saldo Awal: Rp " + this.saldo);
        
        if (totalDebet > this.saldo) {
            System.out.println("Gagal! Saldo tidak cukup untuk transfer ini.");
        } else {
            this.saldo -= totalDebet;
            System.out.println("Nominal Transfer: Rp " + jumlah);
            System.out.println("Biaya Admin: Rp " + biaya);
            System.out.println("Sisa Saldo: Rp " + this.saldo);
        }
    }    
}