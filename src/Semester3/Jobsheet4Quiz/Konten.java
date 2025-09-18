package Semester3.Jobsheet4Quiz;

public class Konten {
    private int idKonten;
    private String judul;
    private String materiKonten;
    private String jenis;

    public Konten(int idKonten, String judul, String isi, String jenis) {
        this.idKonten = idKonten;
        this.judul = judul;
        this.materiKonten = isi;
        this.jenis = jenis;
    }

    public int getIdKonten() { return idKonten; }
    public void setIdKonten(int idKonten) { this.idKonten = idKonten; }
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }
    public String getMateriKonten() { return materiKonten; }
    public void setMateriKonten(String isi) { this.materiKonten = isi; }
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public void infoKonten() {
        System.out.println("Menampilkan " + jenis + ": " + judul);
    }

    public void updateKonten(String isiBaru) {
        this.materiKonten = isiBaru;
    }
}