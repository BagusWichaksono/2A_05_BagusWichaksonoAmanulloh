package Pertemuan5;

import java.util.Scanner;
public class PemilihanHariDenganIf05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber;
        System.out.print("Input day number: ");
        dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 6) {
            System.out.println("Weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}