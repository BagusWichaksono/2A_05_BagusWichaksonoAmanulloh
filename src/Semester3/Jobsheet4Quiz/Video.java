package Semester3.Jobsheet4Quiz;

public class Video extends Konten {
    private int durasiMenit;

    public Video(int id, String judul, String isi, int durasi) {
        super(id, judul, isi, "Video");
        this.durasiMenit = durasi;
    }

    public int getDurasiMenit() {
        return durasiMenit;
    }

    public void setDurasiMenit(int durasi) {
        this.durasiMenit = durasi;
    }

    @Override
    public void infoKonten() {
        System.out.println("Menampilkan Video: " + getJudul() + " (Durasi: " + durasiMenit + " menit)");
    }
}