package Semester3.Jobsheet7.TugasOverriding;

public class Dosen extends Manusia {
    
    @Override
    public void makan() {
        System.out.println("Dosen makan untuk menambah energi");
    }
    
    public void lembur() {
        System.out.println("Dosen terkadang lembur");
    }
}