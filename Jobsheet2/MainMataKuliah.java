package Jobsheet2;

public class MainMataKuliah {
public static void main(String[] args) {

        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "RT1253008";
        mk1.namaMK = "Praktikum PBO";
        mk1.sks = 2;
        mk1.nilaiAngka = 3.8;

        MataKuliah mk2 = new MataKuliah();
        mk2.kodeMK = "RT1253009";
        mk2.namaMK = "Basis Data";
        mk2.sks = 3;
        mk2.nilaiAngka = 3.5;

        MataKuliah mk3 = new MataKuliah();
        mk3.kodeMK = "RT1253010";
        mk3.namaMK = "Algoritma & Struktur Data";
        mk3.sks = 3;
        mk3.nilaiAngka = 4.0;

        System.out.println("=== DETAIL MATA KULIAH ===");
        mk1.tampilData();
        mk2.tampilData();
        mk3.tampilData();

        double totalBobot = mk1.hitungBobotNilai() + mk2.hitungBobotNilai() + mk3.hitungBobotNilai();
        System.out.println("TOTAL BOBOT NILAI DARI SELURUH MK: " + totalBobot);
    }
}