package Semester3.UTS.UTS_SIRAMPASIEN05;

import java.util.Date;

public class Pemeriksaan05 {
    private int id05;
    private Date tanggalPemeriksaan05;
    private String keluhan05;
    private String diagnosa05;
    private String tindakan05;
    private String obat05;
    private Dokter05 dokter05;

    public Pemeriksaan05(int id05, Date tanggalPemeriksaan05, String keluhan05, String diagnosa05, String tindakan05, String obat05, Dokter05 dokter05) {
        this.id05 = id05;
        this.tanggalPemeriksaan05 = tanggalPemeriksaan05;
        this.keluhan05 = keluhan05;
        this.diagnosa05 = diagnosa05;
        this.tindakan05 = tindakan05;
        this.obat05 = obat05;
        this.dokter05 = dokter05;
    }

    public int getId05() {
        return id05;
    }

    public Date getTanggalPemeriksaan05() {
        return tanggalPemeriksaan05;
    }

    public String getKeluhan05() {
        return keluhan05;
    }

    public String getDiagnosa05() {
        return diagnosa05;
    }

    public String getTindakan05() {
        return tindakan05;
    }

    public String getObat05() {
        return obat05;
    }

    public Dokter05 getDokter05() {
        return dokter05;
    }
}