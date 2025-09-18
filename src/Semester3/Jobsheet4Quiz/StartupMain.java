package Semester3.Jobsheet4Quiz;

public class StartupMain {
    public static void main(String[] args) {
        Instruktur andi = new Instruktur(1, "Andi", "andi@startup.com", "Software Development");
        Kursus kursusJava = andi.buatKursusBaru(101, "Belajar Java", "Pemrograman Java dari dasar", 500000);

        Video v1 = new Video(1, "Intro Java", "Video pengantar", 10);
        andi.tambahKontenKeKursus(kursusJava, v1);

        Peserta budi = new Peserta(2, "Budi", "budi@startup.com");
        budi.registrasiKeKursus(kursusJava);

        Pembayaran bayar = new Pembayaran(1001, 500000, budi, kursusJava);
        budi.selesaikanPembayaran(bayar);

        System.out.println("Validasi Transaksi: " + bayar.getStatusPembayaran());
        System.out.println("\n===== Rangkuman Informasi Kursus =====");
        kursusJava.tampilkanInfoLengkap();
        System.out.println("\n===== Detail Materi Video =====");
        v1.infoKonten();
    }
}