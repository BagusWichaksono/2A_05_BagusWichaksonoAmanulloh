package Semester2.Pertemuan12;

public class NodeAntrian {
    MahasiswaAntrian data;
    NodeAntrian next;

    public NodeAntrian(MahasiswaAntrian data) {
        this.data = data;
        this.next = null;
    }
}
