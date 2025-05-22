package Semester2.Pertemuan13;

public class NodeVaksin {
    int noAntrian;
    String nama;
    NodeVaksin prev, next;

    NodeVaksin(NodeVaksin prev, int noAntrian, String nama, NodeVaksin next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.next = next;
    }
}
