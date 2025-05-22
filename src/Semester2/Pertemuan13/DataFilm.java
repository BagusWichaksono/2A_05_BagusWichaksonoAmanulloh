package Semester2.Pertemuan13;

public class DataFilm {
    NodeFilm head, tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        NodeFilm newNode = new NodeFilm(null, id, judul, rating, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        NodeFilm newNode = new NodeFilm(null, id, judul, rating, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addAt(int index, int id, String judul, double rating) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
        } else if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            NodeFilm current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            NodeFilm newNode = new NodeFilm(current.prev, id, judul, rating, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Data kosong");
        } else {
            System.out.println("Film " + head.judul + " berhasil dihapus");
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Data kosong");
        } else {
            System.out.println("Film " + tail.judul + " berhasil dihapus");
            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head = null;
            size--;
        }
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            NodeFilm current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            System.out.println("Film " + current.judul + " berhasil dihapus");
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Data kosong");
        } else {
            NodeFilm current = head;
            while (current != null) {
                System.out.println("ID: " + current.id);
                System.out.println("  Judul Film: " + current.judul);
                System.out.println("  IMDB: " + current.rating);
                System.out.println();
                current = current.next;
            }
        }
    }

    public void searchID(int id) {
        NodeFilm current = head;
        int posisi = 0;
        boolean ketemu = false;

        while (current != null) {
            if (current.id == id) {
                System.out.println("Data ID: " + id + " berada di node ke- " + posisi);
                System.out.println("IDENTITAS:");
                System.out.println("ID Film: " + current.id);
                System.out.println("Judul Film: " + current.judul);
                System.out.println("IMDB Rating: " + current.rating);
                ketemu = true;
                break;
            }
            posisi++;
            current = current.next;
        }

        if (!ketemu) {
            System.out.println("Data dengan ID " + id + " tidak ditemukan");
        }
    }

    public void urutanDescending() {
        if (isEmpty()) return;

        for (NodeFilm i = head; i != null; i = i.next) {
            NodeFilm max = i;
            for (NodeFilm j = i.next; j != null; j = j.next) {
                if (j.rating > max.rating) {
                    max = j;
                }
            }

            if (max != i) {
                int tempId = i.id;
                String tempJudul = i.judul;
                double tempRating = i.rating;

                i.id = max.id;
                i.judul = max.judul;
                i.rating = max.rating;

                max.id = tempId;
                max.judul = tempJudul;
                max.rating = tempRating;
            }
        }
    }
}