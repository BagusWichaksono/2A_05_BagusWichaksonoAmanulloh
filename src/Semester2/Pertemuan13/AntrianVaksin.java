package Semester2.Pertemuan13;

public class AntrianVaksin {
    NodeVaksin head;
    int size;

    public void tambahAntrian(int no, String nama) {
        if (head == null) {
            head = new NodeVaksin(null, no, nama, null);
        } else {
            NodeVaksin current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeVaksin newNode = new NodeVaksin(current, no, nama, null);
            current.next = newNode;
        }
        size++;
    }

    public void hapusAntrian() {
    if (head == null) {
        System.out.println("Antrian kosong.");
    } else {
        String nama = head.nama;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
        System.out.println(nama + " telah selesai divaksinasi.");
    }
}


    public void tampilkanAntrian() {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("+++++++++++++++++++++++++");
        System.out.printf("|%-5s|%-10s|\n", "No.", "Nama");
        NodeVaksin current = head;
        while (current != null) {
            System.out.printf("|%-5d|%-10s|\n", current.noAntrian, current.nama);
            current = current.next;
        }
        System.out.println();
    }

    public int jumlahAntrian() {
        return size;
    }
}
