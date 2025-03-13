import java.util.Scanner;

public class BioskopMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Nomor Hp: ");
        String nomorHp = sc.nextLine();
        System.out.println("\nPilih Cabang Bioskop:");
        System.out.println("1. Movimax Dinoyo");
        System.out.println("2. Movimax Sarinah");
        System.out.println("3. Movimax Lumajang");
        System.out.println("Masukkan Pilihan 1-3: ");
        int pilihanCabang = sc.nextInt();
        sc.nextLine();

        String cabangBioskop;
        switch (pilihanCabang) {
            case 1: cabangBioskop = "Movimax Dinoyo"; break;
            case 2: cabangBioskop = "Movimax Sarinah"; break;
            case 3: cabangBioskop = "Movimax Lumajang"; break;
            default: cabangBioskop = "Tidak Valid"; break;
        }

        System.out.println("\nPilih Film:");
        System.out.println("1. Dune: Part Two");
        System.out.println("2. Kung Fu Panda 4");
        System.out.println("3. Godzilla x Kong: The New Empire");
        System.out.println("4. Deadpool & Wolverine");
        System.out.println("5. Inside Out 2");
        System.out.print("Masukkan pilihan (1-5): ");
        int pilihanFilm = sc.nextInt();

        Bioskop05 pemesanan = new Bioskop05(nama, nomorHp, cabangBioskop, pilihanFilm);
        System.out.println("\nDetail Pemesanan Tiket: ");
        pemesanan.tampilkanInformasi();
    }
}
