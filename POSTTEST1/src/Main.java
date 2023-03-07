import java.util.ArrayList;
import java.util.Scanner;

class Lapangan {
    private String nama;
    private String jenis;
    private String ukuran;

    public Lapangan(String nama, String jenis, String ukuran) {
        this.nama = nama;
        this.jenis = jenis;
        this.ukuran = ukuran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String toString() {
        return "Lapangan{" +
                "nama='" + nama + '\'' +
                ", jenis='" + jenis + '\'' +
                ", ukuran=" + ukuran +
                '}';
    }
}

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Lapangan> lapanganList = new ArrayList<>();

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 5) {
            displayMenu();
            System.out.print("Pilihan: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    createLapangan();
                    break;
                case 2:
                    readLapangan();
                    break;
                case 3:
                    updateLapangan();
                    break;
                case 4:
                    deleteLapangan();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nSistem Pendataan Lapangan Pusat Olahraga");
        System.out.println("1. Tambah Lapangan");
        System.out.println("2. Lihat Lapangan");
        System.out.println("3. Ubah Lapangan");
        System.out.println("4. Hapus Lapangan");
        System.out.println("5. Keluar");
    }

    private static void createLapangan() {
        System.out.println("\nTambah Lapangan");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Jenis: ");
        String jenis = input.nextLine();
        System.out.print("Ukuran: ");
        String ukuran = input.nextLine();
        input.nextLine();

        Lapangan lapangan = new Lapangan(nama, jenis, ukuran);
        lapanganList.add(lapangan);
        System.out.println("Lapangan berhasil ditambahkan.");
    }

    private static void readLapangan() {
        System.out.println("\nLihat Lapangan");
        for (Lapangan lapangan : lapanganList) {
            System.out.println(lapangan);
        }
    }

    private static void updateLapangan() {
        System.out.println("\nUbah Lapangan");
        System.out.print("Masukkan nama lapangan yang ingin diubah: ");
        String nama = input.nextLine();

        boolean found = false;
        for (Lapangan lapangan : lapanganList) {
            if (lapangan.getNama().equals(nama)) {
                System.out.print("Jenis baru: ");
                String jenis = input.nextLine();
                System.out.println("Ukuran baru");
                String ukuran = input.nextLine();
                input.nextLine();
                lapangan.setJenis(jenis);
                lapangan.setUkuran(ukuran);
                System.out.println("Data lapangan berhasil diubah.");
                found = true;
                break;
            }
        }
    
        if (!found) {
            System.out.println("Data lapangan tidak ditemukan.");
        }
    }
    
    private static void deleteLapangan() {
        System.out.println("\nHapus Lapangan");
        System.out.print("Masukkan nama lapangan yang ingin dihapus: ");
        String nama = input.nextLine();
    
        boolean found = false;
        for (Lapangan lapangan : lapanganList) {
            if (lapangan.getNama().equals(nama)) {
                lapanganList.remove(lapangan);
                System.out.println("Data lapangan berhasil dihapus.");
                found = true;
                break;
            }
        }
    
        if (!found) {
            System.out.println("Data lapangan tidak ditemukan.");
        }
    }
}    

