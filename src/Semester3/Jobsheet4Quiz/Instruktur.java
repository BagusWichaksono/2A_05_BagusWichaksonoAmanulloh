package Semester3.Jobsheet4Quiz;

public class Instruktur extends Pengguna {
    private String bidangKeahlian;

    public Instruktur(int id, String nama, String email, String keahlian) {
        super(id, nama, email);
        this.bidangKeahlian = keahlian;
    }

    public String getBidangKeahlian() {
        return bidangKeahlian;
    }

    public void setBidangKeahlian(String keahlian) {
        this.bidangKeahlian = keahlian;
    }

    public Kursus buatKursusBaru(int idKursus, String judul, String deskripsi, double harga) {
        return new Kursus(idKursus, judul, deskripsi, harga);
    }

    public void tambahKontenKeKursus(Kursus kursus, Konten konten) {
        kursus.tambahkanKontenBaru(konten);
    }
}