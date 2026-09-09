package Jobsheet2;

public class TestPeminjamanBuku {
public static void main(String[] args) {
    

    PeminjamanBuku peminjaman1 = new PeminjamanBuku();
    peminjaman1.namaPeminjam = "Budi";
    peminjaman1.idTransaksi = "TRX001";
    peminjaman1.judulBuku = "Pemrograman Java";
    peminjaman1.jumllahHariKeterlambatan = 2;
    double denda1 = peminjaman1.hitungDenda();

    PeminjamanBuku peminjaman2 = new PeminjamanBuku();
    peminjaman2.namaPeminjam = "Siti";
    peminjaman2.idTransaksi = "TRX002";
    peminjaman2.judulBuku = "Struktur Data";
    peminjaman2.jumllahHariKeterlambatan = 0;
    double denda2 = peminjaman2.hitungDenda();
  

    peminjaman1.tampilkanInfoPeminjaman();
    peminjaman2.tampilkanInfoPeminjaman();

}
}
