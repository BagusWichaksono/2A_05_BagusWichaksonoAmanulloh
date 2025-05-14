package Semester1.Jobsheet9;

import java.util.Scanner;

public class Square05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 0; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
