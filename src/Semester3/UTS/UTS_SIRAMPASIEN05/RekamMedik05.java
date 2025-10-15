package Semester3.UTS.UTS_SIRAMPASIEN05;

import java.util.ArrayList;
import java.util.List;

public class RekamMedik05 {
    private int id05;
    private Pasien05 pasien05;
    private List<Pemeriksaan05> daftarPemeriksaan05;

    public RekamMedik05(int id05, Pasien05 pasien05) {
        this.id05 = id05;
        this.pasien05 = pasien05;
        this.daftarPemeriksaan05 = new ArrayList<>();
    }

    public void tambahPemeriksaan05(Pemeriksaan05 pemeriksaan05) {
        if (daftarPemeriksaan05 == null) {
            daftarPemeriksaan05 = new ArrayList<>();
        }
        daftarPemeriksaan05.add(pemeriksaan05);
    }
    
    public int getId05() {
        return id05;
    }

    public Pasien05 getPasien05() {
        return pasien05;
    }
    
    public void setDaftarPemeriksaan05(List<Pemeriksaan05> daftarPemeriksaan05) {
        this.daftarPemeriksaan05 = daftarPemeriksaan05;
    }

    public List<Pemeriksaan05> getDaftarPemeriksaan05() {
        return daftarPemeriksaan05;
    }
}