package Semester2.Pertemuan3;

public class DataDosen05 {
    
    public static void dataSemuaDosen(Dosen05[] arrayOfDosen) {
        System.out.println("\n===============================");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].tampilkanInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen05 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\nJumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, countPria = 0, countWanita = 0;

        for (Dosen05 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        double rataUsiaPria = (countPria > 0) ? (double) totalUsiaPria / countPria : 0;
        double rataUsiaWanita = (countWanita > 0) ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("\nRata-rata Usia Dosen Pria   : " + rataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataUsiaWanita);
    }

    public static void infoDosenPalingTua(Dosen05[] arrayOfDosen) {
        Dosen05 tertua = arrayOfDosen[0];

        for (Dosen05 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        tertua.tampilkanInfo();
    }

    public static void infoDosenPalingMuda(Dosen05[] arrayOfDosen) {
        Dosen05 termuda = arrayOfDosen[0];

        for (Dosen05 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        termuda.tampilkanInfo();
    }
}
