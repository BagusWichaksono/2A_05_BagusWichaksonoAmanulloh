package Jobsheet9;

public class Surat05 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' = sakit, 'I' = izin
    int durasi;

    public Surat05() {
        
    }

    public Surat05(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}
