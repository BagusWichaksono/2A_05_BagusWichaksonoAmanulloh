package Semester3.UTS.UTS_SIRAMPASIEN05;

public class Dokter05 extends Orang05 {
    private int id05;
    private String spesialisasi05;

    public Dokter05(int id05, String nama05, boolean jenisKelamin05, String alamat05, String noTelp05, String spesialisasi05) {
        super(nama05, jenisKelamin05, alamat05, noTelp05);
        this.id05 = id05;
        this.spesialisasi05 = spesialisasi05;
    }

    public int getId05() {
        return id05;
    }

    public String getSpesialisasi05() {
        return spesialisasi05;
    }

    public void setSpesialisasi05(String spesialisasi05) {
        this.spesialisasi05 = spesialisasi05;
    }

    @Override
    public void displayInfo05() {
        System.out.println("ID Dokter\t: " + id05);
        super.displayInfo05();
        System.out.println("Spesialisasi\t: " + spesialisasi05);
    }
}