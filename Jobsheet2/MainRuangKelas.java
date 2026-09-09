package Jobsheet2;

public class MainRuangKelas {
    public static void main(String[] args) {
        RuangKelas r1 = new RuangKelas();
        r1.kodeRuang = "RT01";
        r1.namaGedung = "Gedung Sipil / JTI";
        r1.kapasitas = 35;
        r1.jumlahMahasiswa = 30;

        System.out.println("=== DATA RUANG KELAS ===");
        r1.tampilData();
    }
}
