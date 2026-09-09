package Jobsheet2;

public class Laptop {
    public String merk;
    public String kodeInventaris;
    public int ramGB;

    public void tampilSpesifikasi() {
        System.out.println("Merk: " + merk);
        System.out.println("Kode Inventaris: " + kodeInventaris);
        System.out.println("RAM : " + ramGB + " GB");
    }

    //method dengan argumen dan nilai balik (return)
    public int upgradeRam(int tambahanGB) {
        int ramBaru = ramGB + tambahanGB;
        return ramBaru;
    }

    public int hitungHargaSewa(int jumlahHari) {
    return jumlahHari * 25000;
}
}
