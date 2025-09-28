package Semester3.TeoriPertemuan5;

public class Mobil {
    private String merek;
    private String model;
    private double harga;
    private String nomorRangka;

    public Mobil(String merek, String model, double harga) {
        this.merek = merek;
        this.model = model;
        this.harga = harga;
        this.nomorRangka = "VIN" + (int)(Math.random() * 100000);
    }

    public String getMerek() { return merek; }
    public String getModel() { return model; }
    public String getNomorRangka() { return nomorRangka; }

    public void tampilkanInfo() {
        System.out.println("Mobil\t\t: " + merek + " " + model);
        System.out.println("Nomor Rangka\t: " + nomorRangka);
        System.out.println("Harga\t\t: Rp" + String.format("%,.0f", harga));
    }
}
