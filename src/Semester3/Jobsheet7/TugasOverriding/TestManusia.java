package Semester3.Jobsheet7.TugasOverriding;

public class TestManusia {
    public static void main(String[] args) {
        
        System.out.println("Pengujian Objek Manusia (Superclass)");
        Manusia manusia = new Manusia();
        System.out.println();
        manusia.bernafas();
        manusia.makan();
        System.out.println("-------------------------------------------------");
        
        System.out.println("\nPengujian Objek Dosen (Subclass)");
        Dosen dosen = new Dosen();
        System.out.println();
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();
        System.out.println("-------------------------------------------------");
        
        System.out.println("\nPengujian Objek Mahasiswa (Subclass)");
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println();
        mahasiswa.bernafas();
        mahasiswa.makan();
        mahasiswa.tidur();
        System.out.println("-------------------------------------------------");
        
        System.out.println("\nPengujian Dynamic Method Dispatch");
        System.out.println();
        Manusia mnsDosen = new Dosen();
        Manusia mnsMahasiswa = new Mahasiswa();
        
        System.out.print("Panggilan dari referensi Manusia (objek Dosen): ");
        System.out.println();
        mnsDosen.makan();
        
        System.out.print("Panggilan dari referensi Manusia (objek Mahasiswa): ");
        System.out.println();
        mnsMahasiswa.makan();
        System.out.println("-------------------------------------------------");
    }
}