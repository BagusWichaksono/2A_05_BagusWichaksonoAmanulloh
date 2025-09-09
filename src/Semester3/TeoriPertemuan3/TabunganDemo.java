package Semester3.TeoriPertemuan3;

public class TabunganDemo {
    public static void main(String[] args) {
        Tabungan tb1 = new Tabungan("012345", "Bagus", 1000000.0);
        
        tb1.cekSaldo();
        System.out.println("------------------------------------");

        tb1.simpanUang(500000.0);
        System.out.println("------------------------------------");
        
        tb1.ambilUang(200000.0);
        System.out.println("------------------------------------");

        tb1.kirimUang(400000.0);
        System.out.println("------------------------------------");

        tb1.cekSaldo();
    }
}