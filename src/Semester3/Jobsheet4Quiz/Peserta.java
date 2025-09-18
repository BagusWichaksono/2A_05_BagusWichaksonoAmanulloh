package Semester3.Jobsheet4Quiz;

public class Peserta extends Pengguna {
    public Peserta(int id, String nama, String email) {
        super(id, nama, email);
    }

    public void registrasiKeKursus(Kursus kursus) {
        kursus.daftarkanPesertaBaru(this);
        System.out.println(getNamaLengkap() + " berhasil mendaftar kursus " + kursus.getJudul());
    }

    public void selesaikanPembayaran(Pembayaran pembayaran) {
        pembayaran.konfirmasiPembayaran();
    }
}