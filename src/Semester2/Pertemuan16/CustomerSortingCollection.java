package Semester2.Pertemuan16;

import java.util.ArrayList;

public class CustomerSortingCollection {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(3, "Zainab"));
        customers.add(new Customer(1, "Andi"));
        customers.add(new Customer(2, "Rara"));

        System.out.println("Sebelum diurutkan:");
        for (Customer c : customers) {
            System.out.println(c);
        }

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println("\nSetelah diurutkan berdasarkan nama:");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}