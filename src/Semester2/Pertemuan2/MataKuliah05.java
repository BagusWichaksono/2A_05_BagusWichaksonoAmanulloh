package Semester2.Pertemuan2;

public class MataKuliah05 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
    public MataKuliah05() {
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah05(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama            : " + nama);
        System.out.println("SKS             : " + sks);
        System.out.println("Jumlah Jam      : " + jumlahJam + " jam/minggu");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            
        } else {
            this.jumlahJam -= jam;
            
        }
    }
}
