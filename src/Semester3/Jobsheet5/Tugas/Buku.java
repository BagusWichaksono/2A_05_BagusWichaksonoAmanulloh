package Semester3.Jobsheet5.Tugas;

public class Buku {
    private String isbn;
    private String judul;

    public Buku(String isbn, String judul) {
        this.isbn = isbn;
        this.judul = judul;
    }

    public String info() {
        return "ISBN: " + isbn + "\nJudul: " + judul;
    }
}