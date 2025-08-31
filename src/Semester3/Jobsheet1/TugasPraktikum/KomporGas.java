package Semester3.Jobsheet1.TugasPraktikum;

public class KomporGas extends Kompor {
    private String jenisGas;
    private String merek;

    public KomporGas(String merek, int jumlahTungku, String jenisGas) {
        super(merek, jumlahTungku);
        this.merek = merek;
        this.jenisGas = jenisGas;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis Gas: " + jenisGas);
    }
}
