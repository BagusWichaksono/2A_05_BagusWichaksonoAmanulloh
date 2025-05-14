package Semester2.Pertemuan5;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        String[] nim = {"220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007", "220101008"};
        int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};  // Nilai UTS
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};  // Nilai UAS

        int nilaiMax = NilaiMahasiswa.cariMaxDC(uts, 0, uts.length - 1);
        int nilaiMin = NilaiMahasiswa.cariMinDC(uts, 0, uts.length - 1);

        String namaMax = "", nimMax = "";
        String namaMin = "", nimMin = "";
        for (int i = 0; i < uts.length; i++) {
            if (uts[i] == nilaiMax) {
                namaMax = nama[i];
                nimMax = nim[i];
            }
            if (uts[i] == nilaiMin) {
                namaMin = nama[i];
                nimMin = nim[i];
            }
        }

        double rataUAS = NilaiMahasiswa.hitungRataBF(uas);

        System.out.println("===============================================");
        System.out.println("|          HASIL PERHITUNGAN NILAI            |");
        System.out.println("===============================================");
        System.out.println("| Mahasiswa dengan nilai UTS tertinggi       |");
        System.out.println("| Nama  : " + namaMax);
        System.out.println("| NIM   : " + nimMax);
        System.out.println("| Nilai : " + nilaiMax);
        System.out.println("===============================================");
        System.out.println("| Mahasiswa dengan nilai UTS terendah        |");
        System.out.println("| Nama  : " + namaMin);
        System.out.println("| NIM   : " + nimMin);
        System.out.println("| Nilai : " + nilaiMin);
        System.out.println("===============================================");
        System.out.println("| Rata-rata nilai UAS semua mahasiswa       |");
        System.out.println("| Nilai : " + rataUAS);
        System.out.println("===============================================");
    }
}
