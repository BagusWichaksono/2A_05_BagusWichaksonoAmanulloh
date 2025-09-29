package Semester3.Jobsheet5.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Pustakawan petugas1 = new Pustakawan("P001", "Andi");
        Anggota anggota1 = new Anggota("A001", "Candra");
        Buku buku1 = new Buku("978-602-03-2478-4", "Laskar Pelangi");

        TransaksiPeminjaman trx1 = new TransaksiPeminjaman(1, petugas1, anggota1, buku1);
        
        System.out.println(trx1.info());
    }
}