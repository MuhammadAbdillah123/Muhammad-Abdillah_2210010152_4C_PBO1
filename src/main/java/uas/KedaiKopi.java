
package uas;


    // KedaiKopi.java
import java.util.Scanner;

public class KedaiKopi {
    private Kopi[] menu;
    private int jumlah;

    // Konstruktor
    public KedaiKopi(int ukuran) {
        menu = new Kopi[ukuran];
        jumlah = 0;
    }

    // Metode untuk menambahkan kopi ke menu
    public void tambahKopi(String nama, double harga, String ukuran) {
        if (jumlah < menu.length) {
            menu[jumlah++] = new Kopi(nama, harga, ukuran);
        } else {
            System.out.println("Menu penuh. Tidak dapat menambahkan kopi lagi.");
        }
    }

    // Metode untuk menampilkan menu kopi
    public void tampilkanMenu() {
        System.out.println("Menu Kopi:");
        for (int i = 0; i < jumlah; i++) {
            menu[i].tampilkanInfo();
            System.out.println();
        }
    }

    // Metode utama
    public static void main(String[] args) {
        KedaiKopi kedai = new KedaiKopi(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Tambah Kopi");
                System.out.println("2. Tampilkan Menu");
                System.out.println("3. Keluar");
                System.out.print("Pilih opsi: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline

                if (pilihan == 1) {
                    System.out.print("Masukkan nama kopi: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan harga: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine(); // Konsumsi newline
                    System.out.print("Masukkan ukuran: ");
                    String ukuran = scanner.nextLine();
                    kedai.tambahKopi(nama, harga, ukuran);
                } else if (pilihan == 2) {
                    kedai.tampilkanMenu();
                } else if (pilihan == 3) {
                    break;
                } else {
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Bersihkan buffer
            }
        }

        scanner.close();
    }
}
