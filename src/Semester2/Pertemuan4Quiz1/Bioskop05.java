package Semester2.Pertemuan4Quiz1;

public class Bioskop05 {
    String namaPelanggan;
    String nomorHp;
    String cabangBioskop;
    int pilihanFilm;

    public Bioskop05() {
    }

    public Bioskop05(String namaPelanggan, String nomorHp, String cabangBioskop, int pilihanFilm) {
        this.namaPelanggan = namaPelanggan;
        this.nomorHp = nomorHp;
        this.cabangBioskop = cabangBioskop;
        this.pilihanFilm = pilihanFilm;
    }

    void tampilkanInformasi() {
        System.out.println("Nama Pelanggan: "+ namaPelanggan);
        System.out.println("Nomor Hp: "+ nomorHp);
        System.out.println("Film Yang Dipilih: "+ pilihFilm(pilihanFilm));
        System.out.println("Cabang Bioskop: "+ cabangBioskop);
    }

    String pilihFilm(int pilihan) {
        switch (pilihan) {
            case 1: return "Dune: Part Two";
            case 2: return "Kung Fu Panda 4";
            case 3: return "Godzilla x Kong: The New Empire";
            case 4: return "Deadpool & Wolverine";
            case 5: return "Inside Out 2";
            default: return "Tidak Valid";        }
    } 
}
