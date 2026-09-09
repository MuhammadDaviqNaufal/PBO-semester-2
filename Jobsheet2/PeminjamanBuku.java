package Jobsheet2;

public class PeminjamanBuku {

    public String namaPeminjam;
    public String idTransaksi;
    public String judulBuku;
    public int jumllahHariKeterlambatan;
    public double dendaPerHari = 1000;

    public double hitungDenda() {
        return jumllahHariKeterlambatan * dendaPerHari;
    }

    public void tampilkanInfoPeminjaman() {
        System.out.println("Nama Peminjam: " + namaPeminjam);
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Judul Buku: " + judulBuku);
        System.out.println("Jumlah Hari Keterlambatan: " + jumllahHariKeterlambatan);
        System.out.println("Denda Per Hari: Rp. " + dendaPerHari);
}
}
