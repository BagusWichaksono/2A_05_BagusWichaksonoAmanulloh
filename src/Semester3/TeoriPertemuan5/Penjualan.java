package Semester3.TeoriPertemuan5;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Penjualan {
    private TenagaPenjual tenagaPenjual;
    private Pelanggan pelanggan;
    private Mobil mobilTerjual;
    private Date tanggalJual;
    private double hargaFinal;

    public Penjualan(TenagaPenjual penjual, Pelanggan pembeli, Mobil mobil, double hargaFinal) {
        this.tenagaPenjual = penjual;
        this.pelanggan = pembeli;
        this.mobilTerjual = mobil;
        this.hargaFinal = hargaFinal;
        this.tanggalJual = new Date();
    }

    public void tampilkanInfoPenjualan() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy, HH:mm:ss");
        System.out.println("\n===== Detail Transaksi Penjualan =====");
        System.out.println("Tanggal Transaksi: " + sdf.format(tanggalJual));
        System.out.println("\n--- Mobil yang Terjual ---");
        mobilTerjual.tampilkanInfo();
        System.out.println("Harga Jual\t: Rp" + String.format("%,.0f", hargaFinal));
        
        System.out.println("\n--- Dijual oleh ---");
        tenagaPenjual.tampilkanInfo();
        
        System.out.println("\n--- Dibeli oleh ---");
        pelanggan.tampilkanInfo();
        System.out.println("======================================");
    }
}