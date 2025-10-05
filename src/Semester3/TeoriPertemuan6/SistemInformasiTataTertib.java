package Semester3.TeoriPertemuan6;

import java.util.ArrayList;
import java.util.List;

public class SistemInformasiTataTertib {
    private List<Pelanggaran> catatPelanggaran;

    public SistemInformasiTataTertib() {
        this.catatPelanggaran = new ArrayList<>();
    }

    public void catatPelanggaran(Pelanggaran pelanggaran) {
        this.catatPelanggaran.add(pelanggaran);
    }

    public void lihatRiwayatPelanggaran(AnggotaKampus anggota) {
        System.out.println("\nRiwayat Pelanggaran untuk " + anggota.getNama() + ":");
        boolean found = false;
        int count = 1;
        for (Pelanggaran p : catatPelanggaran) {
            if (p.getPelanggar().getId().equals(anggota.getId())) {
                System.out.println(count + ". Tanggal: " + p.getTanggal());
                System.out.println("   Pelanggaran: " + p.getPeraturanDilanggar().getPeraturan());
                System.out.println("   Sanksi: " + p.getPeraturanDilanggar().getSanksi());
                found = true;
                count++;
            }
        }

        if (!found) {
            System.out.println("   Tidak ditemukan riwayat pelanggaran.");
        }
    }
}