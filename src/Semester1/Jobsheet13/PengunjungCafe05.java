package Semester1.Jobsheet13;

public class PengunjungCafe05 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String temp : namaPengunjung) {
            System.out.println("- " + temp);
        }
    }
    
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}
