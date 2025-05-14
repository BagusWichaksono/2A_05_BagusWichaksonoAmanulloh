package Semester2.Pertemuan6;

public class DataDosen05 {
    Dosen05[] dataDosen;
    int idx;

    public DataDosen05() {
        dataDosen = new Dosen05[10];
        idx = 0;
    }

    void tambah(Dosen05 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            System.out.println("\n=== Data Dosen ===");
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen05 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("\nData telah diurutkan (Usia Termuda ke Tertua).");
    }

    void PencarianDataSequential05(String cariNama) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;

        System.out.println("\nHasil Pencarian Nama: " + cariNama);
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cariNama)) {
                dataDosen[i].tampil();
                ditemukan = true;
                jumlahDitemukan++;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan nama '" + cariNama + "' tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama '" + cariNama + "'.");
        }
    }

    void PencarianDataBinary05(int cariUsia) {
        SortingASC();
        int left = 0, right = idx - 1;
        boolean ditemukan = false;
        int jumlahDitemukan = 0;

        System.out.println("\nHasil Pencarian Usia: " + cariUsia);
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == cariUsia) {
                int i = mid;
                while (i >= 0 && dataDosen[i].usia == cariUsia) {
                    dataDosen[i].tampil();
                    jumlahDitemukan++;
                    i--;
                }

                i = mid + 1;
                while (i < idx && dataDosen[i].usia == cariUsia) {
                    dataDosen[i].tampil();
                    jumlahDitemukan++;
                    i++;
                }

                ditemukan = true;
                break;
            } else if (dataDosen[mid].usia > cariUsia) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + cariUsia + ".");
        }
    }
}
