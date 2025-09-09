package Semester3.TeoriPertemuan3;

public class PinjolDemo {
    public static void main(String[] args) {
        PinjamanOnline pj1
         = new PinjamanOnline("Doni", 2000000.0, 0.05, 4);

        pj1
        .cekStatus();
        
        pj1
        .bayarCicilan();
        
        pj1
        .cekStatus();
    }
}