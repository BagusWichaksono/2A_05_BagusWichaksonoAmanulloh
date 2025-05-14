package Semester2.Pertemuan2;

public class DosenMain05 {
    public static void main(String[] args) {
        Dosen05 ds1 = new Dosen05("204838339", "Bagus", true, 2020, "Bahasa Inggris");
        ds1.tampilInformasi();
        ds1.setStatusAktif(false);
        ds1.ubahKeahlian("Pancasila");
        System.out.println("----- Setelah Perubahan -----");
        ds1.tampilInformasi();
        System.out.println();

        Dosen05 ds2 = new Dosen05("184838340", "Wichaksono", false, 2018, "Aljabar Linier");
        ds2.tampilInformasi();
        ds2.setStatusAktif(true);
        ds2.ubahKeahlian("Matematika Dasar");
        System.out.println("----- Setelah Perubahan -----");
        ds2.tampilInformasi();
        System.out.println();
    }
}
