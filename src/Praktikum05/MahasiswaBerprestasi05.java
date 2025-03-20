package Praktikum05;

public class MahasiswaBerprestasi05 {
    Mahasiswa05[] listMhs;
    int idx;

    MahasiswaBerprestasi05(int jumlah) {
        listMhs = new Mahasiswa05[jumlah];
        idx = 0;
    }

    void tambah(Mahasiswa05 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa05 m : listMhs) {
            m.tampilInformasi();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa05 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}
