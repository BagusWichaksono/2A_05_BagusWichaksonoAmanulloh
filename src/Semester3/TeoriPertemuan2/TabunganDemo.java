package Semester3.TeoriPertemuan2;

public class TabunganDemo {
    public static void main(String[] args) {
        Tabungan tab1 = new Tabungan("2466643", "Bagus", 10000);

        
        tab1.CekSaldo();
        tab1.SimpanUang(20000);
        tab1.AmbilUang(25000);
        tab1.CekSaldo();
    }
}
