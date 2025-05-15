package Semester2.Pertemuan12;

public class QueueAntrianMahasiswa {
    NodeAntrian head, tail;
    int size;

    public QueueAntrianMahasiswa() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(MahasiswaAntrian mhs) {
        NodeAntrian baru = new NodeAntrian(mhs);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
        } else {
            System.out.println("Mahasiswa yang dipanggil:");
            head.data.tampilData();
            head = head.next;
            if (head == null) tail = null;
            size--;
        }
    }

    public void peekDepan() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            head.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekBelakang() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang:");
            tail.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar antrian mahasiswa:");
            NodeAntrian temp = head;
            while (temp != null) {
                temp.data.tampilData();
                temp = temp.next;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void clearQueue() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}
