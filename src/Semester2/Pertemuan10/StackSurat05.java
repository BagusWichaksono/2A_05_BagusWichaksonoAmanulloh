package Semester2.Pertemuan10;

public class StackSurat05 {
    Surat05[] stack;
    int size;
    int top;

    public StackSurat05(int kapasitas) {
        this.size = kapasitas;
        this.stack = new Surat05[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat05 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat05 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat yang bisa diproses.");
            return null;
        }
    }

    public Surat05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack surat kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.trim().equalsIgnoreCase(nama.trim())) {
                System.out.println("Surat ditemukan:");
                System.out.println(stack[i].idSurat + " - " + stack[i].namaMahasiswa + " - " + stack[i].kelas);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }    
}