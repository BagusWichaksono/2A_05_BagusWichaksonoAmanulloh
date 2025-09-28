package Semester3.TeoriPertemuan5;

public class Main {
    public static void main(String[] args) {
        Dealer jayaMotor = new Dealer("Jaya Motor Surabaya");

        Mobil mobil1 = new Mobil("Toyota", "Kijang Innova Zenix 2.0 V HV", 520000000);
        Mobil mobil2 = new Mobil("Chery", "Tiggo 8 CSH", 480000000);
        Mobil mobil3 = new Mobil("Mitsubishi", "Destinator Ultimate", 445000000);

        jayaMotor.tambahMobil(mobil1);
        jayaMotor.tambahMobil(mobil2);
        jayaMotor.tambahMobil(mobil3);

        jayaMotor.tampilkanInventaris();

        TenagaPenjual Adhi = new TenagaPenjual("Adhi Saputra", "081234567890", "K001");
        Pelanggan Anita = new Pelanggan("Anita Sari", "087654321098", "P001");

        System.out.println("\n>>> Memproses transaksi penjualan untuk Chery Tiggo 8 CSH...");
        Mobil mobilDijual = mobil2;
        
        Penjualan transaksi1 = new Penjualan(Adhi, Anita, mobilDijual, 472000000);
        
        jayaMotor.hapusMobil(mobilDijual);
        
        transaksi1.tampilkanInfoPenjualan();

        jayaMotor.tampilkanInventaris();
    }
}
