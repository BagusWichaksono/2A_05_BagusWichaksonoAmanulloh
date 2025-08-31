package Semester3.Jobsheet1.TugasPraktikum;

public class Handphone {
    private String merek, tipe;
    private int kapasitasBaterai;

    public Handphone(String merek, String tipe, int kapasitasBaterai) {
        this.merek = merek;
        this.tipe = tipe;
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public void telepon(String nomor) {
        System.out.println(merek + " " + tipe + " menelpon ke " + nomor);
    }

    public void kirimPesan(String nomor) {
        System.out.println(merek + " " + tipe + " mengirim pesan ke " + nomor);
    }

    public void cetakInfo() {
        System.out.println("=== Informasi Handphone ===");
        System.out.println("Merek: " + merek);
        System.out.println("Tipe: " + tipe);
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
    }
}
