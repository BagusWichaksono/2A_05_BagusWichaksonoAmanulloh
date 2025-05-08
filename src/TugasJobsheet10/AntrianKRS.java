package TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKRS = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        sudahKRS = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian KRS.");
    }

    public void prosesKRS() {
        if (sudahKRS >= 30) {
            System.out.println("Batas maksimum 30 mahasiswa telah diproses.");
            return;
        }
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa memproses 2 Mahasiswa.");
            return;
        }
        System.out.println("Memproses 2 Mahasiswa:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahKRS++;
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa Antri KRS:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size < 1) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        for (int i = 0; i < Math.min(2, size); i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();        
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa Terakhir:");
        data[rear].tampilkanData();
    }    

    public void cetakLaporan() {
        System.out.println("Jumlah antrian sekarang      : " + size);
        System.out.println("Jumlah mahasiswa sudah KRS   : " + sudahKRS);
        System.out.println("Jumlah mahasiswa belum KRS   : " + (30 - sudahKRS));
    }
}
