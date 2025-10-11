package Semester3.TeoriPertemuan7;

public class TestKepegawaian {
    public static void main(String[] args) {
        Manager man = new Manager("Bill Kates", 5000000);
        Supervisor spv = new Supervisor("Susanti", 1000000);
        SalesManager slman = new SalesManager("Jesmenjes", "IT", 2000000);

        man.naikkanGaji();
        spv.naikkanGaji();
        slman.naikkanGaji();

        man.cetakStatus();
        System.out.println();
        spv.cetakStatus();
        System.out.println();
        slman.cetakStatus();
    }
}