package Semester3.UTS.UTS_SIRAMPASIEN05;

public class Orang05 {
    private String nama05;
    private boolean jenisKelamin05;
    private String alamat05;
    private String noTelp05;

    public Orang05(String nama05, boolean jenisKelamin05, String alamat05, String noTelp05) {
        this.nama05 = nama05;
        this.jenisKelamin05 = jenisKelamin05;
        this.alamat05 = alamat05;
        this.noTelp05 = noTelp05;
    }

    public Orang05(String nama05, boolean jenisKelamin05, String alamat05) {
        this.nama05 = nama05;
        this.jenisKelamin05 = jenisKelamin05;
        this.alamat05 = alamat05;
        this.noTelp05 = "-";
    }
    
    public void setNama05(String nama05) {
        this.nama05 = nama05;
    }

    public void setJenisKelamin05(boolean jenisKelamin05) {
        this.jenisKelamin05 = jenisKelamin05;
    }

    public void setAlamat05(String alamat05) {
        this.alamat05 = alamat05;
    }

    public void setNoTelp05(String noTelp05) {
        this.noTelp05 = noTelp05;
    }

    public String getNama05() {
        return nama05;
    }

    public boolean isJenisKelamin05() {
        return jenisKelamin05;
    }
    
    public String getJenisKelaminString05() {
        return jenisKelamin05 ? "Laki-laki" : "Perempuan";
    }

    public String getAlamat05() {
        return alamat05;
    }

    public String getNoTelp05() {
        return noTelp05;
    }
    
    public void displayInfo05() {
        System.out.println("Nama\t\t: " + nama05);
        System.out.println("Jenis Kelamin\t: " + getJenisKelaminString05());
        System.out.println("Alamat\t\t: " + alamat05);
        System.out.println("No. Telepon\t: " + noTelp05);
    }
}