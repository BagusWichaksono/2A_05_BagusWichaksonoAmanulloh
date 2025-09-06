package Semester3.Jobsheet2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No. 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println();
        
        mhs2.nim = 102;
        mhs2.nama = "Doni";
        mhs2.alamat = "Jl. Mawar No. 2A";
        mhs2.kelas = "2A";
        mhs2.tampilBiodata();
        System.out.println();
        
        mhs3.nim = 103;
        mhs3.nama = "Rendi";
        mhs3.alamat = "Jl. Melati No. 3A";
        mhs3.kelas = "2E";
        mhs3.tampilBiodata();
    }
}
