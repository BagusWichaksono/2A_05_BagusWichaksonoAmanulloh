package Semester3.UTS.UTS_SIRAMPASIEN05;

public class Pasien05 extends Orang05 {
    private int id05;
    private RekamMedik05 rekamMedik05;

    public Pasien05(int id05, String nama05, boolean jenisKelamin05, String alamat05, String noTelp05) {
        super(nama05, jenisKelamin05, alamat05, noTelp05);
        this.id05 = id05;
    }

    public void setRekamMedik05(RekamMedik05 rekamMedik05) {
        this.rekamMedik05 = rekamMedik05;
    }

    public int getId05() {
        return id05;
    }

    public RekamMedik05 getRekamMedik05() {
        return rekamMedik05;
    }
    
    @Override
    public void displayInfo05() {
        System.out.println("ID Pasien\t: " + id05);
        super.displayInfo05();
        if (rekamMedik05 != null) {
            System.out.println("ID Rekam Medik\t: " + rekamMedik05.getId05());
        } else {
            System.out.println("ID Rekam Medik\t: (Belum ada)");
        }
    }
}