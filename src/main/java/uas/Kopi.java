
package uas;


    // Kopi.java
public class Kopi extends Produk {
    private String ukuran;

    // Konstruktor
    public Kopi(String nama, double harga, String ukuran) {
        super(nama, harga); // Memanggil konstruktor superclass
        this.ukuran = ukuran;
    }

    // Accessor dan Mutator untuk ukuran
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    // Override metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran: " + ukuran);
    }
}
