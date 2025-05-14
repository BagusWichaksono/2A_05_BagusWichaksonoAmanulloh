package Semester2.Pertemuan5;

public class NilaiMahasiswa {
    
    static int cariMaxDC(int[] arr, int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];
        }
        int tengah = (kiri + kanan) / 2;
        int maxKiri = cariMaxDC(arr, kiri, tengah);
        int maxKanan = cariMaxDC(arr, tengah + 1, kanan);

        if (maxKiri > maxKanan) {
            return maxKiri;
        } else {
            return maxKanan;
        }
    }

    static int cariMinDC(int[] arr, int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];
        }
        int tengah = (kiri + kanan) / 2;
        int minKiri = cariMinDC(arr, kiri, tengah);
        int minKanan = cariMinDC(arr, tengah + 1, kanan);

        if (minKiri < minKanan) {
            return minKiri;
        } else {
            return minKanan;
        }
    }

    static double hitungRataBF(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }
}
