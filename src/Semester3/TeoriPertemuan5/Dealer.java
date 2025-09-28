package Semester3.TeoriPertemuan5;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private String nama;
    private List<Mobil> inventaris; 

    public Dealer(String nama) {
        this.nama = nama;
        this.inventaris = new ArrayList<>();
    }

    public void tambahMobil(Mobil mobil) {
        this.inventaris.add(mobil);
        System.out.println("INFO: " + mobil.getMerek() + " " + mobil.getModel() + " telah ditambahkan ke inventaris.");
    }

    public void hapusMobil(Mobil mobil) {
        if (this.inventaris.remove(mobil)) {
            System.out.println("INFO: " + mobil.getMerek() + " " + mobil.getModel() + " telah dihapus dari inventaris.");
        }
    }

    public void tampilkanInventaris() {
        System.out.println("\n===== Inventaris " + nama + " =====");
        if (inventaris.isEmpty()) {
            System.out.println("Inventaris saat ini kosong.");
        } else {
            for (Mobil mobil : inventaris) {
                mobil.tampilkanInfo();
                System.out.println("---------------------------------");
            }
        }
        System.out.println("======================================");
    }
}
