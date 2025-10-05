package Semester3.Jobsheet6.KendaraanOOP;

public class Truk extends Kendaraan {
    int KapasitasTruk;
    
    public Truk(String merk, int tahunProduksi, int KapasitasTruk) {
        super(merk, tahunProduksi);
        this.KapasitasTruk = KapasitasTruk;
    }

    @Override

    void jalankan() {
        System.out.println("Truk " + merk + " Berjalan");
    }

    void info(){
        super.info();
        System.out.println("Kapasitas truk sebesar  : " + KapasitasTruk + " Ton");
    }
}
