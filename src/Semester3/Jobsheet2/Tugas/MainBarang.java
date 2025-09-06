package Semester3.Jobsheet2.Tugas;

public class MainBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();

        brg1.kode = "EG001";
        brg1.namaBarang = "Eggel Terra 3 Mini";
        brg1.hargaDasar = 449000;
        brg1.diskon = 15;

        brg1.tampilData();
    }
}