# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data kedai kopi menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama kopi, harga, ukuran dan memberikan output berupa informasi detail dari produk, harga, dan ukuran.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Produk`, `Kopi`, dan `KedaiKopi` adalah contoh dari class.

```bash
public class Produk {
    ...
}

public class Kopi extends Produk {
    ...
}

public class KedaiKopi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `menu[jumlah++] = new Kopi(nama, harga, ukuran);` adalah contoh pembuatan object.

```bash
menu[jumlah++] = new Kopi(nama, harga, ukuran);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `harga`, dan `ukuran` adalah contoh atribut.

```bash
String nama;
double harga;
String ukuran;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Produk` dan `Kopi`.

```bash
public Produk(String nama, double harga) {
    this.nama = nama;
    this.harga = harga;
}

public Kopi(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setHarga`, dan `setUkuran` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setHarga(double harga) {
    this.harga = harga;
}

public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga`, dan `getUkuran` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public double getHarga() {
    return harga;
}

public String getUkuran() {
        return ukuran;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `harga`, dan `ukuran` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private double harga;
private String ukuran;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Kopi` mewarisi `Produk` dengan sintaks `extends`.

```bash
public class Kopi extends Produk {
    ...
}
```

9. **Polymorphism** adalah digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. 'Kopi' adalah subclass dari 'Produk'. 'Kopi' mewarisi metode 'tampilkanInfo' dari 'Produk', tetapi metode ini dioverride dalam 'Kopi' untuk menambahkan perilaku khusus. Ini adalah contoh polymorphism: metode yang sama ('tampilkanInfo') memiliki perilaku yang berbeda tergantung pada objeknya ('Produk' atau 'Kopi').

```bash
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Ukuran: " + ukuran);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` untuk menentukan tindakan yang harus dilakukan berdasarkan pilihan pengguna..

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` dan `while (true)` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlah; i++) {
    menu[i].tampilkanInfo();
    System.out.println();
}

while (true) { ... }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user.
```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama kopi: ");
String nama = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `private Kopi[] menu;` adalah contoh penggunaan array.

```bash
private Kopi[] menu;
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // Code that may throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
    scanner.nextLine(); // Bersihkan buffer
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Abdillah
NPM: 2210010152
