package Semester3.TeoriPertemuan5;

public class TenagaPenjual extends Orang {
    private String idKaryawan;

    public TenagaPenjual(String nama, String nomorTelepon, String idKaryawan) {
        super(nama, nomorTelepon);
        this.idKaryawan = idKaryawan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ID Karyawan\t: " + this.idKaryawan);
    }
}
