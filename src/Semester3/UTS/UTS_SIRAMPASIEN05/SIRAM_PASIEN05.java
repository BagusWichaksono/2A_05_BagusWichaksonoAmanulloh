package Semester3.UTS.UTS_SIRAMPASIEN05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SIRAM_PASIEN05 {

    private static List<Dokter05> daftarDokter = new ArrayList<>();
    private static List<Pasien05> daftarPasien = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int nextDokterId = 1;
    private static int nextPasienId = 1;
    private static int nextPemeriksaanId = 1;

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            tampilkanMenu();
            System.out.print("Pilih Menu Nomer? ");
            int pilihan = bacaInteger();
            
            switch (pilihan) {
                case 1:
                    tambahPasien();
                    break;
                case 2:
                    updateDataPasien();
                    break;
                case 3:
                    tampilkanDaftarPasien();
                    break;
                case 4:
                    tambahDokter();
                    break;
                case 5:
                    updateDataDokter();
                    break;
                case 6:
                    tampilkanDaftarDokter();
                    break;
                case 7:
                    tambahRiwayatPemeriksaan();
                    break;
                case 8:
                    tampilkanRiwayatPemeriksaan();
                    break;
                case 9:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan SIRAM PASIEN.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        }
    }

    private static void tampilkanMenu() {
        System.out.println("=========================================");
        System.out.println("   Sistem Informasi Rekam Medik Pasien   ");
        System.out.println("=========================================");
        System.out.println("Menu Program:");
        System.out.println("1. Tambah Pasien");
        System.out.println("2. Update Data Pasien");
        System.out.println("3. Tampilkan Daftar Pasien");
        System.out.println("4. Tambah Dokter");
        System.out.println("5. Update Data Dokter");
        System.out.println("6. Tampilkan Daftar Dokter");
        System.out.println("7. Tambah Riwayat Pemeriksaan (Rekam Medik) Pasien");
        System.out.println("8. Tampilkan Riwayat Pemeriksaan (Rekam Medik) Pasien");
        System.out.println("9. Selesai");
        System.out.println("-----------------------------------------------------");
    }

    private static void tambahDokter() {
        System.out.println("\n--- Formulir Tambah Dokter ---");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis Kelamin (L/P): ");
        boolean jk = bacaJenisKelamin();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("No. Telepon: ");
        String noTelp = scanner.nextLine();
        System.out.print("Spesialisasi: ");
        String spesialisasi = scanner.nextLine();

        Dokter05 dokter = new Dokter05(nextDokterId, nama, jk, alamat, noTelp, spesialisasi);
        daftarDokter.add(dokter);
        nextDokterId++;
        System.out.println("-> Data dokter berhasil ditambahkan!");
    }

    private static void updateDataDokter() {
        System.out.println("\n--- Formulir Update Dokter ---");
        System.out.print("Masukkan ID Dokter yang akan diupdate: ");
        int id = bacaInteger();
        Dokter05 dokter = cariDokterById(id);

        if (dokter == null) {
            System.out.println("-> Dokter dengan ID " + id + " tidak ditemukan.");
            return;
        }

        System.out.println("Data saat ini:");
        dokter.displayInfo05();
        System.out.println("\nMasukkan data baru (kosongkan jika tidak ingin mengubah):");
        
        System.out.print("Nama (" + dokter.getNama05() + "): ");
        String nama = scanner.nextLine();
        if (!nama.isEmpty()) dokter.setNama05(nama);

        System.out.print("Alamat (" + dokter.getAlamat05() + "): ");
        String alamat = scanner.nextLine();
        if (!alamat.isEmpty()) dokter.setAlamat05(alamat);

        System.out.print("No. Telepon (" + dokter.getNoTelp05() + "): ");
        String noTelp = scanner.nextLine();
        if (!noTelp.isEmpty()) dokter.setNoTelp05(noTelp);
        
        System.out.print("Spesialisasi (" + dokter.getSpesialisasi05() + "): ");
        String spesialisasi = scanner.nextLine();
        if (!spesialisasi.isEmpty()) dokter.setSpesialisasi05(spesialisasi);
        
        System.out.println("-> Data dokter berhasil diupdate!");
    }

    private static void tampilkanDaftarDokter() {
        System.out.println("\n--- Daftar Dokter ---");
        if (daftarDokter.isEmpty()) {
            System.out.println("Belum ada data dokter yang tersimpan.");
        } else {
            for (Dokter05 d : daftarDokter) {
                d.displayInfo05();
                System.out.println("--------------------");
            }
        }
    }
    
    private static void tambahPasien() {
        System.out.println("\n--- Formulir Tambah Pasien ---");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis Kelamin (L/P): ");
        boolean jk = bacaJenisKelamin();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("No. Telepon: ");
        String noTelp = scanner.nextLine();

        Pasien05 pasien = new Pasien05(nextPasienId, nama, jk, alamat, noTelp);
        RekamMedik05 rekamMedik = new RekamMedik05(nextPasienId, pasien);
        pasien.setRekamMedik05(rekamMedik);
        
        daftarPasien.add(pasien);
        nextPasienId++;
        System.out.println("-> Data pasien berhasil ditambahkan!");
    }
    
    private static void updateDataPasien() {
        System.out.println("\n--- Formulir Update Pasien ---");
        System.out.print("Masukkan ID Pasien yang akan diupdate: ");
        int id = bacaInteger();
        Pasien05 pasien = cariPasienById(id);

        if (pasien == null) {
            System.out.println("-> Pasien dengan ID " + id + " tidak ditemukan.");
            return;
        }
        
        System.out.println("Data saat ini:");
        pasien.displayInfo05();
        System.out.println("\nMasukkan data baru (kosongkan jika tidak ingin mengubah):");
        
        System.out.print("Nama (" + pasien.getNama05() + "): ");
        String nama = scanner.nextLine();
        if (!nama.isEmpty()) pasien.setNama05(nama);

        System.out.print("Alamat (" + pasien.getAlamat05() + "): ");
        String alamat = scanner.nextLine();
        if (!alamat.isEmpty()) pasien.setAlamat05(alamat);

        System.out.print("No. Telepon (" + pasien.getNoTelp05() + "): ");
        String noTelp = scanner.nextLine();
        if (!noTelp.isEmpty()) pasien.setNoTelp05(noTelp);

        System.out.println("-> Data pasien berhasil diupdate!");
    }
    
    private static void tampilkanDaftarPasien() {
        System.out.println("\n--- Daftar Pasien ---");
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien yang tersimpan.");
        } else {
            for (Pasien05 p : daftarPasien) {
                p.displayInfo05();
                System.out.println("--------------------");
            }
        }
    }
    
    private static void tambahRiwayatPemeriksaan() {
        System.out.println("\n--- Formulir Tambah Riwayat Pemeriksaan ---");
        System.out.print("Masukkan ID Pasien: ");
        int idPasien = bacaInteger();
        Pasien05 pasien = cariPasienById(idPasien);
        if (pasien == null) {
            System.out.println("-> Pasien tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan ID Dokter: ");
        int idDokter = bacaInteger();
        Dokter05 dokter = cariDokterById(idDokter);
        if (dokter == null) {
            System.out.println("-> Dokter tidak ditemukan.");
            return;
        }
        
        System.out.print("Tanggal Pemeriksaan (dd/MM/yyyy): ");
        Date tanggal = bacaTanggal();
        
        System.out.print("Keluhan: ");
        String keluhan = scanner.nextLine();
        
        System.out.print("Diagnosa: ");
        String diagnosa = scanner.nextLine();
        
        System.out.print("Tindakan: ");
        String tindakan = scanner.nextLine();
        
        System.out.print("Obat: ");
        String obat = scanner.nextLine();

        Pemeriksaan05 pemeriksaan = new Pemeriksaan05(nextPemeriksaanId, tanggal, keluhan, diagnosa, tindakan, obat, dokter);
        pasien.getRekamMedik05().tambahPemeriksaan05(pemeriksaan);
        nextPemeriksaanId++;
        
        System.out.println("-> Riwayat pemeriksaan berhasil ditambahkan!");
    }

    private static void tampilkanRiwayatPemeriksaan() {
        System.out.println("\n--- Tampilkan Riwayat Pemeriksaan Pasien ---");
        System.out.print("Masukkan ID Pasien: ");
        int idPasien = bacaInteger();
        Pasien05 pasien = cariPasienById(idPasien);

        if (pasien == null) {
            System.out.println("-> Pasien tidak ditemukan.");
            return;
        }

        RekamMedik05 rekamMedik = pasien.getRekamMedik05();
        List<Pemeriksaan05> daftarPemeriksaan = rekamMedik.getDaftarPemeriksaan05();

        System.out.println("\n--- Menampilkan Rekam Medik untuk ---");
        pasien.displayInfo05();
        System.out.println("---------------------------------------");

        if (daftarPemeriksaan.isEmpty()) {
            System.out.println("Pasien ini belum memiliki riwayat pemeriksaan.");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
            for (Pemeriksaan05 p : daftarPemeriksaan) {
                System.out.println("ID Pemeriksaan\t: " + p.getId05());
                System.out.println("Tanggal\t\t: " + sdf.format(p.getTanggalPemeriksaan05()));
                System.out.println("Dokter\t\t: " + p.getDokter05().getNama05() + " (" + p.getDokter05().getSpesialisasi05() + ")");
                System.out.println("Keluhan\t\t: " + p.getKeluhan05());
                System.out.println("Diagnosa\t: " + p.getDiagnosa05());
                System.out.println("Tindakan\t: " + p.getTindakan05());
                System.out.println("Obat\t\t: " + p.getObat05());
                System.out.println(".......................................");
            }
        }
    }

    private static int bacaInteger() {
        while (true) {
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.print("Input tidak valid. Harap masukkan angka: ");
                scanner.nextLine();
            }
        }
    }

    private static boolean bacaJenisKelamin() {
        while (true) {
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("L")) {
                return true;
            } else if (input.equals("P")) {
                return false;
            } else {
                System.out.print("Input tidak valid. Masukkan 'L' atau 'P': ");
            }
        }
    }
    
    private static Date bacaTanggal() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        while (true) {
            try {
                String input = scanner.nextLine();
                return formatter.parse(input);
            } catch (ParseException e) {
                System.out.print("Format tanggal salah. Gunakan format dd/MM/yyyy: ");
            }
        }
    }

    private static Dokter05 cariDokterById(int id) {
        for (Dokter05 d : daftarDokter) {
            if (d.getId05() == id) {
                return d;
            }
        }
        return null;
    }

    private static Pasien05 cariPasienById(int id) {
        for (Pasien05 p : daftarPasien) {
            if (p.getId05() == id) {
                return p;
            }
        }
        return null;
    }
}