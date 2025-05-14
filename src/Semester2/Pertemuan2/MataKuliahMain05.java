package Semester2.Pertemuan2;

public class MataKuliahMain05 {
    public static void main(String[] args) {
        MataKuliah05 mk1 = new MataKuliah05("PRAKALSD_TI", "Praktikum Algoritma dan Struktur data", 3, 6);
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        System.out.println("----- Setelah Perubahan -----");
        mk1.tampilInformasi();
        System.out.println();

        MataKuliah05 mk2 = new MataKuliah05("ALSD_TI", "Algoritma dan Struktur data", 2, 4);
        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(2);
        System.out.println("----- Setelah Perubahan -----");
        mk2.tampilInformasi();
        System.out.println();
    }
}