package Semester3.Jobsheet2.Tugas;

public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    public int hitungHargaJual() {
        float besarDiskon = (this.diskon / 100) * this.hargaDasar;
        return (int) (this.hargaDasar - besarDiskon);
    }

    public void tampilData() {
        System.out.println("======= Data Barang =======");
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Dasar  : Rp" + hargaDasar);
        System.out.println("Diskon       : " + diskon + "%");
        System.out.println("Harga Jual   : Rp" + hitungHargaJual());
        System.out.println("===========================");
    }
}