package Semester3.TeoriPertemuan5;

public class Pelanggan extends Orang {
    private String idPelanggan;

    public Pelanggan(String nama, String nomorTelepon, String idPelanggan) {
        super(nama, nomorTelepon);
        this.idPelanggan = idPelanggan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ID Pelanggan\t: " + this.idPelanggan);
    }
}