package Semester3.Jobsheet7.TugasOverloading;

public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        System.out.println("Method Total Sudut");
        System.out.println("Sudut ketiga jika diketahui 90 dan 30   : " + sg.totalSudut(90, 30));
        System.out.println("Sisa sudut jika diketahui 60            : " + sg.totalSudut(60));
        System.out.println();
        System.out.println("Method Keliling");
        System.out.println("Keliling jika sisi 10, 12, 15           : " + sg.keliling(10, 12, 15));
        System.out.printf("Keliling segitiga siku-siku jika sisi A=10, B=12: %.2f\n", sg.keliling(10, 12));
    }
}