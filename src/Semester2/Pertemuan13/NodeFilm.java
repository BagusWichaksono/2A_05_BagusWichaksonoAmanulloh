package Semester2.Pertemuan13;

public class NodeFilm {
    int id;
    String judul;
    double rating;
    NodeFilm prev, next;

    public NodeFilm(NodeFilm prev, int id, String judul, double rating, NodeFilm next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}