package Minggu5;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        int uts[] = {78, 85, 90, 76, 92, 88, 80, 82};
        int uas[] = {82, 88, 87, 79, 95, 85, 83, 84};

        System.out.println("Nilai UTS tertinggi: " + NilaiMahasiswa.cariMaxDC(uts, 0, uts.length - 1));
        System.out.println("Nilai UTS terendah: " + NilaiMahasiswa.cariMinDC(uts, 0, uts.length - 1));
        System.out.println("Rata-rata nilai UAS: " + NilaiMahasiswa.hitungRataBruteForce(uas));
    }
}
