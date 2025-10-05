package Semester3.TeoriPertemuan6;

public class Main {
    public static void main(String[] args) {
        SistemInformasiTataTertib sistem = new SistemInformasiTataTertib();

        Mahasiswa mhs1 = new Mahasiswa("Ahmad Asoy", "ID-MHS-001", "2451502001", "Ilmu Komputer");
        Mahasiswa mhs2 = new Mahasiswa("Citra Kemiri", "ID-MHS-002", "2451504002", "Sistem Informasi");
        Dosen dsn1 = new Dosen("Prof. Dr. Gunawan Wibisono", "ID-DSN-001", "197508172000031002", "FILKOM");

        TataTertib aturan1 = new TataTertib("Parkir tidak pada tempatnya", "Teguran lisan dan pemindahan kendaraan");
        TataTertib aturan2 = new TataTertib("Tidak mengikuti ujian tanpa keterangan", "Nilai E pada mata kuliah terkait");
        TataTertib aturan3 = new TataTertib("Merusak fasilitas kampus", "Ganti rugi dan skorsing 1 minggu");

        sistem.catatPelanggaran(new Pelanggaran(mhs1, aturan1, "2025-10-02"));
        sistem.catatPelanggaran(new Pelanggaran(mhs2, aturan2, "2025-10-04"));
        sistem.catatPelanggaran(new Pelanggaran(mhs1, aturan3, "2025-10-05"));
        
        sistem.lihatRiwayatPelanggaran(mhs1);
        sistem.lihatRiwayatPelanggaran(mhs2);
        sistem.lihatRiwayatPelanggaran(dsn1);
        
        System.out.println();
        aturan3.terapkanSanksi(mhs1);
    }
}