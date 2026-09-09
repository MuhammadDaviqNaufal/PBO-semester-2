package Jobsheet2;

public class TestBuku {
    public static void main(String[] args) {
        buku buku1 = new buku();
        buku1.isbn = "978-3-16-148410-0";
        buku1.judul = "Dasar Pemrograman berbasos objek";
        buku1.penulis = "Abdul Kadir";
        
        buku1.tahunTerbit = 2022;

        buku1.tampilkanInfoBuku();

        buku buku2 = new buku();
        buku2.isbn = "978-3-16-148410-1";
        buku2.judul = "Pemrograman Java untuk Pemula";
        buku2.penulis = "Budi Santoso";
        buku2.penerbit = "Erlangga";
        buku2.tahunTerbit = 2021;

        buku2.tampilkanInfoBuku();

        buku buku3 = new buku();
        buku3.isbn = "978-3-16-148410-2";
        buku3.judul = "Struktur Data dan Algoritma";
        buku3.penulis = "Siti Aminah";
        buku3.penerbit = "Gramedia";
        buku3.tahunTerbit = 2020;

        buku3.tampilkanInfoBuku();
    }
}
