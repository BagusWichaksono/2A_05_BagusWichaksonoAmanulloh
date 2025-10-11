package Semester3.Jobsheet7.TugasOverriding;

public class Mahasiswa extends Manusia {
    
    @Override
    public void makan() {
        System.out.println("Mahasiswa sering makan mie instan");
    }
    
    public void tidur() {
        System.out.println("Mahasiswa butuh tidur yang cukup");
    }
}