
package uas;


    // Produk.java
public class Produk {
    private String nama;
    private double harga;

    // Konstruktor
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Metode accessor
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Metode mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Produk: " + nama);
        System.out.println("Harga: Rp " + harga);
    }
}
