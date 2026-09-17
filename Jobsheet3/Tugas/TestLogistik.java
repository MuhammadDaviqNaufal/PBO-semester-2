package Tugas;
import java.util.Scanner;
public class TestLogistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nomor Resi: ");
        String resi = input.nextLine();
        System.out.print("Masukkan Nama Pemilik: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kapasitas Maksimal (kg): ");
        double kapasitas = input.nextDouble();

        Kontainer kontainer = new Kontainer(resi, nama, kapasitas);

        System.out.println("\n--- Data Kontainer Berhasil Dibuat ---");
        System.out.println("Nama Pemilik: " + kontainer.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainer.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin ditambah (kg): ");
        double tambah = input.nextDouble();
        kontainer.tambahMuatan(tambah);
        System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double turun = input.nextDouble();
        kontainer.turunkanMuatan(turun);
        System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");

        input.close();
    }
}
